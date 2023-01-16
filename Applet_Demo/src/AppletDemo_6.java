import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;



public class AppletDemo_6 extends Applet {
	
	TextField t;
	TextArea t1,t2;
	Button  b1;
	
	public void init()
	{
//		setLayout(new GridLayout(3,1));
		
		add(t=new TextField());
//		add(t1=new TextArea("Enter a number",1,20));
		add(b1=new Button("Table"));
		add(t1=new TextArea(10,20));

	}
	
	public boolean action(Event e,Object o)
	{
		if(e.target.equals(b1))
		{
		    String s1= t.getText();
		    
		    int n=Integer.parseInt(s1);
		    
		    int multi=0;
		    for(int i=1;i<=10;i++)
		    {
		    
		    	multi=i*n;
	
		    	t1.setText(String.valueOf(multi));
		    	
 		    }
		}
		
		
		
		
		return true;
	}
	
}
