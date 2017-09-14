package ve.gob.cendit.cenditlab.views.tests;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import ve.gob.cendit.cenditlab.tasks.System;
import ve.gob.cendit.cenditlab.views.ComponentSelectionPane;
import ve.gob.cendit.cenditlab.views.MainWindow;
import ve.gob.cendit.cenditlab.views.SystemView;
import ve.gob.cendit.cenditlab.views.View;

import java.util.Arrays;


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
            systemViews[i].subscribeEvent(SystemView.ON_CLICK,
                    e -> onClickHandler(e));
            systemViews[i].subscribeEvent(SystemView.ON_MOUSE_OVER,
                    e -> onMouseOverHandler(e));
        }

        return systemViews;
    }

    private void onClickHandler(Object... args)
    {
        Arrays.stream(args)
                .forEach(arg -> java.lang.System.out.printf("%s, ", arg.toString()));

        selectionPane.addSelected(new SystemView("Selecionado", "Conjunto seleccionado", null));

        java.lang.System.out.println();
    }

    private void onMouseOverHandler(Object... args)
    {
        Arrays.stream(args)
                .forEach(arg -> java.lang.System.out.printf("%s, ", arg.toString()));

        java.lang.System.out.println();
    }
}
