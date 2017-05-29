#-------------------------------------------------
#
# Project created by QtCreator 2017-04-21T13:48:16
#
#-------------------------------------------------

QT       += core gui

greaterThan(QT_MAJOR_VERSION, 4): QT += widgets

TARGET = VisaC-Qt
TEMPLATE = app


SOURCES += main.cpp\
        mainwindow.cpp

HEADERS  += mainwindow.h

FORMS    += mainwindow.ui

linux {
    #HEADERS += /usr/include/visa.h \
    #        /usr/include/visatype.h
    #HEADERS += /home/jarias/Escritorio/Pasantia/Aplicaciones/Linux/librevisa-0.0.20130412/include/visa.h \
    #       /home/jarias/Escritorio/Pasantia/Aplicaciones/Linux/librevisa-0.0.20130412/include/visatype.h
}

unix:!macx: LIBS += -L$$PWD/../../../../../../usr/local/lib/ -lvisa

INCLUDEPATH += $$PWD/../../../../../../usr/local/include
DEPENDPATH += $$PWD/../../../../../../usr/local/include
