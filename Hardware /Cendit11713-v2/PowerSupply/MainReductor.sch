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
P 2450 1800
F 0 "U?" H 2450 2650 50  0000 L BNN
F 1 "TL494CD" H 2300 600 50  0000 L BNN
F 2 "SOIC127P600X175-16N" H 2450 1800 50  0001 L BNN
F 3 "SOIC-16 Texas Instruments" H 2450 1800 50  0001 L BNN
F 4 "Texas Instruments" H 2450 1800 50  0001 L BNN "MF"
F 5 "Good" H 2450 1800 50  0001 L BNN "Availability"
F 6 "DC-DC converter%3B PWM controller%3B Uin%3A -0.3%C3%B738V%3B Uout%3A 40V%3B 250mA" H 2450 1800 50  0001 L BNN "Description"
F 7 "TL494CD" H 2450 1800 50  0001 L BNN "MP"
F 8 "0.45 USD" H 2450 1800 50  0001 L BNN "Price"
	1    2450 1800
	1    0    0    -1  
$EndComp
Text HLabel 1050 650  0    60   Input ~ 0
HV_DC
Text HLabel 1050 800  0    60   Input ~ 0
HV_GND
$Comp
L D_Zener D?
U 1 1 59F29F10
P 1050 6300
F 0 "D?" H 1050 6400 50  0000 C CNN
F 1 "20V@1W" H 1050 6200 50  0000 C CNN
F 2 "" H 1050 6300 50  0001 C CNN
F 3 "" H 1050 6300 50  0001 C CNN
	1    1050 6300
	0    1    1    0   
$EndComp
$Comp
L R R?
U 1 1 59F2A0F4
P 1050 5850
F 0 "R?" V 1130 5850 50  0000 C CNN
F 1 "R" V 1050 5850 50  0000 C CNN
F 2 "" V 980 5850 50  0001 C CNN
F 3 "" H 1050 5850 50  0001 C CNN
	1    1050 5850
	1    0    0    -1  
$EndComp
$Comp
L C C?
U 1 1 59F2A3F9
P 6850 5150
F 0 "C?" H 6875 5250 50  0000 L CNN
F 1 "C" H 6875 5050 50  0000 L CNN
F 2 "" H 6888 5000 50  0001 C CNN
F 3 "" H 6850 5150 50  0001 C CNN
	1    6850 5150
	1    0    0    -1  
$EndComp
$Comp
L R R?
U 1 1 59F2A92C
P 1250 5400
F 0 "R?" V 1330 5400 50  0000 C CNN
F 1 "R" V 1250 5400 50  0000 C CNN
F 2 "" V 1180 5400 50  0001 C CNN
F 3 "" H 1250 5400 50  0001 C CNN
	1    1250 5400
	0    1    1    0   
$EndComp
$Comp
L R R?
U 1 1 59F2A9A8
P 1250 5200
F 0 "R?" V 1330 5200 50  0000 C CNN
F 1 "R" V 1250 5200 50  0000 C CNN
F 2 "" V 1180 5200 50  0001 C CNN
F 3 "" H 1250 5200 50  0001 C CNN
	1    1250 5200
	0    1    1    0   
$EndComp
$Comp
L R_Small R?
U 1 1 59F2B16A
P 7350 4950
F 0 "R?" V 7450 4900 50  0000 L CNN
F 1 "R_Small" V 7550 4900 50  0000 L CNN
F 2 "" H 7350 4950 50  0001 C CNN
F 3 "" H 7350 4950 50  0001 C CNN
	1    7350 4950
	0    1    1    0   
$EndComp
$Comp
L CP C?
U 1 1 59F2BA9F
P 7100 5150
F 0 "C?" H 7125 5250 50  0000 L CNN
F 1 "CP" H 7125 5050 50  0000 L CNN
F 2 "" H 7138 5000 50  0001 C CNN
F 3 "" H 7100 5150 50  0001 C CNN
	1    7100 5150
	1    0    0    -1  
$EndComp
Wire Wire Line
	7600 4950 7450 4950
Wire Wire Line
	6600 4950 7250 4950
Wire Wire Line
	6850 4950 6850 5000
Wire Wire Line
	7100 5000 7100 4950
Connection ~ 7100 4950
$Comp
L GND #PWR?
U 1 1 59F2BC50
P 6850 5400
F 0 "#PWR?" H 6850 5150 50  0001 C CNN
F 1 "GND" H 6850 5250 50  0000 C CNN
F 2 "" H 6850 5400 50  0001 C CNN
F 3 "" H 6850 5400 50  0001 C CNN
	1    6850 5400
	1    0    0    -1  
$EndComp
Wire Wire Line
	6850 5300 6850 5400
Wire Wire Line
	7100 5300 7100 5350
