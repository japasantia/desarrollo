package ve.gob.cendit.cenditlab.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SelectionWindowController
{
    @FXML
    private VBox programmingSCPI;

    @FXML
    void onProgrammingSCPIPressed(ActionEvent event)
    {
        try
        {
            Stage stage = InstrumentProgram.getMainStage();
            Parent instrumentProgram =
                    FXMLLoader.load(getClass().getResource("SelectionWindow.fxml"));
            stage.setScene(new Scene(instrumentProgram));
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
