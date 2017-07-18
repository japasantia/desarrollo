package ve.gob.cendit.cenditlab.measurements;

import ve.gob.cendit.cenditlab.io.IConnection;

import java.util.*;

/**
 * Created by jarias on 17/07/17.
 */
public class MeasurementParmetersTask implements ITask
{
    private static String[] RAW_COMMANDS =
    {
        "RST\n",
        "CLS",
        ":SENSE:FREQUENCY:STOP $frequency-stop$\n",
        ":SENSE:FREQUENCY:POINTS $frequency-points$",
        ":SENSE:AVERAGE:STATE $average-state$",
        ":SENSE:AVERAGE:COUNT $average-count$",
        ":SENSE:BANDWIDTH: $bandwidth$",
        ":INITIATE:CONTINUOUS:ALL $continuous$"
    };

    private IConnection connection;
    private Map<String, Variable> variablesMap;
    private List<ScpiCommand> commands;

    public MeasurementParmetersTask(IConnection connection,
                Map<String, Variable> variablesMap)
    {
        this.connection = connection;
        this.variablesMap = variablesMap;
    }

    private void loadCommands()
    {
        commands = new ArrayList<ScpiCommand>(RAW_COMMANDS.length);

        Arrays.stream(RAW_COMMANDS)
            .forEach( c -> commands.add(new ScpiCommand(c, variablesMap)) );
    }

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
        try
        {
            for (ScpiCommand command : commands)
            {
                connection.write(command.getCommand());
            }
        }
        catch (Exception ex)
        {

        }
    }
}
