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
LIBS:eSim_Analog
LIBS:eSim_Devices
LIBS:eSim_Digital
LIBS:eSim_Hybrid
LIBS:eSim_Miscellaneous
LIBS:eSim_Power
LIBS:eSim_Sources
LIBS:eSim_Subckt
LIBS:eSim_User
LIBS:eSim_Plot
LIBS:eSim_PSpice
LIBS:LPC1768FBD100_551
LIBS:Cendit11713-cache
EELAYER 25 0
EELAYER END
$Descr A4 11693 8268
encoding utf-8
Sheet 1 9
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
S 600  1900 900  800 
U 59149DBB
F0 "PowerSupplyMain" 60
F1 "PowerSupplyMain.sch" 60
F2 "+3.3_VDC" O R 1500 2050 60 
F3 "+5.0_VDV" O R 1500 2200 60 
F4 "I2C_BUS" B R 1500 2400 60 
$EndSheet
$Sheet
S 3250 1950 1600 1500
U 59149FF9
F0 "MCUCore" 60
F1 "MCUCore.sch" 60
F2 "MAIN_BUS" B R 4850 2700 60 
F3 "+3.3_VDC" I L 3250 2050 60 
F4 "+5.0_VDC" I L 3250 2200 60 
F5 "I2C_BUS" B L 3250 2500 60 
F6 "SPI_BUS" B L 3250 2650 60 
F7 "USB" B R 4850 3050 60 
$EndSheet
$Sheet
S 650  3050 800  950 
U 5914A033
F0 "PowerSupplyExternal" 60
F1 "PowerSupplyExternal.sch" 60
F2 "ADJ_VDC_OUT" O R 1450 3250 60 
F3 "+5.0_VDC_OUT" O R 1450 3400 60 
F4 "+3.0_VDC_OUT" O R 1450 3550 60 
F5 "I2C_BUS" B R 1450 3750 60 
$EndSheet
$Sheet
S 3200 650  1300 950 
U 5914A10C
F0 "EthernetController" 60
F1 "EthernetController.sch" 60
F2 "+3.3_VDC" B L 3200 850 60 
F3 "SPI_BUS" B L 3200 1100 60 
$EndSheet
$Sheet
S 6650 1800 1200 1000
U 5914A963
F0 "GPIBInterface" 60
F1 "GPIBInterface.sch" 60
F2 "+5.0_VDC" I L 6650 2100 60 
F3 "MAIN_BUS" B L 6650 2500 60 
F4 "+3.3_VDC" I L 6650 1950 60 
$EndSheet
$Sheet
S 6650 3100 1200 1000
U 5914A9B7
F0 "GPIOInterface" 60
F1 "GPIOInterface.sch" 60
F2 "+5.0_VDC" I L 6650 3400 60 
F3 "MAIN_BUS" B L 6650 3700 60 
F4 "+3.3_VDC" I L 6650 3250 60 
$EndSheet
$Sheet
S 5650 4650 1350 1100
U 5914AA0A
F0 "UIPanelController" 60
F1 "UIPanelController.sch" 60
F2 "+3.3_VDC" I L 5650 4800 60 
F3 "MAIN_BUS" B R 7000 5000 60 
F4 "+5.0_VDC" I L 5650 4950 60 
$EndSheet
$Sheet
S 2500 4650 1450 1100
U 5914AA1B
F0 "ScreenController" 60
F1 "ScreenController.sch" 60
F2 "+3.3_VDC" I L 2500 4800 60 
F3 "MAIN_BUS" B R 3950 4900 60 
F4 "LCD_BUS" B R 3950 5100 60 
$EndSheet
Wire Bus Line
	1500 2400 1950 2400
Wire Bus Line
	2450 1100 2450 3750
Wire Bus Line
	1450 3750 2350 3750
Wire Bus Line
	2450 1100 3200 1100
Text GLabel 6450 1950 0    60   BiDi ~ 0
+3.3_VDC
Text GLabel 6450 2100 0    60   BiDi ~ 0
+5.0_VDC
Text GLabel 6450 3250 0    60   BiDi ~ 0
+3.3_VDC
Text GLabel 6450 3400 0    60   BiDi ~ 0
+5.0_VDC
Text GLabel 3050 2050 0    60   Input ~ 0
+3.3_VDC
Text GLabel 3050 2200 0    60   Input ~ 0
+5.0_VDC
Text GLabel 1650 2050 2    60   Output ~ 0
+3.3_VDC
Text GLabel 1650 2200 2    60   Output ~ 0
+5.0_VDC
Text GLabel 1650 3550 2    60   Output ~ 0
+3.3_VDC_OUT
Text GLabel 1650 3400 2    60   Output ~ 0
+5.0_VDC_OUT
Text GLabel 2250 4800 0    60   BiDi ~ 0
+3.3_VDC
Text GLabel 5400 4800 0    60   BiDi ~ 0
+3.3_VDC
Text GLabel 5400 4950 0    60   BiDi ~ 0
+5.0_VDC
Wire Wire Line
	1500 2050 1650 2050
Wire Wire Line
	1500 2200 1650 2200
Wire Wire Line
	1450 3400 1650 3400
Wire Wire Line
	1450 3550 1650 3550
Wire Wire Line
	2250 4800 2500 4800
Wire Wire Line
	5400 4800 5650 4800
Wire Wire Line
	5400 4950 5650 4950
Wire Wire Line
	6450 3250 6650 3250
Wire Wire Line
	6450 3400 6650 3400
Wire Wire Line
	6450 1950 6650 1950
Wire Wire Line
	6450 2100 6650 2100
Wire Wire Line
	3050 2050 3250 2050
Wire Wire Line
	3050 2200 3250 2200
Text GLabel 3000 850  0    60   Input ~ 0
+3.3_VDC
Wire Wire Line
	3000 850  3200 850 
Entry Bus Bus
	2450 2400 2550 2500
Entry Bus Bus
	2350 2400 2450 2300
Entry Bus Bus
	2350 3750 2450 3650
Wire Bus Line
	2350 2400 1900 2400
Wire Bus Line
	3250 2500 2550 2500
Wire Bus Line
	5500 2000 5500 4400
Wire Bus Line
	5500 4400 7500 4400
Wire Bus Line
	7500 4400 7500 5250
Wire Bus Line
	5550 4400 4300 4400
Wire Bus Line
	4300 4400 4300 5300
Entry Bus Bus
	5400 2700 5500 2600
Entry Bus Bus
	5500 2400 5600 2500
Entry Bus Bus
	5500 3600 5600 3700
Entry Bus Bus
	4200 4900 4300 4800
Entry Bus Bus
	7400 5000 7500 4900
Wire Bus Line
	4900 2700 5400 2700
Wire Bus Line
	4950 2700 4850 2700
Wire Bus Line
	6650 2500 5600 2500
Wire Bus Line
	5600 3700 6650 3700
Wire Bus Line
	4200 4900 3900 4900
Wire Bus Line
	7400 5000 7000 5000
$EndSCHEMATC
