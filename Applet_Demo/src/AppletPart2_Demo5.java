import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;

//design part 5

//Write a AppletPart2_Demo5 program !

/* in this program we have three Components, two Buttons and One TextFiled and we will perform Some action on Button Components and result will be shown in the TextField Component.
suppose, when we will click on Button one then result shows in the TextFiled "hello World"
			when we will click on Button two then result shows in the TextFiled Empty(there is nothing).
			
	we will achieved this program by ActionListener interface.
	
	in this program, we are using lambda Expression for Register with Components.

	
*/




public class AppletPart2_Demo5 extends Applet{

	Button b1,b2;
	TextField t;
	
	public void init()
	{
		add(b1=new Button("Click"));
		add(t=new TextField(10));
		add(b2=new Button("Clear"));
		
		// there several way to write Lambda Expression
		b1.addActionListener((ActionEvent e)-> {t.setText("hello World");});
		
//		b1.addActionListener((e)-> t.setText("Hello world"));
		
		
		
		b2.addActionListener((e)-> t.setText(""));
		
	}
	
}
