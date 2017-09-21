package ve.gob.cendit.cenditlab.views;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

public class MasterDetailView extends View
{
    private static final String FXML_URL = "master-detail-view.fxml";

    @FXML
    private Pane masterPane;

    @FXML
    private Pane detailPane;

    @FXML
    private Pane footerPane;

    @FXML
    private Pane headerPane;

    public static final int MASTER = 0;
    public static final int DETAIL = 1;
    public static final int FOOTER = 2;
    public static final int HEADER = 3;

    private Pane[] panes;


    public MasterDetailView()
    {
        super(FXML_URL);

        load();

        panes = new Pane[] { masterPane, detailPane, footerPane, headerPane };
    }

    @Override
    public void update()
    {

    }

    public void addSectionView(View view, int sectionId)
    {
        getPaneFromId(sectionId).getChildren().add(view.getNode());
    }

    public void removeSectionView(View view, int sectionId)
    {
        getPaneFromId(sectionId).getChildren().remove(view.getNode());
    }

    public void clearSectionView(int sectionId)
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
