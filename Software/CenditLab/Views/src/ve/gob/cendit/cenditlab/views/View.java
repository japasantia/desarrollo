package ve.gob.cendit.cenditlab.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

public class View
{
    protected String DEFAULT_DESCRIPTION = "View";
    protected String DEFAULT_IMAGE_URL = "";

    private String name;
    private String description;
    private String fxmlResource;

    private Node viewNode;

    public View(String name, String fxmlResource, String description)
    {
        setName(name);
        setDescription(description);
        setFxmlResource(fxmlResource);
    }

    public void setName(String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("View name must not be null");
        }
        name = value;
    }

    public void setDescription(String value)
    {
        description = value;
    }

    public void setFxmlResource(String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("Fxml resource name must not be null");
        }
        fxmlResource = value;
        viewNode = null;

    }

    public String getFxmlResource()
    {
        return fxmlResource;
    }

    public Node getNode()
    {
        if (viewNode != null)
        {
            return viewNode;
        }

        viewNode = loadNodeFromFxmlResource(fxmlResource);
        return viewNode;
    }

    private Node loadNodeFromFxmlResource(String fxmlResource)
    {
        try
        {
            /*
            Creacion de Custom Control
            http://docs.oracle.com/javafx/2/fxml_get_started/custom_control.htm
            */
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlResource));
            Node node = loader.load();
            loader.setController(this);

            return node;
        }
        catch (Exception ex)
        {
            throw new RuntimeException(ex);
        }
    }
}
