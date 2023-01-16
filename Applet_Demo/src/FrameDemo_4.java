import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Frame design part 4

//Write a FrameDemo_4 program !

/* in this program we have three Components, two Buttons and One TextFiled and we will perform Some action on Button Components and result will be shown in the TextField Component.
suppose, when we will click on Button one then result shows in the TextFiled "hello World"
			when we will click on Button two then result shows in the TextFiled Empty(there is nothing).
			
	we will achieved this program by ActionListener interface and Frame Class.

	in this program we will use Lambda Expression because of ActionListener Interface is a Functional Interface
	
	Lambda Expression only works on Functional Interface.

*/





public class FrameDemo_4 extends Frame {

	Button b1,b2;					// declaration Area
	TextField t;
	
	public FrameDemo_4()				// initialization Area
	{
		setLayout(new FlowLayout());
		
		add(b1=new Button("Click"));
		add(t=new TextField(10));
		add(b2=new Button("Clear"));
	
		// register components with lambda Expression 
		b1.addActionListener((e)-> {t.setText("Hello World");});
		b2.addActionListener((e)-> {t.setText("");});
		
		
	
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
		
		new FrameDemo_4();
	}

}
