#include "TftLcdIO.h"

#define CS_PORT     PORTC
#define RST_PORT    PORTC
#define RD_PORT     PORTC
#define WR_PORT     PORTA

#define CS_BIT      PORTCbits.RC1
#define RST_BIT     PORTCbits.RC2
#define RD_BIT      PORTCbits.RC0
#define WR_BIT      PORTAbits.RA1
#define CD_BIT      PORTAbits.RA0

#define LOW         0
#define HIGH        1

/*
TftLcdIO* TftLcdIO_Init(TftLcdIO* pTftLcdIO, 
	uint8_t cs, uint8_t cd, uint8_t wr, uint8_t rd,
	uint8_t rst, 
	uint8_t xm, uint8_t xp, uint8_t yp, uint8_t ym)
 */

int TftLcdIO_Init()
{
    TRISB = 0x00;    
    TRISA &= 0b11111100;    // RS WR
    TRISC &= 0b11111000;    // RST CS RD     
}

void TftLcdIO_SetControlIdle()
{
	TftLcdIO_SetRstIdle();
	TftLcdIO_SetCsIdle();
	TftLcdIO_SetCdIdle();
	TftLcdIO_SetWrIdle();
	TftLcdIO_SetRdIdle();
}

INLINE void TftLcdIO_SetCsActive()
{
	//digitalWrite(TftLcdIO_Get()->_cs, LOW);
    CS_BIT = LOW;
}

INLINE void TftLcdIO_SetWrActive()
{
	//digitalWrite(TftLcdIO_Get()->_wr, LOW);
    WR_BIT = LOW;
}

INLINE void TftLcdIO_SetRdActive()
{
	//digitalWrite(TftLcdIO_Get()->_rd, LOW);
    RD_BIT = LOW;
}

INLINE void TftLcdIO_SetCdActive()
{
	//digitalWrite(TftLcdIO_Get()->_cd, LOW);
    CD_BIT = LOW;
}

INLINE void TftLcdIO_SetRstActive()
{	
	//digitalWrite(TftLcdIO_Get()->_rst, LOW);
    RST_BIT = LOW;
}

INLINE void TftLcdIO_SetCsIdle()
{
	//digitalWrite(TftLcdIO_Get()->_cs, HIGH);
    CS_BIT = HIGH;
}

INLINE void TftLcdIO_SetWrIdle()
{
	//digitalWrite(TftLcdIO_Get()->_wr, HIGH);
    WR_BIT = HIGH;
}

INLINE void TftLcdIO_SetRdIdle()
{
	//digitalWrite(TftLcdIO_Get()->_rd, HIGH);
    RD_BIT = HIGH;
}

INLINE void TftLcdIO_SetCdIdle()
{
	//digitalWrite(TftLcdIO_Get()->_cd, HIGH);
    CD_BIT = HIGH;
}

INLINE void TftLcdIO_SetRstIdle()
{	
	//digitalWrite(TftLcdIO_Get()->_rst, HIGH);
    RST_BIT = HIGH;
}

INLINE void TftLcdIO_SetCdCommand()
{
	//digitalWrite(TftLcdIO_Get()->_cd, LOW);
    CD_BIT = LOW;
}

INLINE void TftLcdIO_SetCdData()
{
	//digitalWrite(TftLcdIO_Get()->_cd, HIGH);
    CD_BIT = HIGH;
}

void TftLcdIO_SetWriteDir()
{
    TRISB = 0x00;
}

void TftLcdIO_SetReadDir()
{
    TRISB = 0xFF;    
}

INLINE void TftLcdIO_WrStrobe()
{
	TftLcdIO_SetWrActive();
	// delayMicroseconds(50);
	TftLcdIO_SetWrIdle();
}

INLINE void TftLcdIO_Write8(byte d)
{   
    PORTB = d;
    
	TftLcdIO_WrStrobe();
}

byte TftLcdIO_Read8()
{
    /*
	TftLcdIO_SetRdActive();
	delayMicroseconds(500);
	int data = (PORTB << 6) | (PORTD >> 2);
	TftLcdIO_SetRdIdle();
	return data;
    */
}

void TftLcdIO_WriteRegister8(byte a, byte d)
{
	TftLcdIO_SetCdCommand();
	TftLcdIO_Write8(a);
	TftLcdIO_SetCdData();
	TftLcdIO_Write8(d);
}

void TftLcdIO_WriteRegister16(int a, int d)
{
	byte hi, lo;

	hi = a >> 8;
	lo = a;
	TftLcdIO_SetCdCommand();
	TftLcdIO_Write8(hi);
	TftLcdIO_Write8(lo);

	hi = d >> 8;
	lo = d;
	TftLcdIO_SetCdData();
	TftLcdIO_Write8(hi);
	TftLcdIO_Write8(lo);
}

void TftLcdIO_WriteRegister24(uint8_t r, uint32_t d) 
{
	TftLcdIO_SetCsActive();		
	TftLcdIO_SetCdCommand();
	TftLcdIO_Write8(r);		
	TftLcdIO_SetCdData();
	// delayMicroseconds(10);
	TftLcdIO_Write8(d >> 16);
	// delayMicroseconds(10);
	TftLcdIO_Write8(d >> 8);
	// delayMicroseconds(10);
	TftLcdIO_Write8(d);
	TftLcdIO_SetCsIdle();
}

