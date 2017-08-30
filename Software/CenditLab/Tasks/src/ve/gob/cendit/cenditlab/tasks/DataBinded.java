package ve.gob.cendit.cenditlab.tasks;


public class DataBinded extends Data
{
    private Data dataBinded;

    public DataBinded(String name, Data data)
    {
        super(name);
        dataBinded = data;
    }

    @Override
    public Object set(Object value)
    {
        return dataBinded.set(value);
    }

    @Override
    public Object set(Data data)
    {
        return dataBinded.set(data);
    }

    @Override
    public Object get()
    {
        return dataBinded.get();
    }

    @Override
    public String toString()
    {
        return dataBinded.toString();
    }
}
