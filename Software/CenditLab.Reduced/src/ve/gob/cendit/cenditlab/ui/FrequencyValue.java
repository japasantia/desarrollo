package ve.gob.cendit.cenditlab.ui;


import javafx.beans.property.FloatProperty;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FrequencyValue
{
    public static final String HZ = "Hz";
    public static final String KHZ = "kHz";
    public static final String MHZ = "MHz";
    public static final String GHZ = "GHz";
    public static final String DEFAULT_UNIT = HZ;

    private static final String FREQUENCY_VALUE_REGEX =
        "^\\s*[+-]?(?<magnitude>\\d+(.\\d*)?([eE][+-]?\\d+)?)(\\s*(?<unit>Hz|kHz|MHz|GHz))?\\s*$";

    private static final Pattern frequencyValuePattern =
            Pattern.compile(FREQUENCY_VALUE_REGEX);

    private float frequency;
    private String unit;

    private FloatProperty frequencyProperty;

    public FrequencyValue()
    {
        unit = DEFAULT_UNIT;
    }

    public FrequencyValue(float frequency, String unit)
    {
        this.frequency = frequency;
        this.unit = unit;
    }

    public FrequencyValue(String value, String unit)
    {
        this.frequency = Float.parseFloat(value);
        this.unit  = unit;
    }

    public float getMagnitude()
    {
        return frequency;
    }

    public String getUnit()
    {
        return unit;
    }

    @Override
    public String toString()
    {
        return String.format("%.2f %s",
                getMagnitude(), getUnit());
    }

    public static boolean isValid(String value)
    {
        return value.matches(FREQUENCY_VALUE_REGEX);
    }

    public static FrequencyValue parse(String value)
    {
        Matcher matcher = frequencyValuePattern.matcher(value);

        if (matcher.find())
        {
            String magnitude = matcher.group("magnitude");
            String unit = matcher.group("unit");

            return new FrequencyValue(magnitude, unit);
        }

        throw new IllegalArgumentException("Invalid frequency value format");
    }

    public static String[] getValidUnits()
    {
        return new String[] {GHZ, MHZ, KHZ, HZ};
    }
}
