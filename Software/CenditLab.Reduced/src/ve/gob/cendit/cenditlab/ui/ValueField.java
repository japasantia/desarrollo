package ve.gob.cendit.cenditlab.ui;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ValueField extends HBox
{
    private static final String FXML_URL = "value-field.fxml";

    @FXML
    private TextField valueTextField;

    @FXML
    private ChoiceBox<String> unitsChoiceBox;

    private List<IUpdateListener> listenersList;

    private Field field;

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

        initialize();
    }

    private void initialize()
    {
        field = new Field();


        valueTextField.focusedProperty()
                .addListener((observable, oldValue, newValue) ->
                    {
                        if (!newValue)
                            validate();
                    });
        unitsChoiceBox.focusedProperty()
                .addListener((observable, oldValue, newValue) ->
                    {
                        if (!newValue)
                            validate();
                    });
    }

    private void validate()
    {
        field.setValue(valueTextField.getText());
        field.setUnit(unitsChoiceBox.getValue());

        setField(field);

        callUpdateListeners();
    }

    public void addUpdateListener(IUpdateListener listener)
    {
        if (listenersList == null)
        {
            listenersList = new LinkedList<>();
        }

        if (listener != null)
        {
            listenersList.add(listener);
        }
    }

    public void removeUpdateListener(IUpdateListener listener)
    {
        if (listenersList != null)
        {
            listenersList.remove(listener);
        }
    }

    private void callUpdateListeners()
    {
        listenersList.stream()
                .forEach(listener -> listener.onUpdate());
    }

    public void setField(Field field)
    {
        if (field == null)
        {
            throw new IllegalArgumentException("field must not be null");
        }

        this.field = field;

        valueTextField.setText(field.getValue());
        unitsChoiceBox.setValue(field.getUnit());
    }

    public String getField()
    {
        return valueTextField.getText();
    }

    @Override
    public String toString()
    {
        return field.toString();
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
        return validator.isValid(toString());
    }
}
