package ve.gob.cendit.cenditlab.data;


import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.XYChart;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class GraphData extends Data
{
    public static final int NORMAL_BUFFER = 0;
    public static final int FIXED_BUFFER = 1;
    public static final int CIRCULAR_BUFFER = 2;
    public static final int QUEUE_BUFFER = 3;

    private static final int BUFFER_MODE_MIN = 0;
    private static final int BUFFER_MODE_MAX = 3;

    private final static int DEFAULT_LIMIT_SIZE = 100;

    private ArrayList<XYChart.Data<Number, Number>> dataList;
    private XYChart.Series<Number, Number> series;

    private int limitSize = DEFAULT_LIMIT_SIZE;
    private int index = -1;
    private int growMode = NORMAL_BUFFER;

    private Consumer<XYChart.Data<Number, Number>> addPointFunction;

    public GraphData(String name)
    {
        super(name);

        dataList = new ArrayList<>();
        addPointFunction = this::addPointNormalMode;
    }

    public void addPoints(double[] pointsX, double[] pointsY)
    {
        if (pointsX == null || pointsY == null || pointsX.length != pointsY.length)
        {
            throw new IllegalArgumentException("pointsX and pointsY must have equal size");
        }

        for (int i = 0; i < pointsX.length; i++)
        {
            addPoint(pointsX[i], pointsY[i]);
        }
    }

    public void addPoint(double pointX, double pointY)
    {
        addPointFunction.accept(new XYChart.Data<Number, Number>(pointX, pointY));
    }

    private void addPointNormalMode(XYChart.Data<Number, Number> data)
    {
        if (index < limitSize)
        {
            ++index;
            dataList.add(data);
        }
        else
        {
            flushAppendData();
            clearPoints();
            index = -1;
        }
    }

    private void addPointFixedSizeMode(XYChart.Data<Number, Number> data)
    {
        if (limitSize == -1)
        {
            return;
        }

        if (index < limitSize)
        {
            ++index;
            dataList.add(data);
        }
        else
        {
            limitSize = -1;
            flushSetData();
            clearPoints();
        }
    }

    private void addPointCircularBufferMode(XYChart.Data<Number, Number> data)
    {
        if (index < limitSize)
        {
            ++index;
            dataList.add(data);
        }
        else
        {
            index = -1;
            flushSetData();
            clearPoints();
        }
    }

    private void addPointQueueBufferMode(XYChart.Data<Number, Number> data)
    {
        if (index < limitSize)
        {
            ++index;
            dataList.add(data);
        }
        else
        {
            index = -1;
            flushAppendData();
            clearPoints();
        }
    }

    public void clearPoints()
    {
        dataList.clear();
    }

    public List<XYChart.Data<Number, Number>> getPoints()
    {
        return dataList;
    }

    public XYChart.Series<Number, Number> getSeries()
    {
        if (series == null)
        {
            series = new XYChart.Series<>();
            series.setName(getName());
        }

        return series;
    }

    private void flushSetData()
    {
        if (series != null)
        {
            Platform.runLater(() ->
                {
                    series.setData(FXCollections.observableList(dataList));
                });
        }
    }

    private void flushAppendData()
    {
        if (series != null)
        {
            Platform.runLater(() ->
                {

                });
        }
    }

    public void setGrowMode(int value, int limitSize)
    {
        if (value >= BUFFER_MODE_MIN && value <= BUFFER_MODE_MAX && limitSize > 0)
        {
            index = -1;
            growMode = value;
            this.limitSize = limitSize;

            switch (growMode)
            {
                case NORMAL_BUFFER:
                    addPointFunction = this::addPointNormalMode;
                    break;

                case FIXED_BUFFER:
                    addPointFunction = this::addPointFixedSizeMode;
                    break;

                case CIRCULAR_BUFFER:
                    addPointFunction = this::addPointCircularBufferMode;
                    break;

                case QUEUE_BUFFER:
                    addPointFunction = this::addPointQueueBufferMode;
                    break;

                // TODO: revisar caso default
                default:
                    addPointFunction = this::addPointNormalMode;
                    break;
            }
        }
    }

    public int getGrowMode()
    {
        return growMode;
    }

    private static final String POINT_SEPARATOR = ";";
    private static final String COORD_SEPARATOR = ",";
    private static final String LIST_SPLIT_PATTERN = "[" + POINT_SEPARATOR + "," + COORD_SEPARATOR + "]";

    private static final String FLOAT_NUMBER_PATTERN =
        "\\s*[+-]?\\d+(\\.\\d*)?([eE][+-]?(\\d+))?\\s*";

    private static final String POINT_PATTERN =
        FLOAT_NUMBER_PATTERN + COORD_SEPARATOR + FLOAT_NUMBER_PATTERN;

    private static final String LIST_POINT_PATTERN =
        "(" + POINT_PATTERN + ")" + "(" + POINT_SEPARATOR + POINT_PATTERN + ")+";

    private static List<GraphPoint> parseFromObject(Object value)
    {
        if (value instanceof String)
        {
           return parseFromString((String)value);
        }
        else if (value instanceof Object[][])
        {
            return parseFromArrayColumns((Object[][]) value, 0, 1,
                    0, 0, -1);
        }
        else if (value instanceof Object[])
        {
            return parseFromArray((Object[]) value, 0, -1);
        }
        else
        {
            throw new IllegalArgumentException("Value does not contain a valid graph data representation");
        }
    }

    private static List<GraphPoint> parseFromString(String value)
    {
        if (value != null && value.matches(LIST_POINT_PATTERN))
        {
            String[] pointsString = value.split(LIST_SPLIT_PATTERN);

            int length = 2 * (pointsString.length / 2);

            List<GraphPoint> pointsList = new ArrayList<>(length / 2);

            for (int i = 0; i <  length; i += 2)
            {
                Float x = Float.parseFloat(pointsString[i]);
                Float y = Float.parseFloat(pointsString[i + 1]);
                pointsList.add(new GraphPoint(x, y));
            }

            return pointsList;
        }
        else
        {
            /* TODO: Cadena no presenta formato de lista */
            throw new IllegalArgumentException("Input string is not a valid point list");
        }
        /*
        if (value != null && value.matches(LIST_POINT_PATTERN))
        {
            String[] pointsString = value.split(POINT_SEPARATOR);

            List<GraphPoint> pointsList = new ArrayList<>(pointsString.length);

            Arrays.stream(pointsString)
                    .forEach(point -> {
                        String[] coords = point.split(COORD_SEPARATOR);
                        Float x = Float.parseFloat(coords[0]);
                        Float y = Float.parseFloat(coords[1]);
                        pointsList.add(new GraphPoint(x, y));
                    });

            return pointsList;
        }
        else
        {
            //TODO: Cadena no presenta formato de lista
            throw new IllegalArgumentException("Value does not contain a valid graph data representation");
        }
        */
    }

    private static List<GraphPoint> parseFromArray(Object[] array, int offset, int length)
    {
        if (array == null || offset < 0)
        {
            throw new IllegalArgumentException("array must not be null and offset must be valid array start index");
        }

        length = (length >= 0 ? length : array.length);
        length = 2 * (length / 2);

        ArrayList pointsList = new ArrayList<>(length / 2);

        for (int i = 0; i < length; i += 2)
        {
            try
            {
                pointsList.add(new GraphPoint(array[i], array[i + 1]));
            }
            catch (Exception ex)
            {
                /* TODO: cambiar por tipo de excepcion mas apropiado */
                throw new RuntimeException("Error parsing from input array", ex);
            }
        }

        return pointsList;
    }

    private static List<GraphPoint> parseFromArray(Object[] arrayX, Object[] arrayY,
                                                   int offsetX, int offsetY, int length)
    {
        if (arrayX == null || arrayY == null)
        {
            throw new IllegalArgumentException("Input arrays must not be null");
        }

        if (offsetX < 0  || offsetY < 0)
        {
            throw new IllegalArgumentException("The offset in the array must not be negative");
        }

        length = (length >= 0 ?
                Math.min(Math.min(arrayX.length, arrayY.length), length) :
                Math.min(arrayX.length, arrayY.length));

        List<GraphPoint> pointsList = new ArrayList<>(length);

        for (int i = 0; i < length; ++i)
        {
            try
            {
                pointsList.add(new GraphPoint(arrayX[i + offsetX], arrayY[i + offsetY]));
            }
            catch (Exception ex)
            {
                /* TODO: cambiar por tipo de excepcion mas apropiado */
                throw new RuntimeException("Error parsing from input arrays", ex);
            }
        }

        return pointsList;
    }

    private static List<GraphPoint> parseFromArrayColumns(Object[][] array,
                                                   int columnX, int columnY,
                                                   int offsetX, int offsetY,
                                                   int length)
    {
        if (array == null)
        {
            throw new IllegalArgumentException("Input array must not be null");
        }

        if (columnX < 0 || columnY < 0 || offsetX < 0 || offsetY < 0)
        {
            throw new IllegalArgumentException("Column indexes and offsets must not be negative");
        }

        length = (length >= 0 ? length : array.length);
        List<GraphPoint> pointsList = new ArrayList<GraphPoint>(length);

        for (int i = 0; i < length; ++i)
        {
            Object[] rowX = array[i + offsetX];
            Object[] rowY = array[i + offsetY];

            if (rowX != null && rowY != null/* && xIndex < row.length && yIndex < row.length */)
            {
                try
                {
                    pointsList.add(new GraphPoint(rowX[columnX], rowY[columnY]));
                }
                catch (Exception ex)
                {
                        /* TODO: cambiar por tipo de excepcion mas apropiado */
                    throw new RuntimeException("Error parsing from input array", ex);
                }
            }
            else
            {
                    /* TODO: cambiar por tipo de excepcion mas apropiado */
                throw new RuntimeException("Array row must not be null");
            }
        }

        return pointsList;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        /*
        List<GraphPoint> pointsList = (List<GraphPoint>) get();

        pointsList.stream()
            .forEach(point -> {
                // TODO: revisar cast, falla para Integer -> point.toString()
                sb.append(String.format("%s; ", point));
            });

        if (sb.length() > 1)
        {
            sb.deleteCharAt(sb.length() - 1);
        }
        */
        return sb.toString();
    }
}
