package ve.gob.cendit.cenditlab.cal;

import com.sun.jna.Native;

/**
 * Created by jarias on 6/23/17.
 */
public class Vxi11Loader
{
    private static IVxi11 library;

    public static IVxi11 getLibrary()
    {
        if (library != null)
        {
            // Si la libreria ya ha sido cargada
            return library;
        }

        // Se carga la libreria por primera vez
        try
        {
            library = Native.loadLibrary("/home/jarias/Escritorio/Pasantia/Aplicaciones/Linux/vxi11_1.10/vxi11.so",
                    IVxi11.class);
        }
        catch (Exception ex)
        {
            System.err.println(ex.getMessage());
            System.exit(0);
        }

        return library;
    }
}
