import ve.gob.cendit.cenditlab.measurements.ScpiCommand;
import ve.gob.cendit.cenditlab.measurements.Variable;

import java.util.Collection;

/**
 * Created by jarias on 14/07/17.
 */
public class ScpiCommandTest
{
    public static void main(String[] args)
    {
        Variable v1 = new Variable("Data", 12);
        Variable v2 = new Variable("Value", 3.13);

        ScpiCommand command1 =
                new ScpiCommand("MEAS:INPUT $data$, $value$",
                        v1, v2);
        String preparedCommand = command1.getCommand();

        ScpiCommand command2 =
                new ScpiCommand("INPUT:DC $range$, $mode$",
                        10.0, "ON");
        preparedCommand = command2.getCommand();

        ScpiCommand command3 =
                new ScpiCommand("MEAS:INPUT 10, 20");
        preparedCommand = command3.getCommand();

        v1.setValue("OFF");
        v2.setValue(14.16);

        preparedCommand = command1.getCommand();

        Collection<Variable> variables = command1.getVariables();
        variables.stream().forEach(v -> System.out.printf("cmd1 var: %s\n", v));

        variables = command2.getVariables();
        variables.stream().forEach(v -> System.out.printf("cmd2 var: %s\n", v));

        variables = command3.getVariables();
    }
}
