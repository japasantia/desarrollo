package ve.gob.cendit.cenditlab.cal;

/**
 * Created by jsars on 15/06/17.
 */
public interface IGpibConnection
{
    int write(byte[] buffer);
    int write(String data);

    int read(byte[] buffer);
    String readString();
}
