import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;




//Write a AppletPart2_MouseMotionListener program !

/*
 in this program, we want coordinate x-axis and y-axis by moving mouse Cursor.
 and we used Anonymous class to write .
 */

/*Java MouseMotionListener Interface
The Java MouseMotionListener is notified whenever you move or drag mouse. It is notified against MouseEvent.
The MouseMotionListener interface is found in java.awt.event package. It has two methods.

Methods of MouseMotionListener interface
The signature of 2 methods found in MouseMotionListener interface are given below:

public abstract void mouseDragged(MouseEvent e);  
public abstract void mouseMoved(MouseEvent e);

*/


public class AppletPart2_MouseMotionListener_1  extends Applet{

	public void init()
	{
		addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent arg0) {    			  // this is extra method and we don't need this method but can't avoid this method because comes with FocusListener interface.
				// TODO Auto-generated method stub					// how to avoid and remove extra method at the time of using interface that time we will use Adapter class
				
			}

			@Override
			public void mouseMoved(MouseEvent arg0)
			{		
				int x= arg0.getX();
				int y= arg0.getY();
				
				String i= String.valueOf(x);			
				String j= String.valueOf(y);


				showStatus(i+", "+j);
			}
			
		});
	}
}
	
	

