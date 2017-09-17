package ve.gob.cendit.cenditlab.tasks;


public class MeasurementStep
{
    private String name;

    private MeasurementSession stepOwnerSession;

    public MeasurementStep(String name, MeasurementSession stepOwnerSession)
    {
        this.name = name;
        setOwnerSession(stepOwnerSession);
    }

    void setOwnerSession(MeasurementSession stepOwnerSession)
    {
        if (this.stepOwnerSession != null)
        {
            stepOwnerSession.removeStep(this);
        }

        this.stepOwnerSession = stepOwnerSession;
    }

    public MeasurementSession getStepOwnerSession()
    {
        return stepOwnerSession;
    }

    public MeasurementSession getOwnerSession()
    {
        return stepOwnerSession;
    }
    
    public void load()
    {
        
    }
    
    public void run()
    {
        
    }
    
    public void unload()
    {
        
    }
}
