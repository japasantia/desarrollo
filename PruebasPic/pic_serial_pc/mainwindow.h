#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>
#include <QtSerialPort/QSerialPort>

namespace Ui {
class MainWindow;
}

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    explicit MainWindow(QWidget *parent = 0);
    ~MainWindow();

protected slots:

    void initializeScreen();
    void updatePortA();
    void updatePortB();
    void updatePortC();
    void serialReceive();
    void readAnalog();    
    void openSerialPort();

private:
    Ui::MainWindow *ui;

    QSerialPort* serial;
};

#endif // MAINWINDOW_H
