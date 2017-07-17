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
    // putrsUSBUSART("On: InitializeScreen");
    // CDCTxService();
    
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
        char data;

        numBytesRead = getsUSBUSART(readBuffer, sizeof(readBuffer));
        
        if (numBytesRead <= 0)
            return;
    
        char cmd = readBuffer[0];

        if (cmd == 'i') 
        {            
            Screen_Initialize();
            putrsUSBUSART("Rcv: Initialize screen");
        }
        else if (cmd == 'b' && numBytesRead >= 2)
        {            
            PORTB = readBuffer[1];
            putrsUSBUSART("Rcv: Update PORTB");
        }
        else if (cmd == 'c' && numBytesRead >= 2)
        {          
            PORTC = readBuffer[1];
            putrsUSBUSART("Rcv: Update PORTC");            
        } 
        else 
        {
            putrsUSBUSART("Rcv: Unknown command");
        }    
        
        #define SET_DATA            0x10
        #define GET_DATA            0x11
        #define SET_CONTROL         0x12
        #define GET_CONTROL         0x13
        #define SET_CONTROL_BIT     0x14
        #define CMD_OK              0xFF
        
        switch (cmd)
        {
            case SET_DATA:
                if (numBytesRead > 1)
                    TftLcdIO_Write8(readBuffer[1]);
                writeBuffer[0] = SET_DATA;
                writeBuffer[1] = CMD_OK;
                
                break;
                
            case GET_DATA:
                data = PORTB;
                data &= 0b11101111;
                data |= (RD_BIT != 0) ? 0b00010000 : 0b00000000;     
                writeBuffer[0] = GET_DATA;
                writeBuffer[1] = CMD_OK;
                writeBuffer[2] = data;
                
                break;
                    
            case SET_CONTROL:
                
                if (numBytesRead  > 1)
                {
                    PORTC = (readBuffer[1] >> 2);
                    PORTA = (readBuffer[1] & 0b00000011);
                }
                
                break;
                
                        
        }
    }
    
    CDCTxService();
}