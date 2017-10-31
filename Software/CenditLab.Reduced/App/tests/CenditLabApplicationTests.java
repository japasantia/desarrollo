import javafx.application.Application;
import javafx.stage.Stage;
import ve.gob.cendit.cenditlab.app.CenditLabApplication;
import ve.gob.cendit.cenditlab.systems.NoiseFigureAnalyzer8975A;
import ve.gob.cendit.cenditlab.ui.MeasurementBarView;

public class CenditLabApplicationTests extends Application
{
    private CenditLabApplication app;

    NoiseFigureAnalyzer8975A nfa;
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

        initializeSystems();
        initializeGui();

        app.show();
    }

    private void initializeSystems()
    {
        nfa = new NoiseFigureAnalyzer8975A();
        measurementBarView = new MeasurementBarView(nfa.getMeasurementManager());
    }

    private void initializeGui()
    {
        app.setTopToolbar(measurementBarView);
    }
}
