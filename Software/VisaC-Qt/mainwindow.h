#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>

#include "visa.h"
#include "visatype.h"

namespace Ui {
class MainWindow;
}

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    explicit MainWindow(QWidget *parent = 0);
    ~MainWindow();

 private slots:
    void visaConnect();
    void visaReadAttribute();
    void visaListResources();

 private:
    void visaOpenSession();

private:
    Ui::MainWindow *ui;

    ViSession m_defaultRM;
    ViSession m_vi;
};


#endif // MAINWINDOW_H
