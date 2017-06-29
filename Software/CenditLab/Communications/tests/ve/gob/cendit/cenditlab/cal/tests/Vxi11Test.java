package ve.gob.cendit.cenditlab.cal.tests;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import ve.gob.cendit.cenditlab.cal.IVxi11;
import ve.gob.cendit.cenditlab.cal.Vxi11Loader;

import java.util.Arrays;

/**
 * Created by jarias on 6/23/17.
 */
public class Vxi11Test
{
    public static void main(String[] args)
    {
        IVxi11 library = Vxi11Loader.getLibrary();
        /*
        long[] clink = new long[8];
        byte[] buffer = new byte[256];

        long ret = library.vxi11_open_device("192.168.1.10", clink, "gpib0,10");
        ret = library.vxi11_send(clink, "*IDN?\n", 5);
        ret = library.vxi11_receive(clink, buffer, 256, 1000);
        */

        byte[] buffer = new byte[256];

        long memory = Native.malloc(2);
        Pointer clink = new Pointer(memory);

        long ret = library.vxi11_open_device("192.168.1.10", clink, "gpib0,10");
        ret = library.vxi11_send(clink, "*IDN?\n", 5);
        ret = library.vxi11_receive(clink, buffer, 256, 1000);
        System.out.printf("Response: %s", new String(buffer));

        Arrays.fill(buffer, (byte)0);
        ret = library.vxi11_send_and_receive(clink, "*IDN?\n", buffer, 256, 1000);
        System.out.printf("Response: %s", new String(buffer));

        ret = library.vxi11_close_device("192.168.1.10", clink);
    }
}
