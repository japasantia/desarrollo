#-------------------------------------------------
#
# Project created by QtCreator 2017-04-21T13:48:16
#
#-------------------------------------------------

QT       += core gui

greaterThan(QT_MAJOR_VERSION, 4): QT += widgets

TARGET = LibreVisaC-Qt
TEMPLATE = app

FORMS    += mainwindow.ui



unix:!macx: LIBS += -L$$PWD/../../../Aplicaciones/Linux/librevisa-0.0.20130412/src/.libs/ -lvisa

INCLUDEPATH += $$PWD/../../../Aplicaciones/Linux/librevisa-0.0.20130412/src/.libs
DEPENDPATH += $$PWD/../../../Aplicaciones/Linux/librevisa-0.0.20130412/src/.libs

HEADERS += \
    mainwindow.h

SOURCES += \
    main.cpp \
    mainwindow.cpp

unix:!macx: LIBS += -L$$PWD/../../../../../../usr/local/lib/ -lvisa

INCLUDEPATH += $$PWD/../../../../Escritorio/Pasantia/Aplicaciones/Linux/librevisa-0.0.20130412/include
DEPENDPATH += $$PWD/../../../../Escritorio/Pasantia/Aplicaciones/Linux/librevisa-0.0.20130412/include
