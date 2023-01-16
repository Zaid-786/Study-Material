package com.class_object;


//to write a program calling default constructor from parameterized constructor

public class ThisClassConstructor
{
	ThisClassConstructor()      		//this is default constructor
	{
		System.out.println("this is default..");
	}
	
	ThisClassConstructor(int x)						//this is parameterized constructor
	{
		this(); 		// this() method used to call a default constructor from parameterized constructor
		System.out.println("this is parameterized="+x);
	}

	public static void main(String[] args) 
	{
		ThisClassConstructor a=new ThisClassConstructor(5);
	}

}
