package com.class_objects_Concept;


//this is Predefined method example
//predefined Method means that method is already written somewhere among any predefined class by java.
// write a program to generate a random number 


public class Method_PredefinedMethod_10 
{
	public static void main(String[] args) 
	{
		
		
//		this is first way to generate a random number
//		System.out.println("generate a random number="+Math.random());
//		System.out.println("generate a random number="+Math.random());
//		System.out.println("generate a random number="+Math.random());
		
		
		
//		this is second way to generate a random number
		int min=1,max=10;
		
		System.out.println("generate a random number between "+min+" to "+max);
		
		int num=(int) (Math.random()*(max-min+1)+min);			//we used formula [(Math.random()*(max-min+1)+min)] to generate a random between two number 
		
		System.out.println(num);
		
		
	}

}
