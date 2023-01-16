import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;

public class AppletDemo_1 extends Applet
{
	Button b;					//declaration part    b is variable of type Button class
	
	public void init()			// predefined method of class Applet
	{
		setBackground(Color.cyan);
		setForeground(Color.black);
		
		add(b=new Button("Sumbit"));		// b is instantiating means created object
	}
	
	public void paint(Graphics g)			// predefined method of class Component
	{
		g.drawString("welcome",100,100);
		
	}
}
