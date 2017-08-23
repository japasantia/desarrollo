package ve.gob.cendit.cenditlab.tasks;


import java.util.*;

public class DataContainer
{
    private final DataSlot[] dataSlots;
    private Map<String, Data> dataMap =
            new HashMap<>();

    public DataContainer(DataSlot... dataSlots)
    {
        if (dataSlots.length == 0)
        {
            throw new IllegalArgumentException("Data slots must not be empty");
        }

        this.dataSlots = dataSlots;

        Arrays.stream(dataSlots)
            .forEach(ds -> dataMap.put(ds.getName(), ds.getDefaultData()));
    }


    private Optional<DataSlot> findDataSlotByName(String slotName)
    {
        return Arrays.stream(dataSlots)
            .filter(ds -> ds.getName() == slotName)
            .findFirst();
    }

    public Data getDefaultData(String slotName)
    {
        Optional<DataSlot> result = findDataSlotByName(slotName);

        return result.isPresent() ? result.get().getDefaultData() : null;
    }

    public boolean containsSlot(String slotName)
    {
        return findDataSlotByName(slotName)
                .isPresent();
    }

    public DataSlot[] getDataSlots()
    {
        return dataSlots;
    }

    public DataSlot getDataSlot(String slotName)
    {
        Optional<DataSlot> result = findDataSlotByName(slotName);

        return result.isPresent() ? result.get() : null;
    }

    public DataSlot getDataSlot(int slotIndex)
    {
        if (slotIndex >= 0 && slotIndex < dataSlots.length)
        {
            return dataSlots[slotIndex];
        }

        return null;
    }

    public Data getData(String slotName)
    {
        return dataMap.get(slotName);
    }

    public Data getData(DataSlot dataSlot)
    {
        return dataMap.get(dataSlot.getName());
    }

    public Data getData(int slotIndex)
    {
        if (slotIndex >= 0 && slotIndex < dataSlots.length)
        {
            return dataMap.get(dataSlots[slotIndex].getName());
        }

        return null;
    }

    public void setData(String slotName, Data data)
    {
        if (dataMap.containsKey(slotName))
        {
            dataMap.put(slotName, data);
        }
    }

    public void setData(DataSlot dataSlot, Data data)
    {
        setData(dataSlot.getName(), data);
    }

    public void setData(int slotIndex, Data data)
    {
        DataSlot dataSlot = getDataSlot(slotIndex);

        if (dataSlot != null)
        {
            setData(dataSlot.getName(), data);
        }
    }

    public void loadData(Data... dataArgs)
    {
        int size = dataArgs.length;

        if (size == 0 || size != dataSlots.length)
        {
            throw new IllegalArgumentException("Data arguments size doesn't match with data slots size");
        }

        Iterator<Data> iterData = Arrays.asList(dataArgs).iterator();
        dataMap.keySet().stream()
            .forEach(key -> dataMap.put(key, iterData.next()));
    }

/*
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        for (String slotName : dataMap.keySet())
        {
            sb.append(String.format("%s: %s, ",
                    slotName, dataMap.get(slotName)));
        }


        if (sb.length() > 2)
        {
            return sb.substring(0, sb.length() - 2);
        }

        return sb.toString();
    }
 */

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        dataMap.keySet().stream()
            .forEach(slotName -> sb.append(String.format("%s\t", slotName)));

        sb.append('\n');

        dataMap.entrySet().stream()
            .forEach(entry -> sb.append(String.format("%s\t", entry.getValue())));

        sb.append('\n');

        return sb.toString();
    }
}
