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
LIBS:CenditBasic
LIBS:cendit-basic
LIBS:PortExpanderMC33996-cache
EELAYER 25 0
EELAYER END
$Descr A4 11693 8268
encoding utf-8
Sheet 1 1
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
L MC33996EKR2 U1
U 1 1 59BAD405
P 2700 2350
F 0 "U1" H 2477 3456 50  0000 L BNN
F 1 "MC33996EKR2" H 2509 981 50  0000 L BNN
F 2 "SOIC65P1030X265-32N" H 2700 2350 50  0001 L BNN
F 3 "Power Switch Lo Side 0.9A 32-Pin SOIC W EP T/R" H 2700 2350 50  0001 L BNN
F 4 "7.23 USD" H 2700 2350 50  0001 L BNN "Price"
F 5 "NXP Semiconductors" H 2700 2350 50  0001 L BNN "MF"
F 6 "SOIC-32 NXP Semiconductors" H 2700 2350 50  0001 L BNN "Package"
F 7 "Unavailable" H 2700 2350 50  0001 L BNN "Availability"
F 8 "MC33996EK/R2" H 2700 2350 50  0001 L BNN "MP"
	1    2700 2350
	1    0    0    -1  
$EndComp
$Comp
L CONN_01X14 J1
U 1 1 59BAD6CB
P 800 2200
F 0 "J1" H 800 2950 50  0000 C CNN
F 1 "CONN_01X14" V 900 2200 50  0000 C CNN
F 2 "" H 800 2200 50  0001 C CNN
F 3 "" H 800 2200 50  0001 C CNN
	1    800  2200
	-1   0    0    1   
$EndComp
$Comp
L GNDPWR #PWR4
U 1 1 59BAD8D0
P 1100 3050
F 0 "#PWR4" H 1100 2850 50  0001 C CNN
F 1 "GNDPWR" H 1100 2920 50  0000 C CNN
F 2 "" H 1100 3000 50  0001 C CNN
F 3 "" H 1100 3000 50  0001 C CNN
	1    1100 3050
	1    0    0    -1  
$EndComp
$Comp
L GNDPWR #PWR8
U 1 1 59BAD468
P 1800 3500
F 0 "#PWR8" H 1800 3300 50  0001 C CNN
F 1 "GNDPWR" H 1800 3370 50  0000 C CNN
F 2 "" H 1800 3450 50  0001 C CNN
F 3 "" H 1800 3450 50  0001 C CNN
	1    1800 3500
	1    0    0    -1  
$EndComp
$Comp
L CONN_01X08 J2
U 1 1 59BADB0F
P 4250 1900
F 0 "J2" H 4250 2350 50  0000 C CNN
F 1 "CONN_01X08" V 4350 1900 50  0000 C CNN
F 2 "" H 4250 1900 50  0001 C CNN
F 3 "" H 4250 1900 50  0001 C CNN
	1    4250 1900
	1    0    0    -1  
$EndComp
$Comp
L CONN_01X08 J3
U 1 1 59BADB84
P 5050 1900
F 0 "J3" H 5050 2350 50  0000 C CNN
F 1 "CONN_01X08" V 5150 1900 50  0000 C CNN
F 2 "" H 5050 1900 50  0001 C CNN
F 3 "" H 5050 1900 50  0001 C CNN
	1    5050 1900
	1    0    0    -1  
$EndComp
Entry Wire Line
	3700 2150 3800 2250
Entry Wire Line
	3700 2050 3800 2150
Entry Wire Line
	3700 1950 3800 2050
Entry Wire Line
	3700 1850 3800 1950
Entry Wire Line
	3700 1750 3800 1850
Entry Wire Line
	3700 1650 3800 1750
Entry Wire Line
	3700 1550 3800 1650
Entry Wire Line
	3700 1450 3800 1550
Entry Wire Line
	4500 1450 4600 1550
Entry Wire Line
	4500 1550 4600 1650
Entry Wire Line
	4500 1650 4600 1750
Entry Wire Line
	4500 1750 4600 1850
