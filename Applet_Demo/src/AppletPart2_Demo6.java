import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



//design part 6

//Write a AppletPart2_Demo6 program !

/* in this program we have three Components, two Buttons and One TextFiled and we will perform Some action on Button Components and result will be shown in the TextField Component.
suppose, when we will click on Button one then result shows in the TextFiled "hello World"
			when we will click on Button two then result shows in the TextFiled Empty(there is nothing).
			
	we will achieved this program by ActionListener interface.

	in this program, we will create two outer Class and register with Components
	
*/



public class AppletPart2_Demo6 extends Applet {

	Button b1,b2;
    static TextField t;						// t variable belongs to the current class(AppletPart2_Demo6) 
	
	public void init()
	{
		add(b1=new Button("Click"));
		add(t=new TextField(10));
		add(b2=new Button("Clear"));
		
		b1.addActionListener(new A21());
		b2.addActionListener(new A22());


	}
}




class A21 implements ActionListener {					// first Outer class which is register with Button b1

	public void actionPerformed(ActionEvent e) 
	{
		AppletPart2_Demo6.t.setText("Hello World");				// we set the TextField t variable by using class name because of t variable is static variable it belong the class
	}
	
}



class A22 implements ActionListener {					// second Outer class which is register with Button b1

	public void actionPerformed(ActionEvent e) 
	{
		AppletPart2_Demo6.t.setText("");
	}
	
}
