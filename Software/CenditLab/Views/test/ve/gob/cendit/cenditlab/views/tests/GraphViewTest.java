package ve.gob.cendit.cenditlab.views.tests;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ve.gob.cendit.cenditlab.views.GraphView;


public class GraphViewTest extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        TwoPaneWindow mainWindow = new TwoPaneWindow();

        String stringPoints =  "1.5, 12.3; 3.14, 4.5; 5.5, 16.78; 2.78, 17";

        Float[] floatPoints = new Float[] { 1.2f, 3.4f, 5.6f, 6.7f, 8.9f };

        Integer[] intPointsX = new Integer[] { 3, 4, 5, 6 };
        Integer[] intPointsY = new Integer[] { 1, 2, 3 };

        Object objArray[][] = new Float[][]
                {
                        { 3.2f, 4.5f, 3.14f, 12.34f }, { 6.3f, 5.2f, 10.14f, 200.15f, -2.78f},
                        { 17.79f, -2.78f, 0.0f, 6.28e2f, 15.0f }, { 5.2f, -4.5f, 69.13f, 3.1616f },
                        { 7.49f, 71.9f, 0.68f, 56.78f, 1.0f }, { 12.52f, 4.5f, 2.2f, 3.1616f },
                        { -6.28f, 47.49f, 1.9f, 6.08f, 6.78f, 1.5f }, { -2.52f, -45.5f, 12.12f, 3.1616f }
                };

        GraphData graphData1 = GraphData.fromString("Graph 1", stringPoints);

        GraphData graphData2 = GraphData.fromArray("Graph 2", floatPoints);

        GraphData graphData3 = GraphData.fromArray("Graph 3",
                intPointsX, intPointsY, -1);

        GraphData graphData4 = GraphData.fromArrayColumns("Graph 4", objArray,
                1, 3, -1);

        GraphView graphView1 = new GraphView("Graph View 1",
                graphData1, graphData2);

        GraphView graphView2 = new GraphView("Graph View 3",
                graphData3, graphData4);

        mainWindow.addRightPanel(graphView1);
        mainWindow.addRightPanel(graphView2);

        Scene root = new Scene(mainWindow);
        primaryStage.setScene(root);
        primaryStage.setTitle("GraphView Test");
        primaryStage.show();
    }
}
