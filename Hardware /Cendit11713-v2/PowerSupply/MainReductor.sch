EESchema Schematic File Version 2
LIBS:adc-dac
LIBS:memory
LIBS:xilinx
LIBS:microcontrollers
LIBS:dsp
LIBS:microchip
LIBS:analog_switches
LIBS:motorola
LIBS:texas
LIBS:intel
LIBS:audio
LIBS:interface
LIBS:digital-audio
LIBS:philips
LIBS:display
LIBS:cypress
LIBS:siliconi
LIBS:opto
LIBS:atmel
LIBS:contrib
LIBS:power
LIBS:device
LIBS:transistors
LIBS:conn
LIBS:linear
LIBS:regul
LIBS:74xx
LIBS:cmos4000
LIBS:Symbols_DCDC-ACDC-Converter_RevC_20Jul2012
LIBS:Symbols_EN60617_13Mar2013
LIBS:Symbols_EN60617-10_HF-Radio_DRAFT_12Sep2013
LIBS:Symbols_ICs-Diskrete_RevD10
LIBS:Symbols_ICs-Opto_RevB_16Sep2013
LIBS:Symbols_Microcontroller_Philips-NXP_RevA_06Oct2013
LIBS:SymbolsSimilarEN60617+oldDIN617-RevE8
LIBS:Symbols_Socket-DIN41612_RevA
LIBS:Symbols_Transformer-Diskrete_RevA
LIBS:CenditBasic
LIBS:TL494CD
LIBS:74xgxx
LIBS:ac-dc
LIBS:actel
LIBS:allegro
LIBS:Altera
LIBS:analog_devices
LIBS:battery_management
LIBS:bbd
LIBS:bosch
LIBS:brooktre
LIBS:cmos_ieee
LIBS:dc-dc
LIBS:diode
LIBS:elec-unifil
LIBS:ESD_Protection
LIBS:eSim_Analog
LIBS:eSim_Devices
LIBS:eSim_Digital
LIBS:eSim_Hybrid
LIBS:eSim_Miscellaneous
LIBS:eSim_Plot
LIBS:eSim_Power
LIBS:eSim_PSpice
LIBS:eSim_Sources
LIBS:eSim_Subckt
LIBS:eSim_User
LIBS:ftdi
LIBS:gennum
LIBS:graphic
LIBS:hc11
LIBS:ir
LIBS:Lattice
LIBS:leds
LIBS:logo
LIBS:maxim
LIBS:mechanical
LIBS:microchip_dspic33dsc
LIBS:microchip_pic10mcu
LIBS:microchip_pic12mcu
LIBS:microchip_pic16mcu
LIBS:microchip_pic18mcu
LIBS:microchip_pic24mcu
LIBS:microchip_pic32mcu
LIBS:modules
LIBS:motor_drivers
LIBS:motors
LIBS:msp430
LIBS:nordicsemi
LIBS:nxp
LIBS:nxp_armmcu
LIBS:onsemi
LIBS:Oscillators
LIBS:powerint
LIBS:Power_Management
LIBS:pspice
LIBS:references
LIBS:relays
LIBS:rfcom
LIBS:sensors
LIBS:silabs
LIBS:stm8
LIBS:stm32
LIBS:supertex
LIBS:switches
LIBS:transf
LIBS:triac_thyristor
LIBS:ttl_ieee
LIBS:valves
LIBS:video
LIBS:wiznet
LIBS:Worldsemi
LIBS:Xicor
LIBS:zetex
LIBS:Zilog
LIBS:PowerSupply-cache
EELAYER 25 0
EELAYER END
$Descr A4 11693 8268
encoding utf-8
Sheet 3 6
Title ""
Date ""
Rev ""
Comp ""
Comment1 ""
Comment2 ""
Comment3 ""
Comment4 ""
$EndDescr
$Comp
L TL494CD U?
U 1 1 59F28971
P 5950 2500
F 0 "U?" H 5734 3387 50  0000 L BNN
F 1 "TL494CD" H 5728 1229 50  0000 L BNN
F 2 "SOIC127P600X175-16N" H 5950 2500 50  0001 L BNN
F 3 "SOIC-16 Texas Instruments" H 5950 2500 50  0001 L BNN
F 4 "Texas Instruments" H 5950 2500 50  0001 L BNN "MF"
F 5 "Good" H 5950 2500 50  0001 L BNN "Availability"
F 6 "DC-DC converter%3B PWM controller%3B Uin%3A -0.3%C3%B738V%3B Uout%3A 40V%3B 250mA" H 5950 2500 50  0001 L BNN "Description"
F 7 "TL494CD" H 5950 2500 50  0001 L BNN "MP"
F 8 "0.45 USD" H 5950 2500 50  0001 L BNN "Price"
	1    5950 2500
	1    0    0    -1  
