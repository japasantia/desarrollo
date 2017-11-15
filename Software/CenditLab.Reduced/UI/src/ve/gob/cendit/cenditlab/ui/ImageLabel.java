package ve.gob.cendit.cenditlab.ui;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageLabel extends Label
{
    private static final String FXML_URL = "fxml/image-label.fxml";

    @FXML
    private ImageView iconImageView;

    public ImageLabel()
    {
        ViewLoader.load(FXML_URL, this, this);
    }

    public void setImage(String imageUrl)
    {
        if (imageUrl != null)
        {
            iconImageView.setDisable(false);
            iconImageView.setImage(new Image(getClass().getResource(imageUrl).toExternalForm()));
        }
        else
        {
            iconImageView.setDisable(true);
        }
    }

    public String getImage()
    {
        return null;
    }
}