Wire Wire Line
	7100 5350 6850 5350
Connection ~ 6850 5350
$Comp
L R R?
U 1 1 59F2BDCF
P 1250 5000
F 0 "R?" V 1330 5000 50  0000 C CNN
F 1 "R" V 1250 5000 50  0000 C CNN
F 2 "" V 1180 5000 50  0001 C CNN
F 3 "" H 1250 5000 50  0001 C CNN
	1    1250 5000
	0    1    1    0   
$EndComp
Wire Wire Line
	1050 650  1350 650 
Text Label 1150 650  0    39   ~ 0
HV_DC
Wire Wire Line
	1050 5550 1050 5700
Wire Wire Line
	1050 6000 1050 6150
Wire Wire Line
	1050 800  1350 800 
$Comp
L D D?
U 1 1 59F2C35C
P 1400 6050
F 0 "D?" H 1400 6150 50  0000 C CNN
F 1 "D" H 1400 5950 50  0000 C CNN
F 2 "" H 1400 6050 50  0001 C CNN
F 3 "" H 1400 6050 50  0001 C CNN
	1    1400 6050
	-1   0    0    1   
$EndComp
Wire Wire Line
	750  6050 1250 6050
Connection ~ 1050 6050
Wire Wire Line
	1550 6050 1900 6050
Text Label 1000 4900 0    39   ~ 0
HV_VDC
$Comp
L R R?
U 1 1 59F2D178
P 6600 5400
F 0 "R?" V 6680 5400 50  0000 C CNN
F 1 "R" V 6600 5400 50  0000 C CNN
F 2 "" V 6530 5400 50  0001 C CNN
F 3 "" H 6600 5400 50  0001 C CNN
	1    6600 5400
	1    0    0    -1  
$EndComp
Wire Wire Line
	6600 4950 6600 5250
Connection ~ 6850 4950
Wire Wire Line
	6600 5550 6600 5700
Wire Wire Line
	6600 6000 6600 6100
$Comp
L R_Small R?
U 1 1 59F2E4FD
P 7150 4400
F 0 "R?" H 7180 4420 50  0000 L CNN
F 1 "RSENSE" H 7180 4360 50  0000 L CNN
F 2 "" H 7150 4400 50  0001 C CNN
F 3 "" H 7150 4400 50  0001 C CNN
	1    7150 4400
	1    0    0    -1  
$EndComp
$Comp
L CP C?
U 1 1 59F2F783
P 8850 1400
F 0 "C?" H 8875 1500 50  0000 L CNN
F 1 "CP" H 8875 1300 50  0000 L CNN
F 2 "" H 8888 1250 50  0001 C CNN
F 3 "" H 8850 1400 50  0001 C CNN
	1    8850 1400
	1    0    0    -1  
$EndComp
$Comp
L C C?
U 1 1 59F2F7E8
P 9150 1400
F 0 "C?" H 9175 1500 50  0000 L CNN
F 1 "C" H 9175 1300 50  0000 L CNN
F 2 "" H 9188 1250 50  0001 C CNN
F 3 "" H 9150 1400 50  0001 C CNN
	1    9150 1400
	1    0    0    -1  
$EndComp
Wire Wire Line
	9150 1150 9150 1250
Wire Wire Line
	8850 1250 8850 1150
Connection ~ 8850 1150
$Comp
L GNDPWR #PWR?
U 1 1 59F30BDD
P 9150 1700
F 0 "#PWR?" H 9150 1500 50  0001 C CNN
F 1 "GNDPWR" H 9150 1570 50  0000 C CNN
F 2 "" H 9150 1650 50  0001 C CNN
F 3 "" H 9150 1650 50  0001 C CNN
	1    9150 1700
	1    0    0    -1  
$EndComp
Wire Wire Line
	9150 1700 9150 1550
Wire Wire Line
	8850 1550 8850 1650
Wire Wire Line
	8850 1650 9150 1650
Connection ~ 9150 1650
$Comp
L R R?
U 1 1 59F31E16
P 750 6350
F 0 "R?" V 830 6350 50  0000 C CNN
F 1 "R" V 750 6350 50  0000 C CNN
F 2 "" V 680 6350 50  0001 C CNN
F 3 "" H 750 6350 50  0001 C CNN
	1    750  6350
	1    0    0    -1  
$EndComp
Wire Wire Line
	750  6050 750  6200
Wire Wire Line
	6450 2400 6450 2850
Wire Wire Line
	7800 4050 7800 3900
Text Label 6450 2450 0    39   ~ 0
HV_DC
Wire Wire Line
	7150 4500 7150 4700
Wire Wire Line
	5850 1050 5600 1050
Wire Wire Line
	5850 1450 5600 1450
