package ve.gob.cendit.cenditlab.cal;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

/**
 * Created by jarias on 29/06/17.
 */
public class Vxi11Connection implements IConnection
{
    private static final IVxi11 libVxi11;
    private static final int CLINK_SIZE = 2;

    static
    {
        libVxi11 = Vxi11Loader.getLibrary();
    }

    private VisaAddress visaAddress;
    private Pointer clink;

    public Vxi11Connection(VisaAddress address)
    {
        visaAddress = address;
        long memory = Native.malloc(CLINK_SIZE);
        clink = new Pointer(memory);
    }

    @Override
    public String read()
    {
        return null;
    }

    @Override
    public int read(byte[] buffer, int offset, int length)
    {

    }

    @Override
    public int write(String data)
    {
        return 0;
    }

    @Override
    public int write(byte[] buffer, int offset, int length)
    {
        return 0;
    }

    @Override
    public void open()
    {
        String ipAddress = visaAddress.getHostAddress();
        String device = visaAddress.getDevice();
        int ret = libVxi11.vxi11_open_device(ipAddress, clink, device);

        /* TODO: revisar valor de retorno se deberia lanzar excepcion acorde */

        if (ret != 0)
        {

        }
    }

    @Override
    public void close()
    {

    }
}
