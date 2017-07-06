package ve.gob.cendit.cenditlab.gui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainWindowController
{
    @FXML
    private VBox programmingSCPI;

    @FXML
    void onProgrammingSCPIPressed()
    {
        try
        {
            Stage stage = MainWindow.getMainStage();
            Parent instrumentProgram =
                    FXMLLoader.load(getClass().getResource("InstrumentProgram.fxml"));
            stage.setScene(new Scene(instrumentProgram));
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
