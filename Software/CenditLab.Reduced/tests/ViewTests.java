import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ve.gob.cendit.cenditlab.measurements.MeasurementManager;
import ve.gob.cendit.cenditlab.measurements.MeasurementStep;
import ve.gob.cendit.cenditlab.ui.EnrSetupViewProto1;
import ve.gob.cendit.cenditlab.ui.FrequencySetupViewProto1;
import ve.gob.cendit.cenditlab.ui.MeasurementBarView;
import ve.gob.cendit.cenditlab.ui.SetupView;

public class ViewTests extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        stage = primaryStage;

        // setupViewTest();
        //enrSetupViewProto1Test();
        frequencySetupViewTest();
    }

    public void setupViewTest()
    {
        VBox root = new VBox();
        Button loadSetupButton = new Button("load Setup");
        SetupView setupView = new SetupView();

        root.getChildren().addAll(setupView, loadSetupButton);

        loadSetupButton.setOnAction(event ->
            System.out.println(setupView.getSetup()));

        showView(root, "CenditLab | SetupView Test",
                600, 400);
    }

    private void frequencySetupViewTest()
    {
        FrequencySetupViewProto1 frequencySetupView =
                new FrequencySetupViewProto1();

        showView(frequencySetupView, "CenditLab.Reduced | Test EnrSetupView Test",
                800, 400);
    }

    private void enrSetupViewProto1Test()
    {
        VBox root = new VBox();
        EnrSetupViewProto1 enrSetupView = new EnrSetupViewProto1();
        TextArea textArea = new TextArea();
        Button button = new Button("Show EnrSetup");

        enrSetupView.enableCommonEnrTableProperty()
                .addListener((observable, oldValue, newValue) ->
                {
                    textArea.appendText(String.format("Common ENR table %s\n",
                            (newValue ? "enabled" : "disabled")));
                });

        enrSetupView.enableEnrTableModeProperty()
                .addListener((observable, oldValue, newValue) ->
                {
                    textArea.appendText(String.format("ENR table mode %s\n",
                            (newValue ? "enabled" : "disabled")));
                });

        button.setOnAction(event ->
            {
                textArea.appendText(enrSetupView.getSetup().toString());
                textArea.appendText("\n");
            });

        root.getChildren().addAll(enrSetupView, textArea, button);

        showView(root, "CenditLab.Reduced | Test EnrSetupView Test",
                600, 400);
    }

    private static void showView(Parent root, String title, double width, double height)
    {
        stage.setScene(new Scene(root, width, height));
        stage.setTitle(title);
        stage.show();
    }
}
