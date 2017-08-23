package ve.gob.cendit.cenditlab.tasks;


public class MathTasks2
{
    public static final String ADD_TASK = "Add Task";
    public static final String PRODUCT_TASK = "Product Task";

    public static Task get(String name)
    {
        switch (name)
        {
            case MathTasks.ADD_TASK:
                return new MathTasks2.AddTask();

            case MathTasks.PRODUCT_TASK:
                return new MathTasks2.ProductTask();

            default:
                throw new IllegalArgumentException("Invalid task name");
        }
    }

    public static class AddTask extends Task
    {
        private Data inputA = new  Data("InputA", 0.0f);
        private Data inputB = new Data("InputB", 0.0f);
        private Data output = new Data("Output", 0.0f);

        private DataSlot slotA = new DataSlot("InputA", inputA, DataDirection.INPUT);
        private DataSlot slotB = new DataSlot("InputB", inputB, DataDirection.INPUT);
        private DataSlot slotOut = new DataSlot("Output", output, DataDirection.OUTPUT);

        private final DataContainer dataContainer =
                new DataContainer(slotA, slotB, slotOut);

        public AddTask()
        {
            setName(MathTasks2.ADD_TASK);
            setDataContainer(dataContainer);
        }

        @Override
        public void execute()
        {
            Number a = (Number)dataContainer.getData(0).get();
            Number b = (Number)dataContainer.getData(1).get();
            dataContainer.getData(2).set(a.floatValue() + b.floatValue());
        }
    }

    public static class ProductTask extends Task
    {
        public ProductTask()
        {
            super(MathTasks2.PRODUCT_TASK,
                new DataSlot("InputA", new Data("InputA", 0.0)),
                new DataSlot("InputB", new Data("InputA", 0.0)),
                new DataSlot("Output", new Data("Output", 0.0), DataDirection.OUTPUT)
            );
        }

        @Override
        public void execute()
        {
            Number a = (Number)getDataContainer().getData(0).get();
            Number b = (Number)getDataContainer().getData(1).get();
            getDataContainer().getData(2).set(a.floatValue() * b.floatValue());
        }
    }
}
