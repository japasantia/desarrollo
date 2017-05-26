using System;
using System.Collections;
using System.Collections.Generic;
using System.Windows;
using Gtk;
using NationalInstruments.VisaNS;


public partial class MainWindow: Gtk.Window
{
	public MainWindow () : base (Gtk.WindowType.Toplevel)
	{
		Build ();
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}


	protected void processButton_Click (object sender, EventArgs e)
	{
		try 
		{
			ResourceManager rm = ResourceManager.GetLocalManager ();
			string[] resources = rm.FindResources ("TCPIP*");

			foreach (string resource in resources) 
			{
				this.outputTextview.Buffer.InsertAtCursor (resource + "\n");
			}
		}
		catch (Exception ex)
		{
			this.outputTextview.Buffer.InsertAtCursor (ex.Message + "\n");
		}
	}

	protected void processIviVisaButton_Click (object sender, EventArgs e)
	{
		try 
		{
			List<string> resourcesList  = new List<string>(Ivi.Visa.GlobalResourceManager.Find());

			foreach (string resource in resourcesList)
			{
				this.outputTextview.Buffer.InsertAtCursor (resource + "\n");
			}
		}
		catch (Exception ex)
		{
			this.outputTextview.Buffer.InsertAtCursor (ex.Message + "\n");
		}
	}
}
