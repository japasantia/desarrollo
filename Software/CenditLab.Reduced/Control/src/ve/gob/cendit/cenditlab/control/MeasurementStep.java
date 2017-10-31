package ve.gob.cendit.cenditlab.control;

public abstract class MeasurementStep
{

    private static final int INITIALIZED = 1;
    private static final int LOADED = 2;
    private static final int RUNNING = 4;
    private static final int UNLOADED = 8;

    private String name;
    private MeasurementManager ownerManager;

    private int status = UNLOADED;

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

    void setStatus(int value)
    {
        status = value;
    }

    public boolean isInitialized()
    {
        return checkStatus(INITIALIZED);
    }

    public boolean isLoaded()
    {
        return checkStatus(LOADED);
    }

    public boolean isRunning()
    {
        return checkStatus(RUNNING);
    }

    public boolean isUnloaded()
    {
        return checkStatus(UNLOADED);
    }

    private boolean checkStatus(int mask)
    {
        return (status & mask) != 0;
    }

    void executeInitialize()
    {
        if (isInitialized())
            return;

        initialize();
        setStatus(INITIALIZED);
    }

    void executeLoad()
    {
        if (isLoaded())
            return;

        load();
        setStatus(INITIALIZED | LOADED);
    }

    void executeRun()
    {
        if (isRunning())
            return;

        run();
        setStatus(INITIALIZED | LOADED | RUNNING);
    }

    void executeUnload()
    {
        if (isUnloaded())
            return;

        unload();
        setStatus(INITIALIZED | UNLOADED);
    }

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
