package ve.gob.cendit.cenditlab.tasks;


public abstract class MeasurementStep
{
    private String name;

    private MeasurementSession stepOwnerSession;

    public MeasurementStep(String name)
    {
        this.name = name;
    }

    public MeasurementStep(String name, MeasurementSession stepOwnerSession)
    {
        this.name = name;
        setOwnerSession(stepOwnerSession);
    }

    public String getName()
    {
        return name;
    }

    void setOwnerSession(MeasurementSession stepOwnerSession)
    {
        if (this.stepOwnerSession != null)
        {
            stepOwnerSession.removeStep(this);
        }

        this.stepOwnerSession = stepOwnerSession;
    }

    public MeasurementSession getOwnerSession()
    {
        return stepOwnerSession;
    }

    public abstract boolean canEnter();
    public abstract boolean canExit();

    public abstract void initialize();

    public abstract void load();
    
    public abstract void run();
    
    public abstract void unload();
}
