EESchema Schematic File Version 2
LIBS:power
LIBS:device
LIBS:transistors
LIBS:conn
LIBS:linear
LIBS:regul
LIBS:74xx
LIBS:cmos4000
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
LIBS:valves
LIBS:CenditBasic
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
L PCF8885 U?
U 1 1 59CA6337
P 3400 1800
F 0 "U?" H 3550 2550 60  0000 C CNN
F 1 "PCF8885" H 3600 700 60  0000 C CNN
F 2 "" H 3400 1800 60  0001 C CNN
F 3 "" H 3400 1800 60  0001 C CNN
	1    3400 1800
	1    0    0    -1  
$EndComp
$Comp
L R_Small RF1
U 1 1 59CA6525
P 7000 1300
F 0 "RF1" V 6900 1250 50  0000 L CNN
F 1 "5k" V 7100 1250 50  0000 L CNN
F 2 "" H 7000 1300 50  0000 C CNN
F 3 "" H 7000 1300 50  0000 C CNN
	1    7000 1300
	0    1    1    0   
$EndComp
$Comp
L R_Small RC1
U 1 1 59CA65EF
P 6400 1550
F 0 "RC1" H 6430 1570 50  0000 L CNN
F 1 "10k" H 6430 1510 50  0000 L CNN
F 2 "" H 6400 1550 50  0000 C CNN
F 3 "" H 6400 1550 50  0000 C CNN
	1    6400 1550
	1    0    0    -1  
$EndComp
$Comp
L C_Small CF1
U 1 1 59CA676B
P 6750 1550
F 0 "CF1" H 6760 1620 50  0000 L CNN
F 1 "10p" H 6760 1470 50  0000 L CNN
F 2 "" H 6750 1550 50  0000 C CNN
F 3 "" H 6750 1550 50  0000 C CNN
	1    6750 1550
	1    0    0    -1  
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CA6801
P 6750 1900
F 0 "#PWR?" H 6750 1650 50  0001 C CNN
F 1 "GNDA" H 6750 1750 50  0000 C CNN
F 2 "" H 6750 1900 50  0000 C CNN
F 3 "" H 6750 1900 50  0000 C CNN
	1    6750 1900
	1    0    0    -1  
$EndComp
Text Label 6200 1250 0    60   ~ 0
IN7
Text Label 7200 1300 0    60   ~ 0
PLATE7
$Comp
L R_Small RF?
U 1 1 59CA6A4F
P 8550 1300
F 0 "RF?" V 8450 1250 50  0000 L CNN
F 1 "5k" V 8650 1250 50  0000 L CNN
F 2 "" H 8550 1300 50  0000 C CNN
F 3 "" H 8550 1300 50  0000 C CNN
	1    8550 1300
	0    1    1    0   
$EndComp
$Comp
L R_Small RC?
U 1 1 59CA6A55
P 7950 1550
F 0 "RC?" H 7980 1570 50  0000 L CNN
F 1 "10k" H 7980 1510 50  0000 L CNN
F 2 "" H 7950 1550 50  0000 C CNN
F 3 "" H 7950 1550 50  0000 C CNN
	1    7950 1550
	1    0    0    -1  
$EndComp
$Comp
L C_Small CF?
U 1 1 59CA6A5B
P 8300 1550
F 0 "CF?" H 8310 1620 50  0000 L CNN
F 1 "10p" H 8310 1470 50  0000 L CNN
F 2 "" H 8300 1550 50  0000 C CNN
F 3 "" H 8300 1550 50  0000 C CNN
	1    8300 1550
	1    0    0    -1  
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CA6A62
P 8300 1900
F 0 "#PWR?" H 8300 1650 50  0001 C CNN
F 1 "GNDA" H 8300 1750 50  0000 C CNN
F 2 "" H 8300 1900 50  0000 C CNN
F 3 "" H 8300 1900 50  0000 C CNN
	1    8300 1900
	1    0    0    -1  
$EndComp
Text Label 7750 1250 0    60   ~ 0
IN6
Text Label 8750 1300 0    60   ~ 0
PLATE6
$Comp
L R_Small RF?
U 1 1 59CA6CC3
P 7000 3250
F 0 "RF?" V 6900 3200 50  0000 L CNN
F 1 "5k" V 7100 3200 50  0000 L CNN
F 2 "" H 7000 3250 50  0000 C CNN
F 3 "" H 7000 3250 50  0000 C CNN
	1    7000 3250
	0    1    1    0   
$EndComp
$Comp
L R_Small RC?
U 1 1 59CA6CC9
P 6400 3500
F 0 "RC?" H 6430 3520 50  0000 L CNN
F 1 "10k" H 6430 3460 50  0000 L CNN
F 2 "" H 6400 3500 50  0000 C CNN
F 3 "" H 6400 3500 50  0000 C CNN
	1    6400 3500
	1    0    0    -1  
$EndComp
$Comp
L C_Small CF?
U 1 1 59CA6CCF
P 6750 3500
F 0 "CF?" H 6760 3570 50  0000 L CNN
F 1 "10p" H 6760 3420 50  0000 L CNN
F 2 "" H 6750 3500 50  0000 C CNN
F 3 "" H 6750 3500 50  0000 C CNN
	1    6750 3500
	1    0    0    -1  
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CA6CD6
P 6750 3850
F 0 "#PWR?" H 6750 3600 50  0001 C CNN
F 1 "GNDA" H 6750 3700 50  0000 C CNN
F 2 "" H 6750 3850 50  0000 C CNN
F 3 "" H 6750 3850 50  0000 C CNN
	1    6750 3850
	1    0    0    -1  
$EndComp
Text Label 6200 3200 0    60   ~ 0
IN5
Text Label 7200 3250 0    60   ~ 0
PLATE5
$Comp
L R_Small RF?
U 1 1 59CA6F7F
P 8450 3250
F 0 "RF?" V 8350 3200 50  0000 L CNN
F 1 "5k" V 8550 3200 50  0000 L CNN
F 2 "" H 8450 3250 50  0000 C CNN
F 3 "" H 8450 3250 50  0000 C CNN
	1    8450 3250
	0    1    1    0   
$EndComp
$Comp
L R_Small RC?
U 1 1 59CA6F85
P 7850 3500
F 0 "RC?" H 7880 3520 50  0000 L CNN
F 1 "10k" H 7880 3460 50  0000 L CNN
F 2 "" H 7850 3500 50  0000 C CNN
F 3 "" H 7850 3500 50  0000 C CNN
	1    7850 3500
	1    0    0    -1  
