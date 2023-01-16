import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//design part 3

//Write a AppletPart2_Demo3 program !

/* in this program we have three Components, two Buttons and One TextFiled and we will perform Some action on Button Components and result will be shown in the TextField Component.
suppose, when we will click on Button one then result shows in the TextFiled "hello World"
			when we will click on Button two then result shows in the TextFiled Empty(there is nothing).
			
	we will achieved this program by ActionListener interface.
	
	in this program, we will create two different object by using inner class and write logic in these classes and register with Components 
			
 one Component is register with one inner class instance and second component is register with second inner class instance which is create into our main class (create instance by inner class and register with component).
*/




public class AppletPart2_Demo3 extends Applet{

	Button b1,b2;
	TextField t;
	
	public void init()
	{
		add(b1=new Button("Click"));
		add(t=new TextField(10));
		add(b2=new Button("Clear"));
		
		b1.addActionListener(new A11());
		b2.addActionListener(new A12());

	}
	
	
	
	
	class A11 implements ActionListener					// first inner class which registers with component button b1
	{
		public void actionPerformed(ActionEvent arg0) 
		{
			t.setText("hello world");
		}
		
	}
	
	
	class A12 implements ActionListener						// Second inner class which registers with component button b2
	{
		public void actionPerformed(ActionEvent arg0)
		{
			t.setText(" ");
		}
		
	}
	
	
}
