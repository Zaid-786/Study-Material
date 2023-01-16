package com.polymorphism;

//To write a program for main method overloading 

public class MainMethodOverload 
{
	public static void main()		 //we have three main method and this is main method overloading but program calls thats main method which have argument as a string array 
	{
		System.out.println("main method without arguments...");
	}
	
	
	public static void main(String args)
	{
		System.out.println("main method with string args..");
	}
	
	
	public static void main(String[] args) 
	{
			System.out.println("this is main method with string []");	
		
	}

}
