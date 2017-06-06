package ve.com.josearias.jnatest;

/**
 * Created by jsars on 05/06/17.
 */
public class JnaTest
{
    public static void main(String[] args)
    {
        JnaInterface lib = JnaInterface.INSTANCE;

        lib.printf("Hello JNA!");
        String testName = null;

        for (int i = 0; i <args.length; ++i)
        {
            lib.printf("\nArgument %d : %s", i, args[i]);
        }

        lib.printf("Enter your name:\n");
        lib.scanf("%s", testName);
        lib.printf("Your name is %s", testName);
    }
}
