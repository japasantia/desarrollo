package ve.gob.cendit.cenditlab.io;

/**
 * Created by jsars on 15/06/17.
 */
public interface IGpibConnection
{
    void open() throws Exception;
    void close();

    int write(byte[] buffer);
    int write(String data);

    int read(byte[] buffer);
    String read();
}
