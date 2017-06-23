package ve.gob.cendit.cenditlab.cal;

import com.sun.jna.Library;

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
    int vxi11_open_device(byte[] ip, long[] clink);
    int vxi11_close_device(byte[] ip, long[] clink);
}