Entry Wire Line
	4500 1850 4600 1950
Entry Wire Line
	4500 1950 4600 2050
Entry Wire Line
	4500 2050 4600 2150
Entry Wire Line
	4500 2150 4600 2250
Entry Wire Line
	3700 1450 3800 1550
Entry Wire Line
	3700 1450 3800 1550
Entry Wire Line
	3600 1550 3700 1450
Entry Wire Line
	3600 1650 3700 1550
Entry Wire Line
	3600 1750 3700 1650
Entry Wire Line
	3600 1850 3700 1750
Entry Wire Line
	3600 1950 3700 1850
Entry Wire Line
	3600 2050 3700 1950
Entry Wire Line
	3600 2150 3700 2050
Entry Wire Line
	3600 2250 3700 2150
Entry Wire Line
	3600 2450 3700 2350
Entry Wire Line
	3600 2350 3700 2250
Entry Wire Line
	3600 2550 3700 2450
Entry Wire Line
	3600 2650 3700 2550
Entry Wire Line
	3600 2750 3700 2650
Entry Wire Line
	3600 2850 3700 2750
Entry Wire Line
	3600 2950 3700 2850
Entry Wire Line
	3600 3050 3700 2950
$Comp
L VPP #PWR7
U 1 1 59BAE748
P 1650 1400
F 0 "#PWR7" H 1650 1250 50  0001 C CNN
F 1 "VPP" H 1650 1550 50  0000 C CNN
F 2 "" H 1650 1400 50  0001 C CNN
F 3 "" H 1650 1400 50  0001 C CNN
	1    1650 1400
	1    0    0    -1  
$EndComp
$Comp
L VCC #PWR9
U 1 1 59BAE764
P 1850 1400
F 0 "#PWR9" H 1850 1250 50  0001 C CNN
F 1 "VCC" H 1850 1550 50  0000 C CNN
F 2 "" H 1850 1400 50  0001 C CNN
F 3 "" H 1850 1400 50  0001 C CNN
	1    1850 1400
	1    0    0    -1  
$EndComp
Entry Wire Line
	1500 1750 1600 1850
Entry Wire Line
	1500 1850 1600 1950
Entry Wire Line
	1500 1950 1600 2050
Entry Wire Line
	1500 2150 1600 2250
Entry Wire Line
	1500 2050 1600 2150
Entry Wire Line
	1400 2750 1500 2650
Entry Wire Line
	1400 2650 1500 2550
Entry Wire Line
	1400 2550 1500 2450
Entry Wire Line
	1400 2450 1500 2350
Entry Wire Line
	1400 2350 1500 2250
Wire Wire Line
	1000 2850 1100 2850
Wire Wire Line
	1100 2850 1100 3050
Wire Wire Line
	1800 3150 2000 3150
Wire Wire Line
	1800 3350 2000 3350
Connection ~ 1800 3350
Wire Wire Line
	2000 2450 1800 2450
Connection ~ 1800 3150
Wire Wire Line
	1800 3050 2000 3050
Connection ~ 1800 3050
Wire Wire Line
	1800 2950 2000 2950
Connection ~ 1800 2950
Wire Wire Line
	1800 2450 1800 3500
Wire Wire Line
	2000 2850 1800 2850
Connection ~ 1800 2850
Wire Wire Line
	2000 2750 1800 2750
Connection ~ 1800 2750
Wire Wire Line
	2000 2650 1800 2650
Connection ~ 1800 2650
Wire Wire Line
	2050 2550 1800 2550
Connection ~ 1800 2550
Wire Bus Line
	3700 1300 3700 3050
Wire Bus Line
	3700 1300 4500 1300
Wire Bus Line
	4500 1300 4500 2300
Wire Wire Line
	3800 1550 4050 1550
Wire Wire Line
	4050 1650 3800 1650
Wire Wire Line
	3800 1750 4050 1750
Wire Wire Line
	4050 1850 3800 1850
Wire Wire Line
	3800 1950 4050 1950
Wire Wire Line
	4050 2050 3800 2050
Wire Wire Line
	3800 2150 4050 2150
