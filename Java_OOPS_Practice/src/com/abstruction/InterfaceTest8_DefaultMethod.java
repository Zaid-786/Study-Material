package com.abstruction;


//To write a program for which are used interface and default method in the interface

interface Drawable3						//this is an interface
{
	void draw();						//this is an interface method
	
	default void msg()								//this is default method is supported interface in java version.8  
	{
		System.out.println("this is sms showing...");
	}
}

class Circle3 implements Drawable3							//class circle3 implements by interface Drawable3 
{
	public void draw()
	{
		System.out.println("this is circle drawing...");
	}
}



public class InterfaceTest8_DefaultMethod 
{
	public static void main(String[] args)
	{
		Circle3 a=new Circle3();
		
		a.draw();
		a.msg();
	}

}