void TftLcdIO_WriteRegister32(byte r, long int d)
{
	TftLcdIO_SetCsActive();
	TftLcdIO_SetCdCommand();
	TftLcdIO_Write8(r);
	TftLcdIO_SetCdData();
	// delayMicroseconds(10);
	TftLcdIO_Write8(d >> 24);
	// delayMicroseconds(10);
	TftLcdIO_Write8(d >> 16);
	// delayMicroseconds(10);
	TftLcdIO_Write8(d >> 8);
	// delayMicroseconds(10);
	TftLcdIO_Write8(d);
	TftLcdIO_SetCsIdle();
}
/*
#define writeRegisterPairInline(aH, aL, d) { \
uint8_t hi = (d) >> 8, lo = (d); \
CD_COMMAND; TftLcdIO_Write8(aH); CD_DATA; TftLcdIO_Write8(hi); \
CD_COMMAND; TftLcdIO_Write8(aL); CD_DATA; TftLcdIO_Write8(lo); }
*/
void TftLcdIO_WriteRegisterPair(uint8_t aH, uint8_t aL, uint16_t d)
{
	uint8_t hi = d >> 8, lo = d;
	TftLcdIO_SetCdCommand();
	TftLcdIO_Write8(aH);
	TftLcdIO_SetCdData();
	TftLcdIO_Write8(hi);
	TftLcdIO_SetCdCommand();
	TftLcdIO_Write8(aL);
	TftLcdIO_SetCdData();
	TftLcdIO_Write8(lo);

}

void TftLcdIO_BeginTouchScreenRead()
{
	TftLcdIO_SetCsIdle();
	TftLcdIO_Write8(0x00);	// Doesnt work!
	// TftLcdIO_Write8(0xFF);	// Doesnt work!
	// TftLcdIO_SetReadDir(); //Doesnt work!
	// DDRD = B00000010;	

	// pinMode(TftLcdIO_Get()->_cs, INPUT);
	// pinMode(TftLcdIO_Get()->_rd, INPUT);	
	
	// DDRB |= B00000011;
}

void TftLcdIO_EndTouchScreenRead()
{
	//TftLcdIO_SetCsActive();

	TftLcdIO_OutputXm(); // A2  RS
	TftLcdIO_OutputXp(); // 6
	TftLcdIO_OutputYm(); // 7
	TftLcdIO_OutputYp(); // A1	WR
	
	// pinMode(TftLcdIO_Get()->_cs, OUTPUT);
	// pinMode(TftLcdIO_Get()->_rd, OUTPUT);	
	
	// TftLcdIO_SetWriteDir(); //Doesnt work!
	// DDRD = B11111110;	
	// DDRB |= B00000011;
}

INLINE void TftLcdIO_HiImpedanceXp()
{
	// pinMode(TftLcdIO_Get()->_xp, INPUT);
}

INLINE void TftLcdIO_HiImpedanceXm()
{
	// pinMode(TftLcdIO_Get()->_xm, INPUT);
}

INLINE void TftLcdIO_HiImpedanceYp()
{
	// pinMode(TftLcdIO_Get()->_yp, INPUT);	
}

INLINE void TftLcdIO_HiImpedanceYm()
{
	// pinMode(TftLcdIO_Get()->_ym, INPUT);
}

INLINE void TftLcdIO_OutputXp()
{
	// pinMode(TftLcdIO_Get()->_xp, OUTPUT);
}

INLINE void TftLcdIO_OutputXm()
{
	// pinMode(TftLcdIO_Get()->_xm, OUTPUT);
}

INLINE void TftLcdIO_OutputYp()
{
	// pinMode(TftLcdIO_Get()->_yp, OUTPUT);
}

INLINE void TftLcdIO_OutputYm()
{
	// pinMode(TftLcdIO_Get()->_ym, OUTPUT);
}

INLINE void TftLcdIO_SetXp()
{
	// digitalWrite(TftLcdIO_Get()->_xp, HIGH);
}

INLINE void TftLcdIO_SetXm()
{
	// digitalWrite(TftLcdIO_Get()->_xm, HIGH);
}

INLINE void TftLcdIO_SetYp()
{
	// digitalWrite(TftLcdIO_Get()->_yp, HIGH);
}

INLINE void TftLcdIO_SetYm()
{
	// digitalWrite(TftLcdIO_Get()->_ym, HIGH);	
}

INLINE void TftLcdIO_ClrXp()
{
	// digitalWrite(TftLcdIO_Get()->_xp, LOW);
}

INLINE void TftLcdIO_ClrXm()
{
	// digitalWrite(TftLcdIO_Get()->_xm, LOW);
}

INLINE void TftLcdIO_ClrYp()
{
	// digitalWrite(TftLcdIO_Get()->_yp, LOW);	
}

INLINE void TftLcdIO_ClrYm()
{
	// digitalWrite(TftLcdIO_Get()->_ym, LOW);	
}

INLINE unsigned int TftLcdIO_AnalogReadYp()
{
	//delayMicroseconds(50);
	// return analogRead(TftLcdIO_Get()->_yp);
}

INLINE unsigned int TftLcdIO_AnalogReadXm()
{
	//delayMicroseconds(50);
	// return analogRead(TftLcdIO_Get()->_xm);	
}
