#include "mainwindow.h"
#include "ui_mainwindow.h"

ViStatus viWrite(ViSession vi,ViBuf buf,ViUInt32 cnt,ViPUInt32 retCnt);

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);

    OpenVisaSession();
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::OpenVisaSession()
{
    ViSession v;
    ViStatus status;
    ViSession a;
    char desc[50]="k2k2k2k2";

    ViUInt32 retCnt;
    char cmdBuffer[] = "*IDN?";
    char recvBuffer[1024];

    //little tests
    status=viOpenDefaultRM(&v);
    viStatusDesc(0,status,desc);
    printf("%s-sesion abierta:%d\n",desc,v);
    //ShowSessions();

    status=viClose(v);
    viStatusDesc(0,status,desc);
    printf("%s-sesion cerrada?:%d\n",desc,v);
    //ShowSessions();

    status=viOpenDefaultRM(&v);
    viStatusDesc(0,status,desc);
    printf("%s-sesion abierta:%d\n",desc,v);
    //ShowSessions();

    // Open GPIB0,10
    status=viOpen(v,"GPIB0::10",VI_LOAD_CONFIG,VI_NULL,&a);
    viStatusDesc(0,status,desc);
    printf("%s-sesion abierta:%d\n",desc,a);
    //ShowSessions();

    // ViStatus viWrite(ViSession vi,ViBuf buf,ViUInt32 cnt,ViPUInt32 retCnt)
    status = viWrite(a, (ViBuf)cmdBuffer, (ViUInt32)6, &retCnt);
    viStatusDesc(0,status,desc);
    printf("%s-sesion abierta:%d\n",desc,a);

    // ViStatus viRead(ViSession vi,ViPBuf buf,ViUInt32 cnt,ViPUInt32 retcnt)
    status = viRead(a, (ViBuf)recvBuffer, 1023, &retCnt);
    viStatusDesc(0,status,desc);
    printf("%s-sesion abierta:%d\n",desc,a);

    status=viOpen(v,"ASRL1",VI_LOAD_CONFIG,VI_NULL,&a);
    viStatusDesc(0,status,desc);
    printf("%s-sesion abierta:%d\n",desc,a);
    //ShowSessions();

    status=viClose(a);
    viStatusDesc(0,status,desc);
    printf("%s-sesion cerrada?:%d\n",desc,a);
    //ShowSessions();

    status=viOpen(v,"ASRL2",VI_LOAD_CONFIG,VI_NULL,&a);
    viStatusDesc(0,status,desc);
    printf("%s-sesion abierta:%d\n",desc,a);
    //ShowSessions();

    status=viOpen(v,"ASRL1",VI_LOAD_CONFIG,VI_NULL,&a);
    viStatusDesc(0,status,desc);
    printf("%s-sesion abierta:%d\n",desc,a);
    //ShowSessions();

    status=viSetAttribute(1,VI_ATTR_ASRL_PARITY,VI_ASRL_PAR_NONE);
    viStatusDesc(0,status,desc);
    printf("%s-resultado:%d\n",desc,status);

    status=viSetAttribute(2,VI_ATTR_ASRL_PARITY,VI_ASRL_PAR_NONE);
    viStatusDesc(0,status,desc);
    printf("%s-resultado:%d\n",desc,status);

    status=viSetAttribute(3,VI_ATTR_ASRL_PARITY,VI_ASRL_PAR_NONE);
    viStatusDesc(0,status,desc);
    printf("%s-resultado:%d\n",desc,status);



    char nombre[20];
    status=viGetAttribute(5,VI_ATTR_INTF_INST_NAME,nombre);
    viStatusDesc(0,status,desc);
    printf("%s: nombre:%s\n",desc,nombre);

}
