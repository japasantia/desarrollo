package ve.gob.cendit.cenditlab.views.tests;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ve.gob.cendit.cenditlab.tasks.MeasurementSession;
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

    private MeasurementSession measurementSession;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        mainWindow = new MainWindow();
        centerPane = new CenterPane();

        initializeMeasurementSession();

        StepsBarView stepsBar = new StepsBarView(measurementSession);
        stepsBar.subscribeEvent(StepsBarView.ON_STEP_CLICK, args -> onStepsBarClick(args));

        centerPane.addTopView(stepsBar);
        mainWindow.setCenterPane(centerPane);

        primaryStage.setTitle("CenditLab - Main Application Test");
        primaryStage.setScene(new Scene(mainWindow));
        primaryStage.setWidth(1200.0);
        primaryStage.setHeight(800.0);
        primaryStage.show();
    }

    private void initializeMeasurementSession()
    {
        MeasurementStep[] measurementSteps = new MeasurementStep[10];

        for (int i = 0; i < measurementSteps.length; ++i)
        {
            measurementSteps[i] = new TestMeasurementStep(String.format("Paso %d", i));
        }

        measurementSession = new MeasurementSession("Sesion de prueba", measurementSteps);
    }

    private void onStepsBarClick(Object... args)
    {
       System.out.printf("Step: %s StepButton: %s\n",
               args[0].toString(), args[1].toString());

       centerPane.addCenterView((View) args[1]);
    }
}

class TestMeasurementStep extends MeasurementStep
{
    public TestMeasurementStep(String name)
    {
        super(name);
    }

    @Override
    public boolean canEnter()
    {
        return false;
    }

    @Override
    public boolean canExit()
    {
        return false;
    }

    @Override
    public void initialize()
    {
        System.out.printf("%s initialize\n", getName());
    }

    @Override
    public void load()
    {
        System.out.printf("%s load\n", getName());
    }

    @Override
    public void run()
    {
        System.out.printf("%s run\n", getName());
    }

    @Override
    public void unload()
    {
        System.out.printf("%s unload\n", getName());
    }
}

