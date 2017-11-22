package ve.gob.cendit.cenditlab.views;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.Arrays;

public class

ComponentSelectionPane extends HBox
{
    private static final String FXML_URL = "component-selection-pane.fxml";

    @FXML
    private Pane instrumentsPane;

    @FXML
    private Pane systemsPane;

    @FXML
    private Pane containerPane;

    public ComponentSelectionPane()
            throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FXML_URL));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        fxmlLoader.load();
    }

    public void addInstrument(View view)
    {
        instrumentsPane.getChildren().add(view.getNode());
    }

    public void addSystem(View view)
    {
        systemsPane.getChildren().add(view.getNode());
    }

    public void addInstruments(View... instrumentViews)
    {
        Arrays.stream(instrumentViews)
                .forEach(view -> instrumentsPane.getChildren().add(view.getNode()));
    }

    public void addSystems(View... systemViews)
    {
        Arrays.stream(systemViews)
                .forEach(view -> systemsPane.getChildren().add(view.getNode()));
    }

    public void addSelected(View view)
    {
        containerPane.getChildren().add(view.getNode());
    }
}
