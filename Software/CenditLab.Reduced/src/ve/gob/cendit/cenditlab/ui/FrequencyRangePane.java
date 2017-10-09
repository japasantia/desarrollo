package ve.gob.cendit.cenditlab.ui;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
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
    private ValueField frequencySpanValueField;

    @FXML
    private ValueField frequencyPointsValueField;

    private static final IValueValidator valueValidator =
            value -> FrequencyValue.isValid(value);


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
        String[] frequencyValidUnits = FrequencyValue.getValidUnits();

        minFrequencyValueField.setChoiceUnits(frequencyValidUnits);
        maxFrequencyValueField.setChoiceUnits(frequencyValidUnits);
        centralFrequencyValueField.setChoiceUnits(frequencyValidUnits);
        frequencySpanValueField.setChoiceUnits(frequencyValidUnits);

        minFrequencyValueField.focusedProperty().addListener(
                observable -> focusChanged(observable));
    }

    private void focusChanged(Observable observable)
    {
        String maxFrequency = maxFrequencyValueField.getMagnitude();
        String minFrequency = minFrequencyValueField.getMagnitude();
    }

    public boolean validate()
    {
        return minFrequencyValueField.validate(valueValidator) &&
                maxFrequencyValueField.validate(valueValidator) &&
                centralFrequencyValueField.validate(valueValidator) &&
                frequencySpanValueField.validate(valueValidator);
    }


}
