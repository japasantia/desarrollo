package ve.gob.cendit.cenditlab.views;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Label;

import ve.gob.cendit.cenditlab.tasks.GraphData;

import java.util.Arrays;


public class GraphView extends View
{
    private final static String FXML_URL = "graph-view.fxml";

    @FXML
    Label titleLabel;

    @FXML
    LineChart lineChart;

    private String name;
    private GraphData[] graphDataArray;
    private ObservableList<Series<Number, Number>> seriesList;

    public GraphView(String name, GraphData... graphDataArgs)
    {
        super(FXML_URL);

        if (graphDataArgs == null)
        {
            throw new IllegalArgumentException("Input graphData must not be null");
        }

        this.name = name;
        this.graphDataArray = graphDataArgs;
    }

    @Override
    public void update()
    {
        titleLabel.setText(name != null ? name : "");

        Axis<Number> xAxis = lineChart.getXAxis();
        xAxis.setAnimated(false);
        xAxis.setAutoRanging(true);

        Axis<Number> yAxis = lineChart.getYAxis();
        yAxis.setAnimated(false);
        yAxis.setAutoRanging(true);

        loadSeriesFromGraphData();

        lineChart.setData(seriesList);
    }

    private void loadSeriesFromGraphData()
    {
        if (seriesList == null && graphDataArray.length > 0)
        {
            seriesList = FXCollections.observableArrayList();

            Arrays.stream(graphDataArray)
                    .forEach(graphData ->
                    {
                        Series<Number, Number> series = new Series<>();

                        graphData.getDataPoints()
                                .forEach(point ->
                                {
                                    series.getData().add(new Data<>(point.getX(), point.getY()));
                                });

                        series.setName(graphData.getName());
                        seriesList.add(series);
                    });
        }
    }
}
