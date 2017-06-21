package ve.gob.cendit.cenditlab.cal;


import com.sun.jna.Platform;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.PointerByReference;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by root on 16/06/17.
 */
public class GpibConnection implements IGpibConnection
{
    private VisaAddress visaAddress;
    private ILinuxGpib linuxGpib;
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
            ILinuxGpib linuxGpib =  LinuxGpibLoader.getLibrary();
            return new GpibConnection(va);
        }
        else
        {
            throw new Exception("Not supported operating system");
        }
    }

    private GpibConnection(String address)
    {

    }

    private GpibConnection(VisaAddress address)
    {
        linuxGpib = LinuxGpibLoader.getLibrary();
        visaAddress = address;
    }

    @Override
    public void open()
            throws Exception
    {
        int board = visaAddress.getBoard();
        int primaryAddress = visaAddress.getPrimaryAddress();
        int secondaryAddress = 0;

        if (visaAddress.hasField(VisaAddressFields.SECONDARY_ADDRESS))
        {
            secondaryAddress = visaAddress.getSecondaryAddress();
        }

        deviceDescriptor = linuxGpib.ibdev(board, primaryAddress, secondaryAddress,
                ILinuxGpib.T3s, 1, 0);

        if (deviceDescriptor < 0)
        {
            throw new Exception("Unable to open connection");
        }
    }

    @Override
    public void close()
    {
        int status = linuxGpib.ibonl(deviceDescriptor, 0);
    }

    @Override
    public int write(byte[] buffer)
    {
        return linuxGpib.ibwrt(deviceDescriptor,
                buffer, buffer.length);
    }

    @Override
    public int write(String buffer)
    {
        return linuxGpib.ibwrt(deviceDescriptor, buffer, buffer.length());
    }

    @Override
    public int read(byte[] buffer)
    {
        return linuxGpib.ibrd(deviceDescriptor, buffer, buffer.length);
    }

    @Override
    public String read()
    {
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();

        byte[] buffer = new byte[1024];
        int bytesRead = 0;
        int status;

        do
        {
            status = read(buffer);
            bytesRead = linuxGpib.ThreadIbcnt();
            byteStream.write(buffer,
                    byteStream.size(),
                    bytesRead);
        }
        while(bytesRead >= 1024);

        String dataRead = byteStream.toString();
        try
        {
            byteStream.close();
        }
        catch (IOException ex)
        { }

        return dataRead;
    }
}
