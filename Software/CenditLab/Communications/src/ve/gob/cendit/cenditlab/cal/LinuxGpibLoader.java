package ve.gob.cendit.cenditlab.cal;

import com.sun.jna.Native;

/**
 * Created by jarias on 15/06/17.
 */
public class LinuxGpibLoader
{
    private static ILinuxGpib library;

    public static ILinuxGpib getLibrary()
    {
        if (library != null)
        {
            // Si la libreria ya ha sido cargada
            return library;
        }

        // Se carga la libreria por primera vez
        try
        {
            library = Native.loadLibrary("gpib", ILinuxGpib.class);
        }
        catch (Exception ex)
        {
            System.err.println(ex.getMessage());
            System.exit(0);
        }

        return library;
    }
}
