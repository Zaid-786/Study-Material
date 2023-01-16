import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


//Frame design part 3

//Write a FrameDemo_3 program !

/* in this program we have three Components, two Buttons and One TextFiled and we will perform Some action on Button Components and result will be shown in the TextField Component.
suppose, when we will click on Button one then result shows in the TextFiled "hello World"
			when we will click on Button two then result shows in the TextFiled Empty(there is nothing).
			
	we will achieved this program by ActionListener interface and Frame Class.

	in this program we will use  Anonymous class to write our logics 
	
*/


public class FrameDemo_3 extends Frame{

	Button b1,b2;
	TextField t;
	
	FrameDemo_3()
	{
		setLayout(new FlowLayout());
		
		add(b1=new Button("Click"));
		add(t=new TextField(10));
		add(b2=new Button("Clear"));

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				t.setText("Hello World");
			}
			
		});
		
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				t.setText("");
			}
			
		});
		
		
		
		// this interface used for window closing after click button of Frame Window
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

		new FrameDemo_3();
	}

}
