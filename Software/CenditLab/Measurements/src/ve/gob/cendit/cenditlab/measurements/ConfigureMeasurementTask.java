package ve.gob.cendit.cenditlab.measurements;

import ve.gob.cendit.cenditlab.io.IConnection;

import java.util.*;

/**
 * Created by jarias on 17/07/17.
 */
public class ConfigureMeasurementTask implements ITask
{
    private static String[] RAW_COMMANDS =
    {
        "*RST",
        "*CLS",
        ":SENSE:FREQUENCY:STOP $frequency-stop$",
        ":SENSE:FREQUENCY:POINTS $frequency-points$",
        ":SENSE:AVERAGE:STATE $average-state$",
        ":SENSE:AVERAGE:COUNT $average-count$",
        ":SENSE:BANDWIDTH $bandwidth$",
        ":INITIATE:CONTINUOUS:ALL $continuous$"
    };

    private IConnection connection;
    private List<ITaskListener> taskListeners;

    private VariablesBundle variablesBundle;
    private List<ScpiCommand2> commands;

    public ConfigureMeasurementTask(IConnection connection,
                                    VariablesBundle variablesBundle)
    {
        this.connection = connection;
        this.variablesBundle = variablesBundle;

        loadCommands();
    }

    private void loadCommands()
    {
        commands = new ArrayList<ScpiCommand2>(RAW_COMMANDS.length);

        Arrays.stream(RAW_COMMANDS)
            .forEach( c -> commands.add(new ScpiCommand2(c, variablesBundle)) );
    }

    @Override
    public VariablesBundle variables()
    {
        return variablesBundle;
    }

    @Override
    public List<ITask> subTasks()
    {
        return null;
    }

    @Override
    public void addTaskListener(ITaskListener listener)
    {
        if (listener == null)
        {
            // TODO: revisar excepcion argumento null
            throw new IllegalArgumentException("listener must not be null");
        }

        if (taskListeners == null)
        {
            taskListeners = new LinkedList<ITaskListener>();
        }

        taskListeners.add(listener);
    }

    @Override
    public void execute()
    {
        try
        {
            if (taskListeners != null)
            {
                taskListeners.stream()
                        .forEach(tl -> tl.onEntry(this));
            }

            for (ScpiCommand2 command : commands)
            {
                if (command.isWellFormed())
                {
                    String stringCommand = command.getCommand();
                    connection.write(stringCommand);
                }
                else
                {
                    // TODO: verificar reporte de error ejecución
                    taskListeners.stream()
                        .forEach(tl -> tl.onError(this));
                    // TODO: establecer el tipo de excepcion
                    throw new TaskExecutionException("bad formed scpi command");
                }
            }
        }
        catch (Exception ex)
        {

        }
    }
}
