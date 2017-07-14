package ve.gob.cendit.cenditlab.cal.tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import ve.gob.cendit.cenditlab.io.VisaAddress;

/**
 * Created by jarias on 6/23/17.
 */

/**
     VXI INSTR           VXI[board]::VXI logical address[::INSTR]
     VXI MEMACC          VXI[board]::MEMACC
     VXI BACKPLANE       VXI[board][::mainframe logical address]::BACKPLANE
     VXI SERVANT         VXI[board]::SERVANT

     GPIB-VXI INTR       GPIB-VXI[board]::VXI logical address[::INSTR]
     GPIB-VXI MEMACC     GPIB-VXI[board]::MEMACC
     GPIB-VXI BACKPLANE  GPIB-VXI[board][::mainframe logical address]::BACKPLANE
     GPIB INSTR          GPIB[board]::primary address[::secondary address][::INSTR]
     GPIB INTFC          GPIB[board]::INTFC
     GPIB SERVANT        GPIB[board]::SERVANT

     PXI INSTR           PXI[board]::device[::function][::INSTR]

     Serial INSTR        ASRL[board][::INSTR]

     TCPIP INSTR         TCPIP[board]::host address[::LAN device name][::INSTR]
     TCPIP SOCKET        TCPIP[board]::host address::port::SOCKET

     USB INSTR           USB[board]::manufacturer ID::model
     code::serial number[::USB interface
     number][::INSTR]

     USB RAW             USB[board]::manufacturer ID::model
     code::serial number[::USB interface
     number]::RAW
 */


public class VisaAddressTest
{
    public static void main(String[] args)
    {

    }

    @Test
    public void checkVisaAddressesAreValid()
    {
        boolean validAddress = false;
        String address = null;

        address = "VXI::1";
        validAddress = VisaAddress.isValid(address);
        assertTrue(address + " must be valid", validAddress);

        address = "VXI0::MEMACC";
        validAddress = VisaAddress.isValid(address);
        assertTrue(address + " must be valid", validAddress);

        address = "VXI0::10::BACKPLANE";
        validAddress = VisaAddress.isValid(address);
        assertTrue(address + " must be valid", validAddress);

        address = "GPIB::001::010::ITRNS";
        validAddress = VisaAddress.isValid(address);
        assertFalse(address + " must be invalid", validAddress);

        address = "TCPIP12::192.326.256.700::PC_LAB::INSTR";
        validAddress = VisaAddress.isValid(address);
        assertTrue(address + " must be valid", validAddress);
    }

    @Test
    public void checkVisaAddressesParseAreValid()
    {
        String address = "VXI0::10::120::INSTR";
        VisaAddress va = VisaAddress.parseAddress(address);

        address = "GPIB00::12::INSTR";
        va = VisaAddress.parseAddress(address);

        address = "TCPIP12::192.326.256.700::INSTR";
        va =  VisaAddress.parseAddress(address);

        // USB[board]::manufacturer ID::model code::serial number[::USB interface number][::INSTR]

        address = "USB10::Acme Inc::AC12234::JKS1828::0::INSTR";
        va =  VisaAddress.parseAddress(address);
    }
}
