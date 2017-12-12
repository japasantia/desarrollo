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
Sheet 2 6
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
L EMI_Filter_LL FL1
U 1 1 59F21E2B
P 6050 1900
F 0 "FL1" H 6050 2075 50  0000 C CNN
F 1 "EMI_Filter_LL" H 6050 1725 50  0000 C CNN
F 2 "" V 6050 1940 50  0000 C CNN
F 3 "" V 6050 1940 50  0000 C CNN
	1    6050 1900
	1    0    0    -1  
$EndComp
$Comp
L C C3
U 1 1 59F21EAF
P 4950 1900
F 0 "C3" H 4975 2000 50  0000 L CNN
F 1 "0.47uF" H 4975 1800 50  0000 L CNN
F 2 "" H 4988 1750 50  0001 C CNN
F 3 "" H 4950 1900 50  0001 C CNN
	1    4950 1900
	1    0    0    -1  
$EndComp
$Comp
L Fuse F1
U 1 1 59F21F42
P 2100 1400
F 0 "F1" V 2180 1400 50  0000 C CNN
F 1 "FUSE_SLOW_BLOWN" V 2025 1400 39  0000 C CNN
F 2 "" V 2030 1400 50  0001 C CNN
F 3 "" H 2100 1400 50  0001 C CNN
	1    2100 1400
	0    1    1    0   
$EndComp
Text HLabel 1650 1400 0    60   Input ~ 0
VAC_IN
Text HLabel 1650 1900 0    60   Input ~ 0
NEUTRAL
Text HLabel 1650 2250 0    60   Input ~ 0
GROUND
$Comp
L C C1
U 1 1 59F222E0
P 5300 1700
F 0 "C1" H 5325 1800 50  0000 L CNN
F 1 "2200pF@1000V" H 5350 1600 39  0000 L CNN
F 2 "" H 5338 1550 50  0001 C CNN
F 3 "" H 5300 1700 50  0001 C CNN
	1    5300 1700
	1    0    0    -1  
$EndComp
$Comp
L C C5
U 1 1 59F22333
P 5300 2200
F 0 "C5" H 5325 2300 50  0000 L CNN
F 1 "2200pF" H 5325 2100 50  0000 L CNN
F 2 "" H 5338 2050 50  0001 C CNN
F 3 "" H 5300 2200 50  0001 C CNN
	1    5300 2200
	1    0    0    -1  
$EndComp
$Comp
L Earth_Protective #PWR204
U 1 1 59F2243C
P 1850 2300
F 0 "#PWR204" H 2100 2050 50  0001 C CNN
F 1 "Earth_Protective" H 2300 2150 50  0001 C CNN
F 2 "" H 1850 2200 50  0001 C CNN
F 3 "" H 1850 2200 50  0001 C CNN
	1    1850 2300
	1    0    0    -1  
$EndComp
$Comp
L Earth #PWR201
U 1 1 59F2246E
P 1850 1950
F 0 "#PWR201" H 1850 1700 50  0001 C CNN
F 1 "Earth" H 1850 1800 50  0001 C CNN
F 2 "" H 1850 1950 50  0001 C CNN
F 3 "" H 1850 1950 50  0001 C CNN
	1    1850 1950
	1    0    0    -1  
$EndComp
$Comp
L C C4
U 1 1 59F22618
P 6650 1900
F 0 "C4" H 6675 2000 50  0000 L CNN
F 1 "0.22uF" H 6675 1800 50  0000 L CNN
F 2 "" H 6688 1750 50  0001 C CNN
F 3 "" H 6650 1900 50  0001 C CNN
	1    6650 1900
	1    0    0    -1  
$EndComp
$Comp
L C C2
U 1 1 59F2261E
P 7000 1700
F 0 "C2" H 7025 1800 50  0000 L CNN
F 1 "2200pF" H 7025 1600 50  0000 L CNN
F 2 "" H 7038 1550 50  0001 C CNN
F 3 "" H 7000 1700 50  0001 C CNN
	1    7000 1700
	1    0    0    -1  
$EndComp
$Comp
L C C6
U 1 1 59F22624
P 7000 2200
F 0 "C6" H 7025 2300 50  0000 L CNN
F 1 "2200pF" H 7025 2100 50  0000 L CNN
F 2 "" H 7038 2050 50  0001 C CNN
F 3 "" H 7000 2200 50  0001 C CNN
	1    7000 2200
	1    0    0    -1  
$EndComp
$Comp
L Earth #PWR205
U 1 1 59F229EB
P 4950 2650
F 0 "#PWR205" H 4950 2400 50  0001 C CNN
F 1 "Earth" H 4950 2500 50  0001 C CNN
F 2 "" H 4950 2650 50  0001 C CNN
F 3 "" H 4950 2650 50  0001 C CNN
	1    4950 2650
	1    0    0    -1  
$EndComp
$Comp
L Earth_Protective #PWR202
U 1 1 59F22A54
P 5600 2000
F 0 "#PWR202" H 5850 1750 50  0001 C CNN
F 1 "Earth_Protective" H 6050 1850 50  0001 C CNN
F 2 "" H 5600 1900 50  0001 C CNN
F 3 "" H 5600 1900 50  0001 C CNN
	1    5600 2000
	1    0    0    -1  
