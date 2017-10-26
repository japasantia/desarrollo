package ve.gob.cendit.cenditlab.ui;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import ve.gob.cendit.cenditlab.data.Field;
import ve.gob.cendit.cenditlab.data.Options;

public class FieldsView extends VBox
{
    private static final String FXML_URL = "fields-view.fxml";
    private int nextRow = -1;


    @FXML
    private GridPane fieldsGridPane;

    public FieldsView()
    {
        ViewLoader.load(FXML_URL, this, this);
    }

    public void addField(String name, Field field)
    {
        int nextRow = getNextRow();

        fieldsGridPane.add(new Label(name), 0, nextRow);
        fieldsGridPane.add(new FieldInput(field), 1, nextRow);
    }

    public void addOptions(String name, Options options)
    {
        int nextRow = getNextRow();

        ChoiceBox<String> choiceBox = new ChoiceBox();
        choiceBox.getItems().addAll(options.getValues());
        choiceBox.setValue(options.getDefault());

        fieldsGridPane.add(new Label(name), 0, nextRow);
        fieldsGridPane.add(choiceBox, 1, nextRow);
    }

    public void addSectionLabel(String caption)
    {
        int nextRow = getNextRow();

        fieldsGridPane.add(new Label(caption), 0, nextRow, 2, 1);
    }

    public int getRows()
    {
        return fieldsGridPane.getRowConstraints().size();
    }

    private int getNextRow()
    {
        return ++nextRow;
    }
}
