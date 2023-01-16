package com.polymorphism;

//To write a program for method overloading changing by return-type

class Adder1
{
	static int add(int a,int b)				//this is static method then we don't need instance for this method and in this method we passed two int-type variable
	{
		return a+b;
	}
	
	static double add(double x,double y)		//this is static method then we don't need instance for this method and in this method we passed two double-type variable
	{
		return x+y;
	}
	
	
}

public class MethodOverloading2 
{
	public static void main(String[] args) 
	{
				System.out.println(Adder1.add(10, 20));
				System.out.println(Adder1.add(12.3,11.3));
	}

}
