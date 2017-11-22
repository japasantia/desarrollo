package ve.gob.cendit.cenditlab.views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * Created by root on 04/09/17.
 */
public class NavButtonView extends View
{
    public static final String FXML_URL = "nav-button-view.fxml";

    @FXML
    private Label stepNumberLabel;

    @FXML
    private Label smallTitleLabel;

    @FXML
    private Label bigTitleLabel;

    private String stepNumber;
    private String smallTitle;
    private String bigTitle;

    public NavButtonView(String stepNumber, String smallTitle, String bigTitle)
    {
        super(FXML_URL);

        this.stepNumber = stepNumber;
        this.smallTitle = smallTitle;
        this.bigTitle = bigTitle;
    }

    @FXML
    public void onClicked(MouseEvent event)
    {
        smallTitleLabel.setText("Clicked!");
    }

    @FXML
    public void onPressed(MouseEvent event)
    {
        smallTitleLabel.setText("Pressed!");
    }


    @Override
    public void update()
    {
        stepNumberLabel.setText(stepNumber);
        smallTitleLabel.setText(smallTitle);
        bigTitleLabel.setText(bigTitle);
    }
}
