import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


//design part 7.1

//Write a AppletPart2_FocusListener_2 program !

/* in this program we have three Components, two Buttons and One TextFiled and we will perform Some action on Button Components and result will be shown in the TextField Component.
suppose, when we will click on Button one then result shows in the TextFiled "hello World"
			when we will click on Button two then result shows in the TextFiled Empty(there is nothing).
			
	we will achieved this program by FocusListener interface.
	
	in this program, we will use Anonymous Class with Adapter Class
	
	Java Adapter Class:-
	If you inherit the adapter class,
	you will not be forced to provide the implementation of all the methods of listener interfaces. So it saves code.


*/






public class AppletPart2_FocusListener_2 extends Applet{

	Button b1,b2;
	TextField t;
	
	
	public void init()
	{
		add(b1=new Button("Click"));
		add(t=new TextField(10));
		add(b2=new Button("Clear"));

		
		b1.addFocusListener(new FocusAdapter() {			// Adapter Class 
															// we used Adapter Class because of we dont need Unwanted method into our code 
			@Override										// FocusListener interface have two abstract method but we want only one method that we used Adapter class (FocusAdapter class For FocusListener interface)
			public void focusGained(FocusEvent e)
			{
				t.setText("Hello World");
			}
			
		});
		
		
		b2.addFocusListener(new FocusAdapter() {
			
			public void focusGained(FocusEvent e) 
			{
			     t.setText("");	
			}
		});
		
		
	}
	
}
