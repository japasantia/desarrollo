package ve.gob.cendit.cenditlab.views;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;

import javafx.scene.control.ListView;
import ve.gob.cendit.cenditlab.data.Data;
import ve.gob.cendit.cenditlab.tasks.Slot;
import ve.gob.cendit.cenditlab.tasks.ComponentSlots;

import java.util.Arrays;


public class VectorView extends View
{
    private static final String DEFAULT_NAME = "Data Container";
    private static final String DEFAULT_DESCRIPTION = "Es un contenedor de datos";
    private static final String FXML_FILE = "data-container-view.fxml";

    @FXML
    private ListView<Node> dataListView;

    private ObservableList<Node> dataList;

    public VectorView()
    {
        super(FXML_FILE);
    }

    public void setDataContainer(ComponentSlots componentSlots)
    {
        if (dataList == null)
        {
            dataList = FXCollections.observableArrayList();
        }

        Slot[] dataSlots = componentSlots.getSlots();

        Arrays.stream(dataSlots)
            .forEach(ds ->
                {
                    String name = ds.getName();
                    Data data = componentSlots.getData(name);
                    String value = data != null ? data.toString() : "";
                    TextView view = new TextView(name, value);
                    dataList.add(view.getNode());
                });
    }

    @Override
    public void update()
    {
        dataListView.setItems(dataList);
    }
}
