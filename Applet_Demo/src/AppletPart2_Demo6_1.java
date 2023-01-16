import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletPart2_Demo6_1 extends Applet {

	Button b1,b2;
    TextField t;					 
	
	public void init()
	{
		add(b1=new Button("Click"));
		add(t=new TextField(10));
		add(b2=new Button("Clear"));

		
		
		A31 a=new A31(this);			//passed the reference of current class into Class A31
		A32 b=new A32(this);

		b1.addActionListener(a);
		b2.addActionListener(b);


	}
}




class A31 implements ActionListener {					// first Outer class which is register with Button b1

	AppletPart2_Demo6_1 d;
	
	public A31(AppletPart2_Demo6_1 d)					//hold the reference of Applet2 Demo class as parameter 
	{
		this.d=d;										// refer to the class instance varible
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		d.t.setText("Hello World");
	}
	
}



class A32 implements ActionListener {					// second Outer class which is register with Button b1

AppletPart2_Demo6_1 d;
	
	public A32(AppletPart2_Demo6_1 d)
	{
		this.d=d;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
			d.t.setText("");
	}
	
}
