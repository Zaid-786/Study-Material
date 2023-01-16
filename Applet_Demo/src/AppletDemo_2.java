
import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.TextField;




public class AppletDemo_2 extends Applet {

	Button b1,b2;				//this is declaration part
	TextField t1;
	
	public void init()
	{
		add(b1=new Button("Click"));
		add(t1=new TextField(8));
		add(b2=new Button("Clear"));
	}
	
	public boolean action(Event e,Object o)
	{
		if(e.target.equals(b1))																if(e.target.equals(b1))				//target button b1 by using this statement
		t1.setText("hello World...");		//after clicked b1 then text Field show message hello world
		
		if(e.target.equals(b2))				//target button b2 by using this statement
		t1.setText("");						//after clicked b2 then text field will be cleared.
		
		return true;
	}
	
}




