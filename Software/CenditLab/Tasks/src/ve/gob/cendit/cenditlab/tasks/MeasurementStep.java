package ve.gob.cendit.cenditlab.tasks;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ve.gob.cendit.cenditlab.views.View;

public abstract class MeasurementStep
{
    private String name;
    private MeasurementManager ownerManager;
    private View stepView;

    public MeasurementStep(String name)
    {
        this.name = name;
    }

    public MeasurementStep(String name, MeasurementManager ownerManager)
    {
        this.name = name;
        setMeasurementManager(ownerManager);
    }

    public String getName()
    {
        return name;
    }

    void setMeasurementManager(MeasurementManager ownerManager)
    {
        if (this.ownerManager != null)
        {
            ownerManager.removeStep(this);
        }

        this.ownerManager = ownerManager;
    }

    public MeasurementManager getMeasurementManager()
    {
        return ownerManager;
    }

    public void setView(View view)
    {
        stepView = view;
    }

    public View getView()
    {
        return stepView;
    }

    public boolean canEnterFromStep(MeasurementStep step)
    {
        throw new NotImplementedException();
    }

    public boolean canExitToStep(MeasurementStep step)
    {
        throw new NotImplementedException();
    }

    public abstract boolean canEnter();
    public abstract boolean canExit();

    public abstract void initialize();

    public abstract void load();
    
    public abstract void run();
    
    public abstract void unload();
}
