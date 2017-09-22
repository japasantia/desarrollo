package ve.gob.cendit.cenditlab.views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ComponentHeaderView extends View
{
    private static final String FXML_URL = "component-header-view.fxml";

    private String name;

    private String iconUrl;

    @FXML
    private Label nameLabel;

    @FXML
    private ImageView iconImageView;

    public ComponentHeaderView(String name, String iconUrl)
    {
        super(FXML_URL);

        this.name = name;
        this.iconUrl = iconUrl;
    }

    @Override
    public void update()
    {
        if (name != null)
        {
            nameLabel.setText(name);
        }
        else
        {
            nameLabel.setVisible(false);
        }


        if (iconUrl != null)
        {
            iconImageView.setImage(new Image(iconUrl));
        }
    }
}
