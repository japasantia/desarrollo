/*
 * File:   user_commands.c
 * Author: jose arias
 *
 * Created on 10 de abril de 2017, 08:22 PM
 */


#include <xc.h>
#include "user_commands.h"
#include "../../src/usb_device_cdc.h"

#include "../../lcd_lib/AdafruitGfx.h"
#include "../../lcd_lib/TftLcd.h"
#include "../../lcd_lib/TftLcdIO.h"


void userInit()
{
    TRISB = 0b11110000;
    PORTB = 0xAA;
}


void userProcess(const char* inputBuffer, char size)
{
    if (inputBuffer[0] == 0x0A || inputBuffer[1] == 0x0D)
    {        
        PORTB &= 0b11110011;
        PORTB |= 0b00000100;
    }
    else
    {
        PORTB = (PORTB & 0xF0) | (0x03 & inputBuffer[0]);        
        PORTB |= 0b00001000;        
    }
}



/**
 Objeto global manejador del modulo  rutinas graficas para pantalla
 */
Gfx g_gfx;

void Screen_Initialize()
{
    putrsUSBUSART("On: InitializeScreen");
    
    TftLcdIO_Init();
    Gfx_Init(&g_gfx, TFTWIDTH, TFTHEIGHT, &TftLcd_DrawPixel);
    TftLcd_Init();
} // end InitializeScreen


static uint8_t readBuffer[CDC_DATA_OUT_EP_SIZE];
static uint8_t writeBuffer[CDC_DATA_IN_EP_SIZE];

void Commands_Process()
{
    /* If the USB device isn't configured yet, we can't really do anything
     * else since we don't have a host to talk to.  So jump back to the
     * top of the while loop. */
    if( USBGetDeviceState() < CONFIGURED_STATE )
    {
        return;
    }

    /* If we are currently suspended, then we need to see if we need to
     * issue a remote wakeup.  In either case, we shouldn't process any
     * keyboard commands since we aren't currently communicating to the host
     * thus just continue back to the start of the while loop. */
    if( USBIsDeviceSuspended()== true )
    {
        return;
    }
    
    if( USBUSARTIsTxTrfReady() == true)
    {
        uint8_t i;
        uint8_t numBytesRead;

        numBytesRead = getsUSBUSART(readBuffer, sizeof(readBuffer));
        
        if (numBytesRead <= 0)
            return;
    
        char cmd = readBuffer[0];

        if (cmd == 'i') 
        {
            putrsUSBUSART("Rcv: Initialize screen");
            Screen_Initialize();
        }
        else if (cmd == 'b' && numBytesRead >= 2)
        {
            putrsUSBUSART("Rcv: Update PORTB");
            PORTB = readBuffer[1];
        }
        else if (cmd == 'c' && numBytesRead >= 2)
        {
            putrsUSBUSART("Rcv: Update PORTC");
            PORTC = readBuffer[1];
        } 
        else 
        {
            putrsUSBUSART("Rcv: Unknown command");
        }    
    }
    
    CDCTxService();
}