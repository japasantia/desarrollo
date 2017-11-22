package ve.gob.cendit.cenditlab.views;

import ve.gob.cendit.cenditlab.tasks.ComponentSlots;
import ve.gob.cendit.cenditlab.tasks.Slot;
import ve.gob.cendit.cenditlab.data.Data;
import ve.gob.cendit.cenditlab.data.ArrayData;
import ve.gob.cendit.cenditlab.data.BooleanData;
import ve.gob.cendit.cenditlab.data.GraphData;
import ve.gob.cendit.cenditlab.data.NumberData;
import ve.gob.cendit.cenditlab.data.ListData;


import java.util.Arrays;

public class ComponentSetupView extends View
{
    private ColumnContainerView rootColumn;

    public ComponentSetupView()
    {
        rootColumn = new ColumnContainerView();
        setViewNode(rootColumn.getNode());
    }

    @Override
    public void update()
    { }

    public void setComponentSlots(ComponentSlots componentSlots)
    {
        Slot[] slots = componentSlots.getSlots();

        Arrays.stream(slots)
                .forEach(slot -> {
                    Data data = componentSlots.getData(slot);
                    Data defaultData = componentSlots.getDefaultData(slot);

                    if (data != null && defaultData == null)
                    {

                    }


                    if (data instanceof Data)
                    {

                    }
                    else if (data instanceof ArrayData)
                    {

                    }

                });
    }
}