$EndComp
Text HLabel 3200 1800 0    60   Input ~ 0
HV_DC
Text HLabel 3200 1950 0    60   Input ~ 0
HV_GND
$Comp
L TRANSISTOR-N-MOSFET-ENHANCEMENT_RevE_Date15jun2010 T?
U 1 1 59F29123
P 8500 3350
F 0 "T?" H 8750 3375 50  0000 C CNN
F 1 "N-MOSFET" H 8900 3300 50  0000 C CNN
F 2 "" H 8500 3350 50  0000 C CNN
F 3 "" H 8500 3350 50  0000 C CNN
	1    8500 3350
	1    0    0    -1  
$EndComp
$Comp
L D_Schottky D?
U 1 1 59F29D25
P 9000 1000
F 0 "D?" H 9000 1100 50  0000 C CNN
F 1 "D_Schottky" H 9000 900 50  0000 C CNN
F 2 "" H 9000 1000 50  0001 C CNN
F 3 "" H 9000 1000 50  0001 C CNN
	1    9000 1000
	1    0    0    -1  
$EndComp
$Comp
L D_Schottky D?
U 1 1 59F29DC2
P 9150 1300
F 0 "D?" H 9150 1400 50  0000 C CNN
F 1 "D_Schottky" H 9150 1200 50  0000 C CNN
F 2 "" H 9150 1300 50  0001 C CNN
F 3 "" H 9150 1300 50  0001 C CNN
	1    9150 1300
	1    0    0    -1  
$EndComp
$Comp
L D_Schottky D?
U 1 1 59F29E65
P 9600 4200
F 0 "D?" H 9600 4300 50  0000 C CNN
F 1 "D_Schottky" H 9600 4100 50  0000 C CNN
F 2 "" H 9600 4200 50  0001 C CNN
F 3 "" H 9600 4200 50  0001 C CNN
	1    9600 4200
	0    1    1    0   
$EndComp
$Comp
L D_Zener D?
U 1 1 59F29F10
P 3450 5300
F 0 "D?" H 3450 5400 50  0000 C CNN
F 1 "D_Zener" H 3450 5200 50  0000 C CNN
F 2 "" H 3450 5300 50  0001 C CNN
F 3 "" H 3450 5300 50  0001 C CNN
	1    3450 5300
	0    1    1    0   
$EndComp
$Comp
L R R?
U 1 1 59F2A0F4
P 3450 4850
F 0 "R?" V 3530 4850 50  0000 C CNN
F 1 "R" V 3450 4850 50  0000 C CNN
F 2 "" V 3380 4850 50  0001 C CNN
F 3 "" H 3450 4850 50  0001 C CNN
	1    3450 4850
	1    0    0    -1  
$EndComp
$Comp
L C C?
U 1 1 59F2A3F9
P 7400 2600
F 0 "C?" H 7425 2700 50  0000 L CNN
F 1 "C" H 7425 2500 50  0000 L CNN
F 2 "" H 7438 2450 50  0001 C CNN
F 3 "" H 7400 2600 50  0001 C CNN
	1    7400 2600
	1    0    0    -1  
$EndComp
$Comp
L GND #PWR?
U 1 1 59F2A70D
P 8500 2800
F 0 "#PWR?" H 8500 2550 50  0001 C CNN
F 1 "GND" H 8500 2650 50  0000 C CNN
F 2 "" H 8500 2800 50  0001 C CNN
F 3 "" H 8500 2800 50  0001 C CNN
	1    8500 2800
	1    0    0    -1  
$EndComp
$Comp
L D D?
U 1 1 59F2A77B
P 8300 2400
F 0 "D?" H 8300 2300 50  0000 C CNN
F 1 "D" H 8300 2200 50  0000 C CNN
F 2 "" H 8300 2400 50  0001 C CNN
F 3 "" H 8300 2400 50  0001 C CNN
	1    8300 2400
	1    0    0    -1  
