package ve.gob.cendit.cenditlab.tasks;

/**
 * Created by jarias on 23/08/17.
 */
public class DataSlot
{
    private final String name;
    private final Data defaultData;
    private final DataDirection direction;

    public DataSlot(String name)
    {
        this(name, null, null);
    }

    public DataSlot(String name, Data defaultData)
    {
        this(name, defaultData, null);
    }

    public DataSlot(String name, Data defaultData, DataDirection direction)
    {
        if (name == null)
        {
            throw new IllegalArgumentException("name must not be null");
        }

        this.name = name;
        this.defaultData = defaultData;

        this.direction = (direction == null) ? DataDirection.BIDIRECTIONAL : direction;
    }

    public String getName()
    {
        return name;
    }

    public Data getDefaultData()
    {
        return defaultData;
    }

    public DataDirection getDirection()
    {
        return direction;
    }

    @Override
    public String toString()
    {
        return String.format("%s [%s, %s]",
                name,
                defaultData != null ? defaultData : "Empty",
                direction);
    }
}
