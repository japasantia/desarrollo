#ifndef TFT_LCD_IO_H
#define TFT_LCD_IO_H

// #include "Arduino.h"
#include "TftLcdDef.h"

#define INLINE inline

#if !defined(RST)
  #define RST   A4
#endif 

#if !defined(CS)
  #define CS    A3
#endif 

#if !defined(CD)  
  #define CD    A2
#endif 

#if !defined(WR)  
  #define WR    A1
#endif   
  
#if !defined(RD)  
  #define RD    A0
#endif 

#if !defined(YP)  
  #define YP    A1
#endif 

#if !defined(XM)  
  #define XM    A2
#endif 

#if !defined(YM)  
  #define YM    7
#endif 

#if !defined(XP)  
  #define XP    6
#endif 

/*
void setControlIdle();
void setRstIdle();
void setCsIdle();
void setRsIdle();
void setWrIdle();
void setRdIdle();
*/

typedef struct tagTftLcdIO 
{
	uint8_t _cs;
	uint8_t _cd;
	uint8_t _wr;
	uint8_t _rd;
	uint8_t _rst;
	
	uint8_t _xm;
	uint8_t _xp;	
	uint8_t _yp;
	uint8_t _ym;

} TftLcdIO;


TftLcdIO* TftLcdIO_Init(TftLcdIO* pTftLcdIO, 
	uint8_t cs, uint8_t cd, uint8_t wr, uint8_t rd,
	uint8_t rst, 
	uint8_t xm, uint8_t xp, uint8_t yp, uint8_t ym);

TftLcdIO* TftLcdIO_Set(TftLcdIO* pTftLcdIO);
INLINE TftLcdIO* TftLcdIO_Get();

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
