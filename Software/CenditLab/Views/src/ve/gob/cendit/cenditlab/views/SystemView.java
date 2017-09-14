package ve.gob.cendit.cenditlab.views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.awt.event.MouseEvent;

public class SystemView extends View
{
    private static final String DEFAULT_NAME = "Nombre del Sistema";
    private static final String DEFAULT_DESCRIPTION = "Descripcion del sistema";
    private static final String FXML_URL = "system-view.fxml";

    @FXML
    private Pane rootPane;

    @FXML
    private ImageView systemImageView;

    @FXML
    private Label nameLabel;

    @FXML
    private Label descriptionLabel;

    private String name;
    private String description;
    private String imageUrl;

    public SystemView()
    {
        super(FXML_URL);
    }

    public  SystemView(String name, String description, String imageUrl)
    {
        super(FXML_URL);

        // TODO: revisar constructor
        publishEvents();
    }

    @Override
    public void update()
    {
        nameLabel.setText(getName());
        descriptionLabel.setText(getDescription());

        if (imageUrl != null)
        {
            systemImageView.setImage(new Image(imageUrl));
        }

        attachEvents();
    }

    public String getName()
    {
        return (name != null ? name : DEFAULT_NAME);
    }

    public String getDescription()
    {
        return (description != null ? description : DEFAULT_DESCRIPTION);
    }

    private void publishEvents()
    {
        publishEvent(ON_CLICK);
        publishEvent(ON_MOUSE_OVER);
    }

    private void attachEvents()
    {

        rootPane.setOnMouseClicked(e ->
            raiseEvent(ON_CLICK, this, e.getButton(), e.getX(), e.getY()));

        rootPane.setOnMouseMoved(e ->
            raiseEvent(ON_MOUSE_OVER, this, e.getX(), e.getY()));
    }

    public static final int ON_CLICK = 1;
    public static final int ON_MOUSE_OVER = 2;
}
