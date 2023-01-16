package com.abstruction;

//To write a program for abstruction example with constructor and abstruct method and method

abstract class Bike 					//this is abstract parent class
{
	Bike()									//this is parent class constructor
	{
		System.out.println("the bike is created...");
	}
	
	abstract void run();							//this is abstract method but without method body
	
	void gear()										//this is method of abstract class
	{
		System.out.println("bike is gearing...");
	}
	
}


class Honda_1 extends Bike					//this is child class extends by abstract parent class
{
	void run()									//in this child class we are defining abstract method body
	{
		System.out.println("bike is running....");					
	}
}



public class AbstructionExample4 {

	public static void main(String[] args) 
	{
			Bike a=new Honda_1();
			
			a.run();
			a.gear();
	}

}
