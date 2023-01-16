package com.array_demo;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;







public class ArrayDemo_Frame1 extends Frame
{
	
	int[] x;
	int[] y;
	
	ArrayDemo_Frame1()
	{
		x=new int[7];
		y=new int[7];
		
		for(int i=0;i<x.length;i++)
		{												// we are initializing random values into array of x & y variable
			x[i]=(int) (400*Math.random());				
			y[i]=(int) (400*Math.random());
		}
		
		
	
		addWindowListener(new WindowAdapter(){
		 
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
		
		});
		
		setSize(400,400);
		setVisible(true);	
		
}
	
	public void paint(Graphics g)
	{
		g.drawPolygon(x,y,5);
	}
	
	
	public static void main(String[] args)
	{
		
		new ArrayDemo_Frame1();
	}

}
