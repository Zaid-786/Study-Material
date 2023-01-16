package com.polymorphism;

//To write a program for method overriding example

class Vehicle1							//this is parents class
{
	void run()
	{
		System.out.println("the vehicle is running...");
	}
}

class Bike extends Vehicle1				//this is child class
{
	void run()
	{
		System.out.println("this bike is running....");
	}
}



public class MethodOverridingTest2 {

	public static void main(String[] args) 
	{
		Bike a=new Bike();
		
		a.run();
	}

}
