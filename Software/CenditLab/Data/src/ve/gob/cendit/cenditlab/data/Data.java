package ve.gob.cendit.cenditlab.data;

import ve.gob.cendit.cenditlab.control.EventEmitter;

public class Data
{
    private String name;

    private EventEmitter<IUpdateListener> updateEventEmitter;

    public Data()
    {
        this("Data");
    }

    public Data(String name)
    {
        setName(name);

        updateEventEmitter = new EventEmitter<IUpdateListener>("OnUpdate", this::onUpdateEventCaller);
    }

    protected void setName(String value)
    {
        name = value;
    }

    public String getName()
    {
        return name;
    }

    public void update()
    {
        updateEventEmitter.call(this, (Object) null);
    }

    public void setUpdateEnabled(boolean value)
    {
        updateEventEmitter.setEnabled(value);
    }

    public boolean isUpdateEnabled()
    {
        return updateEventEmitter.isEnabled();
    }

    public void addUpdateListener(IUpdateListener listener)
    {
        updateEventEmitter.addListener(listener);
    }

    public void removeListener(IUpdateListener listener)
    {
        updateEventEmitter.removeListener(listener);
    }



    private void onUpdateEventCaller(Object source, IUpdateListener listener, Object... args)
    {
        listener.onUpdate(source);
    }


}