$EndComp
$Comp
L C_Small CF?
U 1 1 59CA6F8B
P 8200 3500
F 0 "CF?" H 8210 3570 50  0000 L CNN
F 1 "10p" H 8210 3420 50  0000 L CNN
F 2 "" H 8200 3500 50  0000 C CNN
F 3 "" H 8200 3500 50  0000 C CNN
	1    8200 3500
	1    0    0    -1  
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CA6F92
P 8200 3850
F 0 "#PWR?" H 8200 3600 50  0001 C CNN
F 1 "GNDA" H 8200 3700 50  0000 C CNN
F 2 "" H 8200 3850 50  0000 C CNN
F 3 "" H 8200 3850 50  0000 C CNN
	1    8200 3850
	1    0    0    -1  
$EndComp
Text Label 7650 3200 0    60   ~ 0
IN4
Text Label 8650 3250 0    60   ~ 0
PLATE4
$Comp
L R_Small RF?
U 1 1 59CA77F2
P 7000 2300
F 0 "RF?" V 6900 2250 50  0000 L CNN
F 1 "5k" V 7100 2250 50  0000 L CNN
F 2 "" H 7000 2300 50  0000 C CNN
F 3 "" H 7000 2300 50  0000 C CNN
	1    7000 2300
	0    1    1    0   
$EndComp
$Comp
L R_Small RC?
U 1 1 59CA77F8
P 6400 2550
F 0 "RC?" H 6430 2570 50  0000 L CNN
F 1 "10k" H 6430 2510 50  0000 L CNN
F 2 "" H 6400 2550 50  0000 C CNN
F 3 "" H 6400 2550 50  0000 C CNN
	1    6400 2550
	1    0    0    -1  
$EndComp
$Comp
L C_Small CF?
U 1 1 59CA77FE
P 6750 2550
F 0 "CF?" H 6760 2620 50  0000 L CNN
F 1 "10p" H 6760 2470 50  0000 L CNN
F 2 "" H 6750 2550 50  0000 C CNN
F 3 "" H 6750 2550 50  0000 C CNN
	1    6750 2550
	1    0    0    -1  
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CA7805
P 6750 2900
F 0 "#PWR?" H 6750 2650 50  0001 C CNN
F 1 "GNDA" H 6750 2750 50  0000 C CNN
F 2 "" H 6750 2900 50  0000 C CNN
F 3 "" H 6750 2900 50  0000 C CNN
	1    6750 2900
	1    0    0    -1  
$EndComp
Text Label 6200 2250 0    60   ~ 0
IN3
Text Label 7200 2300 0    60   ~ 0
PLATE3
$Comp
L R_Small RF?
U 1 1 59CA7816
P 8550 2300
F 0 "RF?" V 8450 2250 50  0000 L CNN
F 1 "5k" V 8650 2250 50  0000 L CNN
F 2 "" H 8550 2300 50  0000 C CNN
F 3 "" H 8550 2300 50  0000 C CNN
	1    8550 2300
	0    1    1    0   
$EndComp
$Comp
L R_Small RC?
U 1 1 59CA781C
P 7950 2550
F 0 "RC?" H 7980 2570 50  0000 L CNN
F 1 "10k" H 7980 2510 50  0000 L CNN
F 2 "" H 7950 2550 50  0000 C CNN
F 3 "" H 7950 2550 50  0000 C CNN
	1    7950 2550
	1    0    0    -1  
$EndComp
$Comp
L C_Small CF?
U 1 1 59CA7822
P 8300 2550
F 0 "CF?" H 8310 2620 50  0000 L CNN
F 1 "10p" H 8310 2470 50  0000 L CNN
F 2 "" H 8300 2550 50  0000 C CNN
F 3 "" H 8300 2550 50  0000 C CNN
	1    8300 2550
	1    0    0    -1  
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CA7829
P 8300 2900
F 0 "#PWR?" H 8300 2650 50  0001 C CNN
F 1 "GNDA" H 8300 2750 50  0000 C CNN
F 2 "" H 8300 2900 50  0000 C CNN
F 3 "" H 8300 2900 50  0000 C CNN
	1    8300 2900
	1    0    0    -1  
$EndComp
Text Label 7750 2250 0    60   ~ 0
IN2
Text Label 8750 2300 0    60   ~ 0
PLATE2
$Comp
L R_Small RF?
U 1 1 59CA783A
P 7000 4250
F 0 "RF?" V 6900 4200 50  0000 L CNN
F 1 "5k" V 7100 4200 50  0000 L CNN
F 2 "" H 7000 4250 50  0000 C CNN
F 3 "" H 7000 4250 50  0000 C CNN
	1    7000 4250
	0    1    1    0   
$EndComp
$Comp
L R_Small RC?
U 1 1 59CA7840
P 6400 4500
F 0 "RC?" H 6430 4520 50  0000 L CNN
F 1 "10k" H 6430 4460 50  0000 L CNN
F 2 "" H 6400 4500 50  0000 C CNN
F 3 "" H 6400 4500 50  0000 C CNN
	1    6400 4500
	1    0    0    -1  
$EndComp
$Comp
L C_Small CF?
U 1 1 59CA7846
P 6750 4500
F 0 "CF?" H 6760 4570 50  0000 L CNN
F 1 "10p" H 6760 4420 50  0000 L CNN
F 2 "" H 6750 4500 50  0000 C CNN
F 3 "" H 6750 4500 50  0000 C CNN
	1    6750 4500
	1    0    0    -1  
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CA784D
P 6750 4850
F 0 "#PWR?" H 6750 4600 50  0001 C CNN
F 1 "GNDA" H 6750 4700 50  0000 C CNN
F 2 "" H 6750 4850 50  0000 C CNN
F 3 "" H 6750 4850 50  0000 C CNN
	1    6750 4850
	1    0    0    -1  
$EndComp
Text Label 6200 4200 0    60   ~ 0
IN1
Text Label 7200 4250 0    60   ~ 0
PLATE1
$Comp
L R_Small RF?
U 1 1 59CA785E
P 8450 4250
F 0 "RF?" V 8350 4200 50  0000 L CNN
F 1 "5k" V 8550 4200 50  0000 L CNN
F 2 "" H 8450 4250 50  0000 C CNN
F 3 "" H 8450 4250 50  0000 C CNN
	1    8450 4250
	0    1    1    0   
$EndComp
$Comp
L R_Small RC?
U 1 1 59CA7864
P 7850 4500
F 0 "RC?" H 7880 4520 50  0000 L CNN
F 1 "10k" H 7880 4460 50  0000 L CNN
F 2 "" H 7850 4500 50  0000 C CNN
F 3 "" H 7850 4500 50  0000 C CNN
	1    7850 4500
	1    0    0    -1  
