EESchema Schematic File Version 2  date sáb 27 may 2017 18:53:10 VET
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
LIBS:LibreriaPrueba
LIBS:KPrueba1-cache
EELAYER 25  0
EELAYER END
$Descr A4 11700 8267
encoding utf-8
Sheet 1 1
Title "Prueba 1"
Date "27 may 2017"
Rev "1"
Comp "JaTech"
Comment1 ""
Comment2 ""
Comment3 ""
Comment4 ""
$EndDescr
Wire Wire Line
	1300 6100 1400 6100
Wire Wire Line
	1300 5900 1400 5900
Wire Wire Line
	2200 5450 2300 5450
Wire Wire Line
	2200 5250 2300 5250
Wire Wire Line
	1400 5450 1300 5450
Wire Wire Line
	1300 5250 1400 5250
Wire Bus Line
	2400 5500 2400 4850
Wire Bus Line
	2400 4850 1500 4850
Wire Bus Line
	1500 4850 1500 6200
Wire Wire Line
	3000 4150 3400 4150
Wire Wire Line
	3900 4150 4150 4150
Wire Wire Line
	3100 4400 3100 4250
Wire Wire Line
	3100 4250 3000 4250
Wire Wire Line
	3100 2300 3100 2200
Wire Wire Line
	3100 2200 2950 2200
Wire Wire Line
	4150 2350 4150 2500
Wire Wire Line
	4150 2500 3800 2500
Wire Wire Line
	2950 2500 3400 2500
Wire Wire Line
	4150 1700 4150 1850
Wire Wire Line
	1350 2000 1350 2200
Wire Wire Line
	1350 2200 1500 2200
Wire Wire Line
	3000 4050 3100 4050
Wire Wire Line
	3100 4050 3100 3850
Wire Wire Line
	2950 2900 3350 2900
Wire Wire Line
	4050 3450 4050 3200
Wire Wire Line
	1300 5150 1400 5150
Wire Wire Line
	1300 5350 1400 5350
Wire Wire Line
	2200 5150 2300 5150
Wire Wire Line
	2200 5350 2300 5350
Wire Wire Line
	1300 5800 1400 5800
Wire Wire Line
	1300 6000 1400 6000
Wire Wire Line
	4350 3200 4350 3450
Text Label 1500 4950 0    60   ~ 0
a[1..4]
Text Label 1500 5650 0    60   ~ 0
b[1..4]
Text Label 1300 6100 0    60   ~ 0
b4
Text Label 1300 6000 0    60   ~ 0
b3
$Comp
L CONN_4 P2
U 1 1 5929E7CA
P 950 5950
F 0 "P2" V 900 5950 50  0000 C CNN
F 1 "CONN_4" V 1000 5950 50  0000 C CNN
	1    950  5950
	-1   0    0    -1  
$EndComp
Text Label 1300 5900 0    60   ~ 0
b2
Text Label 1300 5800 0    60   ~ 0
b1
Entry Wire Line
	1500 5800 1400 5900
Entry Wire Line
	1500 5900 1400 6000
Entry Wire Line
	1500 6000 1400 6100
Entry Wire Line
	1500 5700 1400 5800
Entry Wire Line
	2400 5050 2300 5150
Entry Wire Line
	2400 5350 2300 5450
Entry Wire Line
	2400 5250 2300 5350
Entry Wire Line
	2400 5150 2300 5250
Entry Wire Line
	1500 5350 1400 5450
Entry Wire Line
	1500 5250 1400 5350
Entry Wire Line
	1500 5150 1400 5250
Entry Wire Line
	1500 5050 1400 5150
Text Label 2100 5450 0    60   ~ 0
a4
Text Label 2100 5350 0    60   ~ 0
a3
Text Label 2100 5250 0    60   ~ 0
a2
Text Label 2100 5150 0    60   ~ 0
a1
Text Label 1300 5450 0    60   ~ 0
a4
Text Label 1300 5350 0    60   ~ 0
a3
Text Label 1300 5250 0    60   ~ 0
a2
Text Label 1300 5150 0    60   ~ 0
a1
$Comp
L CONN_4 P4
U 1 1 5929E7BF
P 1850 5300
F 0 "P4" V 1800 5300 50  0000 C CNN
F 1 "CONN_4" V 1900 5300 50  0000 C CNN
	1    1850 5300
	-1   0    0    -1  
$EndComp
$Comp
L CONN_4 P1
U 1 1 5929E79B
P 950 5300
F 0 "P1" V 900 5300 50  0000 C CNN
F 1 "CONN_4" V 1000 5300 50  0000 C CNN
	1    950  5300
	-1   0    0    -1  
