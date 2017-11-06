package ve.gob.cendit.cenditlab.ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import ve.gob.cendit.cenditlab.control.System;
import ve.gob.cendit.cenditlab.control.Task;

public class SystemsSetupView extends GenericMainView
{
    private ObservableList<System> systemList;

    private ListView<Node> masterListView;

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

    private void initialize()
    {
        masterListView = new ListView<>();
        detailsVBox = new VBox();

        this.createCenterSection("Master", masterListView);
        this.createCenterSection("Details", detailsVBox);

        systemList = FXCollections.observableArrayList();
    }

    public void setSystems(System... systems)
    {
        systemList.clear();
        addSystems(systems);
    }

    public ObservableList<System> getSystems()
    {
        return systemList;
    }

    public void addSystems(System... systems)
    {
        systemList.addAll(systems);

        populateSystemsMasterListView();
    }

    private void populateSystemsMasterListView()
    {
        for (System system : systemList)
        {
            IconView systemIcon = new IconView(system.getName(),
                    "system-icon.png");
            systemIcon.setOnMouseClicked(event -> onSystemClicked(event, system));
            masterListView.getItems().add(systemIcon);
        }
    }
    
    private void onSystemClicked(MouseEvent event, System system)
    {
        Task[] tasks = system.getTasks();

        detailsVBox.getChildren().clear();

        for (Task task : tasks)
        {
            IconView taskIcon = new IconView(task.getName(),
                    "nfa8975a.jpg");
            detailsVBox.getChildren().add(taskIcon);
        }
    }
}
