package ve.gob.cendit.cenditlab.views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class StepButtonView extends View
{
    private static final String FXML_URL = "step-button-view.fxml";

    public static final int ON_CLICK = 1;

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

        this.bigTitle = (bigTitle != null ? bigTitle : "");
        this.smallTitle = (smallTitle != null ? smallTitle : "");
        this.imageUrl = imageUrl;

        publishEvent(ON_CLICK);
    }

    @Override
    public void update()
    {
        bigTitleLabel.setText(bigTitle);
        smallTitleLabel.setText(smallTitle);
    }

    @FXML
    private void buttonClicked(MouseEvent event)
    {
        raiseEvent(ON_CLICK, this);
    }

    @Override
    public String toString()
    {
        return String.format("StepButtonView %s", bigTitle);
    }
}
