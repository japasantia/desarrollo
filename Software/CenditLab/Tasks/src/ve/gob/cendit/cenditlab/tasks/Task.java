package ve.gob.cendit.cenditlab.tasks;

public abstract class Task
{
    private String name;

    private DataContainer dataContainer;

    public Task(String name, DataContainer dataContainer)
    {
        setName(name);

        setDataContainer(dataContainer);
    }

    public Task(String name, DataSlot... dataSlots)
    {
        this(name, new DataContainer(dataSlots));
    }

    protected Task()
    { }

    final protected void setName(String name)
    {
        if (name == null)
        {
            throw new IllegalArgumentException("Task name must not be null");
        }

        this.name = name;
    }

    final protected void setDataContainer(DataContainer dataContainer)
    {
        if (dataContainer == null)
        {
            throw new IllegalArgumentException("Task dataContainer must not be null");
        }

        this.dataContainer = dataContainer;
    }

    final protected void setDataSlots(DataSlot... dataSlots)
    {
        dataContainer = new DataContainer(dataSlots);
    }

    public String getName()
    {
        return name;
    }

    public DataContainer getDataContainer()
    {
        return dataContainer;
    }

    public abstract void execute();
}
