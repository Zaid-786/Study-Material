package com.abstruction;

//To write a program for abstruction example 


abstract class Bike_1     			//this is abstract parent class
{
	abstract void run();			//this is abstract method but without method body
}

class Honda extends Bike_1 			//this is child class extends by abstract parent class 
{
	void run()						//in this child class we are defining abstract method body
	{
		System.out.println("this is abstract method body definition..");
	}
}



public class AbstructionExample1
{ 
	public static void main(String[] args) 
	{
			Bike_1 a=new Honda();
			
			a.run();
			
	}

}
