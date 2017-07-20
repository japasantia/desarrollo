/********************************************************************************
** Form generated from reading UI file 'mainwindow.ui'
**
** Created by: Qt User Interface Compiler version 5.9.1
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_MAINWINDOW_H
#define UI_MAINWINDOW_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QFormLayout>
#include <QtWidgets/QHBoxLayout>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QMenuBar>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QStatusBar>
#include <QtWidgets/QTextEdit>
#include <QtWidgets/QToolBar>
#include <QtWidgets/QVBoxLayout>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_MainWindow
{
public:
    QWidget *centralWidget;
    QWidget *formLayoutWidget;
    QFormLayout *formLayout;
    QVBoxLayout *verticalLayout_2;
    QHBoxLayout *horizontalLayout_7;
    QLabel *pathLabel;
    QLineEdit *devicePath;
    QHBoxLayout *horizontalLayout_3;
    QPushButton *openSerialButton;
    QPushButton *closeSerialButton;
    QVBoxLayout *commandsLayout;
    QLabel *label;
    QHBoxLayout *dataRow;
    QLabel *label_2;
    QLineEdit *inputText;
    QLabel *label_3;
    QHBoxLayout *commandRow1;
    QPushButton *setDataButton;
    QPushButton *getDataButton;
    QHBoxLayout *commandRow2;
    QPushButton *setControlButton;
    QPushButton *pulse1msButton;
    QLabel *portsLabel;
    QHBoxLayout *commandRow3;
    QPushButton *portAUpdateButton;
    QPushButton *initializeScreenButton;
    QHBoxLayout *commandRow4;
    QPushButton *portCUpdateButton;
    QPushButton *portBUpdateButton;
    QPushButton *readAnalogButton;
    QVBoxLayout *outputLayout;
    QLabel *outputLabel;
    QTextEdit *outputText;
    QMenuBar *menuBar;
    QToolBar *mainToolBar;
    QStatusBar *statusBar;
    QToolBar *toolBar;

    void setupUi(QMainWindow *MainWindow)
    {
        if (MainWindow->objectName().isEmpty())
            MainWindow->setObjectName(QStringLiteral("MainWindow"));
        MainWindow->resize(709, 506);
        centralWidget = new QWidget(MainWindow);
        centralWidget->setObjectName(QStringLiteral("centralWidget"));
        formLayoutWidget = new QWidget(centralWidget);
        formLayoutWidget->setObjectName(QStringLiteral("formLayoutWidget"));
        formLayoutWidget->setGeometry(QRect(40, 30, 771, 461));
        formLayout = new QFormLayout(formLayoutWidget);
        formLayout->setSpacing(6);
        formLayout->setContentsMargins(11, 11, 11, 11);
        formLayout->setObjectName(QStringLiteral("formLayout"));
        formLayout->setContentsMargins(0, 0, 0, 0);
        verticalLayout_2 = new QVBoxLayout();
        verticalLayout_2->setSpacing(6);
        verticalLayout_2->setObjectName(QStringLiteral("verticalLayout_2"));
        horizontalLayout_7 = new QHBoxLayout();
        horizontalLayout_7->setSpacing(6);
        horizontalLayout_7->setObjectName(QStringLiteral("horizontalLayout_7"));
        pathLabel = new QLabel(formLayoutWidget);
        pathLabel->setObjectName(QStringLiteral("pathLabel"));
        QSizePolicy sizePolicy(QSizePolicy::Preferred, QSizePolicy::Fixed);
        sizePolicy.setHorizontalStretch(0);
        sizePolicy.setVerticalStretch(0);
        sizePolicy.setHeightForWidth(pathLabel->sizePolicy().hasHeightForWidth());
        pathLabel->setSizePolicy(sizePolicy);

        horizontalLayout_7->addWidget(pathLabel);

        devicePath = new QLineEdit(formLayoutWidget);
        devicePath->setObjectName(QStringLiteral("devicePath"));

        horizontalLayout_7->addWidget(devicePath);


        verticalLayout_2->addLayout(horizontalLayout_7);

        horizontalLayout_3 = new QHBoxLayout();
        horizontalLayout_3->setSpacing(6);
        horizontalLayout_3->setObjectName(QStringLiteral("horizontalLayout_3"));
        openSerialButton = new QPushButton(formLayoutWidget);
        openSerialButton->setObjectName(QStringLiteral("openSerialButton"));

        horizontalLayout_3->addWidget(openSerialButton);

        closeSerialButton = new QPushButton(formLayoutWidget);
        closeSerialButton->setObjectName(QStringLiteral("closeSerialButton"));

        horizontalLayout_3->addWidget(closeSerialButton);


        verticalLayout_2->addLayout(horizontalLayout_3);


        formLayout->setLayout(0, QFormLayout::LabelRole, verticalLayout_2);

        commandsLayout = new QVBoxLayout();
        commandsLayout->setSpacing(6);
        commandsLayout->setObjectName(QStringLiteral("commandsLayout"));
        label = new QLabel(formLayoutWidget);
        label->setObjectName(QStringLiteral("label"));
        sizePolicy.setHeightForWidth(label->sizePolicy().hasHeightForWidth());
        label->setSizePolicy(sizePolicy);

        commandsLayout->addWidget(label);

        dataRow = new QHBoxLayout();
        dataRow->setSpacing(6);
        dataRow->setObjectName(QStringLiteral("dataRow"));
        label_2 = new QLabel(formLayoutWidget);
        label_2->setObjectName(QStringLiteral("label_2"));
        sizePolicy.setHeightForWidth(label_2->sizePolicy().hasHeightForWidth());
        label_2->setSizePolicy(sizePolicy);

        dataRow->addWidget(label_2);

        inputText = new QLineEdit(formLayoutWidget);
        inputText->setObjectName(QStringLiteral("inputText"));

        dataRow->addWidget(inputText);


        commandsLayout->addLayout(dataRow);

        label_3 = new QLabel(formLayoutWidget);
        label_3->setObjectName(QStringLiteral("label_3"));
        sizePolicy.setHeightForWidth(label_3->sizePolicy().hasHeightForWidth());
        label_3->setSizePolicy(sizePolicy);

        commandsLayout->addWidget(label_3);

        commandRow1 = new QHBoxLayout();
        commandRow1->setSpacing(6);
        commandRow1->setObjectName(QStringLiteral("commandRow1"));
        commandRow1->setSizeConstraint(QLayout::SetDefaultConstraint);
        setDataButton = new QPushButton(formLayoutWidget);
        setDataButton->setObjectName(QStringLiteral("setDataButton"));

        commandRow1->addWidget(setDataButton);

        getDataButton = new QPushButton(formLayoutWidget);
        getDataButton->setObjectName(QStringLiteral("getDataButton"));

        commandRow1->addWidget(getDataButton);


        commandsLayout->addLayout(commandRow1);

        commandRow2 = new QHBoxLayout();
        commandRow2->setSpacing(6);
        commandRow2->setObjectName(QStringLiteral("commandRow2"));
        setControlButton = new QPushButton(formLayoutWidget);
        setControlButton->setObjectName(QStringLiteral("setControlButton"));

        commandRow2->addWidget(setControlButton);

        pulse1msButton = new QPushButton(formLayoutWidget);
        pulse1msButton->setObjectName(QStringLiteral("pulse1msButton"));

        commandRow2->addWidget(pulse1msButton);


        commandsLayout->addLayout(commandRow2);

        portsLabel = new QLabel(formLayoutWidget);
        portsLabel->setObjectName(QStringLiteral("portsLabel"));
        sizePolicy.setHeightForWidth(portsLabel->sizePolicy().hasHeightForWidth());
        portsLabel->setSizePolicy(sizePolicy);

        commandsLayout->addWidget(portsLabel);

        commandRow3 = new QHBoxLayout();
        commandRow3->setSpacing(6);
        commandRow3->setObjectName(QStringLiteral("commandRow3"));
        portAUpdateButton = new QPushButton(formLayoutWidget);
        portAUpdateButton->setObjectName(QStringLiteral("portAUpdateButton"));

        commandRow3->addWidget(portAUpdateButton);

        initializeScreenButton = new QPushButton(formLayoutWidget);
        initializeScreenButton->setObjectName(QStringLiteral("initializeScreenButton"));

        commandRow3->addWidget(initializeScreenButton);


        commandsLayout->addLayout(commandRow3);

        commandRow4 = new QHBoxLayout();
        commandRow4->setSpacing(6);
        commandRow4->setObjectName(QStringLiteral("commandRow4"));
        portCUpdateButton = new QPushButton(formLayoutWidget);
        portCUpdateButton->setObjectName(QStringLiteral("portCUpdateButton"));

        commandRow4->addWidget(portCUpdateButton);

        portBUpdateButton = new QPushButton(formLayoutWidget);
        portBUpdateButton->setObjectName(QStringLiteral("portBUpdateButton"));

        commandRow4->addWidget(portBUpdateButton);


        commandsLayout->addLayout(commandRow4);

        readAnalogButton = new QPushButton(formLayoutWidget);
        readAnalogButton->setObjectName(QStringLiteral("readAnalogButton"));

        commandsLayout->addWidget(readAnalogButton);


        formLayout->setLayout(0, QFormLayout::FieldRole, commandsLayout);

        outputLayout = new QVBoxLayout();
        outputLayout->setSpacing(6);
        outputLayout->setObjectName(QStringLiteral("outputLayout"));
        outputLabel = new QLabel(formLayoutWidget);
        outputLabel->setObjectName(QStringLiteral("outputLabel"));

        outputLayout->addWidget(outputLabel);

        outputText = new QTextEdit(formLayoutWidget);
        outputText->setObjectName(QStringLiteral("outputText"));
        outputText->setReadOnly(true);

        outputLayout->addWidget(outputText);


        formLayout->setLayout(1, QFormLayout::LabelRole, outputLayout);

        MainWindow->setCentralWidget(centralWidget);
        menuBar = new QMenuBar(MainWindow);
        menuBar->setObjectName(QStringLiteral("menuBar"));
        menuBar->setGeometry(QRect(0, 0, 709, 19));
        MainWindow->setMenuBar(menuBar);
        mainToolBar = new QToolBar(MainWindow);
        mainToolBar->setObjectName(QStringLiteral("mainToolBar"));
        MainWindow->addToolBar(Qt::TopToolBarArea, mainToolBar);
        statusBar = new QStatusBar(MainWindow);
        statusBar->setObjectName(QStringLiteral("statusBar"));
        MainWindow->setStatusBar(statusBar);
        toolBar = new QToolBar(MainWindow);
        toolBar->setObjectName(QStringLiteral("toolBar"));
        MainWindow->addToolBar(Qt::TopToolBarArea, toolBar);

        retranslateUi(MainWindow);

        QMetaObject::connectSlotsByName(MainWindow);
    } // setupUi

    void retranslateUi(QMainWindow *MainWindow)
    {
        MainWindow->setWindowTitle(QApplication::translate("MainWindow", "MainWindow", Q_NULLPTR));
        pathLabel->setText(QApplication::translate("MainWindow", "Serial port path", Q_NULLPTR));
        openSerialButton->setText(QApplication::translate("MainWindow", "Open", Q_NULLPTR));
        closeSerialButton->setText(QApplication::translate("MainWindow", "Close", Q_NULLPTR));
        label->setText(QApplication::translate("MainWindow", "TftLcdIO test", Q_NULLPTR));
        label_2->setText(QApplication::translate("MainWindow", "Command data", Q_NULLPTR));
        label_3->setText(QApplication::translate("MainWindow", "Commands", Q_NULLPTR));
        setDataButton->setText(QApplication::translate("MainWindow", "Set Data", Q_NULLPTR));
        getDataButton->setText(QApplication::translate("MainWindow", "Get Data", Q_NULLPTR));
        setControlButton->setText(QApplication::translate("MainWindow", "Set Control", Q_NULLPTR));
        pulse1msButton->setText(QApplication::translate("MainWindow", "Pulse 1MS", Q_NULLPTR));
        portsLabel->setText(QApplication::translate("MainWindow", "Port operations", Q_NULLPTR));
        portAUpdateButton->setText(QApplication::translate("MainWindow", "Update PORTA", Q_NULLPTR));
        initializeScreenButton->setText(QApplication::translate("MainWindow", "Initialize Screen", Q_NULLPTR));
        portCUpdateButton->setText(QApplication::translate("MainWindow", "Update PORTC", Q_NULLPTR));
        portBUpdateButton->setText(QApplication::translate("MainWindow", "Update PORTB", Q_NULLPTR));
        readAnalogButton->setText(QApplication::translate("MainWindow", "Read Analog", Q_NULLPTR));
        outputLabel->setText(QApplication::translate("MainWindow", "Output", Q_NULLPTR));
        outputText->setHtml(QApplication::translate("MainWindow", "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\" \"http://www.w3.org/TR/REC-html40/strict.dtd\">\n"
"<html><head><meta name=\"qrichtext\" content=\"1\" /><style type=\"text/css\">\n"
"p, li { white-space: pre-wrap; }\n"
"</style></head><body style=\" font-family:'Sans Serif'; font-size:9pt; font-weight:400; font-style:normal;\">\n"
"<p style=\" margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\"><span style=\" font-weight:600; color:#0055ff;\">Hola</span><span style=\" font-weight:600;\"> </span><span style=\" font-weight:600; color:#55ff7f;\">que</span><span style=\" font-weight:600;\"> </span><span style=\" font-weight:600; color:#ff5500;\">tal</span></p></body></html>", Q_NULLPTR));
        toolBar->setWindowTitle(QApplication::translate("MainWindow", "toolBar", Q_NULLPTR));
    } // retranslateUi

};

namespace Ui {
    class MainWindow: public Ui_MainWindow {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_MAINWINDOW_H