$EndComp
$Comp
L C_Small CF?
U 1 1 59CA786A
P 8200 4500
F 0 "CF?" H 8210 4570 50  0000 L CNN
F 1 "10p" H 8210 4420 50  0000 L CNN
F 2 "" H 8200 4500 50  0000 C CNN
F 3 "" H 8200 4500 50  0000 C CNN
	1    8200 4500
	1    0    0    -1  
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CA7871
P 8200 4850
F 0 "#PWR?" H 8200 4600 50  0001 C CNN
F 1 "GNDA" H 8200 4700 50  0000 C CNN
F 2 "" H 8200 4850 50  0000 C CNN
F 3 "" H 8200 4850 50  0000 C CNN
	1    8200 4850
	1    0    0    -1  
$EndComp
Text Label 7650 4200 0    60   ~ 0
IN0
Text Label 8650 4250 0    60   ~ 0
PLATE0
$Comp
L GNDA #PWR?
U 1 1 59CA7D3D
P 2800 1400
F 0 "#PWR?" H 2800 1150 50  0001 C CNN
F 1 "GNDA" V 2800 1150 50  0000 C CNN
F 2 "" H 2800 1400 50  0000 C CNN
F 3 "" H 2800 1400 50  0000 C CNN
	1    2800 1400
	0    1    1    0   
$EndComp
$Comp
L C_Small CPC6
U 1 1 59CAB101
P 4950 2150
F 0 "CPC6" V 4900 2200 50  0000 L CNN
F 1 "100nF" V 5000 2200 50  0000 L CNN
F 2 "" H 4950 2150 50  0000 C CNN
F 3 "" H 4950 2150 50  0000 C CNN
	1    4950 2150
	0    1    1    0   
$EndComp
$Comp
L C_Small CPC4
U 1 1 59CAB560
P 5450 2350
F 0 "CPC4" V 5400 2400 50  0000 L CNN
F 1 "100nF" V 5500 2450 50  0000 L CNN
F 2 "" H 5450 2350 50  0000 C CNN
F 3 "" H 5450 2350 50  0000 C CNN
	1    5450 2350
	0    1    1    0   
$EndComp
$Comp
L C_Small CPC7
U 1 1 59CAB5F6
P 4700 2050
F 0 "CPC7" V 4650 2150 50  0000 L CNN
F 1 "100nF" V 4750 2100 50  0000 L CNN
F 2 "" H 4700 2050 50  0000 C CNN
F 3 "" H 4700 2050 50  0000 C CNN
	1    4700 2050
	0    1    1    0   
$EndComp
$Comp
L C_Small CPC5
U 1 1 59CAB5FC
P 5200 2250
F 0 "CPC5" V 5150 2300 50  0000 L CNN
F 1 "100nF" V 5250 2300 50  0000 L CNN
F 2 "" H 5200 2250 50  0000 C CNN
F 3 "" H 5200 2250 50  0000 C CNN
	1    5200 2250
	0    1    1    0   
$EndComp
$Comp
L C_Small CPC2
U 1 1 59CAB6E6
P 4950 2550
F 0 "CPC2" V 4800 2600 50  0000 L CNN
F 1 "100nF" V 4900 2600 50  0000 L CNN
F 2 "" H 4950 2550 50  0000 C CNN
F 3 "" H 4950 2550 50  0000 C CNN
	1    4950 2550
	0    1    1    0   
$EndComp
$Comp
L C_Small CPC3
U 1 1 59CAB6EC
P 4700 2450
F 0 "CPC3" V 4550 2500 50  0000 L CNN
F 1 "100nF" V 4650 2500 50  0000 L CNN
F 2 "" H 4700 2450 50  0000 C CNN
F 3 "" H 4700 2450 50  0000 C CNN
	1    4700 2450
	0    1    1    0   
$EndComp
$Comp
L C_Small CPC0
U 1 1 59CAB6F2
P 5450 2750
F 0 "CPC0" V 5300 2850 50  0000 L CNN
F 1 "100nF" V 5400 2850 50  0000 L CNN
F 2 "" H 5450 2750 50  0000 C CNN
F 3 "" H 5450 2750 50  0000 C CNN
	1    5450 2750
	0    1    1    0   
$EndComp
$Comp
L C_Small CPC1
U 1 1 59CAB6F8
P 5200 2650
F 0 "CPC1" V 5050 2700 50  0000 L CNN
F 1 "100nF" V 5150 2700 50  0000 L CNN
F 2 "" H 5200 2650 50  0000 C CNN
F 3 "" H 5200 2650 50  0000 C CNN
	1    5200 2650
	0    1    1    0   
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CAF4AD
P 5700 2850
F 0 "#PWR?" H 5700 2600 50  0001 C CNN
F 1 "GNDA" H 5700 2700 50  0000 C CNN
F 2 "" H 5700 2850 50  0000 C CNN
F 3 "" H 5700 2850 50  0000 C CNN
	1    5700 2850
	1    0    0    -1  
$EndComp
Text Label 4350 1200 0    60   ~ 0
IN7
Text Label 4350 1300 0    60   ~ 0
IN6
Text Label 4350 1400 0    60   ~ 0
IN5
Text Label 4350 1500 0    60   ~ 0
IN4
Text Label 4350 1600 0    60   ~ 0
IN3
Text Label 4350 1700 0    60   ~ 0
IN2
Text Label 4350 1800 0    60   ~ 0
IN1
Text Label 4350 1900 0    60   ~ 0
IN0
$Comp
L CONN_01X02 P?
U 1 1 59CC1EEB
P 10000 2550
F 0 "P?" H 10000 2700 50  0000 C CNN
F 1 "PLATE_CONN" H 10000 2400 50  0000 C CNN
F 2 "" H 10000 2550 50  0000 C CNN
F 3 "" H 10000 2550 50  0000 C CNN
	1    10000 2550
	1    0    0    -1  
$EndComp
$Comp
L CONN_01X02 P?
U 1 1 59CC2400
P 10000 2950
F 0 "P?" H 10000 3100 50  0000 C CNN
F 1 "PLATE_CONN" H 9950 2800 50  0000 C CNN
F 2 "" H 10000 2950 50  0000 C CNN
F 3 "" H 10000 2950 50  0000 C CNN
	1    10000 2950
	1    0    0    -1  
$EndComp
$Comp
L CONN_01X02 P?
U 1 1 59CC266E
P 10000 3350
F 0 "P?" H 10000 3500 50  0000 C CNN
F 1 "PLATE_CONN" H 10000 3200 50  0000 C CNN
F 2 "" H 10000 3350 50  0000 C CNN
F 3 "" H 10000 3350 50  0000 C CNN
	1    10000 3350
	1    0    0    -1  
