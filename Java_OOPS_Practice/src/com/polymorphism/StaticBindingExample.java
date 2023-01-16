package com.polymorphism;

//To write a program for static binding example
//when type of object is determined at compile time (by the compiler),its knowns as static binding
//if there is any private,final or static method in a class,there is static binding.


public class StaticBindingExample
{
	private void study()      			//this is private method means showing thats a static binding
	{
		System.out.println("this is zo study practice...");
	}
	
	public static void main(String[] args)
	{
		StaticBindingExample a=new StaticBindingExample();
			a.study();
	}

}
