package ve.gob.cendit.cenditlab.ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class ValueUnitField extends HBox
{
    private static final String FXML_URL = "value-unit-field.fxml";

    public ValueUnitField()
    {
        FXMLLoader fxmlLoader =
                new FXMLLoader(getClass()
                        .getResource(FXML_URL));

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
