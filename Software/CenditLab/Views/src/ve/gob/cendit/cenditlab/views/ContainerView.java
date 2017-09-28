package ve.gob.cendit.cenditlab.views;

import javafx.scene.layout.Region;

public class ContainerView extends View
{
    private ContainerView parentContainerView;

    protected ContainerView(String fxmlUrl)
    {
        super(fxmlUrl);
    }

    @Override
    public void update()
    {}

    protected void setParentContainer(ContainerView container)
    {
        if (parentContainerView != null)
        {
            parentContainerView.remove(this);
        }

        parentContainerView = container;
        // parentContainerView.add(container);
    }

    protected ContainerView getParentContainer()
    {
        return parentContainerView;
    }

    public void add(ContainerView child)
    {

    }

    public void remove(ContainerView child)
    {

    }

    public boolean hasParentContainer()
    {
        return parentContainerView != null;
    }

    public void setWidthPercentage(double parentPercent)
    {
        if (hasParentContainer())
        {
            double parentWidth = getParentContainer().getNode().getBoundsInParent().getWidth();
            ((Region)getNode()).setPrefWidth(parentPercent * parentWidth);
        }
    }

    public void setHeightPercentage(double parentPercent)
    {
        if (hasParentContainer())
        {
            double parentHeight = getParentContainer().getNode().getBoundsInParent().getHeight();
            ((Region)getNode()).setPrefWidth(parentPercent * parentHeight);
        }
    }

    public void setSizePercentage(double parentWidthPercent, double parentHeightPercent)
    {
        setWidthPercentage(parentWidthPercent);
        setHeightPercentage(parentHeightPercent);
    }

    public void setWidth(double width)
    {
        ((Region)getNode()).setPrefWidth(width);
    }

    public void setHeight(double height)
    {
        ((Region)getNode()).setPrefHeight(height);
    }

    public void setSize(double width, double height)
    {
        setWidth(width);
        setHeight(height);
    }
}
