package ve.gob.cendit.cenditlab.ui;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.scene.Node;

import javafx.scene.layout.VBox;
import ve.gob.cendit.cenditlab.control.System;
import ve.gob.cendit.cenditlab.control.Task;
import ve.gob.cendit.cenditlab.ui.base.ViewType;

public class SystemsSetupStepView extends SectionedView
{
    private ComponentListView<System> masterListView;

    private VBox detailVBox;
    private VBox setupVBox;

    public SystemsSetupStepView()
    {
        initialize();
    }

    public SystemsSetupStepView(System... systems)
    {
        loadSystems(systems);
        initialize();
    }

    private void initialize()
    {
        masterListView = new ComponentListView<>();
        detailVBox = new VBox();
        setupVBox = new VBox();

        this.createCenterSection("Master", masterListView);
        this.createCenterSection("Detail", detailVBox);
        this.createCenterSection("Setup", setupVBox);

        masterListView.setTitle("Available Systems");
        masterListView.setIcon("images/system-icon.png");
        masterListView.setItems(FXCollections.<System>observableArrayList());
        masterListView.enableMultipleSelection(true);

        masterListView.setOnListSelectionChanged(this::onSystemSelected);
    }

    public ObservableList<System> getSystems()
    {
        return masterListView.getItems();
    }

    public void loadSystems(System... systems)
    {
        unloadSystems();
        addSystems(systems);
    }

    public void addSystems(System... systems)
    {
        getSystems().addAll(systems);
    }

    public void unloadSystems()
    {
        getSystems().clear();

        detailVBox.getChildren().clear();
    }

    private <T extends System> void onSystemSelected(ObservableValue<? extends System> observable,
                                  System oldSystem, System newSystem)
    {
        if (newSystem == null)
            return;

        Task[] tasks = newSystem.getTasks();

        if (tasks == null)
            return;

        detailVBox.getChildren().clear();
        setupVBox.getChildren().clear();

        for (Task task : tasks)
        {
            Node viewNode = task.getView(ViewType.DESCRIPTION);


            if (viewNode != null)
            {
                detailVBox.getChildren().add(viewNode);
            }

            viewNode = task.getView(ViewType.SETUP);

            if (viewNode != null)
            {
                setupVBox.getChildren().add(viewNode);
            }
        }
    }
}
