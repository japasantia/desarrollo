package ve.gob.cendit.cenditlab.measurements;

import com.sun.javaws.exceptions.InvalidArgumentException;
import ve.gob.cendit.cenditlab.measurements.Variable;
import ve.gob.cendit.cenditlab.measurements.VariableChangeListener;

import java.nio.file.InvalidPathException;
import java.security.InvalidParameterException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScpiCommand
{
    /*
    Pruebas de expresiones regulares
        https://regex101.com/
        http://myregexp.com/
        https://www.debuggex.com/
        http://myregexp.com/g
    */
    // TODO: corregir regexp para extraer parametros y validar comando
    private static final String SCPI_COMAND_WITH_ARGUMENTS_REGEX =
            "^([^$]*\\$([^$]+)\\$[^$]*)+$";
    private static final String SCPI_COMMAND_REGEX =
            "([^$]*(\\$(?<argument>[^$]+)\\$)+[^$]*)";
            // "([^$]*(\\$(?<argument>[^$]*)\\$)*[^$]*)";

    private String rawCommand;
    private String preparedCommand;
    private boolean needUpdate;

    private VariableChangeListener variableChangeListener;

    private Map<String, Variable> arguments;

    public ScpiCommand(String command, Variable... variables)
    {
        if (command == null || variables == null)
        {
            // TODO: excepcion ante arguentos null
            throw new IllegalArgumentException("Arguments must not be null");
        }


        if (!hasArguments(command))
        {
            // TODO: excepcion el coando no tiene marcadores de posicion argumentos
            // mal formato de comando
            throw new InvalidParameterException("command has no arguments placeholders");
        }


        arguments = new HashMap<>();
        needUpdate = false;

        rawCommand = command;
        mapArgumentsWithVariables(command, variables);
        addChangeListenerToVariables();
        preparedCommand = replaceVariables(rawCommand);
    }

    public ScpiCommand(String command, Object... values)
    {
        if (command == null || values == null)
        {
            // TODO: excepcion ante arguentos null
            throw new IllegalArgumentException("Arguments must not be null");
        }

        if (!hasArguments(command))
        {
            // TODO: excepcion el coando no tiene marcadores de posicion argumentos
            // mal formato de comando
            throw new InvalidParameterException("command has no arguments placeholders");
        }

        arguments = new HashMap<>();
        needUpdate = false;

        rawCommand = command;
        extractVariables(command, values);
        preparedCommand = replaceVariables(rawCommand);
    }

    public ScpiCommand(String string, Map<String, Variable> argumentsMap)
    {

    }

    public ScpiCommand(String command)
    {
        if (command == null)
        {
            throw new IllegalArgumentException("Arguments must not be null");
        }

        if (hasArguments(command))
        {
            throw new InvalidParameterException("command passed without arguments values list");
        }

        needUpdate = false;
        rawCommand = command;
        preparedCommand = command;
    }

    private static boolean hasArguments(String command)
    {
        return command.matches(SCPI_COMAND_WITH_ARGUMENTS_REGEX);
    }

    private void mapArgumentsWithVariables(String command, Variable... variables)
    {
        int index = 0;

        Pattern pattern = Pattern.compile(SCPI_COMMAND_REGEX);
        Matcher matcher = pattern.matcher(command);

        while (matcher.find() == true)
        {
            try
            {
                String argName = matcher.group("argument");
                if (argName != null)
                {
                    arguments.put(argName, variables[index]);
                    index++;
                }
            }
            catch (Exception ex)
            { }
        }

        rawCommand = command;
    }

    private void extractVariables(String command, Object... values)
    {
        int index = 0;

        Pattern pattern = Pattern.compile(SCPI_COMMAND_REGEX);
        Matcher matcher = pattern.matcher(command);

        while (matcher.find())
        {
            try
            {
                String argName = matcher.group("argument");
                if (argName != null)
                {
                    arguments.put(argName,
                            new Variable( argName, values[index] ));
                    index++;
                }
            }
            catch (Exception ex)
            { }
        }

        rawCommand = command;
    }

    private void loadVariablesFromMap(String command, Map<String, Variable> argumentsMap)
    {
        Pattern pattern = Pattern.compile(SCPI_COMMAND_REGEX);
        Matcher matcher = pattern.matcher(command);

        while (matcher.find())
        {
            try
            {
                String argName = matcher.group("argument");
                if (argName == null)
                {
                    continue;
                }

                if (argumentsMap.containsKey(argName))
                {
                    arguments.put(argName,
                            argumentsMap.get(argName));
                }
                else
                {
                    // TODO: generar excepcion, no existe variable argumento
                }
            }
            catch (Exception ex)
            {}
        }
    }

    private void addChangeListenerToVariables()
    {

        variableChangeListener = new VariableChangeListener()
        {
            @Override
            public void changed(Variable variable, Object oldValue, Object newValue)
            {
                needUpdate = true;
            }
        };

        arguments.values()
                .stream()
                .forEach(variable -> {
                    variable.addChangeListener(variableChangeListener);
                });
    }

    private String replaceVariables(String inCommand)
    {
        String outCommand = inCommand;

        for (Map.Entry<String, Variable> entry : arguments.entrySet())
        {
            String argPattern = String.format("$%s$", entry.getKey());
            Variable argVariable = entry.getValue();
            String argValue = argVariable.getValue().toString();

            outCommand = outCommand.replace(argPattern, argValue);
        }

        return outCommand;
    }

    private void updateCommand()
    {
        if (needUpdate)
        {
            preparedCommand = replaceVariables(rawCommand);
            needUpdate = false;
        }
    }

    public String getCommand()
    {
        updateCommand();
        return preparedCommand;
    }

    public Collection<Variable> getVariables()
    {
        if (arguments != null)
        {
            return arguments.values();
        }

        return null;
    }

    public Set<String> getArguments()
    {
        if (arguments != null)
        {
            return arguments.keySet();
        }

        return null;
    }
}
