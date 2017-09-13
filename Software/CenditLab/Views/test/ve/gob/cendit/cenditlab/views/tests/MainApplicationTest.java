package ve.gob.cendit.cenditlab.views.tests;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import ve.gob.cendit.cenditlab.views.ComponentSelectionPane;
import ve.gob.cendit.cenditlab.views.MainWindow;
import ve.gob.cendit.cenditlab.views.SystemView;
import ve.gob.cendit.cenditlab.views.View;




public class MainApplicationTest extends Application
{
    private MainWindow mainWindow;
    private ComponentSelectionPane selectionPane;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        mainWindow = new MainWindow();
        selectionPane = new ComponentSelectionPane();

        selectionPane.addInstruments(createSystemViews(10));
        selectionPane.addSystems(createSystemViews(10));

        mainWindow.setCenterPane(selectionPane);

        primaryStage.setTitle("CenditLab - Main Application Test");
        primaryStage.setScene(new Scene(mainWindow));
        primaryStage.setWidth(1200.0);
        primaryStage.setHeight(800.0);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        Application.launch(args);
    }

    private View[] createSystemViews(int count)
    {
        SystemView[] systemViews = new SystemView[count];
        int index = 0;

        for (int i = 0; i < systemViews.length; i++)
        {

            systemViews[i] = new SystemView(String.format("Sistema %d", index),
                    "Sistema para pruebas", null);
            systemViews[i].getNode().setOnMouseClicked(mouseClickedHandler);

        }

        return systemViews;
    }

    private EventHandler<MouseEvent> mouseClickedHandler = new EventHandler()
    {
        @Override
        public void handle(Event event)
        {
            selectionPane.addSelected((SystemView) event.getSource());
        }
    };
}
