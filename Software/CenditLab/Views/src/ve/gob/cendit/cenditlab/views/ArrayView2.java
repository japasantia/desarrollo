package ve.gob.cendit.cenditlab.views;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import ve.gob.cendit.cenditlab.tasks.ArrayData;


/**
 * Created by root on 07/09/17.
 */
public class ArrayView2 extends View
{
    private static final String FXML_URL = "array-data-view-2.fxml";

    @FXML
    Label titleLabel;

    @FXML
    Pane contentPane;

    private ArrayData arrayData;

    public ArrayView2(ArrayData arrayData)
    {
        super(FXML_URL);

        this.arrayData = arrayData;
    }

    @Override
    public void update()
    {
        contentPane.widthProperty().addListener(
                l -> presentArrayData());
        contentPane.heightProperty().addListener(
                l -> presentArrayData());
    }

    private void presentArrayData()
    {
        if (arrayData == null)
        {
            return;
        }

        contentPane.getChildren().clear();

        titleLabel.setText(arrayData.getName());

        Object[][] array = (Object[][]) arrayData.get();

        for (int i = 0; i < array.length; ++i)
        {
            Object[] row = (Object[]) array[i];

            if (row == null)
            {
                continue;
            }

            int rows = array.length;
            int cols = array[0].length;
            double width = contentPane.getBoundsInLocal().getWidth();
            double height = contentPane.getBoundsInLocal().getHeight();
            double cellWidth = width / cols;
            double cellHeight = height / rows;

            for (int j = 0; j < row.length; j++)
            {
                Object value = row[j];

                if (value != null)
                {

                    Text text = new Text(value.toString());
                    text.setLayoutX(cellWidth * j);
                    text.setLayoutY(cellHeight * i);

                    text.setStyle(
                        String.format("-fx-max-width: %f; -fx-max-height: %f",
                                cellHeight, cellHeight));
                    contentPane.getChildren().add(text);
                }
            }
        }
    }

    @FXML
    void contentPaneMouseClicked(MouseEvent event)
    {
        titleLabel.setText("Clicked");
    }
}
