package ve.gob.cendit.cenditlab.tasks;

/**
 * Created by root on 26/08/17.
 */
public abstract class Component
{
    private String name;
    private String description;

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public abstract ComponentSlots getSlots(/* Context context */);

    protected abstract void setSlots(ComponentSlots slots);

    protected abstract void setContext(/* Context context */);

    // protected abstract Context getContext();

    //public abstract View getView(Context context);
}
