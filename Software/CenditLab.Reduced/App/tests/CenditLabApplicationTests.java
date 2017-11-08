import javafx.application.Application;
import javafx.stage.Stage;
import ve.gob.cendit.cenditlab.app.CenditLabApplication;
import ve.gob.cendit.cenditlab.control.MeasurementManager;
import ve.gob.cendit.cenditlab.systems.*;
import ve.gob.cendit.cenditlab.ui.MeasurementBarView;

public class CenditLabApplicationTests extends Application
{
    private CenditLabApplication app;

    NoiseFigureAnalyzer8975A nfa;
    AttenuatorSwitchDriver11713 asd;
    MeasurementManager measurementManager;
    MeasurementBarView measurementBarView;

    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        CenditLabApplication.initialize(primaryStage);

        app = CenditLabApplication.getApp();

        initializeApp();
        initializeGui();

        app.show();
    }

    private void initializeApp()
    {
        nfa = new NoiseFigureAnalyzer8975A();
        asd = new AttenuatorSwitchDriver11713();

        SystemsSetupStep systemsSetupStep = new SystemsSetupStep("Systems Setup", nfa, asd);
        TasksSetupStep tasksSetupStep = new TasksSetupStep("Tasks Setup", nfa, asd);
        TasksExecutionStep tasksExecutionStep = new TasksExecutionStep("Tasks Execution", nfa, asd);

        measurementManager = new MeasurementManager("Noise Figure Measurement System",
                systemsSetupStep, tasksSetupStep, tasksExecutionStep);
        measurementBarView = new MeasurementBarView(measurementManager);
    }

    private void initializeGui()
    {
        app.setTopToolbar(measurementBarView);
    }
}
