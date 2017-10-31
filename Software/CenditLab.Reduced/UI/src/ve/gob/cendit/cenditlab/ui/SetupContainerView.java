package ve.gob.cendit.cenditlab.ui;

import javafx.fxml.FXML;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import ve.gob.cendit.cenditlab.data.Field;
import ve.gob.cendit.cenditlab.data.Options;

public class SetupContainerView extends VBox
{
    private static final String FXML_URL = "setup-container-view.fxml";
    private static RowConstraints singleRow;
    private static RowConstraints extendedRow;

    private int nextRow = -1;

    static
    {
        singleRow = new RowConstraints(30, Region.USE_COMPUTED_SIZE,
                Region.USE_COMPUTED_SIZE, Priority.SOMETIMES,
                VPos.CENTER, false);
        extendedRow = new RowConstraints(200, Region.USE_COMPUTED_SIZE,
                Region.USE_COMPUTED_SIZE, Priority.ALWAYS,
                VPos.TOP, true);
    }

    @FXML
    private GridPane setupGridPane;

    public SetupContainerView()
    {
        ViewLoader.load(FXML_URL, this, this);
    }

    public void addField(String name, Field field)
    {
        int nextRow = insertSingleRow();

        setupGridPane.add(new Label(name), 0, nextRow);
        setupGridPane.add(new FieldInput(field), 1, nextRow);
    }

    public void addFrequencyListPane(String name, FrequencyListPane pane)
    {
        int nextRow = insertExtendedRow();

        setupGridPane.add(pane, 0, nextRow,2, 1);
    }

    public void addOptions(String name, Options options)
    {
        int nextRow = insertSingleRow();

        ChoiceBox<String> choiceBox = new ChoiceBox();
        choiceBox.setPrefHeight(Region.USE_COMPUTED_SIZE);
        choiceBox.getItems().addAll(options.getValues());
        choiceBox.setValue(options.getDefault());

        setupGridPane.add(new Label(name), 0, nextRow);
        setupGridPane.add(choiceBox, 1, nextRow);
    }

    public void addSectionLabel(String caption)
    {
        int nextRow = insertSingleRow();

        setupGridPane.add(new Label(caption), 0, nextRow, 2, 1);
    }

    public void remove(Node node)
    {
        setupGridPane.getChildren().remove(node);
    }

    public int getRows()
    {
        return setupGridPane.getRowConstraints().size();
    }

    private int insertSingleRow()
    {
        setupGridPane.getRowConstraints()
                .add(singleRow);

        return getRows() - 1;
    }

    private int insertExtendedRow()
    {
        setupGridPane.getRowConstraints()
                .add(extendedRow);

        return getRows() - 1;
    }
}
