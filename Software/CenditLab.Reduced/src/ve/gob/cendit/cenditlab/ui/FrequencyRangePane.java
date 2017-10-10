package ve.gob.cendit.cenditlab.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TitledPane;

import java.io.IOException;

public class FrequencyRangePane extends TitledPane
{
    private static final String FXML_URL = "frequency-range-pane.fxml";

    @FXML
    private ValueField minFrequencyValueField;

    @FXML
    private ValueField maxFrequencyValueField;

    @FXML
    private ValueField centralFrequencyValueField;

    @FXML
    private ValueField spanFrequencyValueField;

    @FXML
    private ValueField pointsValueField;

    private static final IValueValidator valueValidator =
            value -> FrequencyField.isValid(value);

    private FrequencyField minFrequencyValue;
    private FrequencyField maxFrequencyValue;
    private FrequencyField centralFrequencyValue;
    private FrequencyField spanFrequencyValue;
    private Field pointsField;

    public FrequencyRangePane()
    {
        FXMLLoader fxmlLoader =
                new FXMLLoader(getClass().
                        getResource(FXML_URL));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try
        {
            fxmlLoader.load();
        }
        catch (IOException ex)
        {
            throw new RuntimeException(ex);
        }

        initialize();
    }

    private void initialize()
    {
        minFrequencyValue = new FrequencyField();
        maxFrequencyValue = new FrequencyField();
        centralFrequencyValue = new FrequencyField();
        spanFrequencyValue = new FrequencyField();
        pointsField = new Field();

        minFrequencyValueField.addUpdateListener(() -> minMaxFrequenciesUpdate());
        maxFrequencyValueField.addUpdateListener(() -> minMaxFrequenciesUpdate());

        centralFrequencyValueField.addUpdateListener(() -> centralSpanFrequenciesUpdate());
        spanFrequencyValueField.addUpdateListener(() -> centralSpanFrequenciesUpdate());

        minFrequencyValueField.setField(minFrequencyValue);
        maxFrequencyValueField.setField(maxFrequencyValue);
        centralFrequencyValueField.setField(centralFrequencyValue);
        spanFrequencyValueField.setField(spanFrequencyValue);
        pointsValueField.setField(pointsField);

        String[] frequencyValidUnits = FrequencyField.getValidUnits();

        minFrequencyValueField.setChoiceUnits(frequencyValidUnits);
        maxFrequencyValueField.setChoiceUnits(frequencyValidUnits);
        centralFrequencyValueField.setChoiceUnits(frequencyValidUnits);
        spanFrequencyValueField.setChoiceUnits(frequencyValidUnits);
    }

    private void minMaxFrequenciesUpdate()
    {
        float centralFrequency =
                (maxFrequencyValue.getMagnitude() + minFrequencyValue.getMagnitude()) / 2f;
        float spanFrequency =
                (maxFrequencyValue.getMagnitude() - minFrequencyValue.getMagnitude());

        centralFrequencyValue.setMagnitude(centralFrequency);
        spanFrequencyValue.setMagnitude(spanFrequency);

        centralFrequencyValueField.setField(centralFrequencyValue);
        spanFrequencyValueField.setField(spanFrequencyValue);
    }

    private void centralSpanFrequenciesUpdate()
    {
        float maxFrequency =
                centralFrequencyValue.getMagnitude() + spanFrequencyValue.getMagnitude() / 2.0f;
        float minFrequency =
                centralFrequencyValue.getMagnitude() - spanFrequencyValue.getMagnitude() / 2.0f;

        maxFrequencyValue.setMagnitude(maxFrequency);
        minFrequencyValue.setMagnitude(minFrequency);

        maxFrequencyValueField.setField(maxFrequencyValue);
        minFrequencyValueField.setField(minFrequencyValue);
    }

    public boolean validate()
    {
        return minFrequencyValueField.validate(valueValidator) &&
                maxFrequencyValueField.validate(valueValidator) &&
                centralFrequencyValueField.validate(valueValidator) &&
                spanFrequencyValueField.validate(valueValidator);
    }
    /*
    public FrequencyField getMinFrequency()
    {

    }

    public FrequencyField getMaxFrequency()
    {

    }

    public FrequencyField getCentralFrequency()
    {

    }

    public FrequencyField getFrequencySpan()
    {

    }
    */
}
