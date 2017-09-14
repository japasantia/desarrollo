package ve.gob.cendit.cenditlab.tasks;

import javax.swing.text.html.HTMLDocument;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jarias on 13/09/17.
 */
public class MeasurementSession
{
    private String name;
    private int stepCounter = -1;
    private MeasurementStep currentStep;

    private List<MeasurementStep> stepsList;

    public void MeasurementSession(String name)
    {
       this.MeasurementSession(name, null);
    }

    public void MeasurementSession(String name, MeasurementStep... stepsArgs)
    {
        this.name = name;

        addSteps(stepsArgs);
    }

    public void addStep(MeasurementStep step)
    {
        if (step != null)
        {
            stepsList.add(step);
        }
    }

    public void addSteps(MeasurementStep... stepsArgs)
    {
        if (stepsArgs != null)
        {
            Arrays.stream(stepsArgs)
                .forEach(step -> {
                    step.setOwnerSession(this);
                    stepsList.add(step);
                });
        }
    }

    public void removeStep(MeasurementStep step)
    {
        if (step != null && step.getOwnerSession() == this)
        {
            stepsList.remove(step);
        }
    }

    public void clearSteps()
    {
        stepsList.clear();
    }

    public int getStepsCount()
    {
        return stepsList.size();
    }

    public int getStepCounter()
    {
        return stepCounter;
    }

    public MeasurementStep getCurrentStep()
    {
        return currentStep;
    }

    public void start()
    {
        stepsList.stream()
            .forEach(step -> {

                step.load();

                stepCounter = 0;
                currentStep = step;

                step.run();

                step.unload();
                /*
                if (step.hasErrors())
                if (step.conAdvance())
                */
            });
    }
}