Wire Wire Line
	4050 2250 3800 2250
Wire Wire Line
	4850 1550 4600 1550
Wire Wire Line
	4600 1650 4850 1650
Wire Wire Line
	4850 1750 4600 1750
Wire Wire Line
	4600 1850 4850 1850
Wire Wire Line
	4850 1950 4600 1950
Wire Wire Line
	4600 2050 4850 2050
Wire Wire Line
	4850 2150 4600 2150
Wire Wire Line
	4600 2250 4850 2250
Wire Wire Line
	3400 1550 3600 1550
Wire Wire Line
	3400 1650 3600 1650
Wire Wire Line
	3400 1750 3600 1750
Wire Wire Line
	3400 1850 3600 1850
Wire Wire Line
	3400 1950 3600 1950
Wire Wire Line
	3400 2050 3600 2050
Wire Wire Line
	3400 2150 3600 2150
Wire Wire Line
	3400 2250 3600 2250
Wire Wire Line
	3600 2350 3400 2350
Wire Wire Line
	3400 2450 3600 2450
Wire Wire Line
	3600 2550 3400 2550
Wire Wire Line
	3400 2650 3600 2650
Wire Wire Line
	3600 2750 3400 2750
Wire Wire Line
	3400 2850 3600 2850
Wire Wire Line
	3600 2950 3400 2950
Wire Wire Line
	3600 3050 3400 3050
Wire Wire Line
	1850 1400 1850 1550
Wire Wire Line
	1850 1550 2000 1550
Wire Wire Line
	1650 1400 1650 1650
Wire Wire Line
	1650 1650 2000 1650
Wire Bus Line
	1500 1500 1500 3900
Wire Wire Line
	2000 1850 1600 1850
Wire Wire Line
	2000 1950 1600 1950
Wire Wire Line
	1600 2050 2000 2050
Wire Wire Line
	1600 2150 2000 2150
Wire Wire Line
	1600 2250 2000 2250
Wire Wire Line
	1000 2750 1400 2750
Wire Wire Line
	1400 2650 1000 2650
Wire Wire Line
	1000 2550 1400 2550
Wire Wire Line
	1400 2450 1000 2450
Wire Wire Line
	1000 2350 1400 2350
Entry Wire Line
	1400 2250 1500 2150
Wire Wire Line
	1400 2250 1000 2250
$Comp
L VPP #PWR3
U 1 1 59BAF1ED
P 1100 1400
F 0 "#PWR3" H 1100 1250 50  0001 C CNN
F 1 "VPP" H 1100 1550 50  0000 C CNN
F 2 "" H 1100 1400 50  0001 C CNN
F 3 "" H 1100 1400 50  0001 C CNN
	1    1100 1400
	1    0    0    -1  
$EndComp
$Comp
L VCC #PWR5
U 1 1 59BAF209
P 1300 1400
F 0 "#PWR5" H 1300 1250 50  0001 C CNN
F 1 "VCC" H 1300 1550 50  0000 C CNN
F 2 "" H 1300 1400 50  0001 C CNN
F 3 "" H 1300 1400 50  0001 C CNN
	1    1300 1400
	1    0    0    -1  
$EndComp
Wire Wire Line
	1100 1400 1100 1550
Wire Wire Line
	1100 1550 1000 1550
Wire Wire Line
	1300 1400 1300 1650
Wire Wire Line
	1300 1650 1000 1650
$Comp
L MC33996EKR2 U2
U 1 1 59BAF736
P 6850 2350
F 0 "U2" H 6627 3456 50  0000 L BNN
F 1 "MC33996EKR2" H 6659 981 50  0000 L BNN
F 2 "SOIC65P1030X265-32N" H 6850 2350 50  0001 L BNN
F 3 "Power Switch Lo Side 0.9A 32-Pin SOIC W EP T/R" H 6850 2350 50  0001 L BNN
F 4 "7.23 USD" H 6850 2350 50  0001 L BNN "Price"
F 5 "NXP Semiconductors" H 6850 2350 50  0001 L BNN "MF"
F 6 "SOIC-32 NXP Semiconductors" H 6850 2350 50  0001 L BNN "Package"
F 7 "Unavailable" H 6850 2350 50  0001 L BNN "Availability"
F 8 "MC33996EK/R2" H 6850 2350 50  0001 L BNN "MP"
	1    6850 2350
	1    0    0    -1  
