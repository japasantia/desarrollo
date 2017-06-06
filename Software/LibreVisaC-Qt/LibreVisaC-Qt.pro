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

HEADERS += \
    mainwindow.h

SOURCES += \
    main.cpp \
    mainwindow.cpp



unix:!macx: LIBS += -lvisa
