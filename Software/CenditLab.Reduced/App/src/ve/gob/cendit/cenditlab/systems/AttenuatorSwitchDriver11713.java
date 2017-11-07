package ve.gob.cendit.cenditlab.systems;

import ve.gob.cendit.cenditlab.control.MeasurementManager;
import ve.gob.cendit.cenditlab.control.System;
import ve.gob.cendit.cenditlab.control.Task;
import ve.gob.cendit.cenditlab.data.FieldsContainer;


public class AttenuatorSwitchDriver11713 extends System
{
    private static final String NAME = "Attenuator and Switch Driver 11713";
    private static final String DESCRIPTION = "Attenuator and switch controller and driver";
    private static final String ICON_URL = "asd11713b.jpg";

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

    private class SetAttenuationTask extends Task
    {
        private static final String NAME = "Attenuation Setter";
        private static final String DESCRIPTION = "Sets attenuation on the device";

        public SetAttenuationTask()
        {
            super(NAME, DESCRIPTION, null);
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
    }


    private class SetSwitchStateTask extends Task
    {
        private static final String NAME = "Change Switch State";
        private static final String DESCRIPTION = "Change switch state on selected switch";

        public SetSwitchStateTask()
        {
            super(NAME, DESCRIPTION, null);
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
    }
}
