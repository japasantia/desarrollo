/*
 * Created by SharpDevelop.
 * User: Administrador
 * Date: 23/03/2017
 * Time: 21:10
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;
using System.Collections.Generic;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;

using Agilent.TMFramework.InstrumentIO;
using Ivi.Visa.Interop;

namespace NFATest
{
	/// <summary>
	/// Interaction logic for Window1.xaml
	/// </summary>
	public partial class Window1 : Window
	{
		private static string instrumentAddress =
			"TCPIP0::192.168.1.10::gpib0,10::INSTR";
			
		private DirectIO instrumentIO;
		
		public Window1()
		{
			InitializeComponent();
			
			instrumentIO = new DirectIO(instrumentAddress);
			
			instrumentIO.WriteLine("*IDN?");
			string resp = instrumentIO.Read();
		}
		
		
		void readFileTextBox_Click(object sender, RoutedEventArgs e)
		{
			NfaFile nfaFile = new NfaFile(instrumentAddress);
			
			string fileContents = nfaFile.GetFile(fileTextBox.Text);
			
			outputTextBox.Text = fileContents;
			
		}
		
		void nfaCalibrateButton_Click(object sender, RoutedEventArgs e)
		{
			NfaMeasure nfaMeasure = new NfaMeasure(instrumentAddress);
			nfaMeasure.Calibrate();
		}
	}
}