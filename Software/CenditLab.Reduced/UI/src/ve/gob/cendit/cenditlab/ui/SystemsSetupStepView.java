package ve.gob.cendit.cenditlab.ui;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.geometry.Orientation;
import javafx.scene.Node;

import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import sun.swing.SwingUtilities2;
import ve.gob.cendit.cenditlab.control.System;
import ve.gob.cendit.cenditlab.control.Task;
import ve.gob.cendit.cenditlab.ui.base.ViewType;

public class SystemsSetupStepView extends SectionedView
{
    private static final Image DEFAULT_ICON =
            new Image(SystemsSetupStepView.class.getResource("/ve/gob/cendit/cenditlab/ui/images/system-icon.png").toExternalForm());

    private ComponentListView<System> masterListView;

    private SectionedView detailSetupSectionedView;

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

        detailSetupSectionedView = new SectionedView();
        detailSetupSectionedView.createCenterSection("Detail", detailVBox);
        detailSetupSectionedView.createCenterSection("Setup", setupVBox);
        detailSetupSectionedView.setCenterSectionOrientation(Orientation.VERTICAL);

        this.createCenterSection("Master", masterListView);
        this.createCenterSection("SetupDetail", detailSetupSectionedView);

        masterListView.setTitle("Available Systems");
        masterListView.setIcon(DEFAULT_ICON);
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
