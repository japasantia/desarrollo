package ve.gob.cendit.cenditlab.views.tests;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ve.gob.cendit.cenditlab.tasks.Component;
import ve.gob.cendit.cenditlab.tasks.ComponentSlots;
import ve.gob.cendit.cenditlab.tasks.MeasurementManager;
import ve.gob.cendit.cenditlab.tasks.MeasurementStep;
import ve.gob.cendit.cenditlab.views.*;


public class MainApplicationTest extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    private MainWindow mainWindow;
    private CenterPane centerPane;
    // private StepsBarView stepsBar;
    private VerticalStepsBarView stepsBar;

    private TestMeasurementManager testSession;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        mainWindow = new MainWindow();
        centerPane = new CenterPane();

        initializeMeasurementSession();

        //centerPane.addTopView(stepsBar);
        mainWindow.setLeftPane(stepsBar.getNode());
        mainWindow.setCenterPane(centerPane);

        primaryStage.setTitle("CenditLab - Main Application Test");
        primaryStage.setScene(new Scene(mainWindow));
        primaryStage.setWidth(1200.0);
        primaryStage.setHeight(800.0);
        primaryStage.show();
    }

    private void initializeMeasurementSession()
    {
        testSession = new TestMeasurementManager(centerPane);
        // stepsBar = new StepsBarView(testSession);
        stepsBar = new VerticalStepsBarView(testSession);
        stepsBar.subscribeEvent(StepsBarView.ON_STEP_CLICK, args -> onStepsBarClick(args));
    }

    private void onStepsBarClick(Object... args)
    {
        System.out.printf("Step: %s StepButton: %s\n",
                args[0].toString(), args[1].toString());

        if (args[0] instanceof MeasurementStep)
        {
            MeasurementStep step = (MeasurementStep) args[0];
            testSession.toStep(step);
        }
    }
}

class TestMeasurementManager extends MeasurementManager
{
    private final MeasurementStep setupStep = new SetupStep();
    private final MeasurementStep taskSelectionStep = new TaskSelectionStep();
    private final MeasurementStep executionStep = new ExecutionStep();
    private final MeasurementStep resultsStep = new ResultsStep();

    public static final int SETUP_STEP = 0;
    public static final int TASK_SELECTION_STEP = 1;
    public static final int EXECUTION_STEP = 2;
    public static final int RESULTS_STEP = 3;

    private ComponentView componentView;
    private CenterPane measurementPane;
    private MasterDetailView masterDetailView;

    public TestMeasurementManager(CenterPane pane)
    {
        super("Test Measurement Session");

        addSteps(setupStep, taskSelectionStep, executionStep, resultsStep);

        measurementPane = pane;
        componentView = new ComponentView();
        masterDetailView = new MasterDetailView();
        measurementPane.addCenterView(masterDetailView);
    }

    class SetupStep extends MeasurementStep
    {
        public SetupStep()
        {
            super("Setup Step");
        }

        @Override
        public boolean canEnterFromStep(MeasurementStep step)
        {
            return true;
        }

        @Override
        public boolean canExitToStep(MeasurementStep step)
        {
            return step == taskSelectionStep;
        }

        @Override
        public void initialize()
        {

        }

        @Override
        public void load()
        {
            componentView.setName("Test Component | Setup");
            componentView.setDescription("Panel de configuracion");
            masterDetailView.clearSectionView(MasterDetailView.MASTER);
            masterDetailView.addSectionView(componentView, MasterDetailView.MASTER);
        }

        @Override
        public void run()
        {

        }

        @Override
        public void unload()
        {

        }
    }

    class TaskSelectionStep extends MeasurementStep
    {
        public TaskSelectionStep()
        {
            super("TaskSelectionStep");
        }

        @Override
        public boolean canEnterFromStep(MeasurementStep step)
        {
            return step == setupStep;
        }

        @Override
        public boolean canExitToStep(MeasurementStep step)
        {
            return step == executionStep;
        }

        @Override
        public void initialize()
        {

        }

        @Override
        public void load()
        {
            componentView.setName("Test Component | Task Selection");
            componentView.setDescription("Panel de configuracion");
            masterDetailView.clearSectionView(MasterDetailView.MASTER);
            masterDetailView.addSectionView(componentView, MasterDetailView.MASTER);
        }

        @Override
        public void run()
        {

        }

        @Override
        public void unload()
        {

        }
    }

    class ExecutionStep extends MeasurementStep
    {
        public ExecutionStep()
        {
            super("ExecutionStep");
        }

        @Override
        public boolean canEnterFromStep(MeasurementStep step)
        {
            return step == taskSelectionStep;
        }

        @Override
        public boolean canExitToStep(MeasurementStep step)
        {
            return step == resultsStep;
        }

        @Override
        public void initialize()
        {

        }

        @Override
        public void load()
        {
            componentView.setName("Test Component | Execution");
            componentView.setDescription("Panel de configuracion");
            masterDetailView.clearSectionView(MasterDetailView.MASTER);
            masterDetailView.addSectionView(componentView, MasterDetailView.MASTER);
        }

        @Override
        public void run()
        {

        }

        @Override
        public void unload()
        {

        }
    }

    class ResultsStep extends MeasurementStep
    {
        public ResultsStep()
        {
            super("ResultsStep");
        }

        @Override
        public boolean canEnterFromStep(MeasurementStep step)
        {
            return step == executionStep;
        }

        @Override
        public boolean canExitToStep(MeasurementStep step)
        {
            return true;
        }

        @Override
        public void initialize()
        {

        }

        @Override
        public void load()
        {
            componentView.setName("Test Component | Results");
            componentView.setDescription("Panel de configuracion");
            masterDetailView.clearSectionView(MasterDetailView.MASTER);
            masterDetailView.addSectionView(componentView, MasterDetailView.MASTER);
        }

        @Override
        public void run()
        {

        }

        @Override
        public void unload()
        {

        }
    }
}

class TestComponent extends Component
{
    @Override
    public ComponentSlots getSlots()
    {
        return null;
    }

    @Override
    protected void setContext(int context)
    {

    }

    @Override
    public View getView(int context)
    {
        return null;
    }
}
