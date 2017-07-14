#include "mainwindow.h"
#include "ui_mainwindow.h"

#include <QMessageBox>
#include <QtSerialPort/QSerialPort>

QT_USE_NAMESPACE


MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);

    serial = new QSerialPort(this);

    connect(ui->initializeScreenButton, SIGNAL(clicked()),
                this, SLOT(initializeScreen()));

    connect(ui->portAUpdate, SIGNAL(clicked()),
            this, SLOT(updatePortA()));

    connect(ui->portBUpdateButton, SIGNAL(clicked()),
                this, SLOT(updatePortB()));

    connect(ui->portCUpdateButton, SIGNAL(clicked()),
                this, SLOT(updatePortC()));

    connect(ui->readAnalogButton, SIGNAL(clicked()),
            this, SLOT(readAnalog()));

    connect(ui->openSerialButton, SIGNAL(clicked()),
            this, SLOT(openSerialPort()));


    connect(serial, SIGNAL(readyRead()),
                this, SLOT(serialReceive()));
}

void MainWindow::openSerialPort()
{
    serial->setDataBits(QSerialPort::DataBits::Data8);
    serial->setBaudRate(115200);
    serial->setFlowControl(QSerialPort::FlowControl::NoFlowControl);

    serial->setPortName(ui->portNameText->text());

    if (serial->open(QIODevice::ReadWrite))
    {
        QMessageBox::information(this, tr("PicSerial"), tr("Aplicacion lista"));
    }
    else
    {
        QMessageBox::critical(this, tr("Error"), tr("Error al abrir puerto serial"));
    }
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::initializeScreen()
{
    serial->write("i");
    QMessageBox::critical(this, tr("PicSerial"), tr("Inicializada pantalla"));
}

void MainWindow::updatePortA()
{
    char data[2];
    QString text = ui->portAText->text();
    data[0] = 'a';
    data[1] = text.toInt();

    serial->write(data, 2);
}

void MainWindow::updatePortB()
{
    char data[2];
    QString text = ui->portBText->text();
    data[0] = 'b';
    data[1] = text.toInt();

    serial->write(data, 2);
}

void MainWindow::updatePortC()
{
    char data[2];
    QString text = ui->portCText->text();
    data[0] = 'c';
    data[1] = text.toInt();

    serial->write(data, 2);
}

void MainWindow::readAnalog()
{
    char data[2];
    QString text = ui->channelText->text();
    data[0] = 's';
    data[1] = text.toInt();

    serial->write(data, 2);
}

void MainWindow::serialReceive()
{
    QByteArray data = serial->readAll();
    ui->outputText->setPlainText(data);

    short value = (data[0] << 8) | data[1];
    ui->outputText->append(QString::asprintf("\nvalue = %5d hex = %4X\n", value, value));
}
