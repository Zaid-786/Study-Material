import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Frame design part 1

// Write a FrameDemo_1 program !

// we will achieved this program by ActionListener interface and Frame Class .

/* in this program we will write a program which is addition of two number,
   and we take five components like (three TextFields, One label , one Equal Button)*/


//lets write the program.



public class FrameDemo_1 extends Frame implements ActionListener{

	TextField t1,t2,t3;
	Label  l1;
	Button b1;
	
	public FrameDemo_1()
	{
		setLayout(new FlowLayout());
		add(t1=new TextField(8));
		add(l1=new Label("+"));
		add(t2=new TextField(8));
		add(b1=new Button("="));
		add(t3=new TextField(8));

		b1.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		setSize(400,400);
		setVisible(true);
	}
	

	
	public static void main(String[] args) {
			new FrameDemo_1();
			
	}



	public void actionPerformed(ActionEvent arg0) {
		
		Object o=arg0.getSource();
		
		if(o.equals(b1))
		{
			String s1=t1.getText();
			int x=Integer.parseInt(s1);
			
			String s2=t2.getText();
			int y=Integer.parseInt(s2);
			
			int z=x+y;
			
//			String s3=String.valueOf(z);
			t3.setText(String.valueOf(z));
			
		}
	}

}
