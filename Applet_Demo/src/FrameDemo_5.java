import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//design part 5

//Write a FrameDemo_4 program !

/* in this program we have three Components, two Buttons and One TextFiled and we will perform Some action on Button Components and result will be shown in the TextField Component.
suppose, when we will click on Button one then result shows in the TextFiled "hello World"
			when we will click on Button two then result shows in the TextFiled Empty(there is nothing).
			
	we will achieved this program by ActionListener interface.

	in this program, we will create two outer Class and register with Components
	
*/






public class FrameDemo_5 extends Frame{

	Button b1,b2;					// declaration Area
	TextField t;
	
	public FrameDemo_5()				// initialization Area
	{
		setLayout(new FlowLayout());
		
		add(b1=new Button("Click"));
		add(t=new TextField(10));
		add(b2=new Button("Clear"));
	
//		register components with out-Class instance and in this Outter-Class we passed argument as Current class reference. 
		b1.addActionListener(new x1(this));
		b2.addActionListener(new x2(this));
		
		
	addWindowListener(new WindowAdapter() {				// for Frame Window Closing 
		
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	});
	
	setSize(400,400);									// set size and Visiblity of Frame Window
	setVisible(true);
	
	}
	
	
	
	public static void main(String[] args) {
		new FrameDemo_5();
	}

}


// first outer-class
class x1 implements ActionListener{

	FrameDemo_5  f1;
	
	x1(FrameDemo_5 f1)
	{
		this.f1=f1;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		f1.t.setText("Hello World");
	}
	
}



//first outer-class
class x2 implements ActionListener{

FrameDemo_5  f2;
	
	x2(FrameDemo_5 f2)
	{
		this.f2=f2;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		f2.t.setText("");
	}
	
}



