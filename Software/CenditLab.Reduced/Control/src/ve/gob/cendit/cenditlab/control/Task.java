package ve.gob.cendit.cenditlab.control;

import ve.gob.cendit.cenditlab.data.Field;
import ve.gob.cendit.cenditlab.data.FieldsContainer;

import java.util.List;

public abstract class Task extends Component
{
    public Task(String name, String description, String iconUrl)
    {
        super(name, description, iconUrl);
    }

    public abstract void execute();

    public abstract FieldsContainer getSetupFields();
}