$Comp
L PA1297NL T1
U 1 1 5A156C9D
P 6250 1250
F 0 "T1" H 6250 1500 50  0000 C CNN
F 1 "PA1297NL" H 6250 500 50  0000 C CNN
F 2 "" H 6250 1250 50  0000 C CNN
F 3 "" H 6250 1250 50  0000 C CNN
	1    6250 1250
	1    0    0    -1  
$EndComp
Wire Wire Line
	5850 1550 5600 1550
Wire Wire Line
	5850 1950 5600 1950
Text Label 5600 1050 0    39   ~ 0
TR_PRI_P
Text Label 5600 1450 0    39   ~ 0
TR_PRI_N
Text Label 5600 1550 0    39   ~ 0
TR_SEN_P
Text Label 5600 1950 0    39   ~ 0
TR_SEN_N
Wire Wire Line
	6650 1050 7050 1050
Wire Wire Line
	6650 1450 7000 1450
Text Label 6700 1050 0    39   ~ 0
TR_SEC_P
Text Label 6700 1450 0    39   ~ 0
TR_SEC_N
$Comp
L Jumper_NC_Dual JP?
U 1 1 5A15A7A0
P 6800 3050
F 0 "JP?" H 6850 2950 50  0000 L CNN
F 1 "Jumper_NC_Dual" H 6800 3150 50  0000 C BNN
F 2 "" H 6800 3050 50  0000 C CNN
F 3 "" H 6800 3050 50  0000 C CNN
	1    6800 3050
	0    -1   1    0   
$EndComp
Wire Wire Line
	6450 3450 6800 3450
Wire Wire Line
	6800 3450 6800 3300
Connection ~ 6450 3450
Wire Wire Line
	6800 2800 6800 2600
Wire Wire Line
	6450 2600 7550 2600
Connection ~ 6450 2600
$Comp
L Jumper_NC_Dual JP?
U 1 1 5A15B0FE
P 7800 2600
F 0 "JP?" H 7850 2500 50  0000 L CNN
F 1 "Jumper_NC_Dual" H 7800 2700 50  0000 C BNN
F 2 "" H 7800 2600 50  0000 C CNN
F 3 "" H 7800 2600 50  0000 C CNN
	1    7800 2600
	-1   0    0    -1  
$EndComp
Connection ~ 6800 2600
Wire Wire Line
	8050 2600 8400 2600
Text Label 8250 2600 0    39   ~ 0
SNUBBER
Wire Wire Line
	6900 3050 7150 3050
Text Label 7000 3050 0    39   ~ 0
TR_PRI_P
Wire Wire Line
	7800 3350 8200 3350
Connection ~ 7800 3350
Text Label 7950 3350 0    39   ~ 0
TR_PRI_N
Wire Wire Line
	6450 4050 7800 4050
$Comp
L Earth #PWR?
U 1 1 5A15E7B3
P 7150 4700
F 0 "#PWR?" H 7150 4450 50  0001 C CNN
F 1 "Earth" H 7150 4550 50  0001 C CNN
F 2 "" H 7150 4700 50  0000 C CNN
F 3 "" H 7150 4700 50  0000 C CNN
F 4 "HV_GND" H 7150 4700 60  0001 C CNN "GND_TYPE"
	1    7150 4700
	1    0    0    -1  
$EndComp
Wire Wire Line
	7150 4300 7150 4050
Connection ~ 7150 4050
$Comp
L C C?
U 1 1 5A160342
P 9000 3000
F 0 "C?" H 9025 3100 50  0000 L CNN
F 1 "C" H 9025 2900 50  0000 L CNN
F 2 "" H 9038 2850 50  0001 C CNN
F 3 "" H 9000 3000 50  0001 C CNN
	1    9000 3000
	1    0    0    -1  
$EndComp
$Comp
L R R?
U 1 1 5A16040C
P 9300 3000
F 0 "R?" H 9400 2950 50  0000 C CNN
F 1 "R" H 9400 3050 50  0000 C CNN
F 2 "" V 9230 3000 50  0001 C CNN
F 3 "" H 9300 3000 50  0001 C CNN
	1    9300 3000
	1    0    0    -1  
$EndComp
Wire Wire Line
	9300 3150 9300 3300
Wire Wire Line
	9300 3300 9000 3300
Wire Wire Line
	9000 3300 9000 3150
Wire Wire Line
	9000 2850 9000 2600
Wire Wire Line
	9000 2600 9300 2600
Wire Wire Line
	9300 2600 9300 2850
Wire Wire Line
	9150 2600 9150 2400
Connection ~ 9150 2600
Text Label 9150 2500 0    39   ~ 0
HV_DC
Wire Wire Line
	9150 3300 9150 3500
Wire Wire Line
	9150 3500 8400 3500
Wire Wire Line
	8400 3500 8400 2600
