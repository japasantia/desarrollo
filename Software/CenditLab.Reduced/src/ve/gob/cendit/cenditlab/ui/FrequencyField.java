package ve.gob.cendit.cenditlab.ui;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FrequencyField extends Field
{
    public static final String HZ = "Hz";
    public static final String KHZ = "kHz";
    public static final String MHZ = "MHz";
    public static final String GHZ = "GHz";
    public static final String DEFAULT_UNIT = HZ;

    public static final String DEFAULT_VALUE = "0.0";

    private static final String FREQUENCY_FIELD_REGEX =
        "^\\s*(?<scalar>[+-]?\\d+(.\\d*)?([eE][+-]?\\d+)?)(\\s*(?<unit>Hz|kHz|MHz|GHz))?\\s*$";

    private static final String FREQUENCY_SCALAR_REGEX =
            "(?<scalar>[+-]?\\d+(.\\d*)?([eE][+-]?\\d+)?)";

    private static final String FREQUENCY_UNIT_REGEX =
            "(?<unit>Hz|kHz|MHz|GHz)";

    private static final Pattern frequencyFieldPattern =
            Pattern.compile(FREQUENCY_FIELD_REGEX);

    private static final Pattern frequencyScalarPattern =
            Pattern.compile(FREQUENCY_SCALAR_REGEX);

    private static final Pattern frequencyUnitRegex =
            Pattern.compile(FREQUENCY_UNIT_REGEX);

    float magnitude;

    public FrequencyField()
    {
        super(DEFAULT_VALUE, DEFAULT_UNIT);
    }

    public FrequencyField(String scalar, String unit)
    {
        float magnitude = FrequencyField.parseFloat(scalar);
        float multiplier = FrequencyField.getMultiplier(unit);

        setMagnitude(magnitude * multiplier);
    }

    public FrequencyField(String field)
    {
        float magnitude = FrequencyField.parseFloat(field);
        setMagnitude(magnitude);
    }

    public void setMagnitude(float magnitude)
    {
        String unit = HZ;

        this.magnitude = magnitude;

        unit = FrequencyField.getUnitFromMagnitude(magnitude);
        magnitude = FrequencyField.normalizeMagnitude(magnitude);

        super.setValue(String.valueOf(magnitude));
        super.setUnit(unit);
    }

    public float getMagnitude()
    {
        float magnitude = Float.parseFloat(getValue());

        switch (getUnit())
        {
            case GHZ:
                return magnitude * 1.0e9f;
            case MHZ:
                return magnitude * 1.0e6f;
            case KHZ:
                return magnitude * 1.0e3f;
            default:
                return magnitude;
        }
    }

    @Override
    public void setValue(String value)
    {
        setMagnitude(FrequencyField.parseFloat(value));
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
        return value.matches(FREQUENCY_FIELD_REGEX);
    }

    public static FrequencyField parse(String value)
    {
        Matcher matcher = frequencyFieldPattern.matcher(value);

        if (matcher.find())
        {
            String scalar = matcher.group("scalar");
            String unit = matcher.group("unit");

            return new FrequencyField(scalar, unit);
        }

        throw new IllegalArgumentException("Invalid frequency value format");
    }

    public static String[] getValidUnits()
    {
        return new String[] {GHZ, MHZ, KHZ, HZ};
    }

    public static float getMultiplier(String unit)
    {
        switch (unit)
        {
            case GHZ:
                return 1.0e9f;
            case MHZ:
                return 1.0e6f;
            case KHZ:
                return 1.0e3f;
            case HZ:
                return 1;
            default:
                throw new IllegalArgumentException("invalid unit");
        }
    }

    public static boolean hasScalar(String field)
    {
        return field != null && field.matches(FREQUENCY_SCALAR_REGEX);
    }

    public static boolean hasUnit(String field)
    {
        return field != null && field.matches(FREQUENCY_UNIT_REGEX);
    }

    public static float parseFloat(String field)
    {
        float magnitude = 0.0f;
        float multiplier = 1.0f;

        if (hasScalar(field))
        {
            String scalar = FrequencyField.extractScalar(field);
            magnitude = Float.parseFloat(scalar);
        }

        if (hasUnit(field))
        {
            String unit = FrequencyField.extractUnit(field);
            multiplier = FrequencyField.getMultiplier(unit);
        }

        return magnitude * multiplier;
    }

    public static String getUnitFromMagnitude(float magnitude)
    {
        float abs = Math.abs(magnitude);

        if (abs >= 1.0e9f)
        {
            return GHZ;
        }
        else if (abs >= 1.0e6)
        {
            return MHZ;
        }
        else if (abs >= 1.0e3)
        {
            return KHZ;
        }

        return HZ;
    }

    public static String extractScalar(String field)
    {
        return extractPart(field, "scalar", frequencyScalarPattern);
    }

    public static String extractUnit(String field)
    {
        return extractPart(field, "unit", frequencyUnitRegex);
    }

    private static String extractPart(String field, String partName, Pattern pattern)
    {
        Matcher matcher = pattern.matcher(field);

        if (matcher.find())
        {
            return matcher.group(partName);
        }

        return null;
    }

    private static float normalizeMagnitude(float magnitude)
    {
        float abs = Math.abs(magnitude);

        if (abs >= 1.0e9f)
        {
            return magnitude / 1.0e9f;
        }
        else if (abs >= 1.0e6)
        {
            return magnitude / 1.0e6f;
        }
        else if (abs >= 1.0e3)
        {
            return magnitude / 1.0e3f;
        }

        return magnitude;
    }
}
