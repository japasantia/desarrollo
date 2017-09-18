package ve.gob.cendit.cenditlab.views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StepButtonView extends View
{
    private static final String FXML_URL = "step-button-view.fxml";

    @FXML
    Label smallTitleLabel;

    @FXML
    Label bigTitleLabel;

    @FXML
    ImageView iconImageView;

    private String smallTitle;
    private String bigTitle;
    private String imageUrl;

    public StepButtonView(String bigTitle, String smallTitle, String imageUrl)
    {
        super(FXML_URL);

        this.bigTitle = bigTitle;
        this.smallTitle = smallTitle;
        this.imageUrl = imageUrl;
    }


    @Override
    public void update()
    {
        bigTitleLabel.setText((bigTitle != null ? bigTitle : ""));
        smallTitleLabel.setText((smallTitle != null ? smallTitle : ""));
    }
}
