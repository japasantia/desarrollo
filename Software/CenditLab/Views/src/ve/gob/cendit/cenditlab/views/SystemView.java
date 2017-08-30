package ve.gob.cendit.cenditlab.views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class SystemView extends View
{
    @FXML
    private ImageView systemImageView;

    @FXML
    private Label nameLabel;

    @FXML
    private Label descriptionLabel;

    public  SystemView()
    {
        super("System View", "system-view.fxml", "Sistema Ejemplo");

        /*
        try
        {
            FXMLLoader loader =
                    new FXMLLoader(getClass().getResource("system-view.fxml"));
            Parent parent = loader.load();
            loader.setRoot(parent);
            loader.setController(this);
            systemImageView.setImage(new Image(getClass().getResource("nfa8975a-big.jpg").toString()));
        }
        catch (Exception ex)
        {
            throw new RuntimeException(ex);
        }
        */
        /*
        FXMLLoader loader =
                new FXMLLoader(getClass().getResource("system-view.fxml"));

        loader.setRoot(this);
        loader.setController(this);

        try
        {
            loader.load();

            //systemImageView.setImage(
            //        new Image(getClass().getResource("nfa8975a-big.jpg").openStream()));

            // systemImageView.setImage(new Image("file:/mnt/local/PasantiaCendit/Desarrollo/Software/CenditLab/Views/resources/nfa8975a-big.jpg"));
            // systemImageView.setImage(new Image("nfa8975a-big.jpg"));

            // load the image from a resource, specified relative to the current class
            // systemImageView.setImage(new Image(getClass().getResource("nfa8975a-big.jpg").toString()));
            // load the image from a resource specified relative to the class path
            systemImageView.setImage(new Image(getClass().getClassLoader().getResource("nfa8975a-big.jpg").toString()));
        }
        catch (Exception ex)
        {
            throw new RuntimeException(ex);
        }
        */
    }
}
