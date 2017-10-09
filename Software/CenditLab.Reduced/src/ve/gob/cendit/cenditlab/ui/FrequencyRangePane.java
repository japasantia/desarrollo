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
            value -> FrequencyValue.isValid(value);

    private FrequencyValue minFrequencyValue;
    private FrequencyValue maxFrequencyValue;
    private FrequencyValue centralFrequencyValue;
    private FrequencyValue spanFrequencyValue;
    private Value pointsValue;

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
        minFrequencyValue = new FrequencyValue();
        maxFrequencyValue = new FrequencyValue();
        centralFrequencyValue = new FrequencyValue();
        spanFrequencyValue = new FrequencyValue();
        pointsValue = new Value();

        minFrequencyValueField.addUpdateListener(() -> minMaxFrequenciesUpdate());
        maxFrequencyValueField.addUpdateListener(() -> minMaxFrequenciesUpdate());

        centralFrequencyValueField.addUpdateListener(() -> centralSpanFrequenciesUpdate());
        spanFrequencyValueField.addUpdateListener(() -> centralSpanFrequenciesUpdate());

        minFrequencyValueField.setValue(minFrequencyValue);
        maxFrequencyValueField.setValue(maxFrequencyValue);
        centralFrequencyValueField.setValue(centralFrequencyValue);
        spanFrequencyValueField.setValue(spanFrequencyValue);
        pointsValueField.setValue(pointsValue);

        String[] frequencyValidUnits = FrequencyValue.getValidUnits();

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

        centralFrequencyValueField.setValue(centralFrequencyValue);
        spanFrequencyValueField.setValue(spanFrequencyValue);
    }

    private void centralSpanFrequenciesUpdate()
    {
        float maxFrequency =
                spanFrequencyValue.getMagnitude() / 2.0f + centralFrequencyValue.getMagnitude();
        float minFrequency =
                spanFrequencyValue.getMagnitude() / 2.0f - centralFrequencyValue.getMagnitude();

        maxFrequencyValue.setMagnitude(maxFrequency);
        minFrequencyValue.setMagnitude(minFrequency);

        maxFrequencyValueField.setValue(maxFrequencyValue);
        minFrequencyValueField.setValue(minFrequencyValue);
    }

    public boolean validate()
    {
        return minFrequencyValueField.validate(valueValidator) &&
                maxFrequencyValueField.validate(valueValidator) &&
                centralFrequencyValueField.validate(valueValidator) &&
                spanFrequencyValueField.validate(valueValidator);
    }
    /*
    public FrequencyValue getMinFrequency()
    {

    }

    public FrequencyValue getMaxFrequency()
    {

    }

    public FrequencyValue getCentralFrequency()
    {

    }

    public FrequencyValue getFrequencySpan()
    {

    }
    */
}
