/*
 * Created by SharpDevelop.
 * User: Jose Arias
 * Date: 20/03/2017
 * Time: 21:09
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;
using System.Collections;
using System.Collections.Generic;
using NationalInstruments;


using Agilent.TMFramework.InstrumentIO;
using Agilent.TMFramework.InstrumentIO.InstrumentSupport;
using Ivi.Driver;
using Ivi.PwrMeter;
using Ivi.Driver.Interop;
using Ivi.LxiSync.Interop;
using Ivi.SpecAn.Interop;
using Ivi.Visa.Interop;
using Ivi.PwrMeter.Interop;
using Ivi.Scope;

namespace IVIAgilent34410
{
	class Program
	{
		
		private static DirectIO directIO;
		private static FormattedIO488Class src;
		

		private static IIviScope scope;
		
		public static void Main(string[] args)
		{
			Console.WriteLine("Hello World!");
			
			// VisaNetTest();
			NiVisaNetTest();
			
			// TODO: Implement Functionality Here
			
			directIO = new DirectIO("TCPIP0::192.168.1.10::gpib0,10::INSTR");
			
			//directIO = new DirectIO("lan[192.168.1.10]:gpib0,10");
			//directIO = new DirectIO("NFA_N8975");
			directIO.WriteLine("*IDN?");
			String response = directIO.Read();
			Console.WriteLine("N8975 resp: " + response);
			
			/*
			an.Initialize("TCPIP0::192.168.1.10::gpib0,10::INSTR",
				true, true);
			
			an.Acquisition.NumberOfSweeps = 16;
			an.NDBPoints.Enabled = true;
			double[] factorY = an.QueryRatio();
			
			foreach (double y in factorY)
			{
				Console.Write("{0} ", factorY);
			}
			Console.WriteLine();
			 */
			
			String enrFile = GetFile("C:PRUEBA.ENR");
			
			Console.WriteLine("ENR file 'PRUEBA.ENR'");
			Console.WriteLine(enrFile);
			
			
			ResourceManager rMgr = new ResourceManagerClass();
			src = new FormattedIO488Class();
			
			src.IO = (IMessage) rMgr.Open("TCPIP0::192.168.1.10::gpib0,10::INSTR", 
			                             AccessMode.NO_LOCK, 5000, null);
			src.IO.Timeout = 5000;
			
			src.IO.Clear();
			src.WriteString("*IDN?");
			string temp = src.ReadString();
			
			Console.WriteLine("IDN = {0}", temp);		
			
			/*
			scope = IviScope.Create("N8975A");
			
			Ivi.Driver.IIviDriver driver = IviDriver.Create("N8975A_DRIVER");
			*/
			
			
			/*
			nfa = new KtXSAnNoiseFigureClass();
			nfa.Initialize("CENDIT_LECER_NFA8975ACENDIT_LECER_NFA8975A", 
			               true, false, null);
			*/
			Console.ReadKey();
		}
		
		public static String GetFile(string filePath)
		{
			string content = null;
			try
			{
				directIO.Write(":MMEMORY:DATA? '" + filePath + "'");
				content = directIO.Read();				
			}
			catch (Exception ex)
			{
				Console.WriteLine("Error in <GetFile> {0}", ex);
			}
			
			return content;
		}
		
		public static void VisaNetTest()
		{
			
			List<string> resourceList = new List<string>(Ivi.Visa.GlobalResourceManager.Find());
			
			Ivi.Visa.IMessageBasedSession mbSession =
				(Ivi.Visa.IMessageBasedSession)Ivi.Visa.GlobalResourceManager
					.Open(resourceList[0]);
			
			mbSession.Dispose();			
		}
		
		public static void NiVisaNetTest()
		{

			NationalInstruments.VisaNS.MessageBasedSession mbSession =
				(NationalInstruments.VisaNS.MessageBasedSession) NationalInstruments.VisaNS.ResourceManager.GetLocalManager().Open("ASRL1::INSTR");
			string response = mbSession.Query("*IDN?");
			
			NationalInstruments.VisaNS.ResourceManager rm = NationalInstruments.VisaNS.ResourceManager.GetLocalManager();
			rm.Open("ASRL1::INTSR");
		}
		
	}
}