$EndComp
$Comp
L GNDPWR #PWR17
U 1 1 59BAF73C
P 5950 3500
F 0 "#PWR17" H 5950 3300 50  0001 C CNN
F 1 "GNDPWR" H 5950 3370 50  0000 C CNN
F 2 "" H 5950 3450 50  0001 C CNN
F 3 "" H 5950 3450 50  0001 C CNN
	1    5950 3500
	1    0    0    -1  
$EndComp
$Comp
L CONN_01X08 J4
U 1 1 59BAF742
P 8400 1900
F 0 "J4" H 8400 2350 50  0000 C CNN
F 1 "CONN_01X08" V 8500 1900 50  0000 C CNN
F 2 "" H 8400 1900 50  0001 C CNN
F 3 "" H 8400 1900 50  0001 C CNN
	1    8400 1900
	1    0    0    -1  
$EndComp
$Comp
L CONN_01X08 J5
U 1 1 59BAF748
P 9200 1900
F 0 "J5" H 9200 2350 50  0000 C CNN
F 1 "CONN_01X08" V 9300 1900 50  0000 C CNN
F 2 "" H 9200 1900 50  0001 C CNN
F 3 "" H 9200 1900 50  0001 C CNN
	1    9200 1900
	1    0    0    -1  
$EndComp
Entry Wire Line
	7850 2150 7950 2250
Entry Wire Line
	7850 2050 7950 2150
Entry Wire Line
	7850 1950 7950 2050
Entry Wire Line
	7850 1850 7950 1950
Entry Wire Line
	7850 1750 7950 1850
Entry Wire Line
	7850 1650 7950 1750
Entry Wire Line
	7850 1550 7950 1650
Entry Wire Line
	7850 1450 7950 1550
Entry Wire Line
	8650 1450 8750 1550
Entry Wire Line
	8650 1550 8750 1650
Entry Wire Line
	8650 1650 8750 1750
Entry Wire Line
	8650 1750 8750 1850
Entry Wire Line
	8650 1850 8750 1950
Entry Wire Line
	8650 1950 8750 2050
Entry Wire Line
	8650 2050 8750 2150
Entry Wire Line
	8650 2150 8750 2250
Entry Wire Line
	7850 1450 7950 1550
Entry Wire Line
	7850 1450 7950 1550
Entry Wire Line
	7750 1550 7850 1450
Entry Wire Line
	7750 1650 7850 1550
Entry Wire Line
	7750 1750 7850 1650
Entry Wire Line
	7750 1850 7850 1750
Entry Wire Line
	7750 1950 7850 1850
Entry Wire Line
	7750 2050 7850 1950
Entry Wire Line
	7750 2150 7850 2050
Entry Wire Line
	7750 2250 7850 2150
Entry Wire Line
	7750 2450 7850 2350
Entry Wire Line
	7750 2350 7850 2250
Entry Wire Line
	7750 2550 7850 2450
Entry Wire Line
	7750 2650 7850 2550
Entry Wire Line
	7750 2750 7850 2650
Entry Wire Line
	7750 2850 7850 2750
Entry Wire Line
	7750 2950 7850 2850
Entry Wire Line
	7750 3050 7850 2950
$Comp
L VPP #PWR16
U 1 1 59BAF770
P 5800 1400
F 0 "#PWR16" H 5800 1250 50  0001 C CNN
F 1 "VPP" H 5800 1550 50  0000 C CNN
F 2 "" H 5800 1400 50  0001 C CNN
F 3 "" H 5800 1400 50  0001 C CNN
	1    5800 1400
	1    0    0    -1  
