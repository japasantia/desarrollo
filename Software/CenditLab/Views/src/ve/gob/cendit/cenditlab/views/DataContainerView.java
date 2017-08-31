package ve.gob.cendit.cenditlab.views;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import ve.gob.cendit.cenditlab.tasks.Data;
import ve.gob.cendit.cenditlab.tasks.DataContainer;
import ve.gob.cendit.cenditlab.tasks.DataSlot;

import java.util.Arrays;

/**
 * Created by root on 29/08/17.
 */
public class DataContainerView extends View
{
    private static final String DEFAULT_NAME = "Data Container";
    private static final String DEFAULT_DESCRIPTION = "Es un contenedor de datos";
    private static final String FXML_FILE = "data-container-view.fxml";

    @FXML
    private ListView<Node> dataListView;

    private ObservableList<TextDataView> dataList;

    public DataContainerView()
    {
        super(DEFAULT_NAME, FXML_FILE, DEFAULT_DESCRIPTION);
    }

    public DataContainerView(String name, String description)
    {
        super(name, "data-container-view.fxml", description);
    }

    public void setDataContainer(DataContainer dataContainer)
    {
        DataSlot[] dataSlots = dataContainer.getDataSlots();

        Arrays.stream(dataSlots)
            .forEach(ds ->
                {
                    String name = ds.getName();
                    Data data = dataContainer.getData(name);
                    String value = data != null ? data.toString() : "";
                    dataListView.getItems()
                        .add(new TextDataView(name, value, null).getNode());
                });
    }
}