$EndComp
$Comp
L CONN_01X02 P?
U 1 1 59CC2674
P 10000 3750
F 0 "P?" H 10000 3900 50  0000 C CNN
F 1 "PLATE_CONN" H 10050 3600 50  0000 C CNN
F 2 "" H 10000 3750 50  0000 C CNN
F 3 "" H 10000 3750 50  0000 C CNN
	1    10000 3750
	1    0    0    -1  
$EndComp
$Comp
L CONN_01X02 P?
U 1 1 59CC27C2
P 11050 2550
F 0 "P?" H 11050 2700 50  0000 C CNN
F 1 "PLATE_CONN" H 11050 2400 50  0000 C CNN
F 2 "" H 11050 2550 50  0000 C CNN
F 3 "" H 11050 2550 50  0000 C CNN
	1    11050 2550
	1    0    0    -1  
$EndComp
$Comp
L CONN_01X02 P?
U 1 1 59CC27C8
P 11050 2950
F 0 "P?" H 11050 3100 50  0000 C CNN
F 1 "PLATE_CONN" H 11050 2800 50  0000 C CNN
F 2 "" H 11050 2950 50  0000 C CNN
F 3 "" H 11050 2950 50  0000 C CNN
	1    11050 2950
	1    0    0    -1  
$EndComp
$Comp
L CONN_01X02 P?
U 1 1 59CC27CE
P 11050 3350
F 0 "P?" H 11050 3500 50  0000 C CNN
F 1 "PLATE_CONN" H 11050 3200 50  0000 C CNN
F 2 "" H 11050 3350 50  0000 C CNN
F 3 "" H 11050 3350 50  0000 C CNN
	1    11050 3350
	1    0    0    -1  
$EndComp
$Comp
L CONN_01X02 P?
U 1 1 59CC27D4
P 11050 3750
F 0 "P?" H 11050 3900 50  0000 C CNN
F 1 "PLATE_CONN" H 11050 3600 50  0000 C CNN
F 2 "" H 11050 3750 50  0000 C CNN
F 3 "" H 11050 3750 50  0000 C CNN
	1    11050 3750
	1    0    0    -1  
$EndComp
Text Label 9300 1400 0    60   ~ 0
PLATE6
Text Label 9300 1300 0    60   ~ 0
PLATE7
$Comp
L GNDA #PWR?
U 1 1 59CB26BE
P 10300 2150
F 0 "#PWR?" H 10300 1900 50  0001 C CNN
F 1 "GNDA" H 10300 2000 50  0000 C CNN
F 2 "" H 10300 2150 50  0000 C CNN
F 3 "" H 10300 2150 50  0000 C CNN
	1    10300 2150
	1    0    0    -1  
$EndComp
$Comp
L CONN_02X08 PLATES_CONN
U 1 1 59CB0581
P 9900 1650
F 0 "PLATES_CONN" H 9900 2100 50  0000 C CNN
F 1 "CONN_02X08" V 9900 1650 50  0000 C CNN
F 2 "" H 9900 450 50  0000 C CNN
F 3 "" H 9900 450 50  0000 C CNN
	1    9900 1650
	1    0    0    -1  
$EndComp
Text Label 9300 1500 0    60   ~ 0
PLATE5
Text Label 9300 1600 0    60   ~ 0
PLATE4
Text Label 9300 1700 0    60   ~ 0
PLATE3
Text Label 9300 1800 0    60   ~ 0
PLATE2
Text Label 9300 1900 0    60   ~ 0
PLATE1
Text Label 9300 2000 0    60   ~ 0
PLATE0
$Comp
L C C?
U 1 1 59CC74CA
P 3200 3450
F 0 "C?" H 3225 3550 50  0000 L CNN
F 1 "1uF" H 3225 3350 50  0000 L CNN
F 2 "" H 3238 3300 50  0000 C CNN
F 3 "" H 3200 3450 50  0000 C CNN
	1    3200 3450
	1    0    0    -1  
$EndComp
$Comp
L C C?
U 1 1 59CC78C4
P 3550 3450
F 0 "C?" H 3575 3550 50  0000 L CNN
F 1 "100nF" H 3575 3350 50  0000 L CNN
F 2 "" H 3588 3300 50  0000 C CNN
F 3 "" H 3550 3450 50  0000 C CNN
	1    3550 3450
	1    0    0    -1  
$EndComp
$Comp
L C C?
U 1 1 59CC7963
P 3900 3450
F 0 "C?" H 3925 3550 50  0000 L CNN
F 1 "100nF" H 3925 3350 50  0000 L CNN
F 2 "" H 3938 3300 50  0000 C CNN
F 3 "" H 3900 3450 50  0000 C CNN
	1    3900 3450
	1    0    0    -1  
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CC7E9D
P 2800 2050
F 0 "#PWR?" H 2800 1800 50  0001 C CNN
F 1 "GNDA" V 2800 1800 50  0000 C CNN
F 2 "" H 2800 2050 50  0000 C CNN
F 3 "" H 2800 2050 50  0000 C CNN
	1    2800 2050
	0    1    1    0   
$EndComp
$Comp
L +3.3V #PWR?
U 1 1 59CC8C35
P 2950 1100
F 0 "#PWR?" H 2950 950 50  0001 C CNN
F 1 "+3.3V" H 2950 1240 50  0000 C CNN
F 2 "" H 2950 1100 50  0000 C CNN
F 3 "" H 2950 1100 50  0000 C CNN
	1    2950 1100
	1    0    0    -1  
$EndComp
$Comp
L VDD #PWR?
U 1 1 59CC8CA3
P 2750 1200
F 0 "#PWR?" H 2750 1050 50  0001 C CNN
F 1 "VDD" H 2750 1350 50  0000 C CNN
F 2 "" H 2750 1200 50  0000 C CNN
F 3 "" H 2750 1200 50  0000 C CNN
	1    2750 1200
	1    0    0    -1  
$EndComp
$Comp
L +3.3V #PWR?
U 1 1 59CCAF94
P 3200 3150
F 0 "#PWR?" H 3200 3000 50  0001 C CNN
F 1 "+3.3V" H 3200 3290 50  0000 C CNN
F 2 "" H 3200 3150 50  0000 C CNN
F 3 "" H 3200 3150 50  0000 C CNN
	1    3200 3150
	1    0    0    -1  
