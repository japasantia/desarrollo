package ve.gob.cendit.cenditlab.ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.TitledPane;

import java.io.IOException;

public class FrequencyRangePane extends TitledPane
{
    private static final String FXML_URL = "frequency-range-pane.fxml";

    public FrequencyRangePane()
    {
        FXMLLoader fxmlLoader =
                new FXMLLoader(getClass().
                        getResource(FXML_URL));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try
        {
            fxmlLoader.load();
        }
        catch (IOException ex)
        {
            throw new RuntimeException(ex);
        }
    }
}
