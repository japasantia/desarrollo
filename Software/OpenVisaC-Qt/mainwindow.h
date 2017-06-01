#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>


#include <stdio.h>
#include "common.h"
#include "visa.h"
#include "visatype.h"

/*
#include "utils.c"
#include "data.c"
#include "gpib.c"
#include "serial.c"
#include "viclose.c"
#include "vigetattr.c"


#include "viopen.c"
#include "viopendrm.c"
#include "viread.c"
#include "visetattr.c"
#include "vistatusdesc.c"
#include "viwrite.c"
*/


namespace Ui {
class MainWindow;
}

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    explicit MainWindow(QWidget *parent = 0);
    ~MainWindow();

private:
    Ui::MainWindow *ui;

private:

    void OpenVisaSession();

};

#endif // MAINWINDOW_H