$EndComp
$Comp
L VDD #PWR?
U 1 1 59CCB002
P 3900 3150
F 0 "#PWR?" H 3900 3000 50  0001 C CNN
F 1 "VDD" H 3900 3300 50  0000 C CNN
F 2 "" H 3900 3150 50  0000 C CNN
F 3 "" H 3900 3150 50  0000 C CNN
	1    3900 3150
	1    0    0    -1  
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CCB3D4
P 3200 3750
F 0 "#PWR?" H 3200 3500 50  0001 C CNN
F 1 "GNDA" H 3200 3600 50  0000 C CNN
F 2 "" H 3200 3750 50  0000 C CNN
F 3 "" H 3200 3750 50  0000 C CNN
	1    3200 3750
	1    0    0    -1  
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CCB46F
P 3900 3750
F 0 "#PWR?" H 3900 3500 50  0001 C CNN
F 1 "GNDA" H 3900 3600 50  0000 C CNN
F 2 "" H 3900 3750 50  0000 C CNN
F 3 "" H 3900 3750 50  0000 C CNN
	1    3900 3750
	1    0    0    -1  
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CDAF81
P 9650 3800
F 0 "#PWR?" H 9650 3550 50  0001 C CNN
F 1 "GNDA" V 9650 3550 50  0000 C CNN
F 2 "" H 9650 3800 50  0000 C CNN
F 3 "" H 9650 3800 50  0000 C CNN
	1    9650 3800
	0    1    1    0   
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CDAFEF
P 9650 3400
F 0 "#PWR?" H 9650 3150 50  0001 C CNN
F 1 "GNDA" V 9650 3150 50  0000 C CNN
F 2 "" H 9650 3400 50  0000 C CNN
F 3 "" H 9650 3400 50  0000 C CNN
	1    9650 3400
	0    1    1    0   
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CDB364
P 9650 3000
F 0 "#PWR?" H 9650 2750 50  0001 C CNN
F 1 "GNDA" V 9650 2750 50  0000 C CNN
F 2 "" H 9650 3000 50  0000 C CNN
F 3 "" H 9650 3000 50  0000 C CNN
	1    9650 3000
	0    1    1    0   
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CDB3D2
P 9650 2600
F 0 "#PWR?" H 9650 2350 50  0001 C CNN
F 1 "GNDA" V 9650 2350 50  0000 C CNN
F 2 "" H 9650 2600 50  0000 C CNN
F 3 "" H 9650 2600 50  0000 C CNN
	1    9650 2600
	0    1    1    0   
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CDBC01
P 10700 2600
F 0 "#PWR?" H 10700 2350 50  0001 C CNN
F 1 "GNDA" V 10700 2350 50  0000 C CNN
F 2 "" H 10700 2600 50  0000 C CNN
F 3 "" H 10700 2600 50  0000 C CNN
	1    10700 2600
	0    1    1    0   
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CDBC6F
P 10700 3000
F 0 "#PWR?" H 10700 2750 50  0001 C CNN
F 1 "GNDA" V 10700 2750 50  0000 C CNN
F 2 "" H 10700 3000 50  0000 C CNN
F 3 "" H 10700 3000 50  0000 C CNN
	1    10700 3000
	0    1    1    0   
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CDBD37
P 10700 3400
F 0 "#PWR?" H 10700 3150 50  0001 C CNN
F 1 "GNDA" V 10700 3150 50  0000 C CNN
F 2 "" H 10700 3400 50  0000 C CNN
F 3 "" H 10700 3400 50  0000 C CNN
	1    10700 3400
	0    1    1    0   
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CDBDFF
P 10700 3800
F 0 "#PWR?" H 10700 3550 50  0001 C CNN
F 1 "GNDA" V 10700 3550 50  0000 C CNN
F 2 "" H 10700 3800 50  0000 C CNN
F 3 "" H 10700 3800 50  0000 C CNN
	1    10700 3800
	0    1    1    0   
$EndComp
Text Label 9400 2500 0    60   ~ 0
PLATE0
Text Label 9450 2900 0    60   ~ 0
PLATE1
Text Label 9450 3300 0    60   ~ 0
PLATE2
Text Label 9450 3700 0    60   ~ 0
PLATE3
Text Label 10500 2500 0    60   ~ 0
PLATE4
Text Label 10500 2900 0    60   ~ 0
PLATE5
Text Label 10500 3300 0    60   ~ 0
PLATE6
Text Label 10500 3700 0    60   ~ 0
PLATE7
$Comp
L CONN_01X08 P?
U 1 1 59CE24CF
P 750 1450
F 0 "P?" H 750 1900 50  0000 C CNN
F 1 "CONN_01X08" V 850 1450 50  0000 C CNN
F 2 "" H 750 1450 50  0000 C CNN
F 3 "" H 750 1450 50  0000 C CNN
	1    750  1450
	-1   0    0    1   
$EndComp
$Comp
L CONN_01X11 P?
U 1 1 59CE30AA
P 750 2750
F 0 "P?" H 750 3350 50  0000 C CNN
F 1 "DEBUG_CONN" V 850 2750 50  0000 C CNN
F 2 "" H 750 2750 50  0000 C CNN
F 3 "" H 750 2750 50  0000 C CNN
	1    750  2750
	-1   0    0    1   
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CE507F
P 1150 1200
F 0 "#PWR?" H 1150 950 50  0001 C CNN
F 1 "GNDA" V 1150 1000 50  0000 C CNN
F 2 "" H 1150 1200 50  0000 C CNN
F 3 "" H 1150 1200 50  0000 C CNN
	1    1150 1200
	0    -1   -1   0   
$EndComp
$Comp
L +3.3V #PWR?
U 1 1 59CE5337
P 1200 1000
F 0 "#PWR?" H 1200 850 50  0001 C CNN
F 1 "+3.3V" H 1200 1140 50  0000 C CNN
F 2 "" H 1200 1000 50  0000 C CNN
F 3 "" H 1200 1000 50  0000 C CNN
	1    1200 1000
	1    0    0    -1  
$EndComp
Text Label 1000 1800 0    60   ~ 0
SCL
Text Label 1000 1700 0    60   ~ 0
SDA
Text Label 1000 1600 0    60   ~ 0
A0
Text Label 1000 1500 0    60   ~ 0
/INT
Text Label 1000 1400 0    60   ~ 0
SLEEP
$Comp
L R_Small R?
U 1 1 59CE6FE3
P 2700 1850
F 0 "R?" V 2600 1800 50  0000 L CNN
F 1 "1OK" V 2800 1800 50  0000 L CNN
F 2 "" H 2700 1850 50  0000 C CNN
F 3 "" H 2700 1850 50  0000 C CNN
	1    2700 1850
	0    1    1    0   
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CE74DE
P 2500 1850
F 0 "#PWR?" H 2500 1600 50  0001 C CNN
F 1 "GNDA" V 2500 1600 50  0000 C CNN
F 2 "" H 2500 1850 50  0000 C CNN
F 3 "" H 2500 1850 50  0000 C CNN
	1    2500 1850
	0    1    1    0   
