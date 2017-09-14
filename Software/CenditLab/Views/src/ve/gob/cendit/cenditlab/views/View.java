package ve.gob.cendit.cenditlab.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

public abstract class View extends EventPublisher
{
    private String fxmlUrl;
    private Node viewNode;

    public View(String fxmlUrl)
    {
        setFxmlUrl(fxmlUrl);
    }

    protected void setFxmlUrl(String path)
    {
        if (path == null)
        {
            throw new IllegalArgumentException("Fxml resource name must not be null");
        }

        fxmlUrl = path;
        viewNode = null;
    }

    protected String getFxmlUrl()
    {
        return fxmlUrl;
    }

    public abstract void update();

    public void load()
    {
        if (viewNode == null)
        {
            viewNode = loadNodeFromFxmlResource(this, fxmlUrl);
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
