/*
 * Created by SharpDevelop.
 * User: Administrador
 * Date: 03/24/2017
 * Time: 21:09
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;
using Agilent.TMFramework;
using Agilent.TMFramework.InstrumentIO;

namespace NFATest
{
	/// <summary>
	/// Description of NfaMeasure.
	/// </summary>
	public class NfaMeasure
	{
		private DirectIO instrumentIO;
		
		public NfaMeasure(string instrumentAddress)
		{
			instrumentIO = new DirectIO(instrumentAddress);
		}
		
		public void Calibrate()
		{
			instrumentIO.WriteLine(":SENSE:CORRECTION:COLLECT:ACQUIRE STANDARD");
			instrumentIO.WriteLine("WAI");
		}
	}
}