Connection ~ 9150 3300
$Comp
L D_Schottky_x2_KCom_AKA D?
U 1 1 5A161149
P 7900 1150
F 0 "D?" H 7950 1050 50  0000 C CNN
F 1 "MBRD10200CT" H 7900 1250 50  0000 C CNN
F 2 "" H 7900 1150 50  0000 C CNN
F 3 "" H 7900 1150 50  0000 C CNN
	1    7900 1150
	0    -1   1    0   
$EndComp
$Comp
L D_Schottky_AKA D?
U 1 1 5A161B49
P 7800 3000
F 0 "D?" H 7800 3100 50  0000 C CNN
F 1 "DURD560A" H 7800 2900 50  0000 C CNN
F 2 "" H 7800 3000 50  0000 C CNN
F 3 "" H 7800 3000 50  0000 C CNN
	1    7800 3000
	0    1    1    0   
$EndComp
Wire Wire Line
	7800 3200 7800 3500
Wire Wire Line
	7900 3200 7900 3350
Connection ~ 7900 3350
Wire Wire Line
	7800 2850 7800 2700
$Comp
L D_Schottky_AKA D?
U 1 1 5A1648BF
P 6450 3750
F 0 "D?" H 6450 3850 50  0000 C CNN
F 1 "DURD560A" H 6450 3650 50  0000 C CNN
F 2 "" H 6450 3750 50  0000 C CNN
F 3 "" H 6450 3750 50  0000 C CNN
	1    6450 3750
	0    1    1    0   
$EndComp
Wire Wire Line
	6450 4050 6450 3950
Wire Wire Line
	6550 4050 6550 3950
Connection ~ 6550 4050
Wire Wire Line
	6450 3600 6450 3250
$Comp
L L_Core_Ferrite L?
U 1 1 5A16C386
P 8450 1150
F 0 "L?" V 8400 1150 50  0000 C CNN
F 1 "L_Core_Ferrite" V 8560 1150 50  0000 C CNN
F 2 "" H 8450 1150 50  0000 C CNN
F 3 "" H 8450 1150 50  0000 C CNN
	1    8450 1150
	0    -1   -1   0   
$EndComp
Wire Wire Line
	7900 1450 7900 1700
Wire Wire Line
	9150 1150 8600 1150
Wire Wire Line
	8300 1150 8100 1150
$Comp
L GNDPWR #PWR?
U 1 1 59F2EE77
P 7900 1700
F 0 "#PWR?" H 7900 1500 50  0001 C CNN
F 1 "GNDPWR" H 7900 1570 50  0000 C CNN
F 2 "" H 7900 1650 50  0001 C CNN
F 3 "" H 7900 1650 50  0001 C CNN
	1    7900 1700
	1    0    0    -1  
$EndComp
$Comp
L Jumper_NO_Small JP?
U 1 1 5A16CDF7
P 7200 1150
F 0 "JP?" H 7200 1230 50  0000 C CNN
F 1 "XCHG" H 7210 1090 50  0000 C CNN
F 2 "" H 7200 1150 50  0000 C CNN
F 3 "" H 7200 1150 50  0000 C CNN
	1    7200 1150
	1    0    0    -1  
$EndComp
$Comp
L Jumper_NO_Small JP?
U 1 1 5A16CEAA
P 7200 1350
F 0 "JP?" H 7200 1430 50  0000 C CNN
F 1 "XCHG" H 7210 1290 50  0000 C CNN
F 2 "" H 7200 1350 50  0000 C CNN
F 3 "" H 7200 1350 50  0000 C CNN
	1    7200 1350
	1    0    0    -1  
$EndComp
Wire Wire Line
	7050 1050 7050 1150
Wire Wire Line
	7050 1150 7100 1150
Wire Wire Line
	7100 1350 7000 1350
Wire Wire Line
	7000 1350 7000 1450
Wire Wire Line
	7300 1350 7500 1350
Wire Wire Line
	7500 1350 7500 1650
Wire Wire Line
	7500 1650 7900 1650
Connection ~ 7900 1650
Wire Wire Line
	7300 1150 7500 1150
Wire Wire Line
	7500 1150 7500 750 
Wire Wire Line
	7500 750  7900 750 
Wire Wire Line
	7900 750  7900 850 
$Comp
L D_Schottky_AKA D?
U 1 1 5A172BCC
P 7750 4950
F 0 "D?" H 7750 5050 50  0000 C CNN
F 1 "DURD560A" H 7750 4850 50  0000 C CNN
F 2 "" H 7750 4950 50  0000 C CNN
F 3 "" H 7750 4950 50  0000 C CNN
	1    7750 4950
	1    0    0    -1  
$EndComp
Wire Wire Line
	7950 4850 8050 4850
Wire Wire Line
	8050 4850 8050 4950
