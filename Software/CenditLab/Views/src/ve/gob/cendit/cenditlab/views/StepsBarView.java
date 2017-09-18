package ve.gob.cendit.cenditlab.views;


import javafx.fxml.FXML;
import javafx.geometry.Bounds;

import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import ve.gob.cendit.cenditlab.tasks.MeasurementSession;

public class StepsBarView extends View
{
    private static final String FXML_URL = "steps-bar-view.fxml";

    @FXML
    private HBox containerHBox;

    @FXML
    private ScrollPane scrollPane;

    private MeasurementSession session;

    public StepsBarView()
    {
        super(FXML_URL);
    }

    public StepsBarView(MeasurementSession session)
    {
        super(FXML_URL);

        setMeasurementSession(session);
    }

    public void setMeasurementSession(MeasurementSession session)
    {
        if (session == null)
        {
            throw new IllegalArgumentException("session must not be null");
        }

        this.session = session;
    }

    @Override
    public void update()
    {
        if (session == null)
        {
            return;
        }

        int stepNumber = 1;

        session.getSteps().stream()
            .forEach(step -> {
                StepButtonView stepButton =
                        new StepButtonView(step.getName(), String.format("Paso %d", stepNumber), null);
                addStepButton(stepButton);
            });
    }

    public void addStepButton(StepButtonView buttonView)
    {
        if (containerHBox != null && buttonView != null)
        {
            containerHBox.getChildren().add(buttonView.getNode());
        }
    }

    @FXML
    void leftButtonClicked(MouseEvent event)
    {
        double hValue = scrollPane.getHvalue();
        double delta = 1.0 / session.getStepsCount();

        if (hValue > 0)
        {
            scrollPane.setHvalue(hValue - delta);
        }

        /*
        double width = containerHBox.getBoundsInLocal().getWidth();
        double layoutX = containerHBox.getLayoutX();

        if (layoutX > -width)
        {
            containerHBox.setLayoutX(layoutX - 0.1 * width);
        }
        */
    }

    @FXML
    void rightButtonClicked(MouseEvent event)
    {
        double hValue = scrollPane.getHvalue();
        double delta = 1.0 / session.getStepsCount();

        if (hValue < 1)
        {
            scrollPane.setHvalue(hValue + delta);
        }

        /*
        double width = containerHBox.getBoundsInLocal().getWidth();
        double layoutX = containerHBox.getLayoutX();

        if (layoutX < width)
        {
            containerHBox.setLayoutX(layoutX + 0.1 * width);
        }
        */
    }
}
