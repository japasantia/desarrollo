package ve.gob.cendit.cenditlab.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class CenterPane extends GridPane
{
    private static final String FXML_URL = "center-window.fxml";

    private static final int TOP_ROW = 0;
    private static final int CENTER_ROW = 1;
    private static final int BOTTOM_ROW = 0;

    private static final int CENTER_COL = 0;

    public CenterPane()
            throws IOException
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_URL));
        loader.setRoot(this);
        loader.setController(this);
        loader.load();
    }

    public void addCenterView(View view)
    {
        this.add(view.getNode(), CENTER_COL, CENTER_ROW);
    }

    public void addTopView(View view)
    {
        this.add(view.getNode(), CENTER_COL, TOP_ROW);
    }

    public void addBottomView(View view)
    {
        this.add(view.getNode(), CENTER_COL, BOTTOM_ROW);
    }
}
