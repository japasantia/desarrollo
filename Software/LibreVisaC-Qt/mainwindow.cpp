#include "mainwindow.h"
#include "ui_mainwindow.h"

#include "visa.h"
#include <stdio.h>

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);

    QObject::connect(ui->processButton, &QPushButton::clicked,
                     this, &MainWindow::visaConnect);
    QObject::connect(ui->readAttributeButton, &QPushButton::clicked,
                    this, &MainWindow::visaReadAttribute);
    QObject::connect(ui->listResourcesButton, &QPushButton::clicked,
                     this, &MainWindow::visaListResources);

    visaOpenSession();
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::visaOpenSession()
{
      /* Open ssesion to GPIB device */
    ViStatus status;
    status = viOpenDefaultRM(&m_defaultRM);

    /*
    status = viOpen(m_defaultRM, "TCPIP0::192.168.1.10::GPIB0,10::INSTR",
           VI_NULL, VI_NULL, &m_vi);
    */

    status = viOpen(m_defaultRM, "GPIB0::10::INSTR",
           VI_NULL, VI_NULL, &m_vi);

    if (status < 0)
        ui->outputText->appendPlainText("Visa open error");

    /*
    status = viOpen(m_defaultRM, "GPIB::10::INSTR",
                    VI_NULL, VI_NULL, &m_vi);
    */
}

/**
    Queries a GPIB device for an identification string and prints the results.
*/
void MainWindow::visaConnect()
{
    ViUInt32 retCount = 0;
    char buf[256] = {"Empty"};

    /* Initialize device */
    viPrintf(m_vi, "*RST\n");
    /* Send and /IDN? string to the device*/
    viPrintf(m_vi, "*IDN?\n");

    /*Read results*/
    //viScanf(vi, (ViString)"%t", buf);
    //viSScanf(vi, viBuf, "%s");
    viRead(m_vi, (ViBuf)buf[256], 256, &retCount);

    /* Print results */
    printf("Instrument identification string: %s\n", buf);
    ui->outputText->appendPlainText(buf);

    /* Close session */
    // viClose(m_vi);
    // viClose(m_defaultRM);
}

void MainWindow::visaReadAttribute()
{
   ViBoolean state, newstate;
   ViStatus retStatus;
   newstate = VI_TRUE;

   retStatus = viGetAttribute(m_vi, VI_ATTR_TERMCHAR_EN, &state);
   if (state != VI_TRUE)
       viSetAttribute(m_vi, VI_ATTR_TERMCHAR, newstate);

   ui->outputText->appendPlainText(QString("TERMCHAR: %1").arg(state ? "TRUE" : "FALSE"));

}

void MainWindow::visaListResources()
{
    ViChar buffer[VI_FIND_BUFLEN];
    ViRsrc matches = buffer;
    ViUInt32  matchesCount = 0;
    ViFindList resourceList;

    ViStatus status = viFindRsrc(m_defaultRM, NULL, &resourceList,
               &matchesCount, buffer);

    ui->outputText->appendPlainText(matchesCount > 0 ?
                QString("Se encontraron %1 recursos").arg(matchesCount) :
                "No se encontraron recursos");

    for (unsigned int i = 0; i < matchesCount; ++i)
    {
        viFindNext(resourceList, matches);
        ui->outputText->appendPlainText(matches);
    }

    viClose(resourceList);
}
