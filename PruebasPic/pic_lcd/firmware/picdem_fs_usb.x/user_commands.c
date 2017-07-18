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
        uint8_t numBytesWrite;
        unsigned long delayCount;
        
        char data;

        numBytesRead = getsUSBUSART(readBuffer, sizeof(readBuffer));
        
        if (numBytesRead <= 0)
            return;
    
        char cmd = readBuffer[0];
        /*
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
        */
        #define SET_DATA            0x10
        #define GET_DATA            0x11
        #define SET_CONTROL         0x12
        #define GET_CONTROL         0x13
        #define SET_CONTROL_BIT     0x14
        #define WR_STROBE           0x15
        #define PULSE_1MS            0x16
        #define PULSE_1US            0x17
        #define CMD_UNK             0x01
        #define CMD_OK              0xFF
        
        switch (cmd)
        {
            case SET_DATA:
                if (numBytesRead > 1)
                {
                    TftLcdIO_Write8(readBuffer[1]);
                    writeBuffer[0] = SET_DATA;
                    writeBuffer[1] = CMD_OK;
                    numBytesWrite = 2;
                }
                
                break;
                
            case GET_DATA:
                data = PORTB;
                data &= 0b11101111;
                data |= (RD_BIT != 0) ? 0b00010000 : 0b00000000;     
                writeBuffer[0] = GET_DATA;
                writeBuffer[1] = CMD_OK;
                writeBuffer[2] = data;
                numBytesWrite = 3;
                
                break;
                    
            case SET_CONTROL:
                
                if (numBytesRead  > 1)
                {
                    PORTC = (readBuffer[1] >> 2);
                    PORTA = (readBuffer[1] & 0b00000011);
                    numBytesWrite = 2;
                }
                
            case WR_STROBE:
                
                TftLcdIO_WrStrobe();
                
                writeBuffer[0] =  WR_STROBE;
                writeBuffer[1] = CMD_OK;
                numBytesWrite = 2;
                
            case PULSE_1MS:
                
                if (numBytesRead > 4) 
                {
                    delayCount = *( (uint32_t*)(readBuffer + 1) );
                    while (delayCount-- > 0)
                    {
                         __delay_ms(1);
                    }
                    writeBuffer[0] = PULSE_1MS;
                    writeBuffer[1] = CMD_OK;
                    numBytesWrite = 2;
                }
                
                break;
                
            case PULSE_1US:
                
                if (numBytesRead > 2)
                {
                    delayCount = *( (uint32_t*)(readBuffer + 1) );
                    while (delayCount-- > 0)
                    {
                         __delay_us(1);
                    }
                    writeBuffer[0] = PULSE_1US;
                    writeBuffer[1] = CMD_OK;
                    numBytesWrite = 2;                
                }                
                
                break;     
                
            default:
                
                writeBuffer[0] = CMD_UNK;
                numBytesWrite = 1;
                
                break;
        }
        
        if (numBytesWrite > 0)
        {
            putUSBUSART(writeBuffer, numBytesWrite);
            numBytesWrite = 0;
        }
    }
    
    CDCTxService();
}