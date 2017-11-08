package ve.gob.cendit.cenditlab.systems;

import javafx.scene.Node;
import ve.gob.cendit.cenditlab.control.MeasurementManager;
import ve.gob.cendit.cenditlab.control.System;
import ve.gob.cendit.cenditlab.control.Task;
import ve.gob.cendit.cenditlab.data.FieldsContainer;
import ve.gob.cendit.cenditlab.ui.ComponentViewFactory;
import ve.gob.cendit.cenditlab.ui.IconView;
import ve.gob.cendit.cenditlab.ui.ViewType;

public class AttenuatorSwitchDriver11713 extends System
{
    private static final String NAME = "Attenuator and Switch Driver 11713";
    private static final String DESCRIPTION = "Attenuator and switch controller and driver";
    private static final String ICON_URL = "asd11713c.jpg";

    private static final ComponentViewFactory viewFactory = ComponentViewFactory.get();

    private Task[] taskArray =
        {
            new SetAttenuationTask(),
            new SetSwitchStateTask()
        };

    public AttenuatorSwitchDriver11713()
    {
        super(NAME, DESCRIPTION, ICON_URL);
    }

    @Override
    public Task[] getTasks()
    {
        return taskArray;
    }

    @Override
    public MeasurementManager getMeasurementManager()
    {
        return null;
    }

    @Override
    public Node getView(ViewType viewType)
    {
        return viewFactory.createView(this, viewType);
    }

    @Override
    public Node getView(String viewId)
    {
        return null;
    }

    private class SetAttenuationTask extends Task
    {
        private static final String NAME = "Attenuation Setter";
        private static final String DESCRIPTION = "Sets attenuation on the device";
        private static final String ICON_URL = "task-icon.jpg";

        public SetAttenuationTask()
        {
            super(NAME, DESCRIPTION, ICON_URL);
        }

        @Override
        public void execute()
        {

        }

        @Override
        public FieldsContainer getSetupFields()
        {
            return null;
        }

        @Override
        public Node getView(ViewType viewType)
        {
            return viewFactory.createView(this, viewType);
        }

        @Override
        public Node getView(String viewId)
        {
            return null;
        }
    }


    private class SetSwitchStateTask extends Task
    {
        private static final String NAME = "Change Switch State";
        private static final String DESCRIPTION = "Change switch state on selected switch";
        private static final String ICON_URL = "task-icon.jpg";

        private final IconView ICON_VIEW = new IconView(NAME, ICON_URL);

        public SetSwitchStateTask()
        {
            super(NAME, DESCRIPTION, ICON_URL);
        }

        @Override
        public void execute()
        {

        }

        @Override
        public FieldsContainer getSetupFields()
        {
            return null;
        }

        @Override
        public Node getView(ViewType viewType)
        {
            return viewFactory.createView(this, viewType);
        }

        @Override
        public Node getView(String viewId)
        {
            return null;
        }
    }
}
