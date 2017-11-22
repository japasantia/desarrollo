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
Sheet 1 6
Title ""
Date ""
Rev ""
Comp ""
Comment1 ""
Comment2 ""
Comment3 ""
Comment4 ""
$EndDescr
$Sheet
S 1700 1500 1300 1150
U 59F1DA15
F0 "INPUT_STAGE" 60
F1 "InputStage.sch" 60
F2 "VAC_IN" I L 1700 1700 60 
F3 "GROUND" I L 1700 2400 60 
F4 "NEUTRAL" I L 1700 2050 60 
F5 "VAC_OUT" I R 3000 1700 60 
F6 "NEUTRAL" I R 3000 2050 60 
F7 "GROUND" I R 3000 2400 60 
$EndSheet
Text GLabel 1150 1700 0    60   Input ~ 0
VAC
Text GLabel 1150 2050 0    60   Input ~ 0
NEUTRAL
Text GLabel 1150 2400 0    60   Input ~ 0
GROUND
$Sheet
S 5900 1500 1300 1150
U 59F1DDC8
F0 "MAIN_REDUCTOR" 60
F1 "MainReductor.sch" 60
F2 "HV_DV" I L 5900 1700 60 
F3 "HV_GND" I L 5900 2050 60 
F4 "VDC_24V" I R 7200 1700 60 
F5 "GND" I R 7200 2000 60 
$EndSheet
$Sheet
S 1650 3200 1150 1150
U 59F1E1B0
F0 "REGULATOR_5V" 60
F1 "Regulator5V.sch" 60
F2 "VDC_24V" I L 1650 3400 60 
F3 "GND" I L 1650 3700 60 
F4 "VDC_5.0V" I R 2800 3400 60 
F5 "GND" I R 2800 3700 60 
$EndSheet
$Sheet
S 4150 3250 1050 1150
U 59F1EA9E
F0 "REGULATOR_3.3V" 60
F1 "Regulator3V.sch" 60
F2 "VDC_24V" I L 4150 3450 60 
F3 "GND" I L 4150 3750 60 
F4 "VDC_3.3V" I R 5200 3450 60 
F5 "GND" I R 5200 3750 60 
$EndSheet
Text GLabel 1300 3400 0    60   Input ~ 0
VDC_24V
Text GLabel 1250 3700 0    60   Input ~ 0
GND
Text GLabel 3900 3450 0    60   Input ~ 0
VDC_24V
Text GLabel 3900 3750 0    60   Input ~ 0
GND
Text GLabel 7550 1700 2    60   Input ~ 0
VDC_24V
Text GLabel 7550 2000 2    60   Input ~ 0
GND
Wire Wire Line
	1150 1700 1700 1700
Wire Wire Line
	1150 2050 1700 2050
Wire Wire Line
	1150 2400 1700 2400
Wire Wire Line
	7200 1700 7550 1700
Wire Wire Line
	7200 2000 7550 2000
Wire Wire Line
	1300 3400 1650 3400
Wire Wire Line
	1250 3700 1650 3700
Wire Wire Line
	3900 3450 4150 3450
Wire Wire Line
	3900 3750 4150 3750
$Sheet
S 3700 1500 1250 1150
U 59F25717
F0 "RECTIFIER_FILTER" 60
F1 "RectifierFilter.sch" 60
F2 "VAC_IN" I L 3700 1700 60 
F3 "GROUND" I L 3700 2400 60 
F4 "NEUTRAL" I L 3700 2050 60 
F5 "HV_DC" I R 4950 1700 60 
F6 "HV_GND" I R 4950 2050 60 
$EndSheet
Wire Wire Line
	4950 1700 5900 1700
Wire Wire Line
	4950 2050 5900 2050
$EndSCHEMATC
