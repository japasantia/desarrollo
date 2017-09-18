package ve.gob.cendit.cenditlab.views.tests;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ve.gob.cendit.cenditlab.tasks.MeasurementSession;
import ve.gob.cendit.cenditlab.tasks.MeasurementStep;
import ve.gob.cendit.cenditlab.views.StepsBarView;
import ve.gob.cendit.cenditlab.views.SystemView;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        TwoPaneWindow mainWindow = new TwoPaneWindow();

        mainWindow.setLeftTitle("Sistemas disponibles");
        mainWindow.setRightTitle("Pasos de medicion");

        for (int i = 0; i < 10; ++i)
        {
            mainWindow.addLeftPanel(new SystemView());
        }

        DummyMeasurementStep[] steps = new DummyMeasurementStep[10];

        for (int  i = 0;  i < steps.length;  i++)
        {
            steps[i] = new DummyMeasurementStep(String.format("Paso %d", i + 1));
        }

        MeasurementSession measurementSession = new MeasurementSession("Sesion de medicion prueba",
                steps);

        StepsBarView stepsBar = new StepsBarView(measurementSession);
        mainWindow.addRightPanel(stepsBar);

        primaryStage.setScene(new Scene(mainWindow));
        primaryStage.setTitle("CenditLab - TesterWindow");
        primaryStage.setWidth(1600.0);
        primaryStage.setHeight(800.0);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


    class DummyMeasurementStep extends MeasurementStep
    {
        public DummyMeasurementStep(String name)
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

        }

        @Override
        public void load()
        {

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
