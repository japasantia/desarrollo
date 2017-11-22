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
LIBS:74xgxx
LIBS:ac-dc
LIBS:actel
LIBS:allegro
LIBS:Altera
LIBS:analog_devices
LIBS:battery_management
LIBS:bbd
LIBS:brooktre
LIBS:cmos_ieee
LIBS:dc-dc
LIBS:diode
LIBS:elec-unifil
LIBS:ESD_Protection
LIBS:ftdi
LIBS:gennum
LIBS:graphic
LIBS:hc11
LIBS:ir
LIBS:Lattice
LIBS:logo
LIBS:maxim
LIBS:mechanical
LIBS:microchip_dspic33dsc
LIBS:microchip_pic10mcu
LIBS:microchip_pic12mcu
LIBS:microchip_pic16mcu
LIBS:microchip_pic18mcu
LIBS:microchip_pic32mcu
LIBS:motor_drivers
LIBS:motors
LIBS:msp430
LIBS:nordicsemi
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
LIBS:ttl_ieee
LIBS:valves
LIBS:video
LIBS:wiznet
LIBS:Worldsemi
LIBS:Xicor
LIBS:zetex
LIBS:Zilog
LIBS:CenditBasic
LIBS:PowerSupply-cache
EELAYER 25 0
EELAYER END
$Descr A4 11693 8268
encoding utf-8
Sheet 6 6
Title ""
Date ""
Rev ""
Comp ""
Comment1 ""
Comment2 ""
Comment3 ""
Comment4 ""
$EndDescr
Text HLabel 1150 800  0    60   Input ~ 0
VAC_IN
Text HLabel 1150 1550 0    60   Input ~ 0
GROUND
Text HLabel 1150 1150 0    60   Input ~ 0
NEUTRAL
$Comp
L Earth_Protective #PWR?
U 1 1 59F26510
P 1300 1650
F 0 "#PWR?" H 1550 1400 50  0001 C CNN
F 1 "Earth_Protective" H 1750 1500 50  0001 C CNN
F 2 "" H 1300 1550 50  0001 C CNN
F 3 "" H 1300 1550 50  0001 C CNN
	1    1300 1650
	1    0    0    -1  
$EndComp
Wire Wire Line
	1150 1550 1300 1550
Wire Wire Line
	1300 1550 1300 1650
$Comp
L Earth #PWR?
U 1 1 59F26527
P 1300 1250
F 0 "#PWR?" H 1300 1000 50  0001 C CNN
F 1 "Earth" H 1300 1100 50  0001 C CNN
F 2 "" H 1300 1250 50  0001 C CNN
F 3 "" H 1300 1250 50  0001 C CNN
	1    1300 1250
	1    0    0    -1  
$EndComp
Wire Wire Line
	1150 1150 1300 1150
Wire Wire Line
	1300 1150 1300 1250
$Comp
L D_Bridge_-AA+ D?
U 1 1 59F26542
P 2150 1300
F 0 "D?" H 2100 1300 50  0000 L CNN
F 1 "D_Bridge_-AA+" H 2300 900 50  0000 L CNN
F 2 "" H 2150 1300 50  0001 C CNN
F 3 "" H 2150 1300 50  0001 C CNN
	1    2150 1300
	1    0    0    -1  
$EndComp
$Comp
L CP C?
U 1 1 59F2659C
P 3850 1250
F 0 "C?" H 3875 1350 50  0000 L CNN
F 1 "CP" H 3875 1150 50  0000 L CNN
F 2 "" H 3888 1100 50  0001 C CNN
F 3 "" H 3850 1250 50  0001 C CNN
	1    3850 1250
	1    0    0    -1  
$EndComp
$Comp
L C C?
U 1 1 59F265D9
P 4100 1250
F 0 "C?" H 4125 1350 50  0000 L CNN
F 1 "C" H 4125 1150 50  0000 L CNN
F 2 "" H 4138 1100 50  0001 C CNN
F 3 "" H 4100 1250 50  0001 C CNN
	1    4100 1250
	1    0    0    -1  
$EndComp
Text HLabel 4400 800  2    60   Input ~ 0
HV_DC
Text HLabel 4400 2050 2    60   Input ~ 0
HV_GND
Wire Wire Line
	1150 800  2150 800 
Wire Wire Line
	2150 800  2150 1000
