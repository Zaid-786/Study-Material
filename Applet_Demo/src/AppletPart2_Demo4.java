import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//design part 4

//Write a AppletPart2_Demo4 program !

/* in this program we have three Components, two Buttons and One TextFiled and we will perform Some action on Button Components and result will be shown in the TextField Component.
suppose, when we will click on Button one then result shows in the TextFiled "hello World"
			when we will click on Button two then result shows in the TextFiled Empty(there is nothing).
			
	we will achieved this program by ActionListener interface.
	
	in this program, we will create Anonymous Class and register with Components.
	use for anonymous class for Functional Interface(means that have only one function into a interface).
			
*/



public class AppletPart2_Demo4 extends Applet{

	Button b1,b2;					//these are declaration Area
	TextField t;
	
	public void init()							// these are initialization Area
	{
		add(b1=new Button("Click"));
		add(t=new TextField(10));
		add(b2=new Button("Clear"));
	
	
	// these are our action logic Area and where we wrote logic by using Anonymous class
		
	b1.addActionListener(new ActionListener(){			// Anonymous class Created

		// implements the method
		public void actionPerformed(ActionEvent e) 
		{
			t.setText("Hello World");
		}
		
	});
	
	
	b2.addActionListener(new ActionListener() {				// Anonymous class Created

		// implements the method
		public void actionPerformed(ActionEvent e) 
		{
			t.setText("");
		}
	
	});

	
	
	}
}
