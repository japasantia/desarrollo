package ve.gob.cendit.cenditlab.app;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ve.gob.cendit.cenditlab.ui.MainViewProto1;

public class CenditLabApplication
{
    private static CenditLabApplication app = null;

    private static final String DEFAULT_TITLE = "CenditLab";
    private static final double DEFAULT_WIDTH = 800.0;
    private static final double DEAULT_HEIGHT = 600.0;

    private Stage primaryStage;
    private MainViewProto1 mainView;

    protected CenditLabApplication(Stage primaryStage)
    {
        this.primaryStage = primaryStage;
        mainView = new MainViewProto1();

        primaryStage.setScene(
                new Scene(mainView, DEFAULT_WIDTH, DEAULT_HEIGHT));
        primaryStage.setTitle(DEFAULT_TITLE);
    }

    public static void initialize(Stage primaryStage)
    {
        if (app == null)
        {
            app = new CenditLabApplication(primaryStage);
        }
    }

    public static CenditLabApplication getApp()
    {
        return app;
    }

    public void show()
    {
        primaryStage.show();
    }

    public void setCenterContainer(Parent view)
    {
        mainView.setCenter(view);
    }

    public void setTopToolbar(Parent toolbar)
    {
        mainView.addToolBar(toolbar);
    }
}