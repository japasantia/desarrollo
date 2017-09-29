package ve.gob.cendit.cenditlab.views;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

import java.util.Arrays;

public class ColumnContainerView extends ContainerView
{
    private static final String FXML_URL = "column-container-view.fxml";
    
    @FXML
    private Pane columnPane;

    public ColumnContainerView()
    {
        super(FXML_URL);

        load();
    }
    
    void setParentRow(RowContainerView column)
    {
        /*
        RowContainerView parent = (RowContainerView) getParentRow();

        if (parent != null)
        {
            // TODO: remover este objeto row de su columna padre
            getParentRow().removeColumn(this);
        }
        */
        super.setParentContainer(column);

    }

    RowContainerView getParentRow()            
    {
        return (RowContainerView) super.getParentContainer();
    }

    @Override
    public void update()
    {

    }

    public void addRows(RowContainerView... rows)
    {
        if (rows != null && rows.length > 0)
        {
            ObservableList<Node> columnsList = columnPane.getChildren();
            Arrays.stream(rows)
                    .forEach(row -> {
                        columnsList.add(row.getNode());
                        row.setParentColumn(this);
                    });
        }
    }

    @Override
    public void add(ContainerView child)
    {
        addRows((RowContainerView) child);
    }

    @Override
    public void remove(ContainerView child)
    {
        removeRow((RowContainerView) child);
    }

    public void setRow(int index, View view)
    {
        setRow(index, view.getNode());
    }

    public void setRow(int index, RowContainerView row)
    {
        setRow(index, row.getNode());
    }

    private void setRow(int index, Node node)
    {
        throwIfRowIndexNegative(index);

        if (isRowIndexInRange(index))
        {
            removeRow(index);
            columnPane.getChildren().add(index, node);
        }
        else
        {
            columnPane.getChildren().add(node);
        }
    }

    public void removeRow(int index)
    {
        throwIfRowIndexNegative(index);

        if (isRowIndexInRange(index))
        {
            columnPane.getChildren().remove(index);
        }
    }

    public void removeRow(RowContainerView row)
    {
        Node rowNode = row.getNode();

        if (columnPane.getChildren().contains(rowNode))
        {
            columnPane.getChildren().remove(rowNode);
        }
    }

    public boolean hasParentRow()
    {
        return getParentRow() != null;
    }

    private void throwIfRowIndexNegative(int index)
    {
        if (index < 0)
        {
            throw new IllegalArgumentException("index index must not be negative");
        }
    }

    private boolean isRowIndexInRange(int index)
    {
        return index >= 0 && index < columnPane.getChildren().size();
    }    
}
