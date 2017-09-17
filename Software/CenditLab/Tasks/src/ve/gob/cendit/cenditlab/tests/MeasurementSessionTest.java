package ve.gob.cendit.cenditlab.tests;

import ve.gob.cendit.cenditlab.tasks.MeasurementSession;
import ve.gob.cendit.cenditlab.tasks.MeasurementStep;


public class MeasurementSessionTest
{
    public static void main(String[] args)
    {
        DummyMeasurementStep step1 = new DummyMeasurementStep("Dummy step 1");
        DummyMeasurementStep step2 = new DummyMeasurementStep("Dummy step 2");
        DummyMeasurementStep step3 = new DummyMeasurementStep("Dummy step 3");
        DummyMeasurementStep step4 = new DummyMeasurementStep("Dummy step 4");

        MeasurementSession session = new MeasurementSession("Session Test",
                step1, step2, step3, step4);

        boolean ret = session.hasNextStep();
        ret = session.hasPrevStep();

        int count = session.getStepsCount();
        MeasurementStep step = session.getCurrentStep();

        ret = session.canGoNextStep();
        ret = session.canGoPrevStep();

        step1.enableEnter(true);
        step1.enableExit(true);

        ret = session.nextStep();
        step = session.getCurrentStep();
        ret = session.hasNextStep();
        ret = session.hasPrevStep();

        ret = session.canGoNextStep();
        ret = session.canGoPrevStep();

        step4.enableEnter(true);
        ret = session.toStep(3);
        step = session.getCurrentStep();
        ret = session.hasNextStep();
        ret = session.canGoNextStep();

        ret = session.nextStep();

        session.toStep(0);
        ret = session.prevStep();
    }
}

class DummyMeasurementStep extends MeasurementStep
{
    private boolean canEnterStep = false;
    private boolean canExitStep = false;

    public DummyMeasurementStep(String name)
    {
        super(name);
    }

    public void enableExit(boolean value)
    {
        canExitStep = value;
    }

    public void enableEnter(boolean value)
    {
        canEnterStep = value;
    }

    @Override
    public boolean canExit()
    {
        return canExitStep;
    }

    @Override
    public boolean canEnter()
    {
        return canEnterStep;
    }

    @Override
    public void initialize()
    {
        printMessage("In initialize");
    }

    @Override
    public void load()
    {
        printMessage("Loading");
    }

    @Override
    public void run()
    {
        printMessage("Running");
    }

    @Override
    public void unload()
    {
        printMessage("In unload");
    }

    private void printMessage(String message)
    {
        System.out.println(String.format("%s: %s", getName(), message));
    }
}
