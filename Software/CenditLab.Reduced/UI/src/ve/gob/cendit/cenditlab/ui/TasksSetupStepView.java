package ve.gob.cendit.cenditlab.ui;

import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import ve.gob.cendit.cenditlab.control.Task;
import ve.gob.cendit.cenditlab.control.System;
import ve.gob.cendit.cenditlab.ui.base.ViewType;

public class TasksSetupStepView extends GenericMainView
{
    private ScrollPane masterScrollView;
    private GenericMainView detailSetupGenericMainView;

    private VBox masterVBox;
    private VBox detailVBox;
    private VBox setupVBox;

    public TasksSetupStepView()
    {
        initialize();
    }

    public TasksSetupStepView(System... systems)
    {
        initialize();
        setSystems(systems);
    }

    private void initialize()
    {
        masterVBox = new VBox();
        masterScrollView = new ScrollPane(masterVBox);

        masterScrollView.setFitToWidth(true);
        masterScrollView.setPannable(true);
        masterVBox.setFillWidth(true);
        masterVBox.setPrefWidth(-1.0);
        masterVBox.setPrefHeight(-1.0);
        masterVBox.setMaxWidth(Double.POSITIVE_INFINITY);

        detailVBox = new VBox();
        setupVBox = new VBox();
        detailSetupGenericMainView = new GenericMainView();

        detailSetupGenericMainView.setCenterSectionOrientation(Orientation.VERTICAL);
        detailSetupGenericMainView.createCenterSection("Detail", detailVBox);
        detailSetupGenericMainView.createCenterSection("Setup", setupVBox);

        this.createCenterSection("Master", masterScrollView);
        this.createCenterSection("DetailSetup", detailSetupGenericMainView);
    }

    public void setSystems(System... systems)
    {
        masterVBox.getChildren().clear();

        for (System system : systems)
        {
            ComponentListView<Task> tasksListView = new ComponentListView<>();

            tasksListView.setOnSelectedItemChanged(this::onTaskSelected);

            tasksListView.setCollapsible(true);
            tasksListView.setIcon(system.getIcon());
            VBox.setVgrow(tasksListView, Priority.ALWAYS);

            tasksListView.setTitle(system.getName());
            tasksListView.getItems().addAll(system.getTasks());

            masterVBox.getChildren().add(tasksListView);
        }
    }

    private <T extends Task> void onTaskSelected(ObservableValue<? extends Task> observable,
                                                 T oldTask, T newTask)
    {
        detailVBox.getChildren().clear();
        detailVBox.getChildren().add(newTask.getView(ViewType.DETAILS));

        setupVBox.getChildren().clear();
        setupVBox.getChildren().add(newTask.getView(ViewType.SETUP));
    }
}
