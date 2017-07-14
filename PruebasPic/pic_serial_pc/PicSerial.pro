#-------------------------------------------------
#
# Project created by QtCreator 2017-07-07T19:38:46
#
#-------------------------------------------------

greaterThan(QT_MAJOR_VERSION, 4) {
    QT       += widgets serialport
} else {
    include($$QTSERIALPORT_PROJECT_ROOT/src/serialport/qt4support/serialport.prf)
}

TARGET = PicSerial
TEMPLATE = app

SOURCES += \
    main.cpp \
    mainwindow.cpp
    #settingsdialog.cpp \
    #console.cpp

HEADERS += \
    mainwindow.h
    #settingsdialog.h \
    #console.h

FORMS += \
    mainwindow.ui
    #settingsdialog.ui

#RESOURCES += \
    #PicSerial.qrc