$EndComp
$Comp
L R R?
U 1 1 59F2A92C
P 3450 4400
F 0 "R?" V 3530 4400 50  0000 C CNN
F 1 "R" V 3450 4400 50  0000 C CNN
F 2 "" V 3380 4400 50  0001 C CNN
F 3 "" H 3450 4400 50  0001 C CNN
	1    3450 4400
	1    0    0    -1  
$EndComp
$Comp
L R R?
U 1 1 59F2A9A8
P 3450 4000
F 0 "R?" V 3530 4000 50  0000 C CNN
F 1 "R" V 3450 4000 50  0000 C CNN
F 2 "" V 3380 4000 50  0001 C CNN
F 3 "" H 3450 4000 50  0001 C CNN
	1    3450 4000
	1    0    0    -1  
$EndComp
$Comp
L R_Small R?
U 1 1 59F2B16A
P 7900 2400
F 0 "R?" V 8000 2350 50  0000 L CNN
F 1 "R_Small" V 8100 2350 50  0000 L CNN
F 2 "" H 7900 2400 50  0001 C CNN
F 3 "" H 7900 2400 50  0001 C CNN
	1    7900 2400
	0    1    1    0   
$EndComp
$Comp
L XFRMR_PA2653NL TR?
U 1 1 59F2B9A8
P 8800 2200
F 0 "TR?" H 8800 2605 50  0000 C CNN
F 1 "XFRMR_PA2653NL" H 8950 1600 50  0000 C CNN
F 2 "" H 8800 1650 50  0001 C CIN
F 3 "" H 9065 1890 50  0001 C CNN
	1    8800 2200
	1    0    0    -1  
$EndComp
Wire Wire Line
	8600 2400 8450 2400
Wire Wire Line
	8600 2700 8500 2700
Wire Wire Line
	8500 2700 8500 2800
$Comp
L CP C?
U 1 1 59F2BA9F
P 7650 2600
F 0 "C?" H 7675 2700 50  0000 L CNN
F 1 "CP" H 7675 2500 50  0000 L CNN
F 2 "" H 7688 2450 50  0001 C CNN
F 3 "" H 7650 2600 50  0001 C CNN
	1    7650 2600
	1    0    0    -1  
$EndComp
Wire Wire Line
	8150 2400 8000 2400
Wire Wire Line
	7150 2400 7800 2400
Wire Wire Line
	7400 2400 7400 2450
Wire Wire Line
	7650 2450 7650 2400
Connection ~ 7650 2400
$Comp
L GND #PWR?
U 1 1 59F2BC50
P 7400 2850
F 0 "#PWR?" H 7400 2600 50  0001 C CNN
F 1 "GND" H 7400 2700 50  0000 C CNN
F 2 "" H 7400 2850 50  0001 C CNN
F 3 "" H 7400 2850 50  0001 C CNN
	1    7400 2850
	1    0    0    -1  
$EndComp
Wire Wire Line
	7400 2750 7400 2850
Wire Wire Line
	7650 2750 7650 2800
Wire Wire Line
	7650 2800 7400 2800
Connection ~ 7400 2800
$Comp
L R R?
U 1 1 59F2BDCF
P 3450 3600
F 0 "R?" V 3530 3600 50  0000 C CNN
F 1 "R" V 3450 3600 50  0000 C CNN
F 2 "" V 3380 3600 50  0001 C CNN
F 3 "" H 3450 3600 50  0001 C CNN
	1    3450 3600
	1    0    0    -1  
$EndComp
Wire Wire Line
	3200 1800 3500 1800
Text Label 3350 1800 0    39   ~ 0
HV_DC
Wire Wire Line
	3450 3750 3450 3850
Wire Wire Line
	3450 4150 3450 4250
Wire Wire Line
	3450 4550 3450 4700
Wire Wire Line
	3450 5000 3450 5150
$Comp
L GND #PWR?
U 1 1 59F2C229
P 3450 2050
F 0 "#PWR?" H 3450 1800 50  0001 C CNN
F 1 "GND" H 3450 1900 50  0000 C CNN
F 2 "" H 3450 2050 50  0001 C CNN
F 3 "" H 3450 2050 50  0001 C CNN
	1    3450 2050
	1    0    0    -1  
