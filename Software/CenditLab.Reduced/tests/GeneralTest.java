import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GeneralTest extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        testFrequencySetupPane(primaryStage);
    }

    private static void testFrequencySetupPane(Stage primaryStage)
    {
        try
        {
            FrequencySetup frequencySetup = new FrequencySetup();

            Scene scene = new Scene(frequencySetup, 600, 400);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
