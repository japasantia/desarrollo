package ve.gob.cendit.cenditlab.systems;

import javafx.scene.Node;
import ve.gob.cendit.cenditlab.control.MeasurementManager;
import ve.gob.cendit.cenditlab.control.MeasurementStep;
import ve.gob.cendit.cenditlab.control.System;
import ve.gob.cendit.cenditlab.control.Task;
import ve.gob.cendit.cenditlab.data.FieldsContainer;
import ve.gob.cendit.cenditlab.ui.ComponentViewFactory;
import ve.gob.cendit.cenditlab.ui.base.ViewType;


public class NoiseFigureAnalyzer8975A extends System
{
    private static final String NAME = "Noise Figure Analyzer 8975A";
    private static final String DESCRIPTION = "Performs noise figure measurements";
    private static final String ICON_URL = "images/nfa8975a.jpg";

    private static final ComponentViewFactory viewFactory = ComponentViewFactory.get();

    private MeasurementManager measurementManager;
    private MeasurementStep[] measurementStepsArray =
        {
            new SystemsSetupStep("NFA8975A System Setup", this),
            new TasksSetupStep("NFA8975A Tasks Setup", this),
            new TasksExecutionStep("NFA8975A Tasks Execution", this)
        };

    private Task[] tasksArray =
        {
                new NoiseFigureMeasureTask(),
                new NoisePowerMeasureTask()
        };

    public NoiseFigureAnalyzer8975A()
    {
        super(NAME, DESCRIPTION, ICON_URL);

        measurementManager = new MeasurementManager("Noise Figure Analyzer 8975A",
                measurementStepsArray);
    }

    @Override
    public Task[] getTasks()
    {
        return tasksArray;
    }

    @Override
    public MeasurementManager getMeasurementManager()
    {
        return measurementManager;
    }

    @Override
    public Node getView(ViewType viewType)
    {
        return viewFactory.getView(this, viewType);
    }

    @Override
    public Node getView(String viewId)
    {
        return null;
    }

    private class NoiseFigureMeasureTask extends Task
    {
        private static final String NAME = "Noise Figure Measurement";
        private static final String DESCRIPTION = "Measures the noise figure of a two port device";
        private static final String ICON_URL = "images/task-icon.jpg";

        public NoiseFigureMeasureTask()
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
            return viewFactory.getView(this, viewType);
        }

        @Override
        public Node getView(String viewId)
        {
            return null;
        }
    }

    private class NoisePowerMeasureTask extends Task
    {
        private static final String NAME = "Noise Power Measurement";
        private static final String DESCRIPTION = "Measures the noise power of a two port device";
        private static final String ICON_URL = "images/task-icon.jpg";


        public NoisePowerMeasureTask()
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
            return viewFactory.getView(this, viewType);
        }

        @Override
        public Node getView(String viewId)
        {
            return null;
        }
    }
}
