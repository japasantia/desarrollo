/*
 * File:   example3.c
 * Author: Microchip Technology Inc
 *
 * Created on April 2, 2015, 2:47 PM
 */

// PIC16F1719 Configuration Bit Settings

// 'C' source line config statements

#include <xc.h>

// #pragma config statements should precede project file includes.
// Use project enums instead of #define for ON and OFF.

// CONFIG1
#pragma config FOSC = ECH       // Oscillator Selection Bits (ECH, External Clock, High Power Mode (4-20 MHz): device clock supplied to CLKIN pins)
#pragma config WDTE = OFF       // Watchdog Timer Enable (WDT disabled)
#pragma config PWRTE = OFF      // Power-up Timer Enable (PWRT disabled)
#pragma config MCLRE = ON       // MCLR Pin Function Select (MCLR/VPP pin function is MCLR)
#pragma config CP = OFF         // Flash Program Memory Code Protection (Program memory code protection is disabled)
#pragma config BOREN = ON       // Brown-out Reset Enable (Brown-out Reset enabled)
#pragma config CLKOUTEN = OFF   // Clock Out Enable (CLKOUT function is disabled. I/O or oscillator function on the CLKOUT pin)
#pragma config IESO = ON        // Internal/External Switchover Mode (Internal/External Switchover Mode is enabled)
#pragma config FCMEN = ON       // Fail-Safe Clock Monitor Enable (Fail-Safe Clock Monitor is enabled)

// CONFIG2
#pragma config WRT = OFF        // Flash Memory Self-Write Protection (Write protection off)
#pragma config PPS1WAY = ON     // Peripheral Pin Select one-way control (The PPSLOCK bit cannot be cleared once it is set by software)
#pragma config ZCDDIS = ON      // Zero-cross detect disable (Zero-cross detect circuit is disabled at POR and can be enabled with ZCDSEN bit.)
#pragma config PLLEN = OFF      // Phase Lock Loop enable (4x PLL is enabled when software sets the SPLLEN bit)
#pragma config STVREN = ON      // Stack Overflow/Underflow Reset Enable (Stack Overflow or Underflow will cause a Reset)
#pragma config BORV = LO        // Brown-out Reset Voltage Selection (Brown-out Reset Voltage (Vbor), low trip point selected.)
#pragma config LPBOR = OFF      // Low-Power Brown Out Reset (Low-Power BOR is disabled)
#pragma config LVP = OFF        // Low-Voltage Programming Enable (High-voltage on MCLR/VPP must be used for programming)

// Interrupt function

void interrupt isr(void){
	// only process timer0-triggered interrupts
	if(INTCONbits.TMR0IE && INTCONbits.TMR0IF) {
            static unsigned char portValue;
            LATB = (portValue++ >> 4); // write to port latch - RB[0:3] = LED[4:7]
            LATD = portValue++; // write to port latch - RD[0:3] = LED[0:3]
            INTCONbits.TMR0IF = 0; // clear this interrupt condition
	}
}

void main(void) {

    // Port B access
    ANSELB = 0x0;  // set to digital I/O (not analog)
    TRISB = 0x0;   // set all port bits to be output

    // Port D access
    ANSELD = 0x0;  // set to digital I/O (not analog)
    TRISD = 0x0;   // set all port bits to be output

    // Timer setup
    OPTION_REG = 0xD7; // timer 0 internal clock, prescaler 1:256
    INTCONbits.TMR0IE = 1; // enable interrupts for timer 0
    ei(); // enable all interrupts

    while(1);

    return;
}
