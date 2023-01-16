package com.polymorphism;

//To write a program for final keyword method 
//if u make any method as final method,then u cant override it.

class Bike1
{
	
 final void run() 							//this is final method
	{
	 System.out.println("bike is running....");	
	}
}

class Honda extends Bike1
{
	void run()								//we cant override it because of this is final method
	{
		System.out.println("honda bike is running...");
	}
}

public class FinalMethodTest 
{
   public static void main(String[] args)
	{
		Honda q=new Honda();
		q.run();
	}

}
