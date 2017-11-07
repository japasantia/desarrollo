package ve.gob.cendit.cenditlab.ui;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Callback;

public class GenericListView<T> extends TitledPane
{
    private static final String FXML_URL = "generic-list-view.fxml";
    private static final String DEFAULT_ICON_URL = "task-icon-1.jpg";
    private static final String DEFAULT_TITLE = "";

    @FXML
    private ImageView iconImageView;

    @FXML
    private ListView<T> containerListView;

    public GenericListView()
    {
        ViewLoader.load(FXML_URL, this, this);
    }

    public void setTitle(String value)
    {
        this.setText(value != null ? value : DEFAULT_TITLE);
    }

    public String getTitle()
    {
        return this.getText();
    }

    public void setIcon(String iconUrl)
    {
        if (iconUrl != null)
        {
            iconImageView.setVisible(true);
            iconImageView.setImage(new Image(iconUrl));
        }
        else
        {
            iconImageView.setVisible(false);
        }
    }

    public void enableMultipleSelection(boolean value)
    {
        containerListView.getSelectionModel()
            .setSelectionMode(value ? SelectionMode.MULTIPLE : SelectionMode.SINGLE);
    }

    public void setItems(ObservableList<T> list)
    {
        if (list != null)
        {
            containerListView.setItems(list);
        }
        else
        {
            containerListView.getItems().clear();
        }
    }

    public ObservableList<T> getItems()
    {
        return containerListView.getItems();
    }

    public void clearItems()
    {
        containerListView.getItems().clear();
    }

    public T getSelectedItem()
    {
        return containerListView.getSelectionModel().getSelectedItem();
    }

    public ObservableList<T> getSelectedItems()
    {
        return containerListView.getSelectionModel().getSelectedItems();
    }

    public void setCellFactory(Callback<ListView<T>, ListCell<T>> callback)
    {
        containerListView.setCellFactory(callback);
    }

    public void setOnSelectedItemChanged(ChangeListener<T> listener)
    {
        containerListView.getSelectionModel()
                .selectedItemProperty()
                .addListener(listener);
    }
}
