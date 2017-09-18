package ve.gob.cendit.cenditlab.views;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import ve.gob.cendit.cenditlab.data.Data;
import ve.gob.cendit.cenditlab.tasks.Slot;

/**
 * Created by root on 29/08/17.
 */
public class TextView extends View
{
    private static final String FXML_FILE = "text-data-view.fxml";

    @FXML
    Label nameLabel;

    @FXML
    TextField valueTextField;

    private String name;
    private String value;

    public TextView()
    {
        super(FXML_FILE);
    }

    public TextView(Slot slot, Data data)
    {
        super(FXML_FILE);

        setName(slot.getName());
        setValue(data.get());
    }

    public TextView(Data data)
    {
        super(FXML_FILE);

        setName(data.getName());
        setValue(data.get());
    }

    public TextView(String name, String value)
    {
        super(FXML_FILE);

        setName(name);
        setValue(value);
    }

    @Override
    public void update()
    {
        nameLabel.setText(name);
        valueTextField.setText(value);
    }

    public void setName(String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("name can not be null");
        }

        name = value;
    }

    public void setValue(Object value)
    {
        this.value = (value != null ? value.toString() : "");
    }
}
