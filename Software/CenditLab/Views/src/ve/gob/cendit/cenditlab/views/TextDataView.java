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

    public TextDataView(Data data)
    {
        super(data.getName(), FXML_FILE, null);
    }

    public TextDataView(String name, String value, String description)
    {
        super(name, FXML_FILE, description);
    }

    public void setName(String value)
    {
        nameLabel.setText(value != null ? value : "");
    }

    public void setValue(String value)
    {
        valueTextField.setText(value != null ? value : "");
    }

    public void setData(Data data)
    {
        nameLabel.setText(data.getName());
        valueTextField.setText(data.toString());
    }

    public void setData(DataSlot slot, Data data)
    {
        nameLabel.setText(slot.getName());
        valueTextField.setText(data.toString());
    }
}
