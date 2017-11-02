package ve.gob.cendit.cenditlab.systems;

import ve.gob.cendit.cenditlab.app.CenditLabApplication;
import ve.gob.cendit.cenditlab.control.System;
import ve.gob.cendit.cenditlab.control.MeasurementStep;
import ve.gob.cendit.cenditlab.ui.SystemsSetupView;


public class SystemsSetupStep extends MeasurementStep
{
    private boolean blocked = false;
    private SystemsSetupView systemsSetupView;

    private System[] systemsArray;

    public SystemsSetupStep(String name, System... systems)
    {
        super(name);

        systemsArray = systems;
        systemsSetupView = new SystemsSetupView();
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
        systemsSetupView.setSystems(systemsArray);
    }

    @Override
    public void load()
    {
        CenditLabApplication.getApp().setCenterContainer(systemsSetupView);
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
