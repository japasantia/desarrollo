package ve.gob.cendit.cenditlab.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class IconView extends VBox
{
    private static final String FXML_URL = "icon-view.fxml";
    private static final String DEFAULT_ICON = "system-icon.png";
    private static final String DEFAULT_CAPTION = "";

    @FXML
    private ImageView iconImageView;

    @FXML
    private Label captionLabel;

    public IconView()
    {
        this(DEFAULT_CAPTION, DEFAULT_ICON);
    }

    public IconView(String caption, String imageIconUrl)
    {
        ViewLoader.load(FXML_URL, this, this);

        setCaption(caption);
        setImageIcon(imageIconUrl);
    }

    public void setCaption(String caption)
    {
        caption = (caption != null ? caption : DEFAULT_CAPTION);
        captionLabel.setText(caption);
    }

    public void setImageIcon(String imageUrl)
    {
        imageUrl = (imageUrl != null ? imageUrl : DEFAULT_ICON);
        iconImageView.setImage(
                new Image(getClass().getResource(imageUrl).toExternalForm()));
    }
}