Connection ~ 8050 4950
Wire Wire Line
	7950 4950 8300 4950
Text Label 8150 4950 0    39   ~ 0
TR_SEN_P
$Comp
L Earth #PWR?
U 1 1 5A174E0A
P 8100 5400
F 0 "#PWR?" H 8100 5150 50  0001 C CNN
F 1 "Earth" H 8100 5250 50  0001 C CNN
F 2 "" H 8100 5400 50  0000 C CNN
F 3 "" H 8100 5400 50  0000 C CNN
F 4 "HV_GND" H 8100 5400 60  0001 C CNN "GND_TYPE"
	1    8100 5400
	1    0    0    -1  
$EndComp
$Comp
L R R?
U 1 1 59F2D3D0
P 6600 5850
F 0 "R?" V 6680 5850 50  0000 C CNN
F 1 "R" V 6600 5850 50  0000 C CNN
F 2 "" V 6530 5850 50  0001 C CNN
F 3 "" H 6600 5850 50  0001 C CNN
	1    6600 5850
	1    0    0    -1  
$EndComp
$Comp
L Earth #PWR?
U 1 1 5A175081
P 6600 6100
F 0 "#PWR?" H 6600 5850 50  0001 C CNN
F 1 "Earth" H 6600 5950 50  0001 C CNN
F 2 "" H 6600 6100 50  0000 C CNN
F 3 "" H 6600 6100 50  0000 C CNN
F 4 "HV_GND" H 6600 6100 60  0001 C CNN "GND_TYPE"
	1    6600 6100
	1    0    0    -1  
$EndComp
Wire Wire Line
	8100 5400 8100 5300
Wire Wire Line
	8100 5300 8300 5300
Text Label 8150 5300 0    39   ~ 0
TR_SEN_N
$Comp
L Earth #PWR?
U 1 1 5A17CE26
P 1450 2800
F 0 "#PWR?" H 1450 2550 50  0001 C CNN
F 1 "Earth" H 1450 2650 50  0001 C CNN
F 2 "" H 1450 2800 50  0000 C CNN
F 3 "" H 1450 2800 50  0000 C CNN
F 4 "HV_GND" H 1450 2800 60  0001 C CNN "GND_TYPE"
	1    1450 2800
	1    0    0    -1  
$EndComp
$Comp
L Earth #PWR?
U 1 1 5A17D19D
P 1350 850
F 0 "#PWR?" H 1350 600 50  0001 C CNN
F 1 "Earth" H 1350 700 50  0001 C CNN
F 2 "" H 1350 850 50  0000 C CNN
F 3 "" H 1350 850 50  0000 C CNN
F 4 "HV_GND" H 1350 850 60  0001 C CNN "GND_TYPE"
	1    1350 850 
	1    0    0    -1  
$EndComp
Wire Wire Line
	1350 800  1350 850 
$Comp
L Q_NPN_BCE Q?
U 1 1 5A183C42
P 6350 3050
F 0 "Q?" H 6250 3300 50  0000 L CNN
F 1 "13003" H 6100 3200 50  0000 L CNN
F 2 "" H 6550 3150 50  0000 C CNN
F 3 "" H 6350 3050 50  0000 C CNN
	1    6350 3050
	1    0    0    -1  
$EndComp
$Comp
L Q_NPN_BCE Q?
U 1 1 5A183D2C
P 7700 3700
F 0 "Q?" H 7900 3750 50  0000 L CNN
F 1 "13003" H 7900 3650 50  0000 L CNN
F 2 "" H 7900 3800 50  0000 C CNN
F 3 "" H 7700 3700 50  0000 C CNN
	1    7700 3700
	1    0    0    -1  
$EndComp
$Comp
L Earth #PWR?
U 1 1 5A185DB9
P 1050 6700
F 0 "#PWR?" H 1050 6450 50  0001 C CNN
F 1 "Earth" H 1050 6550 50  0001 C CNN
F 2 "" H 1050 6700 50  0000 C CNN
F 3 "" H 1050 6700 50  0000 C CNN
F 4 "HV_GND" H 1050 6700 60  0001 C CNN "GND_TYPE"
	1    1050 6700
	1    0    0    -1  
$EndComp
Wire Wire Line
	1050 6450 1050 6700
Wire Wire Line
	750  6500 750  6600
Wire Wire Line
	750  6600 1050 6600
Connection ~ 1050 6600
Text Label 1650 6050 0    39   ~ 0
VCC
Wire Wire Line
	1550 1200 1300 1200
Text Label 1300 1200 0    39   ~ 0
VCC
Wire Wire Line
	1450 2800 1450 2700
Wire Wire Line
	1450 2700 1550 2700
Wire Wire Line
	6600 5650 6300 5650
