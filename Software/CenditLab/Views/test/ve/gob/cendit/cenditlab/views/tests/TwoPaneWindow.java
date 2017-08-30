package ve.gob.cendit.cenditlab.views.tests;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import ve.gob.cendit.cenditlab.views.View;


public class TwoPaneWindow extends BorderPane
{
    @FXML
    private Label leftLabel;

    @FXML
    private Label rightLabel;

    @FXML
    private VBox leftContainerVBox;

    @FXML
    private VBox rightContainerVBox;

    public TwoPaneWindow()
    {
        init();
    }

    private void init()
    {
        try
        {
            FXMLLoader fxmlLoader =
                    new FXMLLoader(getClass().getResource("two-pane-window.fxml"));

            fxmlLoader.setRoot(this);
            fxmlLoader.setController(this);
            fxmlLoader.load();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    public void setLeftTitle(String value)
    {
        setPanelLabelText(value, leftLabel);
    }

    public void setRightTitle(String value)
    {
        setPanelLabelText(value, rightLabel);
    }

    private void setPanelLabelText(String text, Label label)
    {
        if (text != null)
        {
            label.setText(text);
        }
    }

    public void addLeftPanel(View view)
    {
        addViewToContainer(view, leftContainerVBox);

    }

    public void addRightPanel(View view)
    {
        addViewToContainer(view, rightContainerVBox);
    }

    private void addViewToContainer(View view, Pane pane)
    {
        if (view != null && pane != null)
        {
            pane.getChildren().add(view.getNode());
        }
    }

}
