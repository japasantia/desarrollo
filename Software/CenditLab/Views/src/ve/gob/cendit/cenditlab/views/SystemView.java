package ve.gob.cendit.cenditlab.views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SystemView extends View
{
    private static final String DEFAULT_NAME = "Nombre del Sistema";
    private static final String DEFAULT_DESCRIPTION = "Descripcion del sistema";
    private static final String FXML_URL = "system-view.fxml";

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
    }

    public String getName()
    {
        return (name != null ? name : DEFAULT_NAME);
    }

    public String getDescription()
    {
        return (description != null ? description : DEFAULT_DESCRIPTION);
    }
}