$EndComp
Text Label 2850 1850 0    60   ~ 0
SLEEP
$Comp
L +3.3V #PWR?
U 1 1 59CEC609
P 1100 2150
F 0 "#PWR?" H 1100 2000 50  0001 C CNN
F 1 "+3.3V" H 1100 2290 50  0000 C CNN
F 2 "" H 1100 2150 50  0000 C CNN
F 3 "" H 1100 2150 50  0000 C CNN
	1    1100 2150
	1    0    0    -1  
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CEC67D
P 1100 2350
F 0 "#PWR?" H 1100 2100 50  0001 C CNN
F 1 "GNDA" V 1100 2100 50  0000 C CNN
F 2 "" H 1100 2350 50  0000 C CNN
F 3 "" H 1100 2350 50  0000 C CNN
	1    1100 2350
	0    -1   -1   0   
$EndComp
$Comp
L VDD #PWR?
U 1 1 59CECB1B
P 1200 2450
F 0 "#PWR?" H 1200 2300 50  0001 C CNN
F 1 "VDD" V 1200 2650 50  0000 C CNN
F 2 "" H 1200 2450 50  0000 C CNN
F 3 "" H 1200 2450 50  0000 C CNN
	1    1200 2450
	0    1    1    0   
$EndComp
Text Label 2800 2600 0    60   ~ 0
SCL
Text Label 2800 2500 0    60   ~ 0
SDA
Text Label 2800 2400 0    60   ~ 0
A0
Text Label 2750 2250 0    60   ~ 0
/INT_IN
Text Label 2800 2150 0    60   ~ 0
/INT
Text Label 2650 1650 0    60   ~ 0
CLK_OUT
Text Label 2650 1550 0    60   ~ 0
CLK_IN
Text Label 950  3250 0    60   ~ 0
SCL
Text Label 950  3150 0    60   ~ 0
SDA
Text Label 950  3050 0    60   ~ 0
A0
Text Label 950  2950 0    60   ~ 0
/INT
Text Label 950  2850 0    60   ~ 0
SLEEP
Text Label 950  2750 0    60   ~ 0
/INT_IN
Text Label 1000 2550 0    60   ~ 0
CLK_IN
Text Label 1000 2650 0    60   ~ 0
CLK_OUT
$Comp
L LED D?
U 1 1 59CFADEB
P 4500 3700
F 0 "D?" H 4500 3800 50  0000 C CNN
F 1 "LED" H 4500 3600 50  0000 C CNN
F 2 "" H 4500 3700 50  0000 C CNN
F 3 "" H 4500 3700 50  0000 C CNN
	1    4500 3700
	0    -1   -1   0   
$EndComp
$Comp
L R_Small R?
U 1 1 59CFAEBC
P 4500 3350
F 0 "R?" H 4530 3370 50  0000 L CNN
F 1 "330" H 4530 3310 50  0000 L CNN
F 2 "" H 4500 3350 50  0000 C CNN
F 3 "" H 4500 3350 50  0000 C CNN
	1    4500 3350
	1    0    0    -1  
$EndComp
$Comp
L +3.3V #PWR?
U 1 1 59CFAFA9
P 4500 3100
F 0 "#PWR?" H 4500 2950 50  0001 C CNN
F 1 "+3.3V" H 4500 3240 50  0000 C CNN
F 2 "" H 4500 3100 50  0000 C CNN
F 3 "" H 4500 3100 50  0000 C CNN
	1    4500 3100
	1    0    0    -1  
$EndComp
$Comp
L GNDA #PWR?
U 1 1 59CFB085
P 4500 4000
F 0 "#PWR?" H 4500 3750 50  0001 C CNN
F 1 "GNDA" H 4500 3850 50  0000 C CNN
F 2 "" H 4500 4000 50  0000 C CNN
F 3 "" H 4500 4000 50  0000 C CNN
	1    4500 4000
	1    0    0    -1  
$EndComp
$Comp
L TEST TP1
U 1 1 59CFFBD1
P 1250 3550
F 0 "TP1" V 1300 3850 50  0000 C BNN
F 1 "TEST_VDD" V 1200 3950 50  0000 C CNN
F 2 "" H 1250 3550 50  0000 C CNN
F 3 "" H 1250 3550 50  0000 C CNN
	1    1250 3550
	0    -1   -1   0   
$EndComp
$Comp
L TEST TP?
U 1 1 59CFFC62
P 1250 3750
F 0 "TP?" V 1300 4050 50  0000 C BNN
F 1 "VDD_INTREGD" V 1200 4250 50  0000 C CNN
F 2 "" H 1250 3750 50  0000 C CNN
F 3 "" H 1250 3750 50  0000 C CNN
	1    1250 3750
	0    -1   -1   0   
$EndComp
$Comp
L TEST TP?
U 1 1 59D003A5
P 1250 4550
F 0 "TP?" V 1300 4850 50  0000 C BNN
F 1 "TEST_SDA" V 1200 4950 50  0000 C CNN
F 2 "" H 1250 4550 50  0000 C CNN
F 3 "" H 1250 4550 50  0000 C CNN
	1    1250 4550
	0    -1   -1   0   
$EndComp
$Comp
L TEST TP?
U 1 1 59D00883
P 1250 4400
F 0 "TP?" V 1300 4700 50  0000 C BNN
F 1 "TEST_SCL" V 1200 4800 50  0000 C CNN
F 2 "" H 1250 4400 50  0000 C CNN
F 3 "" H 1250 4400 50  0000 C CNN
	1    1250 4400
	0    -1   -1   0   
$EndComp
$Comp
L TEST TP?
U 1 1 59D00922
P 1250 4850
F 0 "TP?" V 1300 5150 50  0000 C BNN
F 1 "TEST_INT" V 1200 5250 50  0000 C CNN
F 2 "" H 1250 4850 50  0000 C CNN
F 3 "" H 1250 4850 50  0000 C CNN
	1    1250 4850
	0    -1   -1   0   
$EndComp
$Comp
L TEST TP?
U 1 1 59D03A8D
P 1250 4700
F 0 "TP?" V 1300 5000 50  0000 C BNN
F 1 "TEST_SLEEP" V 1200 5150 50  0000 C CNN
F 2 "" H 1250 4700 50  0000 C CNN
F 3 "" H 1250 4700 50  0000 C CNN
	1    1250 4700
	0    -1   -1   0   
