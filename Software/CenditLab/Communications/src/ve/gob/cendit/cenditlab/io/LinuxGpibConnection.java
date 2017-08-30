package ve.gob.cendit.cenditlab.io;


import com.sun.jna.Platform;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by root on 16/06/17.
 */
public class LinuxGpibConnection implements IGpibConnection
{
    private static ILinuxGpib library = LinuxGpibLibrary.getLibrary();

    private VisaAddress visaAddress;
    private int deviceDescriptor;

    public static IGpibConnection CreateConnection(String address)
            throws Exception
    {
        // TODO: revisar generacion exceptciones. Crear excepcion GpibConnectionException
        VisaAddress va = VisaAddress.parseAddress(address);

        if (Platform.isWindows())
        {
            throw new NotImplementedException();
        }
        else if (Platform.isLinux())
        {
            ILinuxGpib library =  LinuxGpibLibrary.getLibrary();
            return new LinuxGpibConnection(va);
        }
        else
        {
            throw new Exception("Not supported operating system");
        }
    }

    private LinuxGpibConnection(String address)
    {

    }

    private LinuxGpibConnection(VisaAddress address)
    {
        visaAddress = address;
    }

    @Override
    public void open()
    {
        int board = visaAddress.getBoard();
        int primaryAddress = visaAddress.getPrimaryAddress();
        int secondaryAddress = 0;

        if (visaAddress.hasField(VisaAddressFields.SECONDARY_ADDRESS))
        {
            secondaryAddress = visaAddress.getSecondaryAddress();
        }

        deviceDescriptor = library.ibdev(board, primaryAddress, secondaryAddress,
                ILinuxGpib.T3s, 1, 0);

        if (deviceDescriptor < 0)
        {
            // throw new Exception("Unable to open connection");
        }
    }

    @Override
    public void close()
    {
        int status = library.ibonl(deviceDescriptor, 0);
    }

    @Override
    public int write(byte[] buffer, int offset, int length)
    {
        byte[] data = Arrays.copyOfRange(buffer, offset, offset + length - 1);

        int ibsta = library.ibwrt(deviceDescriptor, data, length);

        return library.ThreadIbcnt();
    }

    @Override
    public int write(byte[] buffer)
    {
        int  ibsta = library.ibwrt(deviceDescriptor,
                buffer, buffer.length);

        return library.ThreadIbcnt();
    }

    @Override
    public int write(String buffer)
    {
        int ibsta = library.ibwrt(deviceDescriptor, buffer, buffer.length());

        return library.ThreadIbcnt();
    }

    @Override
    public int read(byte[] buffer, int offset, int length)
    {
        if  (length == 0)
        {
            return 0;
        }

        byte[] data = new byte[length];
        int ibsta = library.ibrd(deviceDescriptor, data, length);

        // Revisar status retornado en busca de error
        if ((ibsta & 0x8000) != 0)
        {
            // Existe un error en la operacion de lectura
            // TODO: lanzar excepcion
        }

        System.arraycopy(data, 0, buffer, offset, length);

        return library.ThreadIbcnt();
    }

    @Override
    public int read(byte[] buffer)
    {
        int ibsta = library.ibrd(deviceDescriptor, buffer, buffer.length);

        // Revisar status retornado en busca de error
        if ((ibsta & 0x8000) != 0)
        {
            // Existe un error en la operacion de lectura
            // TODO: lanzar excepcion
        }

        return library.ThreadIbcnt();
    }

    @Override
    public String read()
    {
        ByteArrayOutputStream byteStream =
                new ByteArrayOutputStream();

        byte[] buffer = new byte[1024];
        int bytesRead = 0;

        String dataRead = null;

        try
        {
            do
            {
                bytesRead = read(buffer);
                byteStream.write(buffer,
                        byteStream.size(),
                        bytesRead);
            }
            while(bytesRead >= 1024);

            dataRead = byteStream.toString();

            byteStream.close();
        }
        catch (IOException ex)
        { }

        return dataRead;
    }
}
