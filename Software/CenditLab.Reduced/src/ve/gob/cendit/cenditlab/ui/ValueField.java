package ve.gob.cendit.cenditlab.ui;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class ValueField extends HBox
{
    private static final String FXML_URL = "value-field.fxml";

    @FXML
    private TextField valueTextField;

    @FXML
    private ChoiceBox<String> unitsChoiceBox;

    public ValueField()
    {
        FXMLLoader fxmlLoader =
                new FXMLLoader(getClass()
                        .getResource(FXML_URL));

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
    }

    public void setMagnitude(String value)
    {
        valueTextField.setText(value);
    }

    public String getMagnitude()
    {
        return valueTextField.getText();
    }

    public String getValue()
    {
        String magnitude = getMagnitude();
        String unit  = getUnit();


        if (magnitude != null && !magnitude.isEmpty())
        {
            if (unit != null && !unit.isEmpty())
            {
                return String.format("%s %s", magnitude, unit);
            }
            else
            {
                return magnitude;
            }
        }

        return "";
    }

    public void setChoiceUnits(String... units)
    {
        if (units != null && units.length > 0)
        {
            unitsChoiceBox.getItems().clear();
            unitsChoiceBox.getItems().addAll(units);
            unitsChoiceBox.setVisible(true);
            unitsChoiceBox.setValue(units[0]);
        }
        else
        {
            unitsChoiceBox.setVisible(false);
        }
    }

    public void setChoiceUnits(ObservableList<String> units)
    {
        if (units != null && units.size() > 0)
        {
            unitsChoiceBox.getItems().clear();
            unitsChoiceBox.setItems(units);
            unitsChoiceBox.setValue(units.get(0));
        }
        else
        {
            unitsChoiceBox.setVisible(false);
        }
    }

    public ObservableList<String> getChoiceUnits()
    {
        return unitsChoiceBox.getItems();
    }

    public String getUnit()
    {
        return unitsChoiceBox.getValue();
    }

    public void setUnit(String unit)
    {
        unitsChoiceBox.setValue(unit);
    }

    public boolean validate(IValueValidator validator)
    {
        return validator.isValid(getValue());
    }
}