$EndComp
Wire Wire Line
	3200 1950 3450 1950
Wire Wire Line
	3450 1950 3450 2050
$Comp
L D D?
U 1 1 59F2C35C
P 3800 5050
F 0 "D?" H 3800 5150 50  0000 C CNN
F 1 "D" H 3800 4950 50  0000 C CNN
F 2 "" H 3800 5050 50  0001 C CNN
F 3 "" H 3800 5050 50  0001 C CNN
	1    3800 5050
	-1   0    0    1   
$EndComp
Wire Wire Line
	3150 5050 3650 5050
Connection ~ 3450 5050
Wire Wire Line
	3950 5050 4300 5050
Wire Wire Line
	3450 3450 3450 3300
Text Label 3450 3350 0    39   ~ 0
HV_VDC
$Comp
L D_Zener D?
U 1 1 59F2CBFD
P 8200 3750
F 0 "D?" H 8200 3850 50  0000 C CNN
F 1 "D_Zener" H 8200 3650 50  0000 C CNN
F 2 "" H 8200 3750 50  0001 C CNN
F 3 "" H 8200 3750 50  0001 C CNN
	1    8200 3750
	0    1    1    0   
$EndComp
$Comp
L R R?
U 1 1 59F2D178
P 7150 2850
F 0 "R?" V 7230 2850 50  0000 C CNN
F 1 "R" V 7150 2850 50  0000 C CNN
F 2 "" V 7080 2850 50  0001 C CNN
F 3 "" H 7150 2850 50  0001 C CNN
	1    7150 2850
	1    0    0    -1  
$EndComp
$Comp
L POT RV?
U 1 1 59F2D225
P 7150 3300
F 0 "RV?" V 6975 3300 50  0000 C CNN
F 1 "POT" V 7050 3300 50  0000 C CNN
F 2 "" H 7150 3300 50  0001 C CNN
F 3 "" H 7150 3300 50  0001 C CNN
	1    7150 3300
	-1   0    0    -1  
$EndComp
$Comp
L R R?
U 1 1 59F2D3D0
P 7150 3750
F 0 "R?" V 7230 3750 50  0000 C CNN
F 1 "R" V 7150 3750 50  0000 C CNN
F 2 "" V 7080 3750 50  0001 C CNN
F 3 "" H 7150 3750 50  0001 C CNN
	1    7150 3750
	1    0    0    -1  
$EndComp
$Comp
L GND #PWR?
U 1 1 59F2D437
P 7150 4000
F 0 "#PWR?" H 7150 3750 50  0001 C CNN
F 1 "GND" H 7150 3850 50  0000 C CNN
F 2 "" H 7150 4000 50  0001 C CNN
F 3 "" H 7150 4000 50  0001 C CNN
	1    7150 4000
	1    0    0    -1  
$EndComp
Wire Wire Line
	7150 2400 7150 2700
Connection ~ 7400 2400
Wire Wire Line
	7150 3000 7150 3150
Wire Wire Line
	7150 3450 7150 3600
Wire Wire Line
	7150 3900 7150 4000
$Comp
L R_Small R?
U 1 1 59F2D66E
P 4700 2100
F 0 "R?" V 4900 2050 50  0000 L CNN
F 1 "R_Small" V 4800 2050 50  0000 L CNN
F 2 "" H 4700 2100 50  0001 C CNN
F 3 "" H 4700 2100 50  0001 C CNN
	1    4700 2100
	0    1    -1   0   
$EndComp
$Comp
L R_Small R?
U 1 1 59F2D78A
P 4850 3200
F 0 "R?" V 4950 3100 50  0000 L CNN
F 1 "R_Small" V 5000 3000 50  0000 L CNN
F 2 "" H 4850 3200 50  0001 C CNN
F 3 "" H 4850 3200 50  0001 C CNN
	1    4850 3200
	0    1    1    0   
$EndComp
$Comp
L R_Small R?
U 1 1 59F2D808
P 4800 3000
F 0 "R?" V 4650 2950 50  0000 L CNN
F 1 "R_Small" V 4700 2950 50  0000 L CNN
F 2 "" H 4800 3000 50  0001 C CNN
F 3 "" H 4800 3000 50  0001 C CNN
	1    4800 3000
	0    1    1    0   
