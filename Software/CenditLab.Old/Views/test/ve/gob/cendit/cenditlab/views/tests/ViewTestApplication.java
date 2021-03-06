package ve.gob.cendit.cenditlab.views.tests;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ve.gob.cendit.cenditlab.data.ArrayData;
import ve.gob.cendit.cenditlab.tasks.ComponentSlots;
import ve.gob.cendit.cenditlab.tasks.Slot;
import ve.gob.cendit.cenditlab.views.*;


public class ViewTestApplication extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //viewTests(primaryStage);
        rowAndColumnContainerTest(primaryStage);
    }

    private void viewTests(Stage primaryStage)
    {
        TwoPaneWindow mainWindow = new TwoPaneWindow();
        VectorView dcView = new VectorView();

        ComponentSlots dc = new ComponentSlots(
                new Slot("Data 1"),
                new Slot("Data 2"),
                new Slot("Data 3"));
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

        ArrayView arrayView1 = new ArrayView(arrayData1,  "C1", "C2", "C3");
        ArrayView arrayView2 = new ArrayView(arrayData2, "ENR MAG", "ENR PHASE", "SWR MAG","SWR PHASE");

        Object[][] graphData = new Float[][] {
            { 1.0f, 2.0f, 3.6f, 1.3f},
            { 4f, 5f, 6f, 4.8f },
            { 7f, 10f, 9f, 5f },
            { 5f, 6f, 0f, 10f } };
        ArrayData graphArrayData = new ArrayData("Datos grafico", graphData);

        mainWindow.addRightPanel(dcView);
        mainWindow.addRightPanel(arrayView1);
        mainWindow.addRightPanel(arrayView2);

        mainWindow.addLeftPanel(navButton1);
        mainWindow.addLeftPanel(navButton2);
        mainWindow.addLeftPanel(navButton3);

        primaryStage.setScene(new Scene(mainWindow));
        primaryStage.setTitle("View Test");
        primaryStage.show();
    }

    private void rowAndColumnContainerTest(Stage primaryStage)
    {
        RowContainerView rootRow =  new RowContainerView();
        ColumnContainerView column1 = new ColumnContainerView();
        ColumnContainerView column2 = new ColumnContainerView();

        RowContainerView row11 = new RowContainerView();
        RowContainerView row12 = new RowContainerView();
        RowContainerView row13 = new RowContainerView();

        RowContainerView row21 = new RowContainerView();
        RowContainerView row22 = new RowContainerView();

        populateRow(row11, 5);
        populateRow(row12, 2);
        populateRow(row13, 3);

        populateRow(row21, 4);
        populateRow(row22, 1);

        column1.addRows(row11, row12, row13);
        column2.addRows(row21, row22);

        rootRow.addColumns(column1, column2);

        column1.setWidthPercentage(0.8);
        column1.setHeightPercentage(0.6);

        column2.setWidthPercentage(0.2);
        column2.setHeightPercentage(0.4);

        VBox root = new VBox(rootRow.getNode());
        root.setMaxSize(600.0, 400.0);
        root.setFillWidth(false);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setWidth(1200.0);
        primaryStage.setHeight(800.0);
        primaryStage.show();
    }

    private void populateRow(RowContainerView row, int children)
    {
        for (int i = 0; i < children; i++)
        {
            row.setColumn(i,
                    new ComponentView("Componente",
                            String.format("Componente %d", i), null));
        }
    }
}
