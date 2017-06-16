package ve.gob.cendit.cenditlab.cal;


import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

/**
 * Created by jarias on 06/06/17.
 */
public interface ILinuxGpib extends Library
{

    int ibask(int ud, int option, Pointer value);

    int ibdev(int board_index, int pad, int sad, int timeout,
              int send_eoi, int eos);

    int ibconfig(int ui, int option, int setting);

    int ibeos(int ud, int eosmode);
    int ibot(int ud, int send_eoi);
    int ibevent(int ud, /* short */ Pointer event);
    int ibfind(/* const char* name */ Pointer name);

    int iblines(int ud, /* short* */Pointer line_status);
    int ibln(int ud, int pad, int sad, /* short* */Pointer found_listener);
    int ibloc(int ud);
    int ibpct(int ud);

    int ibonl(int ud, int online);

    // ibpad
    // ibpct
    // ibppc

    int ibrd(int ud, /* void* */ Pointer buffer, long num_bytes);
    int ibrda(int ud, /* void* */ Pointer buffer, long num_bytes);
    int ibrdf(int ud, /* const char* */ Pointer file_path);
    int ibwrt(int ud, /* void* */ Pointer buffer, long num_bytes);
    int ibwrta(int ud, /* void* */ Pointer buffer, long num_bytes);
    int ibwrtf(int ud, /* const char* */ Pointer file_path);

    int ibrsc(int ud, int request_control);
    int ibsic(int ud);
    int ibclr(int ud);

    int ibsre(int ud, int enable);
    int ibstop(int ud);
    int ibwait(int ud, int status_mask);

    /** Constantes para timeout */

     int TNONE = 0;
     int T10us = 1;
     int T30us = 2;
     int T100us = 3;
     int T300us = 4;
     int T1ms = 5;
     int T3ms = 6;
     int T10ms = 7;
     int T30ms = 8;
     int T100ms = 9;
     int T300ms = 10;
     int T1s = 11;
     int T3s = 12;
     int T10s = 13;
     int T30s = 14;
     int T100s = 15;
     int T300s = 16;
     int T1000 = 15;
}
