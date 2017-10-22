package ve.gob.cendit.cenditlab.ui;

import javafx.beans.binding.BooleanBinding;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;


public class SetupView extends TabPane
{
    private static final String FXML_URL = "setup-view-proto-1.fxml";

    private static final int SETUP_TO_VIEW = 0;
    private static final int VIEW_TO_SETUP = 1;

    @FXML
    ChoiceBox<String> enrModeChoiceBox;

    @FXML
    ChoiceBox<String> spotModeChoiceBox;

    @FXML
    ChoiceBox<String> noiseSourcePreferenceChoiceBox;

    @FXML
    FieldInput spotEnrFieldInput;

    @FXML
    FieldInput userTcoldFieldInput;

    @FXML
    ToggleView autoLoadEnrToggleButton;

    @FXML
    ToggleView commonEnrTableToggleButton;

    @FXML
    ToggleView snsTcoldToggleButton;

    @FXML
    ToggleView userTcoldToggleButton;

    @FXML
    Tab commonEnrTab;

    @FXML
    Tab measurementEnrTab;

    private EnrSetup enrSetup;

    public SetupView()
    {
        ViewLoader.Load(FXML_URL, this, this);

        initialize();
        attachListeners();
        makeBindings();
    }

    private void initialize()
    {
        enrSetup = new EnrSetup();

        Options options = enrSetup.getEnrModeOptions();
        enrModeChoiceBox.getItems().addAll(options.getValues());
        enrModeChoiceBox.setValue(options.getDefault());

        options = enrSetup.getSpotModeOptions();
        spotModeChoiceBox.getItems().addAll(options.getValues());
        spotModeChoiceBox.setValue(options.getDefault());

        options = enrSetup.getNoiseSourcePreferenceOptions();
        noiseSourcePreferenceChoiceBox.getItems()
                .addAll(options.getValues());
        noiseSourcePreferenceChoiceBox.setValue(options.getDefault());
    }

    private void attachListeners()
    {
        commonEnrTableToggleButton.selectedProperty()
                .addListener(((observable, oldValue, newValue) ->
                        updateCommonTable(newValue)));
    }

    private void makeBindings()
    {
        BooleanBinding binding;

        binding =  enrModeChoiceBox.getSelectionModel().
                selectedIndexProperty().isEqualTo(0);

        commonEnrTab.disableProperty().bind(binding.not());
        measurementEnrTab.disableProperty().bind(binding.not());
        spotEnrFieldInput.disableProperty().bind(binding);

        binding = userTcoldToggleButton.textProperty()
                .isEqualTo("OFF");
        userTcoldFieldInput.disableProperty().bind(binding);
    }

    private void updateCommonTable(boolean commonTable)
    {
        commonEnrTab.setText(commonTable ? "ENR Comun" : "ENR Calibracion");
    }

    private void transferSetup(int direction)
    {
        if (direction == VIEW_TO_SETUP)
        {
            enrSetup.getEnrModeOptions()
                    .setSelected(enrModeChoiceBox.getValue());
            enrSetup.getSpotModeOptions()
                    .setSelected(spotModeChoiceBox.getValue());
            // TODO: procesar EnrField
            enrSetup.getAutoLoadEnrOptions()
                    .setSelected(autoLoadEnrToggleButton.getText());
            enrSetup.getCommonEnrTableOptions()
                    .setSelected(commonEnrTableToggleButton.getText());

            enrSetup.getUserTcoldOptions()
                    .setSelected(userTcoldToggleButton.getText());
            // TODO: procesar TcoldField
            enrSetup.getSnsTcoldOptions()
                    .setSelected(snsTcoldToggleButton.getText());
            enrSetup.getNoiseSourcePreferenceOptions()
                    .setSelected(noiseSourcePreferenceChoiceBox.getValue());
        }
        else if (direction == SETUP_TO_VIEW)
        {
            // TODO: presentar datos en vista
        }
    }

    public EnrSetup getSetup()
    {
        transferSetup(VIEW_TO_SETUP);

        return enrSetup;
    }

    public void setSetup(EnrSetup setup)
    {
        enrSetup = setup;

        transferSetup(SETUP_TO_VIEW);
    }
}
