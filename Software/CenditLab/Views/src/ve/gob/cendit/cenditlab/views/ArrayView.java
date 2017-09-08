package ve.gob.cendit.cenditlab.views;

import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;


import ve.gob.cendit.cenditlab.tasks.ArrayData;



/**
 * Created by root on 04/09/17.
 */
public class ArrayView extends View
{
    private static final String FXML_URL = "array-data-view.fxml";

    @FXML
    Label titleLabel;

    @FXML
    GridPane headerGridPane;

    @FXML
    GridPane contentGridPane;

    private ArrayData arrayData;
    private String[] headers;

    private TextField inputTextField;
    private Label lastLabel;
    private int lastRow = -1;
    private int lastColumn = -1;

    private static ColumnConstraints referenceColumnConstraints;
    private static RowConstraints referenceRowConstraints;

    static
    {
        referenceColumnConstraints = new ColumnConstraints();
        referenceColumnConstraints.setFillWidth(true);
        referenceColumnConstraints.setHgrow(Priority.ALWAYS);
        //referenceColumnConstraints.setMinWidth(50.0);
        //referenceColumnConstraints.setMaxWidth(50.0);

        referenceRowConstraints = new RowConstraints();
        referenceRowConstraints.setFillHeight(true);
        referenceRowConstraints.setVgrow(Priority.ALWAYS);
        //referenceRowConstraints.setMinHeight(50.0);
        //referenceColumnConstraints.setMaxWidth(50.0);
    }

    public ArrayView()
    {
        super(FXML_URL);
    }

    public ArrayView(ArrayData value)
    {
        super(FXML_URL);

        setData(value);
    }

    public ArrayView(ArrayData value, String... headers)
    {
        super(FXML_URL);

        setData(value, headers);
    }

    public void setData(ArrayData value)
    {
        arrayData = value;
    }

    public void setData(ArrayData arrayData, String... headers)
    {
        this.headers = headers;
        this.arrayData = arrayData;
    }

    @Override
    public void update()
    {
        presentArrayData();
        presentHeaders();
    }

    private void presentArrayData()
    {
        if (arrayData == null)
        {
            return;
        }

        titleLabel.setText(arrayData.getName());

        int rows = arrayData.getRows();
        int columns = arrayData.getColumns();

        for (int i = 0; i < rows; ++i)
        {
            for (int j = 0; j < columns; j++)
            {
                Object value = arrayData.getItem(i, j);

                if (value != null)
                {
                    Label valueLabel = new Label(value.toString());
                    valueLabel.setId(String.format("%d:%d", i, j));
                    valueLabel.setMaxWidth(Double.MAX_VALUE);
                    valueLabel.setAlignment(Pos.CENTER);
                    valueLabel.setStyle("-fx-background-color: yellow");
                    GridPane.setHgrow(valueLabel, Priority.ALWAYS);
                    GridPane.setVgrow(valueLabel, Priority.ALWAYS);
                    contentGridPane.add(valueLabel, j, i);
                }
            }
        }

        int percentWidth = 100 / rows;
        int percentHeight = 100 / columns;

        referenceColumnConstraints.setPercentWidth(percentWidth);
        referenceRowConstraints.setPercentHeight(percentHeight);

        for (int i = 0; i < contentGridPane.getColumnConstraints().size(); ++i)
        {
            contentGridPane.getColumnConstraints().set(i, referenceColumnConstraints);
        }

        for (int i = 0; i < contentGridPane.getRowConstraints().size(); ++i)
        {
            contentGridPane.getRowConstraints().set(i, referenceRowConstraints);
        }
    }

