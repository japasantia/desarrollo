package ve.gob.cendit.cenditlab.ui;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.EventHandler;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.util.Callback;
import ve.gob.cendit.cenditlab.control.System;
import ve.gob.cendit.cenditlab.control.Task;

import java.util.Observable;

public class SystemsSetupView extends GenericMainView
{
    private GenericListView<System> masterListView;

    private VBox detailsVBox;

    public SystemsSetupView()
    {
        initialize();
    }

    public SystemsSetupView(System... systems)
    {
        setSystems(systems);
        initialize();
    }

    private void initialize() {
        masterListView = new GenericListView<>();
        detailsVBox = new VBox();

        this.createCenterSection("Master", masterListView);
        this.createCenterSection("Details", detailsVBox);

        masterListView.setTitle("Available Systems");
        masterListView.setItems(FXCollections.<System>observableArrayList());

        masterListView.setOnSelectedItemChanged(this::onSystemSelected);
        masterListView.setCellFactory(this::createListCell);

        /*
        masterListView.setCellFactory((ListView<System> lv) ->
                {
                    SystemListCell cell = new SystemListCell();
                    cell.setOnClicked(event -> onSystemClicked(event));
                    return new SystemListCell();
                });
        */
    }

    public ObservableList<System> getSystems()
    {
        return masterListView.getItems();
    }

    public void setSystems(System... systems)
    {
        getSystems().clear();
        addSystems(systems);
    }

    public void addSystems(System... systems)
    {
        getSystems().addAll(systems);

        // populateSystemsMasterListView();
    }

    /*
    private void populateSystemsMasterListView()
    {
        for (System system : getSystems())
        {
            IconView systemIcon = new IconView(system.getName(),
                    "system-icon.png");
            systemIcon.setOnMouseClicked(event -> onSystemClicked(event, system));
            masterListView.getItems().add(systemIcon);
        }
    }
    */

    private ListCell<System> createListCell(ListView<System> listView)
    {
        return new SystemListCell();
    }

    private void onSystemSelected(ObservableValue<? extends System> observable,
                                  System oldSystem, System newSystem)
    {
        if (newSystem == null)
            return;

        Task[] tasks = newSystem.getTasks();

        detailsVBox.getChildren().clear();

        for (Task task : tasks)
        {
            IconView taskIcon = new IconView(task.getName(),
                    "nfa8975a.jpg");
            detailsVBox.getChildren().add(taskIcon);
        }
    }

    private void onSystemClicked(MouseEvent event)
    {
        SystemListCell cell = (SystemListCell) event.getSource();

        if (cell == null)
            return;

        System system = cell.getSystem();

        if (system == null)
            return;

        Task[] tasks = system.getTasks();

        detailsVBox.getChildren().clear();

        for (Task task : tasks)
        {
            IconView taskIcon = new IconView(task.getName(),
                    "nfa8975a.jpg");
            detailsVBox.getChildren().add(taskIcon);
        }
    }

    protected class SystemListCell extends ListCell<System>
    {
        private IconView iconView;
        private System system;

        public SystemListCell()
        {
            iconView = new IconView();
        }

        public System getSystem()
        {
            return system;
        }

        protected void setSystem(System s)
        {
            system = s;
        }

        @Override
        protected void updateItem(System system, boolean empty)
        {
            super.updateItem(system, empty);

            if (empty || system == null)
            {
                setGraphic(null);
                return;
            }

            setSystem(system);
            iconView.setCaption(system.getName());
            iconView.setIcon(system.getIcon());

            setGraphic(iconView);
        }
    }
}
