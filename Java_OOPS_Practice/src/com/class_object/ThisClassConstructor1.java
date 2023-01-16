package com.class_object;


//to write a program calling  parameterized constructor from default constructor

public class ThisClassConstructor1
{
	ThisClassConstructor1()  		//this is default constructor 
	{
		this(2);					//this() method used for parameterized constructor from default constructor 
		System.out.println("this is default...");
	}
	
	ThisClassConstructor1(int y)				// this is parameterized constructor 
	{
		System.out.println("this is parameterized.."+y);
	}
	
	public static void main(String[] args)
	{
			
		ThisClassConstructor1 b=new ThisClassConstructor1();
		
	}

}
