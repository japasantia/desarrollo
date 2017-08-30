package ve.gob.cendit.cenditlab.views;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

public class Controller
{
    @FXML
    private VBox systemsVBox;

    @FXML
    private FlowPane selectedSystemsFlowPane;

    @FXML
    private Button selectSystemButton;

    @FXML
    private void initialize()
    {
        systemsVBox.addEventFilter(MouseEvent.MOUSE_CLICKED,
            e -> {System.out.println("clicked systemsVBox");});

        SystemView systemView;

        for (int i = 0; i < 5; i++)
        {
            systemView = new SystemView();

            EventHandler<MouseEvent> handler =
                    new EventHandler<MouseEvent>()
                    {
                        @Override
                        public void handle(MouseEvent event)
                        {
                            SystemView systemView = new SystemView();
                            selectedSystemsFlowPane.getChildren().add(systemView.getNode());
                            System.out.println("on EventHandler<MouseEvent> clicked");
                        }
                    };

            systemView.getNode().setOnMousePressed(handler);
            //((AnchorPane)systemView.getNode()).setOnMousePressed(handler);
            //systemView.getNode().addEventFilter(MouseEvent.MOUSE_PRESSED, handler);
            //((AnchorPane)systemView.getNode()).addEventHandler(MouseEvent.MOUSE_PRESSED, handler);

            systemsVBox.getChildren().add(systemView.getNode());
        }
    }

    @FXML
    void addSystem(ActionEvent event)
    {

    }

}
