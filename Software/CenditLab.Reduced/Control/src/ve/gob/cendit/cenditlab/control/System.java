package ve.gob.cendit.cenditlab.control;

import ve.gob.cendit.cenditlab.data.FieldsContainer;

public abstract class System extends Component
{
    public System(String name, String description, String iconUrl)
    {
        super(name, description, iconUrl);
    }

    public abstract FieldsContainer getSetupFields();
    public abstract Task[] getTasks();
}
