package com.polymorphism;

//To write a program for understanding problem without method overriding

class Vehicle								//this is parent class 
{
	void run()
	{
		System.out.println("the vehicle is running...");
	}
}



public class MethodOverridingTest1 extends Vehicle          //this is child class 
{
public static void main(String[] args)
{
		MethodOverridingTest1 a=new MethodOverridingTest1();
	
	a.run();
	
	}

}
