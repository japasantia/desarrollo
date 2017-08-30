#!/bin/bash

installDir="/opt/cenditlab"

if [ -e "$installDir" ]
then
	rm -R $installDir/*
else
	mkdir "$installDir"
fi



cp Views.jar $installDir
chmod +x $installDir/Views.jar

cp cendit-logo.jpg $installDir

echo "[Desktop Entry]
Type=Application
Name=CenditLab
Comment=Lanzador para CenditLab
Exec=java -jar $installDir/Views.jar
Terminal=false
Icon=$installDir/cendit-logo.jpg
Categories=Application;TestAndMeasurement" > CenditLab.desktop

desktopDir=$(xdg-user-dir DESKTOP)
echo $desktopDir

mv CenditLab.desktop $desktopDir
chmod +x $desktopDir/CenditLab.desktop

