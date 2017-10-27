package ve.gob.cendit.cenditlab.ui;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import ve.gob.cendit.cenditlab.data.Field;
import ve.gob.cendit.cenditlab.data.Options;

public class FieldsView extends VBox
{
    private static final String FXML_URL = "fields-view.fxml";

    private int nextRow = -1;


    @FXML
    private GridPane parametersGridPane;

    public FieldsView()
    {
        ViewLoader.load(FXML_URL, this, this);
    }

    public void addField(String name, Field field)
    {
        int nextRow = insertRow();

        parametersGridPane.add(new Label(name), 0, nextRow);
        parametersGridPane.add(new FieldInput(field), 1, nextRow);
    }

    public void addOptions(String name, Options options)
    {
        int nextRow = insertRow();

        ChoiceBox<String> choiceBox = new ChoiceBox();
        choiceBox.getItems().addAll(options.getValues());
        choiceBox.setValue(options.getDefault());

        parametersGridPane.add(new Label(name), 0, nextRow);
        parametersGridPane.add(choiceBox, 1, nextRow);
    }

    public void addSectionLabel(String caption)
    {
        int nextRow = insertRow();

        parametersGridPane.add(new Label(caption), 0, nextRow, 2, 1);
    }

    public int getRows()
    {
        return parametersGridPane.getRowConstraints().size();
    }

    private int insertRow()
    {
        RowConstraints rowConstraints =
                parametersGridPane.getRowConstraints().get(0);
        parametersGridPane.getRowConstraints()
                .add(++nextRow, rowConstraints);

        return nextRow;
    }
}
