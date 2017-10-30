package ve.gob.cendit.cenditlab.ui;


import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class ViewLoader
{
    public static void load(String fxmlUrl, Object controller, Object root)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(root.getClass().getResource(fxmlUrl));
            fxmlLoader.setController(controller);
            fxmlLoader.setRoot(root);
            fxmlLoader.load();
        }
        catch (IOException ex)
        {
            throw new RuntimeException(ex);
        }
    }
}
