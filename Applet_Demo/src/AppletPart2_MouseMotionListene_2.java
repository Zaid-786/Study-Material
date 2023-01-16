import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

//Write a AppletPart2_MouseMotionListener program !

/*
 in this program, we want coordinate x-axis and y-axis by moving mouse Cursor.
 and we used Anonymous class with Adapter Class to write logic .
 */

public class AppletPart2_MouseMotionListene_2  extends Applet{

	public void init()
	{
		
	 addMouseMotionListener(new MouseMotionAdapter() {					// this is Adapter Class
		
		 @Override
		 public void mouseMoved(MouseEvent e)
		 {
			   int x= e.getX();
				int y= e.getY();
				
//				String i= String.valueOf(x);
//				String j= String.valueOf(y);


				showStatus(String.valueOf(x)+", "+String.valueOf(y));

		 }
	});
	
	
	}
}
