#include "mainwindow.h"
#include "ui_mainwindow.h"

#include <QMessageBox>
#include <QtSerialPort/QSerialPort>

QT_USE_NAMESPACE

#define SET_DATA            0x10
#define GET_DATA            0x11
#define SET_CONTROL         0x12
#define GET_CONTROL         0x13
#define SET_CONTROL_BIT     0x14
#define WR_STROBE           0x15
#define PULSE_1MS           0x16
#define PULSE_1US           0x17
#define CMD_UNK             0x01
#define CMD_OK              0xFF

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);

    serial = new QSerialPort(this);

    connect(ui->openSerialButton, SIGNAL(clicked()),
            this, SLOT(openSerialPort()));

    connect(ui->closeSerialButton, SIGNAL(clicked()),
            this, SLOT(closeSerialPort()));

    connect(ui->setDataButton, SIGNAL(clicked()),
            this, SLOT(setData()));

    connect(ui->getDataButton, SIGNAL(clicked()),
            this, SLOT(getData()));

    connect(ui->setControlButton, SIGNAL(clicked()),
            this, SLOT(setControl()));

    connect(ui->pulse1msButton, SIGNAL(clicked()),
            this, SLOT(pulse1ms()));

    connect(ui->initializeScreenButton, SIGNAL(clicked()),
                this, SLOT(initializeScreen()));

    connect(ui->portAUpdateButton, SIGNAL(clicked()),
            this, SLOT(updatePortA()));

    connect(ui->portBUpdateButton, SIGNAL(clicked()),
                this, SLOT(updatePortB()));

    connect(ui->portCUpdateButton, SIGNAL(clicked()),
                this, SLOT(updatePortC()));

    connect(ui->readAnalogButton, SIGNAL(clicked()),
            this, SLOT(readAnalog()));

    /*
    connect(serial, SIGNAL(readyRead()),
                this, SLOT(serialReceive()));
    */
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::openSerialPort()
{
    serial->setDataBits(QSerialPort::DataBits::Data8);
    serial->setBaudRate(115200);
    serial->setFlowControl(QSerialPort::FlowControl::NoFlowControl);

    serial->setPortName(ui->devicePath->text());

    if (serial->open(QIODevice::ReadWrite))
    {
        QMessageBox::information(this, tr("PicSerial"), tr("Aplicacion lista"));
    }
    else
    {
        QMessageBox::critical(this, tr("Error"), tr("Error al abrir puerto serial"));
    }
}

void MainWindow::closeSerialPort()
{
    serial->close();
}

void MainWindow::setData()
{
    bool ok = true;
    char buffer[2];  

    int data = ui->inputText->text().toInt(&ok);

    if (ok)
    {        
        buffer[0] = SET_DATA;
        buffer[1] = data;

        serial->clear();
        serial->write(buffer, 2);
        serial->read(buffer, 2);

        if (buffer[0] == SET_DATA && buffer[1] != CMD_OK)
        {
            // Success
        }
    }
}

void MainWindow::getData()
{
    char buffer[3];

    buffer[0] = GET_DATA;

    serial->clear();
    serial->write(buffer, 1);
    serial->read(buffer, 3);

    if (buffer[0] == GET_DATA && buffer[1] == CMD_OK)
    {
        ui->outputText->append( QString::asprintf("port data = %X\n", buffer[2]) );
    }
}

void MainWindow::setControl()
{
    bool ok = true;
    char buffer[2];

    int data = ui->inputText->text().toInt(&ok);

    if (ok)
    {
        buffer[0] = SET_CONTROL;
        buffer[1] = data;

        serial->clear();
        serial->write(buffer, 2);
        serial->read(buffer, 2);

        if (buffer[0] == SET_CONTROL && buffer[1] == CMD_OK)
        {
            ui->outputText->append("set control suceess");
        }
    }
}

void MainWindow::pulse1ms()
{
    char buffer[2] = {PULSE_1MS};

    serial->clear();
    serial->write(buffer, 1);
    serial->read(buffer, 2);

    if (buffer[0] == PULSE_1MS && buffer[1] != CMD_OK)
    {
        ui->outputText->append("pulse-1ms success");
    }
}


void MainWindow::initializeScreen()
{
    serial->write("i");
    QMessageBox::critical(this, tr("PicSerial"), tr("Inicializada pantalla"));
}

void MainWindow::updatePortA()
{
    char data[2];
    QString text = ui->inputText->text();
    data[0] = 'a';
    data[1] = text.toInt();

    serial->write(data, 2);
}

void MainWindow::updatePortB()
{
    char data[2];
    QString text = ui->inputText->text();
    data[0] = 'b';
    data[1] = text.toInt();

    serial->write(data, 2);
}

void MainWindow::updatePortC()
{
    char data[2];
    QString text = ui->inputText->text();
    data[0] = 'c';
    data[1] = text.toInt();

    serial->write(data, 2);
}

void MainWindow::readAnalog()
{
    char data[2];
    QString text = ui->inputText->text();
    data[0] = 's';
    data[1] = text.toInt();

    serial->write(data, 2);
}

/*
void MainWindow::serialReceive()
{
    QByteArray data = serial->readAll();
    ui->outputText->setPlainText(data);

    short value = (data[0] << 8) | data[1];
    ui->outputText->append(QString::asprintf("\nvalue = %5d hex = %4X\n", value, value));
}
*/
