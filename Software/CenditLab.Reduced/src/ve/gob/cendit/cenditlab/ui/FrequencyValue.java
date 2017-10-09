package ve.gob.cendit.cenditlab.ui;


import javafx.beans.property.FloatProperty;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FrequencyValue extends Value
{
    public static final String HZ = "Hz";
    public static final String KHZ = "kHz";
    public static final String MHZ = "MHz";
    public static final String GHZ = "GHz";
    public static final String DEFAULT_UNIT = HZ;

    public static final String DEFAULT_VALUE = "0.0";

    private static final String FREQUENCY_VALUE_REGEX =
        "^\\s*[+-]?(?<base>\\d+(.\\d*)?([eE][+-]?\\d+)?)(\\s*(?<unit>Hz|kHz|MHz|GHz))?\\s*$";

    private static final Pattern frequencyValuePattern =
            Pattern.compile(FREQUENCY_VALUE_REGEX);


    public FrequencyValue()
    {
        super(DEFAULT_VALUE, DEFAULT_UNIT);
    }

    public FrequencyValue(String frequency, String unit)
    {
        super(frequency, unit);
    }

    public void setMagnitude(float magnitude)
    {
        String value;
        String unit = HZ;

        float abs = Math.abs(magnitude);

        if (abs >= 1.0e9f)
        {
            magnitude /= 1.0e9f;

            unit = GHZ;
        }
        else if (magnitude >= 1.0e6)
        {
            magnitude /= 1.0e6;
            unit = MHZ;
        }
        else if (magnitude >= 1.0e3)
        {
            magnitude /= 1.0e3;
            unit = KHZ;
        }

        super.setValue(String.valueOf(magnitude));
        super.setUnit(unit);
    }

    public float getMagnitude()
    {
        float frequencyMagnitude = Float.parseFloat(getValue());

        switch (getUnit())
        {
            case GHZ:
                return frequencyMagnitude * 1.0e9f;
            case MHZ:
                return frequencyMagnitude * 1.0e6f;
            case KHZ:
                return frequencyMagnitude * 1.0e3f;
            default:
                return frequencyMagnitude;
        }
    }

    @Override
    public void setValue(String value)
    {
       super.setValue(value);
    }

    @Override
    public void setUnit(String unit)
    {
        super.setUnit(unit);
    }

    @Override
    public String toString()
    {
        String value = getValue();
        String unit = getUnit();

        return String.format("%.2f %s",
                value != null ? value : "",
                unit != null ? unit : "");
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
            String base = matcher.group("base");
            String unit = matcher.group("unit");

            return new FrequencyValue(base, unit);
        }

        throw new IllegalArgumentException("Invalid frequency value format");
    }

    public static String[] getValidUnits()
    {
        return new String[] {GHZ, MHZ, KHZ, HZ};
    }
}
