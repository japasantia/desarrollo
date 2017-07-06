package ve.gob.cendit.cenditlab.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class InstrumentProgramController
{

    @FXML
    private VBox controlsPane;

    @FXML
    private VBox leftPane;

    @FXML
    private Button addButton;

    @FXML
    void addButtonPressed(ActionEvent event)
    {
        try
        {
            FXMLLoader loader =
                    new FXMLLoader(getClass().getResource("ScpiControl.fxml"));
            Parent control = loader.load();
            ScpiControlController controller =  loader.getController();
            controller.setParent(controlsPane);
            controlsPane.getChildren().add(control);
        }
        catch (Exception ex)
        {
            System.out.printf("Exception: %s\n", "InstrumentProgramController.addButtonPressed");
            ex.printStackTrace();
        }
    }

    @FXML
    void returnMainWidowButtonPressed(ActionEvent event)
    {
        try
        {
            FXMLLoader loader =
                    new FXMLLoader(getClass().getResource("MainWindow.fxml"));
            Parent mainWindow = loader.load();
            MainWindow.getMainStage().setScene(new Scene(mainWindow));
        }
        catch (Exception ex)
        {
            System.out.printf("Exception: %s\n", "InstrumentProgramController.returnMainWidowButtonPressed");
            ex.printStackTrace();
        }
    }
}
