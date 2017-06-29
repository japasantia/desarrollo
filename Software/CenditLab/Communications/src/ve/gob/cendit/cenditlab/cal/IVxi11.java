package ve.gob.cendit.cenditlab.cal;

import com.sun.jna.Library;
import com.sun.jna.Pointer;

/**
 * Created by jarias on 6/23/17.
 */
/**
 * int	vxi11_open_device(char *ip, CLINK *clink)
 * int	vxi11_close_device(char *ip, CLINK *clink)
 * int	vxi11_send(CLINK *clink, char *cmd, unsigned long len)
 *    --- or --- (if sending just text)
 * int	vxi11_send(CLINK *clink, char *cmd)
 * long	vxi11_receive(CLINK *clink, char *buffer, unsigned long len, unsigned long timeout)
 *
 * There are then useful (to me, anyway) more specific functions built on top
 * of these:
 *
 * int	vxi11_send_data_block(CLINK *clink, char *cmd, char *buffer, unsigned long len)
 * long	vxi11_receive_data_block(CLINK *clink, char *buffer, unsigned long len, unsigned long timeout)
 * long	vxi11_send_and_receive(CLINK *clink, char *cmd, char *buf, unsigned long buf_len, unsigned long timeout)
 * long	vxi11_obtain_long_value(CLINK *clink, char *cmd, unsigned long timeout)
 * double vxi11_obtain_double_value(CLINK *clink, char *cmd, unsigned long timeout)
 */
public interface IVxi11 extends Library
{
    // int vxi11_open_device(byte[] ip, long[] clink);
    // int vxi11_close_device(byte[] ip, long[] clink);
    /*
    int	vxi11_open_device(String ip, long[] clink, String device);
    int vxi11_close_device(String ip, long[] clink);
    int	vxi11_send(long[] clink, String cmd, long len);
    long vxi11_receive(long[] clink, byte[] buffer, long len, long timeout);
    */
    int	vxi11_open_device(String ip, Pointer clink, String device);
    int vxi11_close_device(String ip, Pointer clink);
    int	vxi11_send(Pointer clink, String cmd, long len);
    long vxi11_receive(Pointer clink, byte[] buffer, long len, long timeout);

    int vxi11_send_data_block(Pointer clink, String cmd,
              byte[] buffer, long len);
    long vxi11_receive_data_block(Pointer clink, byte[] buffer,
              long len , long timeout);
    long vxi11_send_and_receive(Pointer clink, String cmd,
                byte[] buffer, long buf_len, long timeout);
    long vxi11_obtain_long_value(Pointer clink, String cmd,
                 long timeout);
    double vxi11_obtain_double_value(Pointer clink, String cmd);
}