$EndComp
$Comp
L TEST TP?
U 1 1 59D03CE4
P 1250 3950
F 0 "TP?" V 1300 4250 50  0000 C BNN
F 1 "TEST_GND" V 1200 4350 50  0000 C CNN
F 2 "" H 1250 3950 50  0000 C CNN
F 3 "" H 1250 3950 50  0000 C CNN
	1    1250 3950
	0    -1   -1   0   
$EndComp
Wire Wire Line
	6400 1450 6400 1300
Wire Wire Line
	6750 1650 6750 1900
Wire Wire Line
	6400 1650 6400 1750
Wire Wire Line
	6400 1750 6750 1750
Connection ~ 6750 1750
Wire Wire Line
	6750 1450 6750 1300
Connection ~ 6750 1300
Wire Wire Line
	6200 1300 6900 1300
Wire Wire Line
	7100 1300 7300 1300
Connection ~ 6400 1300
Wire Wire Line
	7950 1450 7950 1300
Wire Wire Line
	8300 1650 8300 1900
Wire Wire Line
	7950 1650 7950 1750
Wire Wire Line
	7950 1750 8300 1750
Connection ~ 8300 1750
Wire Wire Line
	8300 1450 8300 1300
Connection ~ 8300 1300
Wire Wire Line
	7750 1300 8450 1300
Wire Wire Line
	8650 1300 8850 1300
Connection ~ 7950 1300
Wire Wire Line
	6400 3400 6400 3250
Wire Wire Line
	6750 3600 6750 3850
Wire Wire Line
	6400 3600 6400 3700
Wire Wire Line
	6400 3700 6750 3700
Connection ~ 6750 3700
Wire Wire Line
	6750 3400 6750 3250
Connection ~ 6750 3250
Wire Wire Line
	6200 3250 6900 3250
Wire Wire Line
	7100 3250 7300 3250
Connection ~ 6400 3250
Wire Wire Line
	7850 3400 7850 3250
Wire Wire Line
	8200 3600 8200 3850
Wire Wire Line
	7850 3600 7850 3700
Wire Wire Line
	7850 3700 8200 3700
Connection ~ 8200 3700
Wire Wire Line
	8200 3400 8200 3250
Connection ~ 8200 3250
Wire Wire Line
	7650 3250 8350 3250
Wire Wire Line
	8550 3250 8750 3250
Connection ~ 7850 3250
Wire Wire Line
	6400 2450 6400 2300
Wire Wire Line
	6750 2650 6750 2900
Wire Wire Line
	6400 2650 6400 2750
Wire Wire Line
	6400 2750 6750 2750
Connection ~ 6750 2750
Wire Wire Line
	6750 2450 6750 2300
Connection ~ 6750 2300
Wire Wire Line
	6200 2300 6900 2300
Wire Wire Line
	7100 2300 7300 2300
Connection ~ 6400 2300
Wire Wire Line
	7950 2450 7950 2300
Wire Wire Line
	8300 2650 8300 2900
Wire Wire Line
	7950 2650 7950 2750
Wire Wire Line
	7950 2750 8300 2750
Connection ~ 8300 2750
Wire Wire Line
	8300 2450 8300 2300
Connection ~ 8300 2300
Wire Wire Line
	7750 2300 8450 2300
Wire Wire Line
	8650 2300 8850 2300
Connection ~ 7950 2300
Wire Wire Line
	6400 4400 6400 4250
Wire Wire Line
	6750 4600 6750 4850
Wire Wire Line
	6400 4600 6400 4700
Wire Wire Line
	6400 4700 6750 4700
Connection ~ 6750 4700
Wire Wire Line
	6750 4400 6750 4250
Connection ~ 6750 4250
Wire Wire Line
	6200 4250 6900 4250
Wire Wire Line
	7100 4250 7300 4250
Connection ~ 6400 4250
Wire Wire Line
	7850 4400 7850 4250
Wire Wire Line
	8200 4600 8200 4850
Wire Wire Line
	7850 4600 7850 4700
Wire Wire Line
	7850 4700 8200 4700
Connection ~ 8200 4700
Wire Wire Line
	8200 4400 8200 4250
Connection ~ 8200 4250
Wire Wire Line
	7650 4250 8350 4250
Wire Wire Line
	8550 4250 8750 4250
Connection ~ 7850 4250
Wire Wire Line
	4200 1200 4450 1200
Wire Wire Line
	4200 1300 4450 1300
Wire Wire Line
	4200 1400 4450 1400
Wire Wire Line
	4200 1500 4450 1500
Wire Wire Line
	4200 1600 4450 1600
Wire Wire Line
	4200 1700 4450 1700
Wire Wire Line
	4200 1800 4450 1800
Wire Wire Line
	4200 1900 4450 1900
Wire Wire Line
	4200 2050 4600 2050
Wire Wire Line
	4200 2150 4850 2150
Wire Wire Line
	4200 2250 5100 2250
Wire Wire Line
	4200 2350 5350 2350
Wire Wire Line
	4200 2450 4600 2450
Wire Wire Line
	4200 2550 4850 2550
Wire Wire Line
	4200 2650 5100 2650
Wire Wire Line
	4200 2750 5350 2750
Wire Wire Line
	4800 2050 5700 2050
Wire Wire Line
	5700 2050 5700 2850
Wire Wire Line
	5550 2750 5700 2750
Connection ~ 5700 2750
Wire Wire Line
	5300 2650 5700 2650
Connection ~ 5700 2650
Wire Wire Line
	5050 2550 5700 2550
Connection ~ 5700 2550
Wire Wire Line
	4800 2450 5700 2450
Connection ~ 5700 2450
Wire Wire Line
	5550 2350 5700 2350
Connection ~ 5700 2350
Wire Wire Line
	5300 2250 5700 2250
Connection ~ 5700 2250
Wire Wire Line
	5050 2150 5700 2150
Connection ~ 5700 2150
Wire Wire Line
	9650 2000 9450 2000
Wire Wire Line
	9650 1900 9450 1900
Wire Wire Line
	9650 1800 9450 1800
Wire Wire Line
	9650 1700 9450 1700
Wire Wire Line
	9650 1600 9450 1600
Wire Wire Line
	9650 1500 9450 1500
Wire Wire Line
	9650 1400 9450 1400
Wire Wire Line
	9650 1300 9450 1300
Connection ~ 10300 2000
Wire Wire Line
	10150 2000 10300 2000
Connection ~ 10300 1900
Wire Wire Line
	10150 1900 10300 1900