Connection ~ 6600 5650
$Comp
L R_Small R?
U 1 1 5A18DD07
P 1350 2000
F 0 "R?" V 1450 1650 50  0000 L CNN
F 1 "R_Small" V 1450 1800 50  0000 L CNN
F 2 "" H 1350 2000 50  0001 C CNN
F 3 "" H 1350 2000 50  0001 C CNN
	1    1350 2000
	0    1    1    0   
$EndComp
$Comp
L C_Small C?
U 1 1 5A18F02E
P 1150 1900
F 0 "C?" V 1000 1700 50  0000 L CNN
F 1 "C_Small" V 1000 1850 50  0000 L CNN
F 2 "" H 1150 1900 50  0000 C CNN
F 3 "" H 1150 1900 50  0000 C CNN
	1    1150 1900
	0    1    1    0   
$EndComp
Wire Wire Line
	1550 1900 1250 1900
Wire Wire Line
	1450 2000 1550 2000
Wire Wire Line
	1050 1900 900  1900
Wire Wire Line
	900  1900 900  2250
Wire Wire Line
	1250 2000 900  2000
Connection ~ 900  2000
Wire Wire Line
	1550 2300 1300 2300
Text Label 1300 2300 0    39   ~ 0
VREF_5V
Wire Wire Line
	1550 2400 1300 2400
Text Label 1300 2400 0    39   ~ 0
DEAD_TIME
$Comp
L R R?
U 1 1 5A195784
P 1500 4200
F 0 "R?" H 1350 4250 50  0000 C CNN
F 1 "R" H 1400 4150 50  0000 C CNN
F 2 "" V 1430 4200 50  0001 C CNN
F 3 "" H 1500 4200 50  0001 C CNN
	1    1500 4200
	-1   0    0    1   
$EndComp
$Comp
L C C?
U 1 1 5A196C01
P 1500 3800
F 0 "C?" H 1525 3900 50  0000 L CNN
F 1 "C" H 1525 3700 50  0000 L CNN
F 2 "" H 1538 3650 50  0001 C CNN
F 3 "" H 1500 3800 50  0001 C CNN
	1    1500 3800
	1    0    0    -1  
$EndComp
Wire Wire Line
	1500 4350 1500 4450
$Comp
L Earth #PWR?
U 1 1 5A19782A
P 1500 4450
F 0 "#PWR?" H 1500 4200 50  0001 C CNN
F 1 "Earth" H 1500 4300 50  0001 C CNN
F 2 "" H 1500 4450 50  0000 C CNN
F 3 "" H 1500 4450 50  0000 C CNN
F 4 "HV_GND" H 1500 4450 60  0001 C CNN "GND_TYPE"
	1    1500 4450
	1    0    0    -1  
$EndComp
Wire Wire Line
	1500 4050 1500 3950
Wire Wire Line
	1500 3650 1500 3450
Text Label 1500 3500 0    39   ~ 0
VREF_5V
Wire Wire Line
	1500 4000 1750 4000
Connection ~ 1500 4000
Text Label 1650 4000 0    39   ~ 0
DEAD_TIME
Text Label 6300 5650 0    39   ~ 0
V_SENSE
Wire Wire Line
	1550 1400 1300 1400
Wire Wire Line
	1550 1500 1300 1500
Wire Wire Line
	1550 1600 1300 1600
Wire Wire Line
	1550 1700 1300 1700
Text Label 1300 1500 0    39   ~ 0
V_SENSE
Text Label 1300 2500 0    39   ~ 0
VFBK
Wire Wire Line
	1550 2500 1300 2500
$Comp
L R R?
U 1 1 5A1A1704
P 2550 4600
F 0 "R?" H 2400 4650 50  0000 C CNN
F 1 "R" H 2450 4550 50  0000 C CNN
F 2 "" V 2480 4600 50  0001 C CNN
F 3 "" H 2550 4600 50  0001 C CNN
	1    2550 4600
	-1   0    0    1   
$EndComp
$Comp
L R R?
U 1 1 5A1A17BC
P 2550 3800
F 0 "R?" H 2400 3850 50  0000 C CNN
F 1 "R" H 2450 3750 50  0000 C CNN
F 2 "" V 2480 3800 50  0001 C CNN
F 3 "" H 2550 3800 50  0001 C CNN
	1    2550 3800
	-1   0    0    1   
$EndComp
Wire Wire Line
	2550 3650 2550 3450
$Comp
L POT RV?
U 1 1 5A1A3FB3
P 2550 4200
F 0 "RV?" V 2375 4200 50  0000 C CNN
F 1 "POT" V 2450 4200 50  0000 C CNN
F 2 "" H 2550 4200 50  0000 C CNN
F 3 "" H 2550 4200 50  0000 C CNN
	1    2550 4200
	1    0    0    -1  
