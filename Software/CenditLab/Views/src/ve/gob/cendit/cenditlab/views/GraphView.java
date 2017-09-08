package ve.gob.cendit.cenditlab.views;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Label;
import ve.gob.cendit.cenditlab.tasks.ArrayData;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by jarias on 08/09/17.
 */
public class GraphView extends View
{
    private final static String FXML_URL = "graph-view.fxml";

    @FXML
    Label titleLabel;

    @FXML
    LineChart graphLineChart;

    private ArrayData arrayData;
    private ObservableList<Series<Number, Number>> seriesList;

    public GraphView(ArrayData arrayData)
    {
        super(FXML_URL);

        this.arrayData = arrayData;
    }

    @Override
    public void update()
    {
        titleLabel.setText(arrayData.getName());

        loadData();

        Axis<Number> xAxis = graphLineChart.getXAxis();
        xAxis.setAnimated(false);
        xAxis.setAutoRanging(true);

        Axis<Number> yAxis = graphLineChart.getYAxis();
        yAxis.setAnimated(false);
        yAxis.setAutoRanging(true);
    }

    private void loadData()
    {
        int dataSeries = arrayData.getColumns() / 2;

        seriesList = FXCollections.observableArrayList();

        for (int col = 0; col <= dataSeries; col += 2)
        {
            Series<Number,Number> series =
                makeSeries(col, col + 1);
            seriesList.add(series);
            series.setName(String.format("%s[%s]", arrayData.getName(), col));
        }

        graphLineChart.setData(seriesList);
    }

    private Series<Number, Number> makeSeries(int columnX, int columnY)
    {
        Series<Number, Number> series = new Series<>();
        ObservableList<Data<Number, Number>> dataList =
                series.getData();

        for (int row = 0; row < arrayData.getRows(); ++row)
        {
            Object xObj = arrayData.getItem(row, columnX);
            Object yObj = arrayData.getItem(row, columnY);

            if (xObj instanceof Number && yObj instanceof Number)
            {
                Number x = (Number) xObj;
                Number y = (Number) yObj;
                dataList.add(new Data<Number, Number>(x, y));
            }
        }

        return series;
    }

}
