package ve.gob.cendit.cenditlab.cal.tests;

import ve.gob.cendit.cenditlab.cal.IVxi11;
import ve.gob.cendit.cenditlab.cal.Vxi11Loader;

/**
 * Created by jarias on 6/23/17.
 */
public class Vxi11Test
{
    public static void main(String[] args)
    {
        IVxi11 library = Vxi11Loader.getLibrary();

        long[] clink = new long[2];

        library.vxi11_open_device("192.168.45.10".getBytes(), clink);
    }
}
