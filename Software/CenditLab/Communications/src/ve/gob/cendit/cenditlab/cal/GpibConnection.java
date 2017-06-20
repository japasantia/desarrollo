package ve.gob.cendit.cenditlab.cal;


import com.sun.jna.Platform;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.PointerByReference;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by root on 16/06/17.
 */
public class GpibConnection implements IGpibConnection
{
    private VisaAddress visaAddress;
    private ILinuxGpib linuxGpib;
    private int deviceDescriptor;

    static IGpibConnection CreateConnection(String address)
            throws Exception
    {
        // TODO: revisar generacion exceptciones. Crear excepcion GpibConnectionException
        VisaAddress va = VisaAddress.ParseAddress(address);

        if (Platform.isWindows())
        {
            throw new NotImplementedException();
        }
        else if (Platform.isLinux())
        {
            ILinuxGpib linuxGpib =  LinuxGpibLoader.getLibrary();
            return new GpibConnection(va, linuxGpib);
        }
        else
        {
            throw new Exception("Not supported operating system");
        }
    }

    private GpibConnection(String address)
    {

    }

    private GpibConnection(VisaAddress address, ILinuxGpib library)
    {
        visaAddress = address;
        linuxGpib = library;
    }

    @Override
    public void open()
    {
        int board = Integer.parseInt(visaAddress.getBoard());
        int primaryAddress = Integer.parseInt(visaAddress.getPrimaryAddress());
        int secondaryAddress = Integer.parseInt(visaAddress.getSecondaryAddress());
        deviceDescriptor = linuxGpib.ibdev(board, primaryAddress, secondaryAddress,
                ILinuxGpib.T3s, 1, 0);
    }

    @Override
    public void close()
    {

    }

    @Override
    public int write(byte[] buffer, int size)
    {
        PointerByReference p = new PointerByReference();

        Pointer pointer = Pointer.createConstant(100);
        pointer.write(0, buffer,0, buffer.length);

        return linuxGpib.ibwrt(deviceDescriptor, pointer, buffer.length);
    }

    @Override
    public int write(String data)
    {

    }

    @Override
    public int read(byte[] buffer, int size)
    {
        return 0;
    }

    @Override
    public String read()
    {
        return null;
    }
}
