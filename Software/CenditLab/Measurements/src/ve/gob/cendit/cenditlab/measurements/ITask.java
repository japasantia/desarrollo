package ve.gob.cendit.cenditlab.measurements;

import java.util.List;

/**
 * Created by jarias on 17/07/17.
 */
public interface ITask
{
    List<Variable> variables();
    List<ITask> subTasks();
    void addTaskListener(TaskListener listener);
    void Execute();
}
