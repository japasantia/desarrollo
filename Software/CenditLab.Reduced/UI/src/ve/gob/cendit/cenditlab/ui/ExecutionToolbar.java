package ve.gob.cendit.cenditlab.ui;

import javafx.scene.control.ToolBar;

public class ExecutionToolbar extends ToolBar
{
    private static final String FXML_URL = "fxml/execution-toolbar.fxml";

    public ExecutionToolbar()
    {
        ViewLoader.load(FXML_URL, this, this);
    }
}
