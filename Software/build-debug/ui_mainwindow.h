/********************************************************************************
** Form generated from reading UI file 'mainwindow.ui'
**
** Created by: Qt User Interface Compiler version 5.2.0
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_MAINWINDOW_H
#define UI_MAINWINDOW_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QMenuBar>
#include <QtWidgets/QPlainTextEdit>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QStatusBar>
#include <QtWidgets/QToolBar>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_MainWindow
{
public:
    QWidget *centralWidget;
    QPushButton *processButton;
    QPlainTextEdit *outputText;
    QPushButton *readAttributeButton;
    QPushButton *listResourcesButton;
    QMenuBar *menuBar;
    QToolBar *mainToolBar;
    QStatusBar *statusBar;

    void setupUi(QMainWindow *MainWindow)
    {
        if (MainWindow->objectName().isEmpty())
            MainWindow->setObjectName(QStringLiteral("MainWindow"));
        MainWindow->resize(400, 300);
        centralWidget = new QWidget(MainWindow);
        centralWidget->setObjectName(QStringLiteral("centralWidget"));
        processButton = new QPushButton(centralWidget);
        processButton->setObjectName(QStringLiteral("processButton"));
        processButton->setGeometry(QRect(10, 210, 80, 23));
        outputText = new QPlainTextEdit(centralWidget);
        outputText->setObjectName(QStringLiteral("outputText"));
        outputText->setGeometry(QRect(20, 10, 361, 191));
        readAttributeButton = new QPushButton(centralWidget);
        readAttributeButton->setObjectName(QStringLiteral("readAttributeButton"));
        readAttributeButton->setGeometry(QRect(99, 210, 111, 23));
        QSizePolicy sizePolicy(QSizePolicy::Expanding, QSizePolicy::Fixed);
        sizePolicy.setHorizontalStretch(0);
        sizePolicy.setVerticalStretch(0);
        sizePolicy.setHeightForWidth(readAttributeButton->sizePolicy().hasHeightForWidth());
        readAttributeButton->setSizePolicy(sizePolicy);
        listResourcesButton = new QPushButton(centralWidget);
        listResourcesButton->setObjectName(QStringLiteral("listResourcesButton"));
        listResourcesButton->setGeometry(QRect(220, 210, 111, 23));
        MainWindow->setCentralWidget(centralWidget);
        menuBar = new QMenuBar(MainWindow);
        menuBar->setObjectName(QStringLiteral("menuBar"));
        menuBar->setGeometry(QRect(0, 0, 400, 20));
        MainWindow->setMenuBar(menuBar);
        mainToolBar = new QToolBar(MainWindow);
        mainToolBar->setObjectName(QStringLiteral("mainToolBar"));
        MainWindow->addToolBar(Qt::TopToolBarArea, mainToolBar);
        statusBar = new QStatusBar(MainWindow);
        statusBar->setObjectName(QStringLiteral("statusBar"));
        MainWindow->setStatusBar(statusBar);

        retranslateUi(MainWindow);

        QMetaObject::connectSlotsByName(MainWindow);
    } // setupUi

    void retranslateUi(QMainWindow *MainWindow)
    {
        MainWindow->setWindowTitle(QApplication::translate("MainWindow", "MainWindow", 0));
        processButton->setText(QApplication::translate("MainWindow", "Process", 0));
        readAttributeButton->setText(QApplication::translate("MainWindow", "Read attribute", 0));
        listResourcesButton->setText(QApplication::translate("MainWindow", "List Resources", 0));
    } // retranslateUi

};

namespace Ui {
    class MainWindow: public Ui_MainWindow {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_MAINWINDOW_H