$EndComp
$Comp
L VCC #PWR18
U 1 1 59BAF776
P 6000 1400
F 0 "#PWR18" H 6000 1250 50  0001 C CNN
F 1 "VCC" H 6000 1550 50  0000 C CNN
F 2 "" H 6000 1400 50  0001 C CNN
F 3 "" H 6000 1400 50  0001 C CNN
	1    6000 1400
	1    0    0    -1  
$EndComp
Entry Wire Line
	5650 1750 5750 1850
Entry Wire Line
	5650 1850 5750 1950
Entry Wire Line
	5650 1950 5750 2050
Entry Wire Line
	5650 2050 5750 2150
Wire Wire Line
	5950 3150 6150 3150
Wire Wire Line
	5950 3350 6150 3350
Connection ~ 5950 3350
Wire Wire Line
	6150 2450 5950 2450
Connection ~ 5950 3150
Wire Wire Line
	5950 3050 6150 3050
Connection ~ 5950 3050
Wire Wire Line
	5950 2950 6150 2950
Connection ~ 5950 2950
Wire Wire Line
	5950 2450 5950 3500
Wire Wire Line
	6150 2850 5950 2850
Connection ~ 5950 2850
Wire Wire Line
	6150 2750 5950 2750
Connection ~ 5950 2750
Wire Wire Line
	6150 2650 5950 2650
Connection ~ 5950 2650
Wire Wire Line
	6200 2550 5950 2550
Connection ~ 5950 2550
Wire Bus Line
	7850 1300 7850 3050
Wire Bus Line
	7850 1300 8650 1300
Wire Bus Line
	8650 1300 8650 2300
Wire Wire Line
	7950 1550 8200 1550
Wire Wire Line
	8200 1650 7950 1650
Wire Wire Line
	7950 1750 8200 1750
Wire Wire Line
	8200 1850 7950 1850
Wire Wire Line
	7950 1950 8200 1950
Wire Wire Line
	8200 2050 7950 2050
Wire Wire Line
	7950 2150 8200 2150
Wire Wire Line
	8200 2250 7950 2250
Wire Wire Line
	9000 1550 8750 1550
Wire Wire Line
	8750 1650 9000 1650
Wire Wire Line
	9000 1750 8750 1750
Wire Wire Line
	8750 1850 9000 1850
Wire Wire Line
	9000 1950 8750 1950
Wire Wire Line
	8750 2050 9000 2050
Wire Wire Line
	9000 2150 8750 2150
Wire Wire Line
	8750 2250 9000 2250
Wire Wire Line
	7550 1550 7750 1550
Wire Wire Line
	7550 1650 7750 1650
Wire Wire Line
	7550 1750 7750 1750
Wire Wire Line
	7550 1850 7750 1850
Wire Wire Line
	7550 1950 7750 1950
Wire Wire Line
	7550 2050 7750 2050
Wire Wire Line
	7550 2150 7750 2150
Wire Wire Line
	7550 2250 7750 2250
Wire Wire Line
	7750 2350 7550 2350
Wire Wire Line
	7550 2450 7750 2450
Wire Wire Line
	7750 2550 7550 2550
Wire Wire Line
	7550 2650 7750 2650
Wire Wire Line
	7750 2750 7550 2750
Wire Wire Line
	7550 2850 7750 2850
Wire Wire Line
	7750 2950 7550 2950
Wire Wire Line
	7750 3050 7550 3050
Wire Wire Line
	6000 1400 6000 1550
Wire Wire Line
	6000 1550 6150 1550
Wire Wire Line
	5800 1400 5800 1650
Wire Wire Line
	5800 1650 6150 1650
Wire Bus Line
	5650 1500 5650 3900
Wire Wire Line
	6150 1850 5750 1850
Wire Wire Line
	6150 1950 5750 1950
Wire Wire Line
	5750 2050 6150 2050
Wire Wire Line
	5750 2150 6150 2150
Text Label 3500 3250 0    60   ~ 0
SO_CHAIN
Wire Wire Line
	3400 3250 3850 3250
Wire Wire Line
	6150 2250 5800 2250
Text Label 5800 2250 0    60   ~ 0
SO_CHAIN
Entry Wire Line
	7900 3250 8000 3150
