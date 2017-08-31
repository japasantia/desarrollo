package ve.gob.cendit.cenditlab.views.tests;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ve.gob.cendit.cenditlab.tasks.DataContainer;
import ve.gob.cendit.cenditlab.tasks.DataSlot;
import ve.gob.cendit.cenditlab.views.DataContainerView;

/**
 * Created by jarias on 31/08/17.
 */
public class ViewTestApplication extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        TwoPaneWindow mainWindow = new TwoPaneWindow();
        DataContainerView dcView =
                new DataContainerView("Data Container", "Sample data container");
        mainWindow.addRightPanel(dcView);

        DataContainer dc = new DataContainer(
                new DataSlot("Data 1"),
                new DataSlot("Data 2"),
                new DataSlot("Data 3"));
        dcView.setDataContainer(dc);

        primaryStage.setScene(new Scene(mainWindow));
        primaryStage.setTitle("View Test");
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        Application.launch(args);
    }
}
