package ve.gob.cendit.cenditlab.control;

public abstract class System extends Component
{
    public System(String name, String description, String iconUrl)
    {
        super(name, description, iconUrl);
    }

    public abstract Task[] getTasks();

    public abstract MeasurementManager getMeasurementManager();
}
