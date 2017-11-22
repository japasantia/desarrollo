package ve.gob.cendit.cenditlab.views.tests;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ve.gob.cendit.cenditlab.views.ComponentView;
import ve.gob.cendit.cenditlab.views.MasterDetailView;

public class MasterDetailViewTest extends Application
{
    private MasterDetailView mdv;

    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        mdv = new MasterDetailView();

        addMasterViews();
        addDetailViews();

        Parent root = new VBox(mdv.getNode());
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("CenditLab | MasterDetailView Test");
        primaryStage.setWidth(1200.0);
        primaryStage.setMaxHeight(800.0);
        primaryStage.show();
    }

    private void addMasterViews()
    {
        for (int i = 0; i < 10; i++)
        {
            ComponentView componentView = new ComponentView(String.format("Componente %d", i),
                    "Vista Componenete", null);
            componentView.enableSection(ComponentView.CONTENT, false);
            componentView.enableSection(ComponentView.FOOTER, false);

            mdv.addSectionView(componentView, MasterDetailView.MASTER);
        }
    }

    private void addDetailViews()
    {
        for (int i = 0; i < 10; i++)
        {
            ComponentView componentView = new ComponentView(String.format("Componente %d", i),
                    "Vista Componenente", null);

            mdv.addSectionView(componentView, MasterDetailView.DETAIL);
        }
    }
}
