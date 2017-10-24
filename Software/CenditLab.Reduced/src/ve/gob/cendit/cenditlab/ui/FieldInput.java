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

public class FieldInput extends HBox
{
    private static final String FXML_URL = "field-input.fxml";

    @FXML
    private TextField valueTextField;

    @FXML
    private ChoiceBox<Unit> unitsChoiceBox;

    private List<IUpdateListener> listenersList;
    private boolean updateEnabled;

    private Field field;

    public FieldInput()
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
                            validateValue();
                    });
        unitsChoiceBox.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) ->
                    {
                        validateUnit(newValue);
                    });

        setUpdateEnabled(true);
    }

    private void validateValue()
    {
        field.setValue(valueTextField.getText());
        setField(field);

        callUpdateListeners();
    }

    private void validateUnit(Unit newUnit)
    {
        field.setUnit(newUnit);
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

    public void setUpdateEnabled(boolean enable)
    {
        updateEnabled = enable;
    }

    public boolean isUpdateEnabled()
    {
        return updateEnabled;
    }

    private void callUpdateListeners()
    {
        if (listenersList != null && isUpdateEnabled())
        {
            listenersList.stream()
                    .forEach(listener -> listener.onUpdate());
        }
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

    public Field getField()
    {
        return field;
    }

    @Override
    public String toString()
    {
        return field.toString();
    }

    public void setChoiceUnits(FieldUnits units)
    {
        if (units != null)
        {
            unitsChoiceBox.getItems().clear();
            unitsChoiceBox.getItems().addAll(units.getUnits());
            unitsChoiceBox.setVisible(true);
            unitsChoiceBox.setValue(units.get(0));
        }
        else
        {
            unitsChoiceBox.setVisible(false);
        }
    }

    public ObservableList<Unit> getChoiceUnits()
    {
        return unitsChoiceBox.getItems();
    }

    public Unit getUnit()
    {
        return unitsChoiceBox.getValue();
    }

    public void setUnit(Unit unit)
    {
        unitsChoiceBox.setValue(unit);
    }

    public boolean validate(IValueValidator validator)
    {
        return validator.isValid(toString());
    }
}
