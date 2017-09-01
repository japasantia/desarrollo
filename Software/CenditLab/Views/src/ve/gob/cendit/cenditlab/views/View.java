package ve.gob.cendit.cenditlab.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

public abstract class View
{
    private String fxmlResource;
    private Node viewNode;

    public View(String fxmlResource)
    {
        setFxmlResource(fxmlResource);
    }

    protected void setFxmlResource(String path)
    {
        if (path == null)
        {
            throw new IllegalArgumentException("Fxml resource name must not be null");
        }

        fxmlResource = path;
        viewNode = null;
    }

    protected String getFxmlResource()
    {
        return fxmlResource;
    }

    public abstract void update();

    public void load()
    {
        if (viewNode == null)
        {
            viewNode = loadNodeFromFxmlResource(this, fxmlResource);
        }
    }

    public Node getNode()
    {
        load();
        update();
        return viewNode;
    }

    private static Node loadNodeFromFxmlResource(View controller, String fxmlResource)
    {
        try
        {
            /*
            Creacion de Custom Control
            http://docs.oracle.com/javafx/2/fxml_get_started/custom_control.htm
            */
            FXMLLoader loader =
                new FXMLLoader(controller.getClass().getResource(fxmlResource));
            loader.setController(controller);
            Node node = loader.load();

            return node;
        }
        catch (Exception ex)
        {
            throw new RuntimeException(ex);
        }
    }
}
