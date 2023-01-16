package com.array_demo;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class ArrayDemo_Frame2 extends Frame implements ActionListener{
	
Button b1[][];												// declared the array of button b1

	ArrayDemo_Frame2()
	{
		setLayout(new GridLayout(3,3));						// set the frame window Layout
		
		b1=new Button[3][3];								// set the size of array b1
		
		for(int i=0;i<b1.length;i++)
		{
			for(int j=0;j<b1[i].length;j++)
			{ 
				if(Math.random()>0.5)							// apply the condition
				add(b1[i][j]=new Button("X"));
				else 
					add(b1[i][j]=new Button("O"));
				
				b1[i][j].addActionListener(this);
			}
		}

		

		
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			
		});
		
		setSize(400,400);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args)
	{
		new ArrayDemo_Frame2();
	}



	public void actionPerformed(ActionEvent arg0) {
		
		Object o = arg0.getSource();					// in this method we write our logics which will be perform action on button
		
		if(o instanceof Button)
		{
//			Button b= (Button)o;
//			String a= b.getLabel();
			
			String c=((Button)o).getLabel();
			
			if(c.equals("X"))
				((Button)o).setLabel("O");		
			else 
				((Button)o).setLabel("X");		
			
			}
			
		}
		
	}

