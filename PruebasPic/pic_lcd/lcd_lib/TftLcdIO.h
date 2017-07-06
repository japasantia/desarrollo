#ifndef TFT_LCD_IO_H
#define TFT_LCD_IO_H

// #include "Arduino.h"
#include "TftLcdDef.h"

#define INLINE inline

#define CS_PORT     PORTC
#define RST_PORT    PORTC
#define RD_PORT     PORTC
#define WR_PORT     PORTA

#define YP_BIT      WR_BIT
#define YM_BIT      PORTBbits.RB7
#define XP_BIT      PORTBbits.RB6
#define XM_BIT      CD_BIT

#define YP_TRIS_BIT      TRISAbits.RA1
#define YM_TRIS_BIT      TRISBbits.RB7
#define XP_TRIS_BIT      TRISBbits.RB6
#define XM_TRIS_BIT      TRISAbits.RA0

#define CS_BIT      PORTCbits.RC1
#define RST_BIT     PORTCbits.RC2
#define RD_BIT      PORTCbits.RC0
#define WR_BIT      PORTAbits.RA1
#define CD_BIT      PORTAbits.RA0

#define LOW         0
#define HIGH        1


/*
void setControlIdle();
void setRstIdle();
void setCsIdle();
void setRsIdle();
void setWrIdle();
void setRdIdle();
*/

int TftLcdIO_Init();

void TftLcdIO_SetControlIdle();

INLINE void TftLcdIO_SetCsActive();

INLINE void TftLcdIO_SetWrActive();

INLINE void TftLcdIO_SetRdActive();

INLINE void TftLcdIO_SetCdActive();

INLINE void TftLcdIO_SetRstActive();

INLINE void TftLcdIO_SetCsIdle();

INLINE void TftLcdIO_SetWrIdle();

INLINE void TftLcdIO_SetRdIdle();

INLINE void TftLcdIO_SetCdIdle();

INLINE void TftLcdIO_SetRstIdle();

INLINE void TftLcdIO_SetCdCommand();

INLINE void TftLcdIO_SetCdData();

void TftLcdIO_SetWriteDir();

void TftLcdIO_SetReadDir();

INLINE void TftLcdIO_WrStrobe();

INLINE void TftLcdIO_Write8(byte d);

byte TftLcdIO_Read8();

void TftLcdIO_WriteRegister8(byte a, byte d);

void TftLcdIO_WriteRegister16(int a, int d);

void TftLcdIO_WriteRegister24(uint8_t r, uint32_t d);

void TftLcdIO_WriteRegister32(byte r, long int d);
/*
#define writeRegisterPairInline(aH, aL, d) { \
uint8_t hi = (d) >> 8, lo = (d); \
CD_COMMAND; write8(aH); CD_DATA; write8(hi); \
CD_COMMAND; write8(aL); CD_DATA; write8(lo); }
*/
void TftLcdIO_WriteRegisterPair(uint8_t aH, uint8_t aL, uint16_t d);

void TftLcdIO_BeginTouchScreenRead();
void TftLcdIO_EndTouchScreenRead();

INLINE void TftLcdIO_HiImpedanceXp();
INLINE void TftLcdIO_HiImpedanceXm();
INLINE void TftLcdIO_HiImpedanceYp();
INLINE void TftLcdIO_HiImpedanceYm();

INLINE void TftLcdIO_OutputXp();
INLINE void TftLcdIO_OutputXm();
INLINE void TftLcdIO_OutputYp();
INLINE void TftLcdIO_OutputYm();

INLINE void TftLcdIO_SetXp();
INLINE void TftLcdIO_SetXm();
INLINE void TftLcdIO_SetYp();
INLINE void TftLcdIO_SetYm();

INLINE void TftLcdIO_ClrXp();
INLINE void TftLcdIO_ClrXm();
INLINE void TftLcdIO_ClrYp();
INLINE void TftLcdIO_ClrYm();

INLINE unsigned int TftLcdIO_AnalogReadYp();
INLINE unsigned int TftLcdIO_AnalogReadXm();

#endif