$EndComp
$Comp
L GND #PWR01
U 1 1 5929E310
P 4350 3450
F 0 "#PWR01" H 4350 3450 30  0001 C CNN
F 1 "GND" H 4350 3380 30  0001 C CNN
	1    4350 3450
	1    0    0    -1  
$EndComp
$Comp
L VCC #PWR02
U 1 1 5929E30B
P 4050 3450
F 0 "#PWR02" H 4050 3550 30  0001 C CNN
F 1 "VCC" H 4050 3550 30  0000 C CNN
	1    4050 3450
	-1   0    0    1   
$EndComp
$Comp
L PWR_FLAG #FLG03
U 1 1 5929E2FC
P 4350 3200
F 0 "#FLG03" H 4350 3295 30  0001 C CNN
F 1 "PWR_FLAG" H 4350 3380 30  0000 C CNN
	1    4350 3200
	1    0    0    -1  
$EndComp
$Comp
L PWR_FLAG #FLG04
U 1 1 5929E2F9
P 4050 3200
F 0 "#FLG04" H 4050 3295 30  0001 C CNN
F 1 "PWR_FLAG" H 4050 3380 30  0000 C CNN
	1    4050 3200
	1    0    0    -1  
$EndComp
NoConn ~ 1500 2500
NoConn ~ 1500 2900
NoConn ~ 1500 3200
NoConn ~ 2950 3200
Text Label 3050 4150 0    60   ~ 0
INPUTtoR
Text Label 4150 2500 0    60   ~ 0
LEDtoR
Text Label 3000 2500 0    60   ~ 0
uCtoLED
Text Label 4150 4150 0    60   ~ 0
INPUT
Text Label 3350 2900 0    60   ~ 0
INPUT
$Comp
L GND #PWR05
U 1 1 5929E13C
P 3100 2300
F 0 "#PWR05" H 3100 2300 30  0001 C CNN
F 1 "GND" H 3100 2230 30  0001 C CNN
	1    3100 2300
	1    0    0    -1  
$EndComp
$Comp
L GND #PWR06
U 1 1 5929D935
P 3100 4400
F 0 "#PWR06" H 3100 4400 30  0001 C CNN
F 1 "GND" H 3100 4330 30  0001 C CNN
	1    3100 4400
	1    0    0    -1  
$EndComp
$Comp
L VCC #PWR07
U 1 1 5929D922
P 3100 3850
F 0 "#PWR07" H 3100 3950 30  0001 C CNN
F 1 "VCC" H 3100 3950 30  0000 C CNN
	1    3100 3850
	1    0    0    -1  
$EndComp
$Comp
L VCC #PWR08
U 1 1 5929D8F1
P 4150 1700
F 0 "#PWR08" H 4150 1800 30  0001 C CNN
F 1 "VCC" H 4150 1800 30  0000 C CNN
	1    4150 1700
	1    0    0    -1  
$EndComp
$Comp
L VCC #PWR09
U 1 1 5929D8EA
P 1350 2000
F 0 "#PWR09" H 1350 2100 30  0001 C CNN
F 1 "VCC" H 1350 2100 30  0000 C CNN
	1    1350 2000
	1    0    0    -1  
$EndComp
$Comp
L MYCONN3 J1
U 1 1 5929D825
P 2200 3900
F 0 "J1" H 1900 3400 60  0000 C CNN
F 1 "MYCONN3" H 1900 3900 60  0000 C CNN
	1    2200 3900
	-1   0    0    -1  
$EndComp
$Comp
L LED D1
U 1 1 5929D3C8
P 3600 2500
F 0 "D1" H 3600 2600 50  0000 C CNN
F 1 "LED" H 3600 2400 50  0000 C CNN
	1    3600 2500
	-1   0    0    -1  
$EndComp
$Comp
L PIC12F508 U1
U 1 1 5929D392
P 2250 2700
F 0 "U1" H 2200 2700 60  0000 C CNN
F 1 "PIC12F508" H 2250 3450 60  0000 C CNN
	1    2250 2700
	1    0    0    -1  
$EndComp
$Comp
L R R1
U 1 1 5929D056
P 3650 4150
F 0 "R1" V 3730 4150 50  0000 C CNN
F 1 "100" V 3650 4150 50  0000 C CNN
	1    3650 4150
	0    -1   -1   0   
$EndComp
$Comp
L R R2
U 1 1 5929CEA0
P 4150 2100
F 0 "R2" V 4230 2100 50  0000 C CNN
F 1 "1k" V 4150 2100 50  0000 C CNN
	1    4150 2100
	-1   0    0    1   
$EndComp
$EndSCHEMATC
