package ve.gob.cendit.cenditlab.measurements;

public abstract class MeasurementStep
{
    private String name;
    private MeasurementManager ownerManager;
    //private View stepView;

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

    public abstract boolean canEnterFromStep(MeasurementStep step);
    public abstract boolean canExitToStep(MeasurementStep step);

    public abstract void initialize();

    public abstract void load();
    
    public abstract void run();
    
    public abstract void unload();

    @Override
    public String toString()
    {
        return String.format("Measurement Step: %s", getName());
    }
}
