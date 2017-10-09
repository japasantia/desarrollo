package ve.gob.cendit.cenditlab.ui;

import java.util.LinkedList;
import java.util.List;

public class Value
{
    private String value;
    private String unit;

    List<IUpdateListener> listenersList;

    public Value()
    {}

    public Value(String value, String unit)
    {
        this.value = value;
        this.unit = unit;
    }

    public String getValue()
    {
        return value;
    }

    public String getUnit()
    {
        return unit;
    }

    public void setValue(String value)
    {
        this.value = value;

        callUpdateListeners();
    }

    public void setUnit(String unit)
    {
        this.unit = unit;

        callUpdateListeners();
    }

    public void addUpdateListener(IUpdateListener listener)
    {
        if (listenersList == null)
        {
            listenersList = new LinkedList<>();
        }

        if (listener != null)
        {
            listenersList.add(listener);
        }
    }

    public void removeUpdateListener(IUpdateListener listener)
    {
        if (listenersList != null && listener != null)
        {
            listenersList.remove(listener);
        }
    }

    private void callUpdateListeners()
    {
        if (listenersList != null)
        {
            listenersList.stream()
                    .forEach( listener -> listener.onUpdate());
        }
    }

    @Override
    public String toString()
    {
        return String.format("%s %s", value, unit);
    }
}