$EndComp
$Comp
L R_Small R?
U 1 1 59F2D86B
P 4450 3000
F 0 "R?" V 4300 2950 50  0000 L CNN
F 1 "R_Small" V 4350 2800 50  0000 L CNN
F 2 "" H 4450 3000 50  0001 C CNN
F 3 "" H 4450 3000 50  0001 C CNN
	1    4450 3000
	0    1    1    0   
$EndComp
Wire Wire Line
	5050 3200 4950 3200
Wire Wire Line
	5050 3000 4900 3000
Wire Wire Line
	4700 3000 4550 3000
$Comp
L GND #PWR?
U 1 1 59F2DE2A
P 4200 3000
F 0 "#PWR?" H 4200 2750 50  0001 C CNN
F 1 "GND" H 4200 2850 50  0000 C CNN
F 2 "" H 4200 3000 50  0001 C CNN
F 3 "" H 4200 3000 50  0001 C CNN
	1    4200 3000
	0    1    1    0   
$EndComp
Wire Wire Line
	4350 3000 4200 3000
Wire Wire Line
	4800 2100 5050 2100
Wire Wire Line
	4850 2750 4850 2100
Connection ~ 4850 2100
Wire Wire Line
	4750 3200 4700 3200
Wire Wire Line
	4700 3200 4700 2750
Wire Wire Line
	4700 2750 4850 2750
$Comp
L R_Small R?
U 1 1 59F2E4FD
P 10100 4800
F 0 "R?" H 10130 4820 50  0000 L CNN
F 1 "RSENSE" H 10130 4760 50  0000 L CNN
F 2 "" H 10100 4800 50  0001 C CNN
F 3 "" H 10100 4800 50  0001 C CNN
	1    10100 4800
	1    0    0    -1  
$EndComp
$Comp
L NPN Q?
U 1 1 59F2E931
P 9500 3500
F 0 "Q?" H 9400 3550 50  0000 R CNN
F 1 "NPN" H 9450 3650 50  0000 R CNN
F 2 "" H 9700 3600 29  0000 C CNN
F 3 "" H 9500 3500 60  0000 C CNN
	1    9500 3500
	1    0    0    -1  
$EndComp
$Comp
L GNDPWR #PWR?
U 1 1 59F2EE77
P 9150 2500
F 0 "#PWR?" H 9150 2300 50  0001 C CNN
F 1 "GNDPWR" H 9150 2370 50  0000 C CNN
F 2 "" H 9150 2450 50  0001 C CNN
F 3 "" H 9150 2450 50  0001 C CNN
	1    9150 2500
	1    0    0    -1  
$EndComp
Wire Wire Line
	9150 2500 9150 2400
Wire Wire Line
	9150 2400 9000 2400
$Comp
L CP C?
U 1 1 59F2F783
P 9650 2350
F 0 "C?" H 9675 2450 50  0000 L CNN
F 1 "CP" H 9675 2250 50  0000 L CNN
F 2 "" H 9688 2200 50  0001 C CNN
F 3 "" H 9650 2350 50  0001 C CNN
	1    9650 2350
	1    0    0    -1  
$EndComp
$Comp
L C C?
U 1 1 59F2F7E8
P 9950 2350
F 0 "C?" H 9975 2450 50  0000 L CNN
F 1 "C" H 9975 2250 50  0000 L CNN
F 2 "" H 9988 2200 50  0001 C CNN
F 3 "" H 9950 2350 50  0001 C CNN
	1    9950 2350
	1    0    0    -1  
$EndComp
Wire Wire Line
	4600 2100 4350 2100
Text Label 4350 2100 0    39   ~ 0
VREF
$Comp
L R_Small R?
U 1 1 59F30077
P 4700 2200
F 0 "R?" V 4550 2150 50  0000 L CNN
F 1 "R_Small" V 4600 2150 50  0000 L CNN
F 2 "" H 4700 2200 50  0001 C CNN
F 3 "" H 4700 2200 50  0001 C CNN
	1    4700 2200
	0    1    -1   0   
$EndComp
Wire Wire Line
	5050 2200 4800 2200
Wire Wire Line
	4600 2200 4350 2200
Text Label 4350 2200 0    39   ~ 0
VFBCK
Wire Wire Line
	9950 2100 9950 2200
Wire Wire Line
	9650 2200 9650 2100
