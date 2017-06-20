package ve.gob.cendit.cenditlab.cal;

/**
 * Created by jsars on 17/06/17.
 */

import java.util.Arrays;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
        INTERFACE           SYNTAX

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

 OPTIONAL STRING         DEFAULT VALUE
        SEGMENTS

        VXI0::1::INSTR          A VXI device at logical address 1 in VXI interface VXI0.
        VXI::MEMACC             Board-level register access to the VXI interface.
        VXI::1::BACKPLANE       Mainframe resource for chassis 1 on the default VXI system, GPIB-VXI2::BACKPLANE which is interface 0.
        VXI0::SERVANT           Servant/device-side resource for VXI interface 0.

        GPIB-VXI::9::INSTR      A VXI device at logical address 9 in a GPIB-VXI controlled system.
        GPIB::1::0::INSTR       A GPIB device at primary address 1 and secondary address 0 in GPIB interface 0.

        ASRL1::INSTR            A serial device attached to interface ASRL1.

        GPIB-VXI1::MEMACC       Board-level register access to GPIB-VXI interface number 1.
        GPIB2::INTFC            Interface or raw resource for GPIB interface 2.
        GPIB-VXI2::BACKPLANE    Mainframe resource for default chassis on GPIB-VXI interface 2.
        GPIB1::SERVANT          Servant/device-side resource for GPIB interface 1.

        PXI::15::INSTR          PXI device number 15 on bus 0.

        TCPIP0::1.2.3.4::999    Raw TCP/IP access to port 999 at the specified IP address.
            ::SOCKET
        TCPIP::dev@company.com  A TCP/IP device using VXI-11 located at the specified address.
            ::INSTR             This uses the default LAN Device Name of inst0.

        USB::0x1234::125::      A USB Test & Measurement class device with
        A22-5::INSTR            manufacturer ID 0x1234, model code 125, and serial
                                number A22-5. This uses the device’s first available
                                USBTMC interface. This is usually number 0.

        USB::0x5678::0x33::     A raw USB nonclass device with manufacturer ID
        SN999::1::RAW           0x5678, model code 0x33, and serial number
                                SN999.This uses the device’s interface number 1.
 */



public class VisaAddress
{
    private String visaAddress;
    private VisaInterfaceType interfaceType;

    public VisaAddress(String address)
    {
        interfaceType = VisaInterfaceType.GPIB;
    }

    public VisaInterfaceType getInterfaceType()
    {
        return interfaceType;
    }

    public static boolean TryParseVisaAddress(String address, VisaAddress visaAddress)
    {
        return false;
    }
}

class VisaAddressFields
{
    public static final int INTERFACE_TYPE = 1;
    public static final int BOARD_INDEX = 2;
    public static final int LOGICAL_ADDRESS = 2;
    public static final int MAINFRAME_LOGICAL_ADDRESS = 3;
    public static final int RESOURCE_TYPE = 4;
    public static final int PRIMARY_ADDRESS = 2;
    public static final int SECONDARY_ADDRESS = 3;
    public static final int TCPIP_ADDRESS = 2;
    public static final int TCPIP_PORT = 3;
    public static final int LAN_DEVICE_NAME = 2;
    public static final int MANUFACTURER_ID = 2;
    public static final int MODEL_CODE = 3;
    public static final int SERIAL_NUMBER = 4;
    public static final int INTERFACE_NUMBER = 5;
}

class VisaAddressFieldNames
{
    public static final String INTERFACE = "INTERFACE";
    public static final String BOARD = "BOARD";
    public static final String LOGICAL_ADDRESS = "LOGICALADDRESS";
    public static final String RESOURCE = "RESOURCE";
    public static final String PRIMARY_ADDRESS = "PRIMARYADDRESS";
    public static final String SECONDARY_ADDRESS = "SECONDARYADDRESS";
    public static final String DEVICE = "DEVICE";
    public static final String FUNCTION = "FUNCTION";
    public static final String DEVICE_NAME = "DEVICENAME";
    public static final String PORT = "PORT";
    public static final String MANUFACTURER_ID = "MANUFACTURERID";
    public static final String MODEL_CODE = "MODELCODE";
    public static final String SERIAL_NUMBER = "SERIALNUMBER";
    public static final String INTERFACE_NUMBER = "INTERFACE_NUMBER";
}

class VisaAddressPatterns
{
    /*Colocar nombre a los grupos regex
    https://stackoverflow.com/questions/415580/regex-named-groups-in-java
    "(?<login>\\w+) (?<id>\\d+)"
    matcher.group("login") ==> TEST
    */

    public final static String VXI_INSTR =
            "(?<INTERFACE>VXI)(?<BOARD>\\d+)?::(?<LOGICAL_ADDRESS>\\d+)(::(?<RESOURCE>INSTR))?";
    public final  static String VXI_MEMACC =
            "(?<INTERFACE>VXI)(?<BOARD>\\d+)?::(?<RESOURCE>MEMACC)";
    public final static String VXI_BACKPLANE =
            "(?<INTERFACE>VXI)(?<BOARD>\\d+)?(::(?<LOGICALADDRESS>\\d+))?::(?<RESOURCE>BACKPLANE)";
    public final static String VXI_SERVANT =
            "(?<INTERFACE>VXI)(?<BOARD>\\d+)?::(?<RESOURCE>SERVANT)";

