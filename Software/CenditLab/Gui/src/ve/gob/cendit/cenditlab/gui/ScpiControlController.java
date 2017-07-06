package ve.gob.cendit.cenditlab.gui;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.util.Random;

public class ScpiControlController
{
    private static final Random random = new Random();

    @FXML
    private AnchorPane rootAnchorPane;

    @FXML
    private ProgressIndicator progressIndicator;

    @FXML
    private Button deleteButton;

    @FXML
    private Button execButton;

    @FXML
    private TextField commandText;

    private Pane parent;

    public void setParent(Pane p)
    {
        parent = p;
    }

    public Parent getParent()
    {
        return parent;
    }

    public void removeFromParent()
    {
        parent.getChildren().remove(rootAnchorPane);
    }

    @FXML
    void execButtonPressed(ActionEvent event)
    {
        if (!progressIndicator.isVisible())
        {
            progressIndicator.setVisible(true);
            execButton.setText("!");

            Timeline timeline = new Timeline(new KeyFrame(
                    Duration.seconds(1 + random.nextInt(9)),
                    new EventHandler<ActionEvent>()
                    {
                        @Override
                        public void handle(ActionEvent event)
                        {
                            progressIndicator.setVisible(false);
                            execButton.setText(">");
                        }
                    })
            );
            timeline.setCycleCount(1);
            timeline.play();
        }
        else
        {
            progressIndicator.setVisible(false);
            execButton.setText(">");
        }
    }

    @FXML
    void deleteButtonPressed(ActionEvent event)
    {
        removeFromParent();
    }
}