$EndComp
$Comp
L Earth_Protective #PWR203
U 1 1 59F22AB8
P 7300 2050
F 0 "#PWR203" H 7550 1800 50  0001 C CNN
F 1 "Earth_Protective" H 7750 1900 50  0001 C CNN
F 2 "" H 7300 1950 50  0001 C CNN
F 3 "" H 7300 1950 50  0001 C CNN
	1    7300 2050
	1    0    0    -1  
$EndComp
Wire Wire Line
	1650 1900 1850 1900
Wire Wire Line
	1850 1900 1850 1950
Wire Wire Line
	1650 2250 1850 2250
Wire Wire Line
	1850 2250 1850 2300
Wire Wire Line
	7000 1400 7000 1550
Wire Wire Line
	7000 1850 7000 2050
Wire Wire Line
	5300 1850 5300 2050
Wire Wire Line
	5300 1550 5300 1400
Connection ~ 5300 1400
Wire Wire Line
	4950 1750 4950 1400
Connection ~ 4950 1400
Wire Wire Line
	6650 1750 6650 1400
Connection ~ 6650 1400
Wire Wire Line
	7000 2550 7000 2350
Wire Wire Line
	4950 2050 4950 2650
Wire Wire Line
	5300 2550 5300 2350
Connection ~ 5300 2550
Connection ~ 4950 2550
Wire Wire Line
	5600 2000 5600 1950
Wire Wire Line
	5600 1950 5300 1950
Connection ~ 5300 1950
Wire Wire Line
	6650 2050 6650 2550
Connection ~ 6650 2550
Wire Wire Line
	7300 2050 7300 1950
Wire Wire Line
	7300 1950 7000 1950
Connection ~ 7000 1950
Wire Wire Line
	5850 1800 5800 1800
Wire Wire Line
	5800 1800 5800 1400
Connection ~ 5800 1400
Wire Wire Line
	6400 2550 7000 2550
Wire Wire Line
	5800 2550 5800 2000
Wire Wire Line
	5800 2000 5850 2000
Wire Wire Line
	6250 2000 6400 2000
Wire Wire Line
	6400 2000 6400 2550
Wire Wire Line
	6300 1400 7000 1400
Wire Wire Line
	6300 1400 6300 1800
Wire Wire Line
	6300 1800 6250 1800
$Comp
L Varistor RV1
U 1 1 59F22F6A
P 4700 1400
F 0 "RV1" V 4825 1400 50  0000 C CNN
F 1 "NTC" V 4575 1400 50  0000 C CNN
F 2 "" V 4630 1400 50  0001 C CNN
F 3 "" H 4700 1400 50  0001 C CNN
	1    4700 1400
	0    1    1    0   
$EndComp
$Comp
L D_TVS D2
U 1 1 59F232D8
P 4400 1950
F 0 "D2" H 4400 2050 50  0000 C CNN
F 1 "D_TVS" H 4400 1850 50  0000 C CNN
F 2 "" H 4400 1950 50  0001 C CNN
F 3 "" H 4400 1950 50  0001 C CNN
	1    4400 1950
	0    1    1    0   
$EndComp
Wire Wire Line
	5800 1400 4850 1400
Wire Wire Line
	4000 1400 4550 1400
Wire Wire Line
	4400 1800 4400 1400
Connection ~ 4400 1400
Wire Wire Line
	4400 2100 4400 2550
Wire Wire Line
	4400 2550 5800 2550
$Comp
L Q_TRIAC_AAG D1
U 1 1 59F23CBA
P 2650 1400
F 0 "D1" V 2900 1350 50  0000 L CNN
F 1 "Q_TRIAC_AAG" V 2800 1150 50  0000 L CNN
F 2 "" V 2725 1425 50  0001 C CNN
F 3 "" V 2650 1400 50  0001 C CNN
	1    2650 1400
	0    -1   -1   0   
$EndComp
$Comp
L RELAY-2XCHANGE_DPDT_RevE_Date15jun2010 K1
U 1 1 59F23D7B
P 3350 2000
F 0 "K1" H 3345 2305 50  0000 C CNN
F 1 "RELAY_DPDT" V 2700 2000 50  0000 C CNN
F 2 "" H 3350 2000 50  0000 C CNN
F 3 "" H 3350 2000 50  0000 C CNN
	1    3350 2000
	0    -1   -1   0   
$EndComp
$Comp
L R_Shunt R1
U 1 1 59F24327
P 3800 1400
F 0 "R1" V 3625 1400 50  0000 C CNN
F 1 "R_SENSE" V 3700 1400 50  0000 C CNN
F 2 "" V 3730 1400 50  0001 C CNN
F 3 "" H 3800 1400 50  0001 C CNN
	1    3800 1400
	0    -1   -1   0   
$EndComp
Wire Wire Line
	2250 1400 2500 1400
Wire Wire Line
	2800 1400 3100 1400
Wire Wire Line
	3550 1550 3500 1550
Wire Wire Line
	3600 1400 3550 1400
Wire Wire Line
	3550 1400 3550 1550
Wire Wire Line
	1650 1400 1950 1400
$EndSCHEMATC
