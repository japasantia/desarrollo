package ve.gob.cendit.cenditlab.systems;

import ve.gob.cendit.cenditlab.app.CenditLabApplication;
import ve.gob.cendit.cenditlab.control.MeasurementStep;
import ve.gob.cendit.cenditlab.control.System;
import ve.gob.cendit.cenditlab.control.Task;
import ve.gob.cendit.cenditlab.ui.IconView;
import ve.gob.cendit.cenditlab.ui.MasterDetailView;

public class TasksExecutionStep extends MeasurementStep
{
    private boolean blocked = false;

    private MasterDetailView masterDetailView;
    private System[] systemsArray;

    public TasksExecutionStep(String name, System... systems)
    {
        super(name);

        systemsArray = systems;
    }

    @Override
    public boolean canEnterFromStep(MeasurementStep step)
    {
        return ! isBlocked();
    }

    @Override
    public boolean canExitToStep(MeasurementStep step)
    {
        return ! isBlocked();
    }

    @Override
    public void initialize()
    {
        masterDetailView = new MasterDetailView();

        for (System system : systemsArray)
        {
            for (Task task : system.getTasks())
            {
                IconView taskIconView = new IconView(task.getName(), task.getIcon());
                masterDetailView.addDetail(taskIconView);
            }
        }
    }

    @Override
    public void load()
    {
        CenditLabApplication.getApp().setCenterContainer(masterDetailView);
    }

    @Override
    public void run()
    {

    }

    @Override
    public void unload()
    {

    }

    public void setBlocked(boolean value)
    {
        blocked = value;
    }

    public boolean isBlocked()
    {
        return blocked;
    }
}