Connection ~ 9650 2100
$Comp
L GNDPWR #PWR?
U 1 1 59F30BDD
P 9950 2650
F 0 "#PWR?" H 9950 2450 50  0001 C CNN
F 1 "GNDPWR" H 9950 2520 50  0000 C CNN
F 2 "" H 9950 2600 50  0001 C CNN
F 3 "" H 9950 2600 50  0001 C CNN
	1    9950 2650
	1    0    0    -1  
$EndComp
Wire Wire Line
	9950 2650 9950 2500
Wire Wire Line
	9650 2500 9650 2600
Wire Wire Line
	9650 2600 9950 2600
Connection ~ 9950 2600
$Comp
L D_Schottky D?
U 1 1 59F30673
P 10600 3500
F 0 "D?" H 10600 3600 50  0000 C CNN
F 1 "D_Schottky" H 10600 3400 50  0000 C CNN
F 2 "" H 10600 3500 50  0001 C CNN
F 3 "" H 10600 3500 50  0001 C CNN
	1    10600 3500
	0    1    1    0   
$EndComp
Wire Wire Line
	8000 1450 8000 1300
Wire Wire Line
	8400 1450 8400 1300
Text Label 8000 1350 0    39   ~ 0
HV_DC
Text Label 8400 1350 0    39   ~ 0
HV_GND
$Comp
L R R?
U 1 1 59F31E16
P 3150 5350
F 0 "R?" V 3230 5350 50  0000 C CNN
F 1 "R" V 3150 5350 50  0000 C CNN
F 2 "" V 3080 5350 50  0001 C CNN
F 3 "" H 3150 5350 50  0001 C CNN
	1    3150 5350
	1    0    0    -1  
$EndComp
Wire Wire Line
	3150 5050 3150 5200
$Comp
L D_Schottky D?
U 1 1 59F32100
P 9300 2100
F 0 "D?" H 9300 2200 50  0000 C CNN
F 1 "D_Schottky" H 9300 2000 50  0000 C CNN
F 2 "" H 9300 2100 50  0001 C CNN
F 3 "" H 9300 2100 50  0001 C CNN
	1    9300 2100
	-1   0    0    1   
$EndComp
Wire Wire Line
	9450 2100 9950 2100
Wire Wire Line
	9150 2100 9000 2100
$Comp
L NPN Q?
U 1 1 59F329D6
P 10500 4150
F 0 "Q?" H 10400 4200 50  0000 R CNN
F 1 "NPN" H 10450 4300 50  0000 R CNN
F 2 "" H 10700 4250 29  0000 C CNN
F 3 "" H 10500 4150 60  0000 C CNN
	1    10500 4150
	1    0    0    -1  
$EndComp
Wire Wire Line
	9600 3700 9600 4050
Wire Wire Line
	10600 3650 10600 3950
Wire Wire Line
	9600 3300 9600 3100
Wire Wire Line
	10600 3350 10600 3100
Wire Wire Line
	9600 4350 9600 4500
Wire Wire Line
	9600 4500 10600 4500
Wire Wire Line
	10600 4500 10600 4350
Wire Wire Line
	10600 3100 9600 3100
Text Label 10050 2950 0    39   ~ 0
HV_DC
Text Label 10000 4500 0    39   ~ 0
HV_GND
Connection ~ 10050 2950
$Comp
L GND #PWR?
U 1 1 59F3329B
P 10100 5000
F 0 "#PWR?" H 10100 4750 50  0001 C CNN
F 1 "GND" H 10100 4850 50  0000 C CNN
F 2 "" H 10100 5000 50  0001 C CNN
F 3 "" H 10100 5000 50  0001 C CNN
	1    10100 5000
	1    0    0    -1  
$EndComp
Wire Wire Line
	10100 4500 10100 4700
Connection ~ 10100 4500
Wire Wire Line
	10050 3100 10050 2950
Connection ~ 10050 3100
Wire Wire Line
	10100 4900 10100 5000
$Comp
L R_Small R?
U 1 1 59F33AD1
P 8700 3750
F 0 "R?" H 8730 3770 50  0000 L CNN
F 1 "RSENSE" H 8730 3710 50  0000 L CNN
F 2 "" H 8700 3750 50  0001 C CNN
F 3 "" H 8700 3750 50  0001 C CNN
	1    8700 3750
	1    0    0    -1  
