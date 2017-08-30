package ve.gob.cendit.cenditlab.tests;


import ve.gob.cendit.cenditlab.tasks.Data;
import ve.gob.cendit.cenditlab.tasks.MathTasks2;
import ve.gob.cendit.cenditlab.tasks.Task;

public class MathTasks2Test
{
    public static void main(String[] args)
    {
        Task addTask = MathTasks2.get(MathTasks2.ADD_TASK);
        Task productTask = MathTasks2.get(MathTasks2.PRODUCT_TASK);

        Data inputA = new Data("A", 10.0);
        Data inputB = new Data("B", 12.55f);
        Data out = new Data("Out", 0);

        print("AddTask slots", addTask.getDataContainer().getDataSlots());
        print("AddTask default data", addTask.getDataContainer());

        addTask.getDataContainer().setData(0, inputA);
        addTask.getDataContainer().setData(1, inputB);
        addTask.execute();

        print("AddTask data after execute 1", addTask.getDataContainer());

        addTask.getDataContainer().getData(0).set(45.67f);
        addTask.getDataContainer().getData(1).set(69.13f);
        print("AddTask data modified", addTask.getDataContainer());
        addTask.execute();
        print("AddTask data after execute 2", addTask.getDataContainer());
    }

    public static void print(String caption, Object object)
    {
        System.out.println(caption);
        System.out.println(object);
    }
}