$EndComp
Wire Wire Line
	2550 4050 2550 3950
Wire Wire Line
	2550 4450 2550 4350
Text Label 2550 3500 0    39   ~ 0
VREF_5V
$Comp
L Earth #PWR?
U 1 1 5A1A441B
P 2550 4850
F 0 "#PWR?" H 2550 4600 50  0001 C CNN
F 1 "Earth" H 2550 4700 50  0001 C CNN
F 2 "" H 2550 4850 50  0000 C CNN
F 3 "" H 2550 4850 50  0000 C CNN
F 4 "HV_GND" H 2550 4850 60  0001 C CNN "GND_TYPE"
	1    2550 4850
	1    0    0    -1  
$EndComp
Wire Wire Line
	2550 4850 2550 4750
Wire Wire Line
	2700 4200 2900 4200
Text Label 2800 4200 0    39   ~ 0
V_SET
$Comp
L R R?
U 1 1 5A1A9EE6
P 3300 3800
F 0 "R?" H 3150 3850 50  0000 C CNN
F 1 "R" H 3200 3750 50  0000 C CNN
F 2 "" V 3230 3800 50  0001 C CNN
F 3 "" H 3300 3800 50  0001 C CNN
	1    3300 3800
	-1   0    0    1   
$EndComp
$Comp
L R R?
U 1 1 5A1A9F95
P 3300 4500
F 0 "R?" H 3150 4550 50  0000 C CNN
F 1 "R" H 3200 4450 50  0000 C CNN
F 2 "" V 3230 4500 50  0001 C CNN
F 3 "" H 3300 4500 50  0001 C CNN
	1    3300 4500
	-1   0    0    1   
$EndComp
Wire Wire Line
	3300 3650 3300 3450
Wire Wire Line
	3300 3950 3300 4350
Wire Wire Line
	3300 4750 2900 4750
Wire Wire Line
	2900 4750 2900 4200
Wire Wire Line
	3300 4750 3300 4650
Text Label 3300 3500 0    39   ~ 0
VFBK
Wire Wire Line
	3300 4250 3800 4250
Connection ~ 3300 4250
$Comp
L R_Small R?
U 1 1 5A1ABD72
P 3600 3700
F 0 "R?" H 3400 3650 50  0000 L CNN
F 1 "R_Small" H 3200 3750 50  0000 L CNN
F 2 "" H 3600 3700 50  0001 C CNN
F 3 "" H 3600 3700 50  0001 C CNN
	1    3600 3700
	-1   0    0    1   
$EndComp
$Comp
L C_Small C?
U 1 1 5A1ABE42
P 3600 4000
F 0 "C?" H 3400 3950 50  0000 L CNN
F 1 "C_Small" H 3200 4050 50  0000 L CNN
F 2 "" H 3600 4000 50  0000 C CNN
F 3 "" H 3600 4000 50  0000 C CNN
	1    3600 4000
	-1   0    0    1   
$EndComp
Wire Wire Line
	3600 4250 3600 4100
Wire Wire Line
	3600 3900 3600 3800
Wire Wire Line
	3600 3600 3600 3550
Wire Wire Line
	3600 3550 3300 3550
Connection ~ 3300 3550
Connection ~ 3600 4250
Text Label 3700 4250 0    39   ~ 0
VIN_1_N
Text Label 1300 1400 0    39   ~ 0
VIN_1_N
$Comp
L D_Small D?
U 1 1 5A1B9822
P 6700 4200
F 0 "D?" H 6650 4280 50  0000 L CNN
F 1 "D_Small" H 6550 4120 50  0000 L CNN
F 2 "" V 6700 4200 50  0000 C CNN
F 3 "" V 6700 4200 50  0000 C CNN
	1    6700 4200
	1    0    0    -1  
$EndComp
$Comp
L C C?
U 1 1 5A1B99B6
P 6350 4500
F 0 "C?" H 6375 4600 50  0000 L CNN
F 1 "C" H 6375 4400 50  0000 L CNN
F 2 "" H 6388 4350 50  0001 C CNN
F 3 "" H 6350 4500 50  0001 C CNN
	1    6350 4500
	1    0    0    -1  
$EndComp
$Comp
L R R?
U 1 1 5A1B9A77
P 6100 4500
F 0 "R?" V 6180 4500 50  0000 C CNN
F 1 "R" V 6100 4500 50  0000 C CNN
F 2 "" V 6030 4500 50  0001 C CNN
F 3 "" H 6100 4500 50  0001 C CNN
	1    6100 4500
	1    0    0    -1  
