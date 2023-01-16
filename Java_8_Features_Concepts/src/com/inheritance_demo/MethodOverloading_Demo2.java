package com.inheritance_demo;



//	2. By Changing the Data-type of Arguments

// lets understand by simple Example

/* 
  in this example, we have created two methods that differs in data-type.
  the first add() method receives two Integer Arguments and 
  second add() method receives two double Arguments .
 */



class Adder1{
										// add() method overloading by changing data-type of arguments
	static int add(int a,int b)
	{
		return a+b;
	}
	
	static double add(double a,double b)
	{
		return a+b;
	}
}



public class MethodOverloading_Demo2 {

	public static void main(String[] args) {

		System.out.println(Adder1.add(12,12));
		System.out.println(Adder1.add(12.55,12.5));

	}
}
