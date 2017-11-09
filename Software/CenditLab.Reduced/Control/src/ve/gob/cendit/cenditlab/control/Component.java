package ve.gob.cendit.cenditlab.control;

import javafx.scene.Node;
import ve.gob.cendit.cenditlab.ui.base.ViewType;

public abstract class Component
{
    private String name;
    private String description;
    private String iconUrl;

    public Component(String name, String description, String iconUrl)
    {
        if (name == null || description == null)
        {
            throw new IllegalArgumentException("name and description must not be null");
        }

        this.name = name;
        this.description = description;
        this.iconUrl = iconUrl;

        /*
        this.name = (name != null ? name : "Component");
        this.description = (description != null ? description : "");
        */
    }

    public String getName()
    {
        return name;
    }
    public String getDescription()
    {
        return description;
    }
    public String getIcon() { return iconUrl; }

    public abstract Node getView(ViewType viewType);
    public abstract Node getView(String viewId);
}
