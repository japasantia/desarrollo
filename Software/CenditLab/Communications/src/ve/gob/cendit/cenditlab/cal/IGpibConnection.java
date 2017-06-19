package ve.gob.cendit.cenditlab.cal;

/**
 * Created by jsars on 15/06/17.
 */
public interface IGpibConnection
{
    void open();
    void close();

    int write(byte[] buffer, int size);
    int write(String data);

    int read(byte[] buffer, int size);
    String read();
}