    public final static String GPIB_VXI_INSTR =
            "(?<INTERFACE>GPIB-VXI)(?<BOARD>\\d+)?::(?<LOGICALADDRESS>\\d+)(?<RESOURCE>::(INSTR))?";
    public final static String GPIB_VXI_MEMACC =
            "(?<INTERFACE>GPIB-VXI)(?<BOARD>\\d+)?::(?<RESOURCE>MEMACC)";
    public final static String GPIB_VXI_BACKPLANE =
            "(?<INTERFACE>GPIB-VXI)(?<BOARD>\\d+)?(::(?<LOGICALADDRESS>\\d+))?::(?<RESOURCE>BACKPLANE)";

    public final static String GPIB_INSTR =
            "(?<INTERFACE>GPIB)(?<BOARD>\\d+)?::(?<PRIMARYADDRESS>\\d+)(::(?<SECONDARYADDRESS>\\d+))?(::(?<RESOURCE>INSTR))?";
    public final static String GPIB_INTFC =
            "(?<INTERFACE>GPIB)(?<BOARD>\\d+)?::(?<RESOURCE>INTFC)";
    public final static String GPIB_SERVANT =
            "(?<INTERFCE>GPIB)(?<BOARD>\\d+)?::(?<RESOURCE>SERVANT)";

    public final static String PXI_INSTR_1 =
            "(?<INTERFACE>PXI)(?<BOARD>\\d+)?::(?<DEVICE>\\d+)(::(?<FUNCTION>\\d+))?(::(?<RESOURCE>INSTR))?";
    public final  static String PXI_INSTR_2 =
            "(?<INTERFACE>PXI)(?<BOARD>\\d+)?::((?<DEVICE>\\d+)-)?(?<FUNCTION>\\d+)(.(\\d+))?(::(?<RESOURCE>INSTR))?";
    public final static String PXI_MEMACC =
            "(?<INTERFACE>PXI)(?<BOARD>\\d+)?::(?<RESOURCE>MEMACC)";

    public final static String SERIAL_INSTR =
            "(?<INTERFACE>ASRL)(?<BOARD>\\d)?(::(?<RESOURCE>INSTR))?";

    public final static String TCPIP_INSTR_1 =
            "(?<INTERFACE>TCPIP)(?<BOARD>\\d)?::(?<HOSTADDRESS>\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})(::(?<DEVICENAME>[^:]*))?(::(?<RESOURCE>INSTR))?";
    public final static String TCPIP_INSTR_2 =
            "(?<INTERFACE>TCPIP)(?<BOARD>\\d)?::(?<HOSTADDRESS>\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})::(?<PORT>\\d{1,5})::(?<RESOURCE>SOCKET)";

    public final static String USB_INSTR =
            "(?<INTERFACE>USB)(?<BOARD>\\d+)?::(?<MANUFACTURERID>[^:]*)::(?<MODELCODE>[^:]*)::(?<SERIALNUMBER>[^:]*)(::(?<INTERFACENUMBER>\\d+))?(::(?<RESOURCE>INSTR))?";
    public final  static String USB_INSTR_RAW =
            "(?<INTERFACE>USB)(?<BOARD>\\d+)?::(?<MANUFACTURERID>[^:]*)::(?<MODELCODE>[^:]*)::(?<SERIALNUMBER>[^:]*)(::(?<INTERFACENUMBER>\\d+))?(::(?<RESOURCE>RAW))?";
}


class VisaAddressParseFunctions
{
    static VisaAddress parseVxiInstrAddress(String address)
    {
        Pattern pattern = Pattern.compile(VisaAddressPatterns.GPIB_INSTR);
        Matcher matcher = pattern.matcher(address);

        try {
            if (matcher.find()) {
                String interfaceType = matcher.group(VisaAddressFields.INTERFACE_TYPE);
                String board = matcher.group(VisaAddressFields.BOARD_INDEX);
                String logicalAddress = matcher.group(VisaAddressFields.LOGICAL_ADDRESS);
                String resourceType = matcher.group(VisaAddressFields.RESOURCE_TYPE);

                return new VisaAddress(address);
            }
        }
        catch (Exception ex)
        {

        }
        return null;
    }

    static Function<String, VisaAddress> vxiInstrParseAddress = a -> parse(a);
}

interface IVisaAddressParserFunction
{
    VisaAddress parse(String address);
    boolean tryParse(String address, VisaAddress visaAddress);
}

class VisaAddressParseFunction implements Function<String, VisaAddress>
{

    @Override
    public VisaAddress apply(String s)
    {
        return null;
    }