Wire Bus Line
	1500 3900 8000 3900
Wire Bus Line
	8000 3900 8000 3100
Wire Wire Line
	7550 3250 7900 3250
Text Label 7550 3250 0    59   ~ 0
SO
$Comp
L C C3
U 1 1 59BB0C99
P 2050 4800
F 0 "C3" H 2075 4900 50  0000 L CNN
F 1 "0.1uF" H 2075 4700 50  0000 L CNN
F 2 "" H 2088 4650 50  0001 C CNN
F 3 "" H 2050 4800 50  0001 C CNN
	1    2050 4800
	1    0    0    -1  
$EndComp
$Comp
L C C5
U 1 1 59BB0D1E
P 5650 4750
F 0 "C5" H 5675 4850 50  0000 L CNN
F 1 "0.1uF" H 5675 4650 50  0000 L CNN
F 2 "" H 5688 4600 50  0001 C CNN
F 3 "" H 5650 4750 50  0001 C CNN
	1    5650 4750
	1    0    0    -1  
$EndComp
$Comp
L CP C1
U 1 1 59BB0FF4
P 950 4800
F 0 "C1" H 975 4900 50  0000 L CNN
F 1 "10uF" H 975 4700 50  0000 L CNN
F 2 "" H 988 4650 50  0001 C CNN
F 3 "" H 950 4800 50  0001 C CNN
	1    950  4800
	1    0    0    -1  
$EndComp
$Comp
L C C4
U 1 1 59BB13CD
P 2300 4800
F 0 "C4" H 2325 4900 50  0000 L CNN
F 1 "0.1uF" H 2325 4700 50  0000 L CNN
F 2 "" H 2338 4650 50  0001 C CNN
F 3 "" H 2300 4800 50  0001 C CNN
	1    2300 4800
	1    0    0    -1  
$EndComp
$Comp
L C C6
U 1 1 59BB148F
P 6000 4750
F 0 "C6" H 6025 4850 50  0000 L CNN
F 1 "0.1uF" H 6025 4650 50  0000 L CNN
F 2 "" H 6038 4600 50  0001 C CNN
F 3 "" H 6000 4750 50  0001 C CNN
	1    6000 4750
	1    0    0    -1  
$EndComp
$Comp
L C C2
U 1 1 59BB1591
P 1300 4800
F 0 "C2" H 1325 4900 50  0000 L CNN
F 1 "0.1uF" H 1325 4700 50  0000 L CNN
F 2 "" H 1338 4650 50  0001 C CNN
F 3 "" H 1300 4800 50  0001 C CNN
	1    1300 4800
	1    0    0    -1  
$EndComp
$Comp
L GNDPWR #PWR2
U 1 1 59BB1787
P 950 5100
F 0 "#PWR2" H 950 4900 50  0001 C CNN
F 1 "GNDPWR" H 950 4970 50  0000 C CNN
F 2 "" H 950 5050 50  0001 C CNN
F 3 "" H 950 5050 50  0001 C CNN
	1    950  5100
	1    0    0    -1  
$EndComp
$Comp
L GNDPWR #PWR6
U 1 1 59BB17B5
P 1300 5100
F 0 "#PWR6" H 1300 4900 50  0001 C CNN
F 1 "GNDPWR" H 1300 4970 50  0000 C CNN
F 2 "" H 1300 5050 50  0001 C CNN
F 3 "" H 1300 5050 50  0001 C CNN
	1    1300 5100
	1    0    0    -1  
$EndComp
$Comp
L GNDPWR #PWR11
U 1 1 59BB17E3
P 2050 5150
F 0 "#PWR11" H 2050 4950 50  0001 C CNN
F 1 "GNDPWR" H 1950 5000 50  0000 C CNN
F 2 "" H 2050 5100 50  0001 C CNN
F 3 "" H 2050 5100 50  0001 C CNN
	1    2050 5150
	1    0    0    -1  
