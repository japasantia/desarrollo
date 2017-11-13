package ve.gob.cendit.cenditlab.ui;

import javafx.fxml.FXML;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;
import ve.gob.cendit.cenditlab.data.Field;
import ve.gob.cendit.cenditlab.data.Options;

public class SetupContainerView extends ScrollPane
{
    private static final String FXML_URL = "fxml/setup-container-view.fxml";
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

    public void addField(String title, Field field)
    {
        int nextRow = nextSingleRow();

        setupGridPane.add(new Label(title), 0, nextRow);
        setupGridPane.add(new FieldInput(field), 1, nextRow);
    }

    public void addOptions(String title, Options options)
    {
        int nextRow = nextSingleRow();

        ChoiceBox<String> choiceBox = new ChoiceBox();
        choiceBox.setPrefHeight(Region.USE_COMPUTED_SIZE);
        choiceBox.getItems().addAll(options.getValues());
        choiceBox.setValue(options.getDefault());

        setupGridPane.add(new Label(title), 0, nextRow);
        setupGridPane.add(choiceBox, 1, nextRow);
    }

    public void addSectionLabel(String caption)
    {
        int nextRow = nextSingleRow();

        setupGridPane.add(new Label(caption), 0, nextRow, 2, 1);
    }

    public void addFrequencyListPane(String title, FrequencyListPane pane)
    {
        int nextRow = nextExtendedRow();

        setupGridPane.add(pane, 0, nextRow,2, 1);
    }

    public void addFrequencyRangePane(String title, FrequencyRangePane pane)
    {
        insertExtendedRow(pane, 2, 1);
    }

    public void addBasicFrequencySetupView(String title, BasicFrequencySetupView view)
    {
        insertExtendedRow(view, 2, 1);
    }

    public void addFrequencySetupView(String title, FrequencySetupView view)
    {
        insertExtendedRow(view, 2, 1);
    }

    public void addEnrSetupView(String title, EnrSetupViewProto1 view)
    {
        insertExtendedRow(view, 2, 1);
    }

    public void addSetupView(String title, SetupView view)
    {
        insertExtendedRow(view, 2, 1);
    }

    public void addSetup(String title, Object setupObject)
    {
        if (setupObject instanceof Field)
        {
            addField(title, (Field) setupObject);
        }
        else if (setupObject instanceof Options)
        {
            addOptions(title, (Options) setupObject);
        }
        else if (setupObject instanceof FrequencyListPane)
        {
            addFrequencyListPane(title, (FrequencyListPane) setupObject);
        }
        else if (setupObject instanceof FrequencyRangePane)
        {
            addFrequencyRangePane(title, (FrequencyRangePane) setupObject);
        }
        else if (setupObject instanceof BasicFrequencySetupView)
        {
            addBasicFrequencySetupView(title,
                    (BasicFrequencySetupView) setupObject);
        }
        else if (setupObject instanceof FrequencySetupView)
        {
            addFrequencySetupView(title, (FrequencySetupView) setupObject);
        }
        else if (setupObject instanceof EnrSetupViewProto1)
        {
            addEnrSetupView(title, (EnrSetupViewProto1) setupObject);
        }
    }

    public void remove(Node node)
    {
        setupGridPane.getChildren().remove(node);
    }

    public int getRows()
    {
        return setupGridPane.getRowConstraints().size();
    }

    private int nextSingleRow()
    {
        setupGridPane.getRowConstraints()
                .add(singleRow);

        return getRows() - 1;
    }

    private int nextExtendedRow()
    {
        setupGridPane.getRowConstraints()
                .add(extendedRow);

        return getRows() - 1;
    }

    private void insertSingleRow(Node node, int columnspan, int rowspan)
    {
        int nextRow = nextSingleRow();

        setupGridPane.add(node, 0, nextRow, columnspan, rowspan);
    }

    private void insertExtendedRow(Node node, int columnspan, int rowspan)
    {
        int nextRow = nextExtendedRow();

        setupGridPane.add(node, 0, nextRow, columnspan, rowspan);
    }
}
