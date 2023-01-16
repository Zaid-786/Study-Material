import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Frame design part 2

// Write a FrameDemo_2 program !

/* in this program we have three Components, two Buttuns and One TextFiled and we will perform Some action on Button Components and result will be shown in the TextField Component.
   suppose, when we will click on Button one then result shows in the TextFiled "hello World"
   			when we will click on Button two then result shows in the TextFiled Empty(there is nothing).
   			
   	we will achieved this program by ActionListener interface and Frame Class.
   	
   	in this program, we will create different object and these Object register with of two Components.
   			
    one Component is register with one instance of current class and second component is register with second instance which is create into our main class (create instance by inner class and register with component).
*/




public class FrameDemo_2 extends Frame implements ActionListener  {

	Button b1,b2;
	TextField t;
	
	public FrameDemo_2()
	{										
		// set the layout of frame is FlowLayout otherwise by default layout is BorderLayout
		setLayout(new FlowLayout());
		
		add(b1=new Button("Click"));
		add(t=new TextField(10));
		add(b2=new Button("Clear"));
		
		b1.addActionListener(this);					// register with current class instance
		b2.addActionListener(new A1());				// register with inner class instance
		
// this is anothr way to register with inner class instance
//		A1 a=new A1();					
		
		addWindowListener(new WindowAdapter(){
		
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		setSize(400,400);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {

		new FrameDemo_2();
	}



	@Override											//this current class action method
	public void actionPerformed(ActionEvent arg0) {
		t.setText("hello world");
	}

	
	
class A1 implements ActionListener {

//	A1()
//	{
//		b2.addActionListener(this);
//	}
//	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		t.setText("");
	}
	
}
	
	
	
}
