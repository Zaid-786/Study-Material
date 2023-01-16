import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// design part 2

// Write a AppletPart2_Demo2 program !

/* in this program we have three Components, two Buttuns and One TextFiled and we will perform Some action on Button Components and result will be shown in the TextField Component.
   suppose, when we will click on Button one then result shows in the TextFiled "hello World"
   			when we will click on Button two then result shows in the TextFiled Empty(there is nothing).
   			
   	we will achieved this program by ActionListener interface.
   	
   	in this program, we will create different object and these Object register with of two Components.
   			
    one Component is register with one instance of current class and second component is register with second instance which is create into our main class (create instance by inner class and register with component).
*/



public class AppletPart2_Demo2 extends Applet implements ActionListener{
	
	Button b1,b2;
	TextField t;
	
	public void init()
	{
		add(b1=new Button("Click"));
		add(t=new TextField(8));
		add(b2=new Button("Clear"));
		
		b1.addActionListener(this);
		A6 a=new A6();
		
//		b2.addActionListener(new A6());

	}

	public void actionPerformed(ActionEvent e) {
		
		t.setText("Hello World");
	}
	

	
	class A6 implements ActionListener
	{

		A6()
		{
			b2.addActionListener(this);

		}
		
		public void actionPerformed(ActionEvent e) {
			
			t.setText(" ");
		}
		
	}
	
	
	
}
