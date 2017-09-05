package ve.gob.cendit.cenditlab.tasks;

/**
 * Created by root on 04/09/17.
 */
public class ArrayData extends Data
{
    public ArrayData(String name)
    {
        super(name);
    }

    public ArrayData(String name, Object value)
    {
        super(name, value);
    }

    public ArrayData(String name, Data data)
    {
        super(name, data);
    }

    public ArrayData(Data data)
    {
        super(data);
    }

    @Override
    public void set(Object value)
    {
        super.set(parseArray(value));
    }

    @Override
    public void set(Data data)
    {
        this.set(data.get());
    }

    public static boolean isValid(Object value)
    {
        return (value != null && value instanceof Object[][]);
    }

    private static Object[][] parseArray(Object value)
    {
        if ( ! isValid(value) )
        {
            throw new IllegalArgumentException("Value does not contain a valid array representation");
        }

        return (Object[][]) value;
    }

    @Override
    public String toString()
    {
        Object[][] objArray = (Object[][]) get();

        if (objArray == null)
        {
            return "{}";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < objArray.length; ++i)
        {
            if (objArray[i] == null)
            {
                sb.append("{}");
                continue;
            }

            sb.append("{");

            Object[] objRow = objArray[i];

            for (int j = 0; j < objRow.length - 1; j++)
            {
                Object value = objRow[j];
                sb.append(String.format(" %s,",
                        value != null ? value : ""));
            }

            Object value = objRow[objRow.length - 1];
            sb.append(String.format(" %s }",
                    (value != null) ? value : ""));
        }

        return sb.toString();
    }
}
