import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.TextField;



public class AppletDemo_4 extends Applet{

	Checkbox c1,c2,c3;				//declared variables of class type
	TextField t1;
	Button b1;
	
	public void init()
	{
		setLayout(new GridLayout(2,3));			// set the layout in form of gridLayout formet with paramenters(rows,columns)
		
		add(c1=new Checkbox("1"));				// we added all our components 
		add(c2=new Checkbox("2"));
		add(c3=new Checkbox("3"));
		add(b1=new Button("clear"));
		add(t1=new TextField(10));

	}
	
	public boolean action(Event e,Object o)			//by this statement we applied action on our components
	{
		int sum=0;
		
		if(c1.getState())
			sum=sum+1;
		
		if(c2.getState())
			sum=sum+2;
		
		if(c3.getState())
			sum=sum+3;
		
		t1.setText(String.valueOf(sum));			//by this statement we set text of textfield to convert integer value to string
     
		if(e.target.equals(b1))
			t1.setText(" ");
		
		return true;
	
	}
}
