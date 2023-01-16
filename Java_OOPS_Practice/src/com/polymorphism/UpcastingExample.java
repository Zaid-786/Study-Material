package com.polymorphism;

//To write a program for Upcasting Example
//if the reference variable of parent class refers to the object of child class,its knowns as Upcasting 
//its also called runtime polymorphism

class Bike_A									//this is parent class
{
	void run()									//this is parent class method 
	{
		System.out.println("bike is running...");
	}
}

class Splendor extends Bike_A					//this is child class extends by parent class 
{
	void run()									//this is child class method and overrides method 
	{
	
		System.out.println("splendor is running....");
	}
}

public class UpcastingExample 
{
public static void main(String[] args)
{
	Bike_A q=new Splendor();                 //we created instance reference variable or parent class and instance object through child class
	
	q.run();
	}

}
