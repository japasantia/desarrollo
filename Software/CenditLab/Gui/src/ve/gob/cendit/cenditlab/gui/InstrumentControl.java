package ve.gob.cendit.cenditlab.gui;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.IOException;

/**
 * Creación de un control personalizado
 */
public class InstrumentControl extends VBox
{
    @FXML
    private Label label;

    @FXML
    private ImageView imageView;

    @FXML
    private Image image;

    private StringProperty urlProperty = new SimpleStringProperty(this, "url");

    public InstrumentControl()
    {
        FXMLLoader loader =
            new FXMLLoader(getClass().getResource("InstrumentControl.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try
        {
            loader.load();
        }
        catch (IOException ex)
        {
            throw new RuntimeException(ex);
        }
    }

    public String getText()
    {
        return label.textProperty().get();
    }

    public void setText(String value)
    {
        label.textProperty().set(value);
    }

    public void setUrl(String url)
    {
        urlProperty().set(url);
        imageView.setImage(new Image(url));
    }

    public String getUrl()
    {
        return urlProperty().get();
    }

    public StringProperty  urlProperty()
    {
        return urlProperty;
    }
}