$EndComp
$Comp
L D_Schottky D?
U 1 1 59F34C6F
P 8000 5500
F 0 "D?" H 8000 5600 50  0000 C CNN
F 1 "D_Schottky" H 8000 5400 50  0000 C CNN
F 2 "" H 8000 5500 50  0001 C CNN
F 3 "" H 8000 5500 50  0001 C CNN
	1    8000 5500
	0    1    1    0   
$EndComp
$Comp
L R_Small R?
U 1 1 59F34C75
P 8500 6100
F 0 "R?" H 8530 6120 50  0000 L CNN
F 1 "RSENSE" H 8530 6060 50  0000 L CNN
F 2 "" H 8500 6100 50  0001 C CNN
F 3 "" H 8500 6100 50  0001 C CNN
	1    8500 6100
	1    0    0    -1  
$EndComp
$Comp
L D_Schottky D?
U 1 1 59F34C81
P 9000 4800
F 0 "D?" H 9000 4900 50  0000 C CNN
F 1 "D_Schottky" H 9000 4700 50  0000 C CNN
F 2 "" H 9000 4800 50  0001 C CNN
F 3 "" H 9000 4800 50  0001 C CNN
	1    9000 4800
	0    1    1    0   
$EndComp
Wire Wire Line
	8000 4900 8000 5350
Wire Wire Line
	9000 4950 9000 5300
Wire Wire Line
	9000 4650 9000 4400
Wire Wire Line
	8000 5650 8000 5800
Wire Wire Line
	8000 5800 9000 5800
Wire Wire Line
	9000 5800 9000 5550
Wire Wire Line
	9000 4400 8000 4400
Text Label 8450 4250 0    39   ~ 0
HV_DC
Text Label 8400 5800 0    39   ~ 0
HV_GND
Connection ~ 8450 4250
$Comp
L GND #PWR?
U 1 1 59F34C98
P 8500 6300
F 0 "#PWR?" H 8500 6050 50  0001 C CNN
F 1 "GND" H 8500 6150 50  0000 C CNN
F 2 "" H 8500 6300 50  0001 C CNN
F 3 "" H 8500 6300 50  0001 C CNN
	1    8500 6300
	1    0    0    -1  
$EndComp
Wire Wire Line
	8500 5800 8500 6000
Connection ~ 8500 5800
Wire Wire Line
	8450 4400 8450 4250
Connection ~ 8450 4400
Wire Wire Line
	8500 6200 8500 6300
$Comp
L TRANSISTOR-N-MOSFET-ENHANCEMENT_RevE_Date15jun2010 T?
U 1 1 59F34DFF
P 7850 4750
F 0 "T?" H 8100 4775 50  0000 C CNN
F 1 "N-MOSFET" H 8250 4700 50  0000 C CNN
F 2 "" H 7850 4750 50  0000 C CNN
F 3 "" H 7850 4750 50  0000 C CNN
	1    7850 4750
	1    0    0    -1  
$EndComp
$Comp
L TRANSISTOR-N-MOSFET-ENHANCEMENT_RevE_Date15jun2010 T?
U 1 1 59F34EB7
P 8850 5400
F 0 "T?" H 9100 5425 50  0000 C CNN
F 1 "N-MOSFET" H 9250 5350 50  0000 C CNN
F 2 "" H 8850 5400 50  0000 C CNN
F 3 "" H 8850 5400 50  0000 C CNN
	1    8850 5400
	1    0    0    -1  
$EndComp
Wire Wire Line
	8000 4400 8000 4650
Wire Wire Line
	8600 1900 8400 1900
Wire Wire Line
	8600 2300 8400 2300
Connection ~ 8400 1900
Connection ~ 8400 2300
Text Label 8400 1900 0    39   ~ 0
COIL_P
Text Label 8400 2300 0    39   ~ 0
COIL_N
Wire Wire Line
	8000 5150 8100 5150
Connection ~ 8000 5150
Wire Wire Line
	9000 5100 8900 5100
Connection ~ 9000 5100
Connection ~ 8900 5100
Connection ~ 8100 5150
Text Label 8050 5150 0    39   ~ 0
COIL_P
Text Label 8750 5100 0    39   ~ 0
COIL_N
$EndSCHEMATC