$EndComp
$Comp
L Earth #PWR?
U 1 1 5A1B9BE0
P 6350 4800
F 0 "#PWR?" H 6350 4550 50  0001 C CNN
F 1 "Earth" H 6350 4650 50  0001 C CNN
F 2 "" H 6350 4800 50  0000 C CNN
F 3 "" H 6350 4800 50  0000 C CNN
F 4 "HV_GND" H 6350 4800 60  0001 C CNN "GND_TYPE"
	1    6350 4800
	1    0    0    -1  
$EndComp
Wire Wire Line
	6800 4200 7150 4200
Connection ~ 7150 4200
Wire Wire Line
	5850 4200 6600 4200
Wire Wire Line
	6100 4200 6100 4350
Wire Wire Line
	6350 4350 6350 4200
Connection ~ 6350 4200
Wire Wire Line
	6350 4650 6350 4800
Wire Wire Line
	6100 4650 6100 4750
Wire Wire Line
	6100 4750 6350 4750
Connection ~ 6350 4750
Text Label 1300 1700 0    39   ~ 0
I_SENSE
Connection ~ 6100 4200
Text Label 5850 4200 0    39   ~ 0
I_SENSE
$Comp
L R R?
U 1 1 5A1C29C1
P 4250 4600
F 0 "R?" H 4100 4650 50  0000 C CNN
F 1 "R" H 4150 4550 50  0000 C CNN
F 2 "" V 4180 4600 50  0001 C CNN
F 3 "" H 4250 4600 50  0001 C CNN
	1    4250 4600
	-1   0    0    1   
$EndComp
$Comp
L R R?
U 1 1 5A1C29C7
P 4250 3800
F 0 "R?" H 4100 3850 50  0000 C CNN
F 1 "R" H 4150 3750 50  0000 C CNN
F 2 "" V 4180 3800 50  0001 C CNN
F 3 "" H 4250 3800 50  0001 C CNN
	1    4250 3800
	-1   0    0    1   
$EndComp
Wire Wire Line
	4250 3650 4250 3450
$Comp
L POT RV?
U 1 1 5A1C29CE
P 4250 4200
F 0 "RV?" V 4075 4200 50  0000 C CNN
F 1 "POT" V 4150 4200 50  0000 C CNN
F 2 "" H 4250 4200 50  0000 C CNN
F 3 "" H 4250 4200 50  0000 C CNN
	1    4250 4200
	1    0    0    -1  
$EndComp
Wire Wire Line
	4250 4050 4250 3950
Wire Wire Line
	4250 4450 4250 4350
Text Label 4250 3500 0    39   ~ 0
VREF_5V
$Comp
L Earth #PWR?
U 1 1 5A1C29D8
P 4250 4850
F 0 "#PWR?" H 4250 4600 50  0001 C CNN
F 1 "Earth" H 4250 4700 50  0001 C CNN
F 2 "" H 4250 4850 50  0000 C CNN
F 3 "" H 4250 4850 50  0000 C CNN
F 4 "HV_GND" H 4250 4850 60  0001 C CNN "GND_TYPE"
	1    4250 4850
	1    0    0    -1  
$EndComp
Wire Wire Line
	4250 4850 4250 4750
Wire Wire Line
	4400 4200 4600 4200
Text Label 4500 4200 0    39   ~ 0
I_SHORT
Text Label 1300 1600 0    39   ~ 0
I_SHORT
$Comp
L Earth #PWR?
U 1 1 5A1C58D6
P 900 2250
F 0 "#PWR?" H 900 2000 50  0001 C CNN
F 1 "Earth" H 900 2100 50  0001 C CNN
F 2 "" H 900 2250 50  0000 C CNN
F 3 "" H 900 2250 50  0000 C CNN
F 4 "HV_GND" H 900 2250 60  0001 C CNN "GND_TYPE"
	1    900  2250
	1    0    0    -1  
$EndComp
Wire Wire Line
	900  2200 1550 2200
Connection ~ 900  2200
$Comp
L Q_NPN_BCE Q?
U 1 1 5A1CCDF8
P 5200 2700
F 0 "Q?" H 5400 2750 50  0000 L CNN
F 1 "Q_NPN_BCE" H 5400 2650 50  0000 L CNN
F 2 "" H 5400 2800 50  0000 C CNN
F 3 "" H 5200 2700 50  0000 C CNN
	1    5200 2700
	1    0    0    -1  
$EndComp
$Comp
L D_Small D?
U 1 1 5A1CCEE9
P 5500 3050
F 0 "D?" V 5450 3130 50  0000 L CNN
F 1 "D_Small" H 5350 2970 50  0000 L CNN
F 2 "" V 5500 3050 50  0000 C CNN
F 3 "" V 5500 3050 50  0000 C CNN
	1    5500 3050
	-1   0    0    1   
$EndComp
Wire Wire Line
	5300 2900 5300 3050
Wire Wire Line
	5300 3050 5400 3050
Wire Wire Line
	5600 3050 5850 3050
$EndSCHEMATC
