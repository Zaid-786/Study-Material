import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// design part 1

// Write a AppletPart2_Demo1 program !

/* in this program we have three Components, two Buttuns and One TextFiled and we will perform Some action on Button Components and result will be shown in the TextField Component.
   suppose, when we will click on Button one then result shows in the TextFiled "hello World"
   			when we will click on Button two then result shows in the TextFiled Empty(there is nothing).
   			
   	we will achieved this program by ActionListener interface.
   	
   	in this program, we will create one object and this Object register with two and many Components.
   			
*/

/*
 Java ActionListener Interface:-
	 The Java ActionListener is notified whenever you click on the button or menu item.
	 It is notified against ActionEvent.
	 The ActionListener interface is found in java.awt.event package. 
	 It has only one method: actionPerformed().

	actionPerformed() method
		The actionPerformed() method is invoked automatically whenever you click on the registered component.*/


public class AppletPart2_Demo1 extends Applet implements ActionListener {

	Button b1,b2;					//these are our declaration area
	TextField t;
	
	public void init()						//these are our initialization area
	{
		add(b1=new Button("Click"));
		add(t=new TextField(10));
		add(b2=new Button("Clear"));
		
		// components are register with current class instance(Object)
		b1.addActionListener(this);				// here, we passed this keyword because of we need current class object (this keyword is used that refers to the current class Object).
		b2.addActionListener(this);				// in addActionListen(ActionListener i)  method and we passed the instance of the class which implements ActionListener interface.  

	}

	public void actionPerformed(ActionEvent e)			//this is our action logic area
	{
		Object o= e.getSource();
		
		if(o.equals(b1))
		{
			t.setText("hell world");
		}
		
		if(o.equals(b2))
		{
			t.setText("");
		}
	}
}
