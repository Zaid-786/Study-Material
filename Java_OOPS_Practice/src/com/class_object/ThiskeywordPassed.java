package com.class_object;


//To write a program thiskeyword passed as an argument in the method

public class ThiskeywordPassed 
{
	void n(ThiskeywordPassed obj)				// in the method n() passed an argument type of class ThiskeywordPassed reference variable obj 
	{
		System.out.println("this is method invoking...");
	}
	
	void p()
	{
		n(this);		//thiskeyword passed as an argument in the method	
	}
	
	
	public static void main(String[] args) {
				
		ThiskeywordPassed a=new ThiskeywordPassed();
		
		a.p();
				
		
	}

}
