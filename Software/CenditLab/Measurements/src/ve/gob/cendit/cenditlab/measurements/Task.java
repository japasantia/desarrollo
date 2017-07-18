package ve.gob.cendit.cenditlab.measurements;

import ve.gob.cendit.cenditlab.io.IConnection;

import java.util.List;

/**
 * Created by jarias on 17/07/17.
 */
public class Task implements ITask
{
    private List<Variable> variablesList;
    private List<Task> subTaskList;

    @Override
    public List<Variable> variables()
    {
        return null;
    }

    @Override
    public List<ITask> subTasks()
    {
        return null;
    }

    @Override
    public void addTaskListener(TaskListener listener)
    {

    }

    @Override
    public void Execute()
    {

    }

    public void Execute(IConnection connection)
    {

    }
}
