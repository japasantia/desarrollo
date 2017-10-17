package ve.gob.cendit.cenditlab.ui;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyConfiguration
{
    public static final int FREQUENCY_SWEEP = 0;
    public static final int FREQUENCY_LIST = 1;
    public static final int FREQUENCY_FIXED = 2;

    public static final int BANDWIDTH_100KHZ = 0;
    public static final int BANDWIDTH_200KHZ = 1;
    public static final int BANDWIDTH_400KHZ = 2;
    public static final int BANDWIDTH_1MHZ = 3;
    public static final int BANDWIDTH_2MHZ = 4;
    public static final int BANDWIDTH_4MHZ = 5;

    public static final int AVERAGE_POINT = 0;
    public static final int AVERAGE_SWEEP = 1;

    private Options frequencyModeOptions =
            new Options("Frequency Mode", "Sweep", "List", "Fixed");

    private final Options bandwidthOptions =
            new Options("Bandwidth", "100kHz", "200kHz", "400kHz", "1MHz", "2MHz" ,"4MHz");

    private final Options averageOptions =
            new Options("Average", "ON", "OFF");

    private final Options averageMode =
            new Options("Average", "Point", "Sweep");

    private final FrequencyField maxFrequencyField =
            new FrequencyField();

    private final FrequencyField minFrequencyField =
            new FrequencyField();

    private final FrequencyField centralFrequencyField =
            new FrequencyField();

    private final FrequencyField spanFrequencyField =
            new FrequencyField();

    private final NumericField averagePoints =
            new NumericField();

    private final FrequencyField fixeFrequencyField =
            new FrequencyField();

    private List<FrequencyField> frequencyList;

    public void setFrequencyMode(int value)
    {}

    public String getFrequencyMode()
    {
        return frequencyModeOptions.getSelected();
    }

    public Options getFrequencyModeOptions()
    {
        return frequencyModeOptions;
    }

    public Options getAverageOptions()
    {
        return averageOptions;
    }

    public Options getBandwidthOptions()
    {
        return bandwidthOptions;
    }

    public FrequencyField getMaxFrequencyField()
    {
        return maxFrequencyField;
    }

    public FrequencyField getMinFrequencyField()
    {
        return minFrequencyField;
    }

    public FrequencyField getCentralFrequencyField()
    {
        return centralFrequencyField;
    }

    public FrequencyField getSpanFrequencyField()
    {
        return spanFrequencyField;
    }
}

class Options
{
    private String name;
    private List<String> valuesList;

    private String selected;
    private int selectedIndex;

    public Options(String name, String... values)
    {
        this.name = name;
        this.valuesList = Arrays.asList(values);
    }

    public String getName()
    {
        return name;
    }

    public int getSelectedIndex()
    {
        return selectedIndex;
    }

    public void setSelected(String value)
    {
        int index =  valuesList.indexOf(value);

        if (index != -1)
        {
            selected = value;
            selectedIndex = index;
        }
    }

    public String getSelected()
    {
        return selected;
    }

    public boolean hasOption(String value)
    {
        return valuesList.indexOf(value) != -1;
    }

    public List<String> getValues()
    {
        return Collections.unmodifiableList(valuesList);
    }
}

class Table
{

    public Table(String... headerNames)
    {

    }

    public TableRow getRow(int index)
    {
        return null;
    }

    public void addRow(TableRow row)
    {

    }
}

class TableRow
{

}