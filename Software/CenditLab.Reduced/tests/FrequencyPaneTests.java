import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ve.gob.cendit.cenditlab.ui.FrequencyListPane;
import ve.gob.cendit.cenditlab.ui.FrequencyRangePane;

import java.util.List;

public class FrequencyPaneTests extends Application
{
    private FrequencyListPane frequencyListPane;

    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //loadFrequencyListPaneTest(primaryStage);
        frequencyRangePaneTest(primaryStage);
    }

    private void loadFrequencyListPaneTest(Stage primaryStage)
    {
        frequencyListPane = new FrequencyListPane();

        Button testButton = new Button("Start Test");
        VBox containerVBox = new VBox();

        testButton.setOnAction(event -> frequencyListPaneTest());

        containerVBox.getChildren().addAll(frequencyListPane, testButton);

        primaryStage.setScene(new Scene(containerVBox, 600, 800));
        primaryStage.setTitle("CenditLab.Reduced | Test FrequencyListPane");
        primaryStage.show();
    }

    private void frequencyListPaneTest()
    {
        boolean isValid = frequencyListPane.validate();

        List<String> frequenciesList = frequencyListPane.getFrequencies();

        System.out.printf("Frequencies list valid: %s\n", isValid);

        System.out.println("Frequencies list");

        frequenciesList.stream()
                .forEach(f -> System.out.printf("%s ", f));
    }

    private void frequencyRangePaneTest(Stage primaryStage)
    {
        FrequencyRangePane frequencyRangePane = new FrequencyRangePane();
        VBox vBox = new VBox();

        vBox.getChildren().add(frequencyRangePane);

        primaryStage.setScene(new Scene(vBox));
        primaryStage.setTitle("CenditLab.Reduced | Test FrequencyRangePane");
        primaryStage.show();
    }
}
