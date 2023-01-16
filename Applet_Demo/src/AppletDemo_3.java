import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.Label;
import java.awt.TextField;




public class AppletDemo_3 extends Applet{

	TextField t1,t2,t3;						// we declared variables of class type 
	Label l1;
	Button b1;
	
	public void init()						// in this method we add our components
	{
		add(t1=new TextField(5));
		add(l1=new Label("+"));
		add(t2=new TextField(5));
		add(b1=new Button("="));
		add(t3=new TextField(5));

	}

	public boolean action(Event e,Object o)			//by this statement we performed action on component
	{
		if(e.target.equals(b1))
		{
			String s1=t1.getText();
			int x=Integer.parseInt(s1);				//by this statement convert string to integer
			
			String s2=t2.getText();
			int y=Integer.parseInt(s2);				//by this statement convert string to integer
			
			int z=x+y;
			
			String s3=String.valueOf(z);			//by this statement convert integer to String 
			
			t3.setText(s3);							// set text field of our result
		}
		
		return true;
	}
	
	
	
}
