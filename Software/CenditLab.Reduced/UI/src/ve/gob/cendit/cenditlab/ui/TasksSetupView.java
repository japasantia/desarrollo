package ve.gob.cendit.cenditlab.ui;


import javafx.geometry.Orientation;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import ve.gob.cendit.cenditlab.control.Task;
import ve.gob.cendit.cenditlab.control.System;

public class TasksSetupView extends GenericMainView
{
    private ScrollPane masterScrollView;
    private GenericMainView detailSetupGenericMainView;

    private VBox masterVBox;
    private VBox detailVBox;
    private VBox setupVBox;

    public TasksSetupView()
    {
        initialize();
    }

    public TasksSetupView(System... systems)
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
            GenericListView<Task> taskListView = new GenericListView<>();

            taskListView.setMaxWidth(Double.POSITIVE_INFINITY);
            taskListView.setPrefHeight(-1.0);
            taskListView.setMinHeight(-1.0);
            taskListView.setCollapsible(true);

            VBox.setVgrow(taskListView, Priority.ALWAYS);

            taskListView.setTitle(system.getName());
            taskListView.getItems().addAll(system.getTasks());

            masterVBox.getChildren().add(taskListView);
        }
    }
}
