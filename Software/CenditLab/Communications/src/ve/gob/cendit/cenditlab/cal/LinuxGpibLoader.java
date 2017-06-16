package ve.gob.cendit.cenditlab.cal;

import com.sun.jna.Native;

/**
 * Created by jarias on 15/06/17.
 */
public class LinuxGpibLoader
{
    private static ILinuxGpib library;

    static
    {
        try
        {
            library = Native.loadLibrary("gpib", ILinuxGpib.class);
        }
        catch (Exception ex)
        {
            System.err.println(ex.getMessage());
            System.exit(0);
        }
    }

    public static ILinuxGpib getLibrary()
    {
        return library;
    }
}
