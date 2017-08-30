package ve.gob.cendit.cenditlab.views.tests;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ve.gob.cendit.cenditlab.views.SystemView;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        TwoPaneWindow mainWindow = new TwoPaneWindow();

        mainWindow.setLeftTitle("Sistemas disponibles");
        mainWindow.setRightTitle("Descripción");

        for (int i = 0; i < 10; ++i)
        {
            mainWindow.addLeftPanel(new SystemView());
            mainWindow.addRightPanel(new SystemView());
        }

        primaryStage.setScene(new Scene(mainWindow));
        primaryStage.setTitle("CenditLab - TesterWindow");
        primaryStage.setWidth(1600.0);
        primaryStage.setHeight(800.0);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
