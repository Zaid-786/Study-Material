import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


//design part 7.1

//Write a AppletPart2_FocusListener_1 program !

/* in this program we have three Components, two Buttons and One TextFiled and we will perform Some action on Button Components and result will be shown in the TextField Component.
suppose, when we will click on Button one then result shows in the TextFiled "hello World"
			when we will click on Button two then result shows in the TextFiled Empty(there is nothing).
			
	we will achieved this program by FocusListener interface.
	
	in this program, we will use Anonymous Class 

*/




public class AppletPart2_FocusListener_1 extends Applet {
	Button b1,b2;
    TextField t;					 
	
	public void init()
	{
		add(b1=new Button("Click"));
		add(t=new TextField(10));
		add(b2=new Button("Clear"));
		
		
		b1.addFocusListener(new FocusListener() {				//Anonymous Class
		
			public void focusGained(FocusEvent arg0) 
			{
				t.setText("Hello World");
			}

			
			public void focusLost(FocusEvent arg0)				// this is extra method and we don't need this method but can't avoid this method because comes with FocusListener interface.
			{													// how to avoid and remove extra method at the time of using interface that time we will use Adapter class 
				
			}
			
		});
		
		b2.addFocusListener(new FocusListener() {

			
			public void focusGained(FocusEvent arg0) 
			{
				t.setText("");
			}

			
			public void focusLost(FocusEvent arg0)
			{
				
			}
			
		});
		
		
	}
}
