package ve.gob.cendit.cenditlab.tasks;


public class Data
{
    private Object value;
    private final String name;

    public Data(String name)
    {
        this.name = name;
    }

    public Data(String name, Object value)
    {
        this.name = name;
        this.value = value;
    }

    public Data(String name, Data data)
    {
        this.name = name;
        this.value = data.get();
    }

    public Data(Data data)
    {
        name = data.getName();
        value = data.get();
    }

    public Object set(Object value)
    {
        Object oldValue = this.value;
        this.value = value;

        return oldValue;
    }

    public Object set(Data data)
    {
        Object oldValue = value;
        value = data.get();

        return oldValue;
    }

    public Object get()
    {
        return value;
    }

    public String getName()
    {
        return name;
    }

    public void addQualifier(ValueQualifier qualifier)
    {

    }

    @Override
    public String toString()
    {
        return String.format("%s: %s", name, value);
    }
}
