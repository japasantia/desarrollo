#-------------------------------------------------
#
# Project created by QtCreator 2017-06-01T10:34:56
#
#-------------------------------------------------

QT       += core gui

greaterThan(QT_MAJOR_VERSION, 4): QT += widgets

TARGET = OpenVisaC-Qt
TEMPLATE = app


SOURCES += main.cpp\
        mainwindow.cpp \
    viwrite.c \
    vistatusdesc.c \
    visetattr.c \
    viread.c \
    viopendrm.c \
    viopen.c \
    vigetattr.c \
    viclose.c \
    utils.c \
    serial.c \
    gpib.c \
    data.c


HEADERS  += mainwindow.h \
    common.h \
    visa.h \
    visatype.h

FORMS    += mainwindow.ui

INCLUDEPATH += /home/jarias/Pasantia/Aplicaciones/Linux/open-visa
