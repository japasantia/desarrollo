package ve.gob.cendit.cenditlab.views;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import ve.gob.cendit.cenditlab.tasks.Data;
import ve.gob.cendit.cenditlab.tasks.DataSlot;

/**
 * Created by root on 29/08/17.
 */
public class TextDataView extends View
{
    private static final String FXML_FILE = "text-data-view.fxml";

    @FXML
    Label nameLabel;

    @FXML
    TextField valueTextField;

    private String name;
    private String value;

    public TextDataView()
    {
        super(FXML_FILE);
    }

    public TextDataView(DataSlot slot, Data data)
    {
        super(FXML_FILE);

        setName(slot.getName());
        setValue(data.get());
    }

    public TextDataView(Data data)
    {
        super(FXML_FILE);

        setName(data.getName());
        setValue(data.get());
    }

    public TextDataView(String name, String value)
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
