import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


// lets create a GUI Application By Using Frame





public class GUIApp3 extends Frame 
{

	Button b1,b2;
	TextField t;
	
	public GUIApp3()
	{
		setLayout(new FlowLayout());				// we set Flow-Layout because frame has default border-Layout
		
		add(b1=new Button("click"));
		add(t=new TextField(10));
		add(b2=new Button("clear"));

		b1.addActionListener((e)-> t.setText("Hello World"));				// we Used Lambda Expression here because of ActionListener Interface is Functional Interface
		b2.addActionListener((e)-> t.setText(""));
		
		addWindowListener(new WindowAdapter() {								// This is Adapter Class
		
			@Override
			public void windowClosing(WindowEvent arg0) 					// this method for closing Window By click Close BUtton of Frame Window and then Close the JVM.
			{
				System.exit(0);
			}
		});
		
		setSize(400,400);										// we set the size of Frame Window
		setVisible(true);										// we set the visibilty of Frame Window because by default it is false
	}
	
	
		
	
	public static void main(String[] args) 
	{
		new GUIApp3();
	}

}
