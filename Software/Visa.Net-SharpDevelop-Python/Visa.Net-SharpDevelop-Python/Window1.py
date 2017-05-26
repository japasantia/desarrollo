import wpf
import sys

from System.Windows import Window

class Window1 (Window):
	def __init__(self):
		wpf.LoadComponent(self, 'Window1.xaml')		
		#self.processButton = self.Root.FindName('processButton')
		#self.processButton.Click += run
				
	def process(self, sender, event):
		outputTextBox.Text ="Run"
	
	def processButton_Click(self, sender, event):
		self.outputTextBox.AppendText("Run! ")