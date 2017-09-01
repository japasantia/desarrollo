package ve.gob.cendit.cenditlab.tasks;

import java.util.regex.Pattern;

public class NumericData extends Data
{
    public NumericData(String name)
    {
        super(name);
    }

    public NumericData(String name, Object value)
    {
        super(name, value);
    }

    public NumericData(String name, Data data)
    {
        super(name, data);
    }

    public NumericData(Data data)
    {
        super(data);
    }

    @Override
    public void set(Object value)
    {
        if (NumericData.isValid(value))
        {
            super.set(value);
        }
        else
        {
            throw new IllegalArgumentException("Value does not contain a valid numeric representation");
        }
    }

    @Override
    public void set(Data data)
    {
        this.set(data.get());
    }

    @Override
    public String toString()
    {
        return super.toString();
    }

    /* Representacion numerica NR1 */
    private static final String INTEGER_PATTERN =
            "^\\s*[+-]?\\d+$";

    /* Representacion numerica NR2 */
    private static final String FLOAT_PATTERN =
        "^\\s*[+-]?\\d+(\\.\\d*)?([eE][+-]?(\\d+))?\\s*$";

    /* representaciones NR3 */
    /* Representacion Binaria */
    private static final String BINARY_PATTERN =
        "^\\s*#[bB][\\dabcdefABCDEF]+\\s*$";

    /* Representacion Octal */
    private static final String OCTAL_PATTERN =
            "^\\s*#[oO][\\dabcdefABCDEF]+\\s*$";

    /* Representacion Hexadecimal */
    private static final String HEX_PATTERN =
            "^\\s*#[hH][\\dabcdefABCDEF]+\\s*$";


    private static final String[] NUMERIC_PATTERNS = new String[]
    {
        INTEGER_PATTERN,
        FLOAT_PATTERN,
        BINARY_PATTERN,
        OCTAL_PATTERN,
        HEX_PATTERN
    };


    public static boolean isValid(Object value)
    {
        if (value == null || !(value instanceof Number || value instanceof String))
        {
            return false;
        }

        return isValid(value.toString());
    }

    public static boolean isValid(String value)
    {
        for (String pattern : NUMERIC_PATTERNS)
        {
            if ( value.matches(pattern) )
            {
                return true;
            }
        }

        return false;
    }

    public static boolean isInteger(String value)
    {
        return value != null && value.matches(INTEGER_PATTERN);
    }

    public static boolean isFloat(String value)
    {
        return value != null && value.matches(FLOAT_PATTERN);
    }

    public static boolean isHex(String value)
    {
        return value != null && value.matches(HEX_PATTERN);
    }

    public static boolean isBinary(String value)
    {
        return value != null && value.matches(BINARY_PATTERN);
    }

    public static boolean isOctal(String value)
    {
        return value != null && value.matches(OCTAL_PATTERN);
    }
}