    @Override
    public <V> Function<V, VisaAddress> compose(Function<? super V, ? extends String> before)
    {
        return null;
    }

    @Override
    public <V> Function<String, V> andThen(Function<? super VisaAddress, ? extends V> after) {
        return null;
    }
}

class PatternParseFunctionPair
{
    public String addressPattern;
    public Function<Matcher, VisaAddress> addressExtractFunction;

    public PatternParseFunctionPair(String addressPattern,
                                    Function<Matcher, VisaAddress> addressExtractFunction)
    {
        this.addressPattern = addressPattern;
        this.addressExtractFunction = addressExtractFunction;
    }
}



class VisaAddressParser
{
    private static String[] patterns;
    private static String[] fieldNames;

    private static Function<String, VisaAddress>[] addressFieldExtractFunctions;

    static
    {
        patterns = new String[]
        {
            VisaAddressPatterns.VXI_INSTR,
            VisaAddressPatterns.VXI_MEMACC,
            VisaAddressPatterns.VXI_BACKPLANE,
            VisaAddressPatterns.VXI_SERVANT,

            VisaAddressPatterns.GPIB_VXI_INSTR,
            VisaAddressPatterns.GPIB_VXI_MEMACC,
            VisaAddressPatterns.GPIB_VXI_BACKPLANE,

            VisaAddressPatterns.GPIB_INSTR,
            VisaAddressPatterns.GPIB_INTFC,
            VisaAddressPatterns.GPIB_SERVANT,

            VisaAddressPatterns.PXI_INSTR_1,
            VisaAddressPatterns.PXI_INSTR_2,
            VisaAddressPatterns.PXI_MEMACC,

            VisaAddressPatterns.SERIAL_INSTR,

            VisaAddressPatterns.TCPIP_INSTR_1,
            VisaAddressPatterns.TCPIP_INSTR_2,

            VisaAddressPatterns.USB_INSTR,
            VisaAddressPatterns.USB_INSTR_RAW
        };

        fieldNames = new String[]
        {
            VisaAddressFieldNames.INTERFACE,
            VisaAddressFieldNames.BOARD,
            VisaAddressFieldNames.LOGICAL_ADDRESS,
            VisaAddressFieldNames.RESOURCE,
            VisaAddressFieldNames.PRIMARY_ADDRESS,
            VisaAddressFieldNames.SECONDARY_ADDRESS,
            VisaAddressFieldNames.DEVICE,
            VisaAddressFieldNames.FUNCTION,
            VisaAddressFieldNames.DEVICE_NAME,
            VisaAddressFieldNames.PORT,
            VisaAddressFieldNames.MANUFACTURER_ID,
            VisaAddressFieldNames.MODEL_CODE,
            VisaAddressFieldNames.SERIAL_NUMBER,
            VisaAddressFieldNames.INTERFACE_NUMBER
        };
    }

    public void tets()
    {
        for(int i = 0; i < patterns.length; ++i)
        {
            Function<String, VisaAddress> f = addressFieldExtractFunctions[i];
            f.apply(patterns[i]);
        }

        Arrays.stream(patterns).filter(a -> a.matches("\\d+"));
        addressFieldExtractFunctions[i].apply(patterns[i]);
    }


}

/*class GpibVisaAddressParser implements IVisaAddressParser
{
    private String address;
    private class PatternParseFunction
    {
        public String pattern;
        public Function<Matcher, VisaAddress> parseFunction;

        public PatternParseFunction(String p,
                    Function<Matcher, VisaAddress> pf)
        {
            pattern = p;
            parseFunction = pf;
        }
    }


    private final static String[] ADDRESS_PATTERNS =
    {
        VisaAddressPatterns.GPIB_INSTR_PATTERN,
        VisaAddressPatterns.GPIB_INTFC_PATTERN,
        VisaAddressPatterns.GPIB_SERVANT_PATTERN,
    };

    @Override
    public VisaAddress parse(String address)
    {

    }*/

/*    @Override
    public boolean tryParse(String address, VisaAddress visaAddress)
    {
        for (String pattern : ADDRESS_PATTERNS)
        {
            Pattern regex = Pattern.compile(pattern);
            Matcher matches = regex.matcher(address);

            if (matches.find())
            {
                extractAddressFields(matches);
            }
        }

        return false;
    }*/

/*    private boolean extractAddressFields(Matcher matches)
    {
        Arrays.stream(ADDRESS_PATTERNS).filter((pattern)-> "".matches(pattern)).map();

        Function<String, String> f = (X) -> {
            return "Hola" + X;
        };

        f.apply("Hola");

        return true;
    }
}
*/
enum VisaInterfaceType
{
    VXI,
    GPIB_VXI,
    GPIB,
    PXI,
    TCPIP,
    ASRL,
    USB,
    NONE
}

enum VisaResourceType
{
    INSTR,
    MEMACC,
    BACKPLANE,
    SERVANT,
    INTFC,
    SOCKET,
    RAW,
    NONE
}