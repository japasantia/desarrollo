/*
 * Created by SharpDevelop.
 * User: Administrador
 * Date: 24/03/2017
 * Time: 20:39
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;
using System.Text;
using Agilent.TMFramework;
using Agilent.TMFramework.InstrumentIO;

namespace NFATest
{
	/// <summary>
	/// Description of NfaFile.
	/// </summary>
	public class NfaFile
	{
		private DirectIO instrumentIO;
		
		// TCPIP0::192.168.1.10::gpib0,10::INSTR
		private string instrumentAddress; 
		
		public NfaFile(string instrumentAddress)
		{
			instrumentIO = new DirectIO(instrumentAddress);			
		}
		
		public string GetFile(string filePath)
		{			
			string scpiCommand = String.Format(":MMEMORY:DATA? '{0}'", filePath);
			
			instrumentIO.WriteLine(scpiCommand);
			
			string response = instrumentIO.Read();
			// string response = instrumentIO.ReadIeeeBlockAsString();
			
			return response;
		}		
	}
}


