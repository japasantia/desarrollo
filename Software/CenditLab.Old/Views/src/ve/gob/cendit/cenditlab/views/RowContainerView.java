package ve.gob.cendit.cenditlab.views;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.HBox;

import java.util.Arrays;

public class RowContainerView extends ContainerView
{
    private static final String FXML_URL = "row-container-view.fxml";

    @FXML
    HBox rowPane;

    public RowContainerView()
    {
        super(FXML_URL);

        load();
    }

    void setParentColumn(ColumnContainerView column)
    {
        /*
        ColumnContainerView parent = (ColumnContainerView) getParentColumn();

        if (parent != null)
        {
            getParentColumn().removeRow(this);
        }
        */

        super.setParentContainer(column);
    }

    ColumnContainerView getParentColumn()
    {
        return (ColumnContainerView) super.getParentContainer();
    }

    @Override
    public void update()
    {

    }

    public void addColumns(ColumnContainerView... columns)
    {
        if (columns != null && columns.length > 0)
        {
            ObservableList<Node> columnsList = rowPane.getChildren();
            Arrays.stream(columns)
                    .forEach(column -> {
                        columnsList.add(column.getNode());
                        column.setParentRow(this); });
        }
    }

    @Override
    public void add(ContainerView child)
    {

    }

    @Override
    public void remove(ContainerView child)
    {
        removeColumn((ColumnContainerView) child);
    }

    public void setColumn(int index, View view)
    {
        setColumn(index, view.getNode());
    }

    public void setColumn(int index, ColumnContainerView column)
    {
        setColumn(index, column.getNode());
    }

    private void setColumn(int index, Node node)
    {
        throwIfColumnIndexNegative(index);

        if (isColumnIndexInRange(index))
        {
            removeColumn(index);
            rowPane.getChildren().add(index, node);
        }
        else
        {
            rowPane.getChildren().add(node);
        }
    }

    public void removeColumn(int index)
    {
        // throwIfColumnIndexNegative(index);

        if (isColumnIndexInRange(index))
        {
            rowPane.getChildren().remove(index);
        }
    }

    public void removeColumn(ColumnContainerView column)
    {
        Node columnNode = column.getNode();

        if (rowPane.getChildren().contains(columnNode))
        {
            rowPane.getChildren().remove(columnNode);
        }
    }

    public boolean hasParentColumn()
    {
        return getParentColumn() != null;
    }

    private void throwIfColumnIndexNegative(int index)
    {
        if (index < 0)
        {
            throw new IllegalArgumentException("index index must not be negative");
        }
    }

    private boolean isColumnIndexInRange(int index)
    {
       return index >= 0 && index < rowPane.getChildren().size();
    }
}
