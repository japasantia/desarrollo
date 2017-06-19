package ve.gob.cendit.cenditlab.cal;

/**
 * Created by root on 16/06/17.
 */
public class GpibConnection implements IGpibConnection
{
    static IGpibConnection CreateConnection(VisaAddress address)
    {
        return new GpibConnection(address);
    }

    public GpibConnection(String address)
    {
        this(new VisaAddress(address));
    }

    public GpibConnection(VisaAddress address)
    {

    }

    @Override
    public void open()
    {

    }

    @Override
    public void close()
    {

    }

    @Override
    public int write(byte[] buffer, int size)
    {
        return 0;
    }

    @Override
    public int write(String data)
    {
        return 0;
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