$Comp
L Earth #PWR?
U 1 1 59F2691C
P 2150 1850
F 0 "#PWR?" H 2150 1600 50  0001 C CNN
F 1 "Earth" H 2150 1700 50  0001 C CNN
F 2 "" H 2150 1850 50  0001 C CNN
F 3 "" H 2150 1850 50  0001 C CNN
	1    2150 1850
	1    0    0    -1  
$EndComp
Wire Wire Line
	2150 1600 2150 1850
$Comp
L C_Small C?
U 1 1 59F269EF
P 2550 1100
F 0 "C?" H 2560 1170 50  0000 L CNN
F 1 "3.9nF" H 2560 1020 50  0000 L CNN
F 2 "" H 2550 1100 50  0001 C CNN
F 3 "" H 2550 1100 50  0001 C CNN
	1    2550 1100
	1    0    0    -1  
$EndComp
$Comp
L C_Small C?
U 1 1 59F26A32
P 1700 1100
F 0 "C?" H 1710 1170 50  0000 L CNN
F 1 "3.9nF" H 1710 1020 50  0000 L CNN
F 2 "" H 1700 1100 50  0001 C CNN
F 3 "" H 1700 1100 50  0001 C CNN
	1    1700 1100
	1    0    0    -1  
$EndComp
$Comp
L C_Small C?
U 1 1 59F26AA4
P 1700 1500
F 0 "C?" H 1710 1570 50  0000 L CNN
F 1 "3.9nF" H 1710 1420 50  0000 L CNN
F 2 "" H 1700 1500 50  0001 C CNN
F 3 "" H 1700 1500 50  0001 C CNN
	1    1700 1500
	1    0    0    -1  
$EndComp
$Comp
L C_Small C?
U 1 1 59F26AE4
P 2550 1500
F 0 "C?" H 2560 1570 50  0000 L CNN
F 1 "3.9nF" H 2560 1420 50  0000 L CNN
F 2 "" H 2550 1500 50  0001 C CNN
F 3 "" H 2550 1500 50  0001 C CNN
	1    2550 1500
	1    0    0    -1  
$EndComp
Wire Wire Line
	1500 1300 1850 1300
Wire Wire Line
	1700 1200 1700 1400
Connection ~ 1700 1300
Wire Wire Line
	2550 1200 2550 1400
Wire Wire Line
	2450 1300 2900 1300
Connection ~ 2550 1300
Wire Wire Line
	1700 1000 1700 950 
Wire Wire Line
	1700 950  2550 950 
Connection ~ 2150 950 
Wire Wire Line
	2550 950  2550 1000
Wire Wire Line
	2550 1700 2550 1600
Wire Wire Line
	1700 1700 2550 1700
Connection ~ 2150 1700
Wire Wire Line
	1700 1600 1700 1700
Wire Wire Line
	2900 1300 2900 800 
Wire Wire Line
	4100 800  4100 1100
Wire Wire Line
	1500 1300 1500 2050
Wire Wire Line
	4100 2050 4100 1400
Wire Wire Line
	3850 1400 3850 2150
Connection ~ 3850 2050
Wire Wire Line
	3850 1100 3850 800 
Connection ~ 3850 800 
$Comp
L Thermistor_NTC TH?
U 1 1 59F26F16
P 3250 800
F 0 "TH?" V 3075 800 50  0000 C CNN
F 1 "Thermistor_NTC" V 3375 800 50  0000 C CNN
F 2 "" H 3250 850 50  0001 C CNN
F 3 "" H 3250 850 50  0001 C CNN
	1    3250 800 
	0    -1   -1   0   
$EndComp
$Comp
L Earth #PWR?
U 1 1 59F27D96
P 1500 2050
F 0 "#PWR?" H 1500 1800 50  0001 C CNN
F 1 "Earth" H 1500 1900 50  0001 C CNN
F 2 "" H 1500 2050 50  0001 C CNN
F 3 "" H 1500 2050 50  0001 C CNN
	1    1500 2050
	1    0    0    -1  
$EndComp
$Comp
L Earth #PWR?
U 1 1 59F27DDB
P 3850 2150
F 0 "#PWR?" H 3850 1900 50  0001 C CNN
F 1 "Earth" H 3850 2000 50  0001 C CNN
F 2 "" H 3850 2150 50  0001 C CNN
F 3 "" H 3850 2150 50  0001 C CNN
	1    3850 2150
	1    0    0    -1  
$EndComp
Wire Wire Line
	3850 2050 4400 2050
Wire Wire Line
	2900 800  3100 800 
Connection ~ 4100 800 
Wire Wire Line
	3400 800  4400 800 
Connection ~ 4100 2050
$EndSCHEMATC
