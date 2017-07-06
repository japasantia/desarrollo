package ve.gob.cendit.cenditlab.gui;/**
 * Created by jsars on 02/07/17.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InstrumentProgram extends Application
{
    private static Stage mainStage;

    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage)

    {
        try
        {
            FXMLLoader loader =
                    new FXMLLoader(getClass().getResource("SelectionWindow.fxml"));
            Parent root = loader.load();
            Scene mainScene = new Scene(root);
            stage.setScene(mainScene);
            stage.setTitle("CendiLab [Test]");
            stage.show();

            setMainStage(stage);
        }
        catch (Exception ex)
        {
            System.out.printf("Exception: %s\n", "InstrumentProgram.start");
            ex.printStackTrace();
        }
    }

    private static void setMainStage(Stage stage)
    {
        mainStage = stage;
    }

    public static Stage getMainStage()
    {
        return mainStage;
    }
}
