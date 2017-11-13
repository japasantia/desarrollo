package ve.gob.cendit.cenditlab.ui;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageButton extends Button
{
    private static final String FXML_URL = "fxml/image-button.fxml";

    @FXML
    private ImageView iconImageView;

    public ImageButton()
    {
        ViewLoader.load(FXML_URL, this, this);
    }

    public void setImage(String imageUrl)
    {
        if (imageUrl != null)
        {
            iconImageView.setDisable(false);
            iconImageView.setImage(new Image(imageUrl));
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