$EndComp
$Comp
L GNDPWR #PWR13
U 1 1 59BB185F
P 2300 5150
F 0 "#PWR13" H 2300 4950 50  0001 C CNN
F 1 "GNDPWR" H 2300 5020 50  0000 C CNN
F 2 "" H 2300 5100 50  0001 C CNN
F 3 "" H 2300 5100 50  0001 C CNN
	1    2300 5150
	1    0    0    -1  
$EndComp
$Comp
L GNDPWR #PWR15
U 1 1 59BB18CE
P 5650 5100
F 0 "#PWR15" H 5650 4900 50  0001 C CNN
F 1 "GNDPWR" H 5650 4970 50  0000 C CNN
F 2 "" H 5650 5050 50  0001 C CNN
F 3 "" H 5650 5050 50  0001 C CNN
	1    5650 5100
	1    0    0    -1  
$EndComp
$Comp
L GNDPWR #PWR20
U 1 1 59BB18FC
P 6000 5100
F 0 "#PWR20" H 6000 4900 50  0001 C CNN
F 1 "GNDPWR" H 6000 4970 50  0000 C CNN
F 2 "" H 6000 5050 50  0001 C CNN
F 3 "" H 6000 5050 50  0001 C CNN
	1    6000 5100
	1    0    0    -1  
$EndComp
$Comp
L VPP #PWR1
U 1 1 59BB1C36
P 950 4350
F 0 "#PWR1" H 950 4200 50  0001 C CNN
F 1 "VPP" H 950 4500 50  0000 C CNN
F 2 "" H 950 4350 50  0001 C CNN
F 3 "" H 950 4350 50  0001 C CNN
	1    950  4350
	1    0    0    -1  
$EndComp
$Comp
L VPP #PWR10
U 1 1 59BB1C98
P 2050 4350
F 0 "#PWR10" H 2050 4200 50  0001 C CNN
F 1 "VPP" H 2050 4500 50  0000 C CNN
F 2 "" H 2050 4350 50  0001 C CNN
F 3 "" H 2050 4350 50  0001 C CNN
	1    2050 4350
	1    0    0    -1  
$EndComp
$Comp
L VCC #PWR12
U 1 1 59BB1D21
P 2300 4350
F 0 "#PWR12" H 2300 4200 50  0001 C CNN
F 1 "VCC" H 2300 4500 50  0000 C CNN
F 2 "" H 2300 4350 50  0001 C CNN
F 3 "" H 2300 4350 50  0001 C CNN
	1    2300 4350
	1    0    0    -1  
$EndComp
$Comp
L VCC #PWR19
U 1 1 59BB1E0C
P 6000 4350
F 0 "#PWR19" H 6000 4200 50  0001 C CNN
F 1 "VCC" H 6000 4500 50  0000 C CNN
F 2 "" H 6000 4350 50  0001 C CNN
F 3 "" H 6000 4350 50  0001 C CNN
	1    6000 4350
	1    0    0    -1  
$EndComp
$Comp
L VPP #PWR14
U 1 1 59BB1E3A
P 5650 4350
F 0 "#PWR14" H 5650 4200 50  0001 C CNN
F 1 "VPP" H 5650 4500 50  0000 C CNN
F 2 "" H 5650 4350 50  0001 C CNN
F 3 "" H 5650 4350 50  0001 C CNN
	1    5650 4350
	1    0    0    -1  
$EndComp
Wire Wire Line
	5650 4350 5650 4600
Wire Wire Line
	5650 4900 5650 5100
Wire Wire Line
	6000 4350 6000 4600
Wire Wire Line
	6000 4900 6000 5100
Wire Wire Line
	2300 4350 2300 4650
Wire Wire Line
	2300 4950 2300 5150
Wire Wire Line
	2050 4350 2050 4650
Wire Wire Line
	2050 4950 2050 5150
Wire Wire Line
	950  4350 950  4650
Wire Wire Line
	1300 4650 1300 4400
Wire Wire Line
	1300 4400 950  4400
Connection ~ 950  4400
Wire Wire Line
	950  4950 950  5100
Wire Wire Line
	1300 4950 1300 5100
$EndSCHEMATC
