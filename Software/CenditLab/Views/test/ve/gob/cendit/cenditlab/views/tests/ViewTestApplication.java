package ve.gob.cendit.cenditlab.views.tests;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ve.gob.cendit.cenditlab.tasks.ArrayData;
import ve.gob.cendit.cenditlab.tasks.DataContainer;
import ve.gob.cendit.cenditlab.tasks.DataSlot;
import ve.gob.cendit.cenditlab.views.ArrayDataView;
import ve.gob.cendit.cenditlab.views.ListDataView;
import ve.gob.cendit.cenditlab.views.NavButtonView;

/**
 * Created by jarias on 31/08/17.
 */
public class ViewTestApplication extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        TwoPaneWindow mainWindow = new TwoPaneWindow();
        ListDataView dcView = new ListDataView();


        DataContainer dc = new DataContainer(
                new DataSlot("Data 1"),
                new DataSlot("Data 2"),
                new DataSlot("Data 3"));
        dcView.setDataContainer(dc);

        NavButtonView navButton1 =
            new NavButtonView("1", "Sistemas e Instrumentos", "Selección");
        NavButtonView navButton2 =
            new NavButtonView("2", "Sistemas e intrumentos", "Configuración");
        NavButtonView navButton3 =
                new NavButtonView("3", "Tareas", "Ejecución");

        ArrayData arrayData1 = new ArrayData("Array 1");
        arrayData1.set(new String[][] { { "a", "b", "c" }, { "d", "e" }, { null, null }, { "1", "2", "3", "4"}, { "x" } });

        ArrayData arrayData2 = new ArrayData("Integer Array");
        arrayData2.set(new Integer[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15, 16, 17},
                { 18, 19 }, { 20, 21, 22, 23, 24, 25 }});



        ArrayDataView arrayDataView1 = new ArrayDataView(arrayData1,  "C1", "C2", "C3");
        ArrayDataView arrayDataView2 = new ArrayDataView(arrayData2, "ENR MAG", "ENR PHASE", "SWR MAG","SWR PHASE");

        mainWindow.addRightPanel(dcView);
        mainWindow.addRightPanel(arrayDataView1);
        mainWindow.addRightPanel(arrayDataView2);

        mainWindow.addLeftPanel(navButton1);
        mainWindow.addLeftPanel(navButton2);
        mainWindow.addLeftPanel(navButton3);

        primaryStage.setScene(new Scene(mainWindow));
        primaryStage.setTitle("View Test");
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        Application.launch(args);
    }
}
