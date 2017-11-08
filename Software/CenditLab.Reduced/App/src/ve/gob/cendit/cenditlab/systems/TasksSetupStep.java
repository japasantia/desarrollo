package ve.gob.cendit.cenditlab.systems;

import ve.gob.cendit.cenditlab.app.CenditLabApplication;
import ve.gob.cendit.cenditlab.control.MeasurementStep;
import ve.gob.cendit.cenditlab.control.System;
import ve.gob.cendit.cenditlab.ui.TasksSetupView;

public class TasksSetupStep extends MeasurementStep
{
    private boolean blocked = false;

    private TasksSetupView tasksSetupView;
    private System[] systemsArray;

    public TasksSetupStep(String name, System... systems)
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
        tasksSetupView = new TasksSetupView(systemsArray);
    }

    @Override
    public void load()
    {
        CenditLabApplication.getApp().setCenterContainer(tasksSetupView);
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
