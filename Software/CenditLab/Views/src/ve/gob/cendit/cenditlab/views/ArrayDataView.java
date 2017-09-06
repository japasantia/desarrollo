package ve.gob.cendit.cenditlab.views;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;


import ve.gob.cendit.cenditlab.tasks.ArrayData;



/**
 * Created by root on 04/09/17.
 */
public class ArrayDataView extends View
{
    private static final String FXML_URL = "array-data-view.fxml";

    @FXML
    Label titleLabel;

    @FXML
    GridPane headerGridPane;

    @FXML
    GridPane contentGridPane;

    @FXML
    void contentGridPaneClicked(MouseEvent event)
    {
        GridPane source = (GridPane) event.getSource();

        if (source == null)
        {
            return;
        }

        double width = source.getWidth();
        double height = source.getHeight();

        Object[][] array = (Object[][]) arrayData.get();
        double x = event.getX();
        double y = event.getY();
        double cellWidth = width / array[0].length;
        double cellHeight = height / array.length;

        int row = (int)(y / cellHeight);
        int col = (int)(x / cellWidth);

        TextField textField = new TextField(String.format("Added %d:%d", row, col));
        textField.setMaxWidth(cellWidth);
        textField.setMaxHeight(cellHeight);
        textField.setPrefWidth(cellWidth);
        textField.setPrefHeight(cellHeight);

        contentGridPane.add(textField, col, row);
    }

    private ArrayData arrayData;
    private String[] headers;

    public ArrayDataView()
    {
        super(FXML_URL);
    }

    public ArrayDataView(ArrayData value)
    {
        super(FXML_URL);

        setData(value);
    }

    public ArrayDataView(ArrayData value, String... headers)
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

        Object[][] array = (Object[][]) arrayData.get();

        for (int i = 0; i < array.length; ++i)
        {
            Object[] row = (Object[]) array[i];

            if (row == null)
            {
                continue;
            }

            for (int j = 0; j < row.length; j++)
            {
                Object value = row[j];

                if (value != null)
                {
                    // TextField valueTextField = new TextField();
                    // valueTextField.setText(value.toString());

                    // contentGridPane.add(valueTextField, j, i);

                    Label valueLabel = new Label(value.toString());
                    valueLabel.setMaxWidth(Double.MAX_VALUE);
                    valueLabel.setAlignment(Pos.CENTER);
                    GridPane.setHgrow(valueLabel, Priority.ALWAYS);
                    contentGridPane.add(valueLabel, j, i);
                }
            }
        }

        ColumnConstraints referenceColumnConstraints = new ColumnConstraints();
        referenceColumnConstraints.setFillWidth(false);
        referenceColumnConstraints.setMinWidth(10.0);
        referenceColumnConstraints.setMaxWidth(Double.POSITIVE_INFINITY);
        referenceColumnConstraints.setHgrow(Priority.NEVER);
        referenceColumnConstraints.setPercentWidth(-1);

        for (int i = 0; i < contentGridPane.getColumnConstraints().size(); ++i)
        {
            contentGridPane.getColumnConstraints().set(i, referenceColumnConstraints);
        }


        RowConstraints referenceRowConstraints = new RowConstraints();
        referenceRowConstraints.setFillHeight(false);
        referenceRowConstraints.setMinHeight(30);
        referenceRowConstraints.setVgrow(Priority.NEVER);
        referenceRowConstraints.setPercentHeight(-1);

        for (int i = 0; i < contentGridPane.getRowConstraints().size(); ++i)
        {
            contentGridPane.getRowConstraints().set(i, referenceRowConstraints);
        }

        /*
        contentGridPane.getColumnConstraints()
            .stream()
            .forEach(cc -> {
                cc.setFillWidth(true);
                cc.setMinWidth(10.0);
                cc.setPrefWidth(100.0);
                cc.setMaxWidth(Double.POSITIVE_INFINITY);
                cc.setHgrow(Priority.ALWAYS);
                cc.setPercentWidth(-1);
            });
        */
    }

    private void presentHeaders()
    {
        if (headers == null)
        {
            return;
        }

        ColumnConstraints referenceColumnConstraints = new ColumnConstraints();
        referenceColumnConstraints.setFillWidth(true);
        referenceColumnConstraints.setMinWidth(10.0);
        referenceColumnConstraints.setMaxWidth(Double.POSITIVE_INFINITY);
        referenceColumnConstraints.setHgrow(Priority.ALWAYS);
        referenceColumnConstraints.setPercentWidth(-1);

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



}
