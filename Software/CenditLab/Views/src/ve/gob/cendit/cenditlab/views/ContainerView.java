package ve.gob.cendit.cenditlab.views;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.List;

public class ContainerView extends View
{
    private static final String FXML_URL = "container-view.fxml";

    public static final int HEADER = 0;
    public static final int CONTENT = 1;
    public static final int FOOTER = 2;

    @FXML
    private VBox headerPane;

    @FXML
    private VBox footerPane;

    @FXML
    private VBox contentPane;

    private Pane[] panes  = { headerPane, contentPane, footerPane };

    private List<View> headerViewsList;
    private List<View> contentViewsList;
    private List<View> footerViewsList;

    public ContainerView()
    {
        super(FXML_URL);

        load();
    }

    @Override
    public void update()
    {

    }

    public void addView(View view, int sectionId)
    {
        getPaneFromId(sectionId).getChildren().add(view.getNode());
    }

    public void removeView(View view, int sectionId)
    {
        getPaneFromId(sectionId).getChildren().remove(view.getNode());
    }

    public void clear(int sectionId)
    {
        getPaneFromId(sectionId).getChildren().clear();
    }

    private Pane getPaneFromId(int id)
    {
        if (id < 0 || id >= panes.length)
        {
            throw new IllegalArgumentException("pane id out of range");
        }

        return panes[id];
    }
}
