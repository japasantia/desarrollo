package ve.gob.cendit.cenditlab.views;


import javafx.fxml.FXML;
import javafx.geometry.Bounds;

import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import ve.gob.cendit.cenditlab.tasks.MeasurementSession;
import ve.gob.cendit.cenditlab.tasks.MeasurementStep;

public class StepsBarView extends View
{
    private static final String FXML_URL = "steps-bar-view.fxml";

    public static final int ON_STEP_CLICK = 1;

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

        publishEvent(ON_STEP_CLICK);
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

        for (int i = 0; i < session.getStepsCount(); i++)
        {
            MeasurementStep step = session.getStep(i);
            StepButtonView stepButton =
                    new StepButtonView(step.getName(), String.format("Paso %d", i), null);

            stepButton.subscribeEvent(StepButtonView.ON_CLICK,
                    new IEventFunction()
                    {
                        @Override
                        public void handle(Object... args)
                        {
                             raiseEvent(StepsBarView.ON_STEP_CLICK, step, stepButton);
                        }
                    });

            addStepButton(stepButton);
        }
    }

    public void addStepButton(StepButtonView buttonView)
    {
        if (containerHBox != null && buttonView != null)
        {
            containerHBox.getChildren().add(buttonView.getNode());
        }
    }

    @FXML
    private void leftButtonClicked(MouseEvent event)
    {
        double hValue = scrollPane.getHvalue();
        double delta = 1.0 / session.getStepsCount();

        if (hValue > 0)
        {
            scrollPane.setHvalue(hValue - delta);
        }
    }

    @FXML
    private void rightButtonClicked(MouseEvent event)
    {
        double hValue = scrollPane.getHvalue();
        double delta = 1.0 / session.getStepsCount();

        if (hValue < 1)
        {
            scrollPane.setHvalue(hValue + delta);
        }
    }
}
