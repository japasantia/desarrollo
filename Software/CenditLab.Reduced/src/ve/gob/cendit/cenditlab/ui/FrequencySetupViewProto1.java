package ve.gob.cendit.cenditlab.ui;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.GridPane;

public class FrequencySetupViewProto1 extends GridPane
{
    //private String FXML_URL = "../../../../../../../fxml/frequency-setup-view-proto-1.fxml";
    private String FXML_URL = "frequency-setup-view-proto-1.fxml";

    @FXML
    private ChoiceBox<String> frequencyModeChoiceBox;

    @FXML
    private ChoiceBox<String> bandwidthChoiceBox;

    @FXML
    private FieldInput minFrequencyFieldInput;

    @FXML
    private FieldInput maxFrequencyFieldInput;

    @FXML
    private FieldInput centralFrequencyFieldInput;

    @FXML
    private FieldInput spanFrequencyFieldInput;

    @FXML
    private FieldInput valueFrequencyFieldInput;

    @FXML
    private FieldInput pointsFieldInput;

    private Options frequencyModeOptions =
            new Options("Modo de frequencia", "Barrido", "Lista", "Valor");

    private Options bandwidthOptions =
            new Options("Ancho de banda", "100 kHz", "200 kHz", "400 kHz", "1 MHz", "2 MHz", "4 MHz");

    private FrequencyField minFrequencyField;
    private FrequencyField maxFrequencyField;
    private FrequencyField centralFrequencyField;
    private FrequencyField spanFrequencyField;
    private FrequencyField valueFrequencyField;

    private NumericField pointsField;

    private Boolean blockUpdate;

    public FrequencySetupViewProto1()
    {
        ViewLoader.load(FXML_URL, this, this);

        initialize();
    }

    private void initialize()
    {
        blockUpdate = true;

        minFrequencyField = new FrequencyField();
        maxFrequencyField = new FrequencyField();
        centralFrequencyField = new FrequencyField();
        spanFrequencyField = new FrequencyField();
        valueFrequencyField = new FrequencyField();
        pointsField = new NumericField();

        minFrequencyFieldInput.addUpdateListener(() -> minMaxFrequenciesUpdate());
        maxFrequencyFieldInput.addUpdateListener(() -> minMaxFrequenciesUpdate());

        centralFrequencyFieldInput.addUpdateListener(() -> centralSpanFrequenciesUpdate());
        spanFrequencyFieldInput.addUpdateListener(() -> centralSpanFrequenciesUpdate());

        minFrequencyFieldInput.setField(minFrequencyField);
        maxFrequencyFieldInput.setField(maxFrequencyField);
        centralFrequencyFieldInput.setField(centralFrequencyField);
        spanFrequencyFieldInput.setField(spanFrequencyField);
        valueFrequencyFieldInput.setField(valueFrequencyField);

        pointsFieldInput.setField(pointsField);

        minFrequencyFieldInput.setChoiceUnits(FrequencyField.FIELD_UNITS);
        maxFrequencyFieldInput.setChoiceUnits(FrequencyField.FIELD_UNITS);
        centralFrequencyFieldInput.setChoiceUnits(FrequencyField.FIELD_UNITS);
        spanFrequencyFieldInput.setChoiceUnits(FrequencyField.FIELD_UNITS);
        valueFrequencyFieldInput.setChoiceUnits(FrequencyField.FIELD_UNITS);

        frequencyModeChoiceBox.getItems()
                .addAll(frequencyModeOptions.getValues());
        frequencyModeChoiceBox.setValue(frequencyModeOptions.getDefault());

        bandwidthChoiceBox.getItems()
                .addAll(bandwidthOptions.getValues());
        bandwidthChoiceBox.setValue(bandwidthOptions.getDefault());

        blockUpdate = false;
    }

    private void minMaxFrequenciesUpdate()
    {
        if (blockUpdate)
        {
            return;
        }

        blockUpdate = true;

        float centralFrequency =
                (maxFrequencyField.getMagnitude() + minFrequencyField.getMagnitude()) / 2.0f;
        float spanFrequency =
                (maxFrequencyField.getMagnitude() - minFrequencyField.getMagnitude());

        centralFrequencyField.setMagnitude(centralFrequency);
        spanFrequencyField.setMagnitude(spanFrequency);

        centralFrequencyFieldInput.setUpdateEnabled(false);
        spanFrequencyFieldInput.setUpdateEnabled(false);

        centralFrequencyFieldInput.setField(centralFrequencyField);
        spanFrequencyFieldInput.setField(spanFrequencyField);

        centralFrequencyFieldInput.setUpdateEnabled(true);
        spanFrequencyFieldInput.setUpdateEnabled(true);

        blockUpdate = false;
    }

    private void centralSpanFrequenciesUpdate()
    {
        if (blockUpdate)
        {
            return;
        }

        blockUpdate = true;

        float maxFrequency =
                centralFrequencyField.getMagnitude() + spanFrequencyField.getMagnitude() / 2.0f;
        float minFrequency =
                centralFrequencyField.getMagnitude() - spanFrequencyField.getMagnitude() / 2.0f;

        maxFrequencyField.setMagnitude(maxFrequency);
        minFrequencyField.setMagnitude(minFrequency);

        minFrequencyFieldInput.setUpdateEnabled(false);
        maxFrequencyFieldInput.setUpdateEnabled(false);

        maxFrequencyFieldInput.setField(maxFrequencyField);
        minFrequencyFieldInput.setField(minFrequencyField);

        minFrequencyFieldInput.setUpdateEnabled(true);
        maxFrequencyFieldInput.setUpdateEnabled(true);

        blockUpdate = false;
    }

    public FrequencyField getMinFrequency()
    {
        return minFrequencyField;
    }

    public FrequencyField getMaxFrequency()
    {
        return maxFrequencyField;
    }

    public FrequencyField getCentralFrequency()
    {
        return centralFrequencyField;
    }

    public FrequencyField getFrequencySpan()
    {
        return spanFrequencyField;
    }

    public Field getPoints()
    {
        return pointsField;
    }

    public Options getFrequencyModeOptions()
    {
        return frequencyModeOptions;
    }

    public Options getBandwidthOptions()
    {
        return bandwidthOptions;
    }

    public void setMinFrequency(FrequencyField value)
    {
        if (value == null) return;

        minFrequencyField = value;

        centralSpanFrequenciesUpdate();
    }

    public void setMaxFrequency(FrequencyField value)
    {
        if (value == null) return;

        maxFrequencyField = value;

        centralSpanFrequenciesUpdate();
    }

    public void setCentralFrequency(FrequencyField value)
    {
        if (value == null) return;

        centralFrequencyField = value;

        centralSpanFrequenciesUpdate();
    }

    public void setSpanFrequency(FrequencyField value)
    {
        if (value == null) return;

        spanFrequencyField = value;

        centralSpanFrequenciesUpdate();
    }

    public void setPoints(NumericField value)
    {
        if (value == null) return;

        this.pointsField = value;
    }
}
