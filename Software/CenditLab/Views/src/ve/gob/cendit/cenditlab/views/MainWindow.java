package ve.gob.cendit.cenditlab.views;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MainWindow extends BorderPane
{
    private static final String FXML_URL = "main-window.fxml";

    @FXML
    BorderPane mainBorderPane;

    public MainWindow()
            throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FXML_URL));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        fxmlLoader.load();
    }

    public void setCenterPane(Node childNode)
    {
        mainBorderPane.setCenter(childNode);
    }

    public void setLeftPane(Node childNode)
    {
        mainBorderPane.setLeft(childNode);
    }
}