    private void presentHeaders()
    {
        if (headers == null)
        {
            return;
        }

        for (int i = 0; i < headers.length; ++i)
        {
            String header = (headers[i] != null ? headers[i] : "");

            Label valueLabel = new Label(header);
            valueLabel.setMaxWidth(Double.MAX_VALUE);
            valueLabel.setAlignment(Pos.CENTER);
            GridPane.setHgrow(valueLabel, Priority.ALWAYS);

            headerGridPane.add(valueLabel, i, 0);
            headerGridPane.getColumnConstraints().add(i, referenceColumnConstraints);
        }
    }

    @FXML
    void contentGridPaneClicked(MouseEvent event)
    {
        GridPane source = (GridPane) event.getSource();

        if (source == null)
        {
            return;
        }

        restoreLastLabel();

        lastLabel  = findLabelUnderCursor(event.getX(), event.getY());

        if (lastLabel != null)
        {
            Integer r = GridPane.getRowIndex(lastLabel);
            Integer c = GridPane.getColumnIndex(lastLabel);

            if (r != null && c != null)
            {
                if (inputTextField == null)
                {
                    inputTextField = new TextField();
                    //inputTextField.setMaxWidth(lastLabel.getBoundsInLocal().getWidth());
                    //inputTextField.setMinHeight(lastLabel.getBoundsInLocal().getHeight());
                    //inputTextField.setMaxHeight(lastLabel.getMaxHeight());
                    inputTextField.setAlignment(Pos.CENTER);
                    inputTextField.setPadding(Insets.EMPTY);
                    //inputTextField.setPrefColumnCount(10);

                    /*
                    valueLabel.setMaxWidth(Double.MAX_VALUE);
                    valueLabel.setStyle("-fx-background-color: yellow");
                    GridPane.setHgrow(valueLabel, Priority.ALWAYS);
                    GridPane.setVgrow(valueLabel, Priority.ALWAYS);
                    */
                    //GridPane.setHalignment(inputTextField, HPos.CENTER);
                    GridPane.setMargin(inputTextField, Insets.EMPTY);
                    //GridPane.setHgrow(inputTextField, Priority.ALWAYS);
                    //GridPane.setVgrow(inputTextField, Priority.ALWAYS);
                }

                lastRow = r.intValue();
                lastColumn = c.intValue();

                Object value = arrayData.getItem(lastRow, lastColumn);
                String cellValue = (value != null ? value.toString() : "");

                inputTextField.setText(cellValue);

                contentGridPane.getChildren().removeAll(lastLabel);
                contentGridPane.add(inputTextField, lastColumn, lastRow);
                GridPane.setConstraints(inputTextField, lastColumn, lastRow,
                        1, 1,
                        HPos.CENTER, VPos.CENTER,
                        Priority.NEVER, Priority.NEVER,
                        Insets.EMPTY);
                //contentGridPane.getColumnConstraints().remove(lastColumn);
                //contentGridPane.getColumnConstraints().set(lastColumn, referenceColumnConstraints);
            }
        }
    }

    private void restoreLastLabel()
    {
        if (lastLabel == null || lastRow == -1 || lastColumn == -1 )
        {
            return;
        }

        if (arrayData != null && inputTextField != null)
        {
            String cellValue;

            contentGridPane.getChildren().remove(inputTextField);
            cellValue = inputTextField.getText();
            cellValue = (cellValue != null ? cellValue : "");
            arrayData.setItem(lastRow, lastColumn, cellValue);

            lastLabel.setText(cellValue);
            contentGridPane.add(lastLabel, lastColumn, lastRow);

            lastLabel = null;
            lastColumn = -1;
            lastRow = -1;
        }
    }

    private Label findLabelUnderCursor(double cursorX, double cursorY)
    {
        FilteredList<Node> nodeList =
                contentGridPane.getChildren()
                        .filtered(node ->
                                node != null && node instanceof Label &&
                                        node.getBoundsInParent().contains(
                                                cursorX, cursorY)
                        );

        if (nodeList != null && nodeList.size() > 0)
        {
            return (Label) nodeList.get(0);
        }

        return null;
    }

    private void findPositionUnderCursor()
    {

    }
}