Connection ~ 10300 1800
Wire Wire Line
	10150 1800 10300 1800
Connection ~ 10300 1700
Wire Wire Line
	10150 1700 10300 1700
Connection ~ 10300 1600
Wire Wire Line
	10150 1600 10300 1600
Connection ~ 10300 1500
Wire Wire Line
	10150 1500 10300 1500
Connection ~ 10300 1400
Wire Wire Line
	10150 1400 10300 1400
Wire Wire Line
	10300 1300 10300 2150
Wire Wire Line
	10150 1300 10300 1300
Wire Wire Line
	3000 2050 2800 2050
Wire Wire Line
	3000 1400 2800 1400
Wire Wire Line
	2950 1100 2950 1200
Wire Wire Line
	2950 1200 3000 1200
Wire Wire Line
	2750 1300 3000 1300
Wire Wire Line
	2750 1300 2750 1200
Wire Wire Line
	3200 3150 3200 3300
Wire Wire Line
	3550 3300 3550 3200
Wire Wire Line
	3550 3200 3200 3200
Connection ~ 3200 3200
Wire Wire Line
	3900 3150 3900 3300
Wire Wire Line
	3200 3600 3200 3750
Wire Wire Line
	3550 3600 3550 3700
Wire Wire Line
	3550 3700 3200 3700
Connection ~ 3200 3700
Wire Wire Line
	3900 3600 3900 3750
Wire Wire Line
	9800 2500 9650 2500
Wire Wire Line
	9800 3300 9650 3300
Wire Wire Line
	9800 3000 9650 3000
Wire Wire Line
	9800 2900 9650 2900
Wire Wire Line
	9800 3400 9650 3400
Wire Wire Line
	9800 3700 9650 3700
Wire Wire Line
	9800 3800 9650 3800
Wire Wire Line
	10850 2900 10700 2900
Wire Wire Line
	10850 3000 10700 3000
Wire Wire Line
	10850 2500 10700 2500
Wire Wire Line
	10850 2600 10700 2600
Wire Wire Line
	10850 3300 10700 3300
Wire Wire Line
	10850 3400 10700 3400
Wire Wire Line
	10850 3700 10700 3700
Wire Wire Line
	10850 3800 10700 3800
Wire Wire Line
	9800 2600 9650 2600
Wire Wire Line
	950  1100 1200 1100
Wire Wire Line
	950  1400 1100 1400
Wire Wire Line
	950  1500 1100 1500
Wire Wire Line
	950  1600 1100 1600
Wire Wire Line
	950  1700 1100 1700
Wire Wire Line
	950  1800 1100 1800
Wire Wire Line
	3000 1550 2800 1550
Wire Wire Line
	3000 1650 2800 1650
Wire Wire Line
	3000 2150 2800 2150
Wire Wire Line
	3000 2250 2800 2250
Wire Wire Line
	3000 2500 2800 2500
Wire Wire Line
	3000 2600 2800 2600
Wire Wire Line
	1200 1100 1200 1000
Wire Wire Line
	1150 1200 950  1200
Wire Wire Line
	2800 1850 3000 1850
Wire Wire Line
	2600 1850 2500 1850
Wire Wire Line
	1100 2150 1100 2250
Wire Wire Line
	1100 2250 950  2250
Wire Wire Line
	1100 2350 950  2350
Wire Wire Line
	1200 2450 950  2450
Wire Wire Line
	3000 2400 2800 2400
Wire Wire Line
	950  3250 1150 3250
Wire Wire Line
	950  3150 1150 3150
Wire Wire Line
	950  3050 1150 3050
Wire Wire Line
	950  2950 1150 2950
Wire Wire Line
	950  2850 1150 2850
Wire Wire Line
	950  2750 1150 2750
Wire Wire Line
	950  2650 1150 2650
Wire Wire Line
	950  2550 1150 2550
Wire Wire Line
	4500 3100 4500 3250
Wire Wire Line
	4500 3450 4500 3550
Wire Wire Line
	4500 3850 4500 4000
Wire Wire Line
	1250 4850 1350 4850
Wire Wire Line
	1250 4400 1350 4400
Wire Wire Line
	1250 4550 1350 4550
Wire Wire Line
	1250 4700 1350 4700
Wire Wire Line
	1250 3950 1350 3950
Wire Wire Line
	1250 3750 1600 3750
Wire Wire Line
	1250 3550 1350 3550
Text Label 1200 3550 0    60   ~ 0
VDD
Text Label 1200 3750 0    39   ~ 0
VDD_INTREGD
Text Label 1200 3950 0    60   ~ 0
GND
$Comp
L GNDA #PWR?
U 1 1 59D0D18F
P 1350 3950
F 0 "#PWR?" H 1350 3700 50  0001 C CNN
F 1 "GNDA" V 1350 3750 50  0000 C CNN
F 2 "" H 1350 3950 50  0000 C CNN
F 3 "" H 1350 3950 50  0000 C CNN
	1    1350 3950
	0    -1   -1   0   
$EndComp
$Comp
L +3.3V #PWR?
U 1 1 59D0D3EE
P 1350 3550
F 0 "#PWR?" H 1350 3400 50  0001 C CNN
F 1 "+3.3V" V 1350 3800 50  0000 C CNN
F 2 "" H 1350 3550 50  0000 C CNN
F 3 "" H 1350 3550 50  0000 C CNN
	1    1350 3550
	0    1    1    0   
$EndComp
$Comp
L VDD #PWR?
U 1 1 59D0D5CE
P 1600 3750
F 0 "#PWR?" H 1600 3600 50  0001 C CNN
F 1 "VDD" V 1600 3950 50  0000 C CNN
F 2 "" H 1600 3750 50  0000 C CNN
F 3 "" H 1600 3750 50  0000 C CNN
	1    1600 3750
	0    1    1    0   
$EndComp
Text Label 1200 4400 0    60   ~ 0
SCL
Text Label 1200 4550 0    60   ~ 0
SDA
Text Label 1200 4700 0    60   ~ 0
SLEEP
Text Label 1200 4850 0    60   ~ 0
INT
$Comp
L TEST TP?
U 1 1 59D12F66
P 1250 4250
F 0 "TP?" V 1300 4550 50  0000 C BNN
F 1 "TEST" V 1200 4550 50  0000 C CNN
F 2 "" H 1250 4250 50  0000 C CNN
F 3 "" H 1250 4250 50  0000 C CNN
	1    1250 4250
	0    -1   -1   0   
$EndComp
Wire Wire Line
	1250 4250 1350 4250
Text Label 1250 4250 0    60   ~ 0
A0
$EndSCHEMATC