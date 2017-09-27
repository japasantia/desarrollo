package ve.gob.cendit.cenditlab.views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import ve.gob.cendit.cenditlab.tasks.Component;


public class ComponentView extends View
{
    private static final String FXML_URL = "component-view.fxml";

    public static final int HEADER = 0;
    public static final int CONTENT = 1;
    public static final int FOOTER = 2;

    @FXML
    private Label nameLabel;

    @FXML
    private Label descriptionLabel;

    @FXML
    private Pane headerPane;

    @FXML
    private ScrollPane scrollContentPane;

    @FXML
    private Pane contentPane;

    @FXML
    private Pane footerPane;

    private Pane[] panes;

    @FXML
    private ImageView iconImageView;

    private String name;
    private String description;
    private String iconUrl;

    public ComponentView()
    {
        super(FXML_URL);

        load();

        panes  = new Pane[] { headerPane, contentPane, footerPane };
    }

    public ComponentView(String name, String description, String iconUrl)
    {
        this();

        setName(name);
        setDescription(description);
        setIcon(iconUrl);
    }

    public ComponentView(Component component)
    {
        this();

        setName(component.getName());
        setDescription(component.getDescription());
        setIcon(component.getIcon());
    }

    @Override
    public void update()
    {
        if (nameLabel != null)
        {
            nameLabel.setText((name != null ? name : ""));
            nameLabel.setVisible(name != null);
        }

        if (descriptionLabel != null)
        {
            descriptionLabel.setText((description != null ? description : ""));
            descriptionLabel.setVisible(description != null);
        }

        if (iconImageView != null && iconUrl != null)
        {
            iconImageView.setImage(new Image(iconUrl));
        }
    }

    public void setName(String name)
    {
        this.name = name;

        update();
    }

    public void setDescription(String description)
    {
        this.description = description;

        update();
    }

    public void setIcon(String iconUrl)
    {
        this.iconUrl = iconUrl;

        update();
    }

    public void addView(View view, int sectionId)
    {
        getPaneFromId(sectionId).getChildren().add(view.getNode());
    }

    public void removeView(View view, int sectionId)
    {
        getPaneFromId(sectionId).getChildren().remove(view.getNode());
    }

    public void clear(int sectionId)
    {
        getPaneFromId(sectionId).getChildren().clear();
    }

    public void enableSection(int sectionId, boolean enable)
    {
        if (sectionId == CONTENT)
        {
            scrollContentPane.setVisible(enable);
        }
        else
        {
            getPaneFromId(sectionId).setVisible(enable);
        }
    }

    private Pane getPaneFromId(int id)
    {
        if (id < 0 || id >= panes.length)
        {
            throw new IllegalArgumentException("pane id out of range");
        }

        return panes[id];
    }
}
