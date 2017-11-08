package ve.gob.cendit.cenditlab.ui;

import javafx.scene.Node;
import ve.gob.cendit.cenditlab.control.Component;
import ve.gob.cendit.cenditlab.control.System;
import ve.gob.cendit.cenditlab.control.Task;

import java.util.HashMap;
import java.util.Map;

public class ComponentViewFactory
{
    private static final ComponentViewFactory globalFactory =
            new ComponentViewFactory();

    private Map<String, ComponentViewFactory.ViewFactory> viewFactoriesMap;

    public ComponentViewFactory()
    {
        viewFactoriesMap = new HashMap();
    }

    public static final ComponentViewFactory get()
    {
        return globalFactory;
    }

    public boolean existFactory(Component component)
    {
        return viewFactoriesMap.containsKey(component.getClass().getName());
    }

    public void registerFactory(Component component, ComponentViewFactory.ViewFactory factory)
    {
        if (component == null || factory == null)
        {
            throw new IllegalArgumentException("Arguments must not be null");
        }

        viewFactoriesMap.put(component.getClass().getName(), factory);
    }

    public ComponentViewFactory.ViewFactory removeFactory(Component component)
    {
        return viewFactoriesMap.remove(component.getClass().getName());
    }

    public Node createView(Component component, ViewType viewType)
    {
        if (existFactory(component))
        {
            ComponentViewFactory.ViewFactory viewFactory =
                    viewFactoriesMap.get(component.getClass().getName());

            return viewFactory.createView(component, viewType);
        }

        if (component instanceof System)
        {
            return new IconView(component.getName(), component.getIcon());
        }
        else if (component instanceof Task)
        {
            return new IconView(component.getName(), component.getIcon());
        }
        else
        {
            return new IconView(component.getName(), component.getIcon());
        }
    }

    public interface ViewFactory
    {
        Node createView(Component component, ViewType viewType);
    }
}

/*
public class ComponentViewFactory
{
    private Map<String, Node> viewsMap;

    public ComponentViewFactory()
    {
        viewsMap = new HashMap<>(5);
    }

    public ComponentViewFactory(Pair<ViewType, Node>... viewPairs)
    {
        this();

        Arrays.stream(viewPairs)
                .forEach(pair -> setView(pair.getKey(), pair.getValue()));
    }

    public void setView(ViewType viewType, Node viewNode)
    {
        if (viewType == null)
            return;

        setView(viewType.toString(), viewNode);
    }

    public void setView(String viewId, Node viewNode)
    {
        if (viewId == null)
            return;

        viewsMap.put(viewId, viewNode);
    }

    public void setView(String viewId, String viewUrl)
    {
        Node viewNode = ViewLoader.load(viewUrl);
        setView(viewId, viewNode);
    }

    public Node getView(ViewType viewType)
    {
        return getView(viewType.toString());
    }

    public Node getView(String viewId)
    {
        return viewsMap.get(viewId);
    }

    public Node removeView(ViewType viewType)
    {
        return removeView(viewType.toString());
    }

    public Node removeView(String viewId)
    {
        return viewsMap.remove(viewId);
    }
}
*/
