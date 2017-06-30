package ve.gob.cendit.cenditlab.cal;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by jarias on 29/06/17.
 */
public class Vxi11Connection implements IConnection
{
    private static final IVxi11 library;
    private static final int CLINK_SIZE = 2;

    static
    {
        library = Vxi11Loader.getLibrary();
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
        ByteArrayOutputStream byteStream =
                new ByteArrayOutputStream();

        String dataRead = null;
        byte[] buffer = new byte[1024];
        int bytesRead = 0;
        long ret = 0;

        try
        {
            // TODO: revisar este proceso de lectura
            //while (ret != 0)
            // {
                ret = library.vxi11_receive(clink,
                        buffer, buffer.length,
                        IVxi11.VXI11_READ_TIMEOUT);

                if (ret != 0 || ret == IVxi11.VXI11_NULL_READ_RESP)
                {
                    // TODO: lanzar excepcion
                }

                byteStream.write(buffer,
                        byteStream.size(),
                        buffer.length);
            // }

            dataRead = byteStream.toString();
            byteStream.close();
        }
        catch (IOException ex)
        { }

        return dataRead;
    }

    @Override
    public int read(byte[] buffer, int offset, int length)
    {
        long ret;
        byte[] data = new byte[length];

        ret  = library.vxi11_receive(clink, data, (long)length,
                IVxi11.VXI11_READ_TIMEOUT);

        if (ret != 0 || ret != IVxi11.VXI11_NULL_READ_RESP)
        {
            // TODO: lanzar excepcion
        }

        System.arraycopy(data, 0, buffer, offset, length);

        return length;
    }

    @Override
    public int write(String data)
    {
        int ret;
        byte[] buffer = data.getBytes();

        ret = library.vxi11_send(clink, buffer, buffer.length);

        if (ret != 0 || ret == IVxi11.VXI11_NULL_WRITE_RESP)
        {
            // TODO: Lanzar excepcion
        }

        return buffer.length;
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
        int ret = library.vxi11_open_device(ipAddress, clink, device);

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
