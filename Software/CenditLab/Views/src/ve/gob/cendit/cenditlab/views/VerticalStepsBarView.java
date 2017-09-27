package ve.gob.cendit.cenditlab.views;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import ve.gob.cendit.cenditlab.tasks.MeasurementManager;
import ve.gob.cendit.cenditlab.tasks.MeasurementStep;

public class VerticalStepsBarView extends View
{
    private static final String FXML_URL = "steps-bar-view-vertical.fxml";

    public static final int ON_STEP_CLICK = 1;

    @FXML
    private VBox containerPane;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private Button upButton;

    @FXML
    private Button downButton;

    private MeasurementManager session;

    public VerticalStepsBarView()
    {
        super(FXML_URL);
    }

    public VerticalStepsBarView(MeasurementManager manager)
    {
        super(FXML_URL);

        setMeasurementManager(manager);

        publishEvent(ON_STEP_CLICK);
    }

    public void setMeasurementManager(MeasurementManager manager)
    {
        if (manager == null)
        {
            throw new IllegalArgumentException("manager must not be null");
        }

        this.session = manager;
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
                            raiseEvent(StepsBarView.ON_STEP_CLICK,
                                    step, stepButton);
                        }
                    });

            addStepButton(stepButton);
        }
    }

    public void addStepButton(StepButtonView buttonView)
    {
        if (containerPane != null && buttonView != null)
        {
            containerPane.getChildren().add(buttonView.getNode());
        }
    }

    @FXML
    private void downButtonClicked(MouseEvent event)
    {
        double vValue = scrollPane.getVvalue();
        double delta = 1.0 / session.getStepsCount();

        if (vValue > 0)
        {
            scrollPane.setVvalue(vValue - delta);
        }
    }

    @FXML
    private void upButtonClicked(MouseEvent event)
    {
        double vValue = scrollPane.getVvalue();
        double delta = 1.0 / session.getStepsCount();

        if (vValue < 1)
        {
            scrollPane.setVvalue(vValue + delta);
        }
    }
}
