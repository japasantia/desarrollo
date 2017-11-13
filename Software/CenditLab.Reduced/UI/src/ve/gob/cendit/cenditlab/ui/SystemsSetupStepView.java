package ve.gob.cendit.cenditlab.ui;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.scene.Node;

import javafx.scene.layout.VBox;
import ve.gob.cendit.cenditlab.control.System;
import ve.gob.cendit.cenditlab.control.Task;
import ve.gob.cendit.cenditlab.ui.base.ViewType;

public class SystemsSetupStepView extends GenericMainView
{
    private ComponentListView<System> masterListView;

    private VBox detailVBox;

    public SystemsSetupStepView()
    {
        initialize();
    }

    public SystemsSetupStepView(System... systems)
    {
        setSystems(systems);
        initialize();
    }

    private void initialize()
    {
        masterListView = new ComponentListView<>();
        detailVBox = new VBox();

        this.createCenterSection("Master", masterListView);
        this.createCenterSection("Detail", detailVBox);

        masterListView.setTitle("Available Systems");
        masterListView.setIcon("images/system-icon.png");
        masterListView.setItems(FXCollections.<System>observableArrayList());
        masterListView.enableMultipleSelection(true);

        masterListView.setOnSelectedItemChanged(this::onSystemSelected);
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

        for (Task task : tasks)
        {
            Node taskViewNode = task.getView(ViewType.DESCRIPTION);

            if (taskViewNode != null)
            {
                detailVBox.getChildren().add(taskViewNode);
            }
        }
    }
}
