package com.inheritance_demo;


// MethodOverriding in Java =>

/*
 	if Sub-Class (Child Class) has the same method as declared in the parents Class,
 	its known as MethodOverriding in java.
 	
 	Method Overriding is used for Run-time polymorphism.
 
 */


/* Rules for Java Method Overriding :-
 
 1. the Method must have the same name as in the parent class.
 2. the Method must have the same parameter as in the parent class.
 3. there must be an IS-A relationship (Inheritance).
*/


// lets understand by simple Example,
//  Supposed, we have two Classes, parent class is Vehicle class and child class is Bike class and both class have same run() method  



class Vehicle{												// this is parent class
	
	void run()
	{
		System.out.println("Vehicle is running....");
	}
}


class Bike extends Vehicle{										// this is child class extends  parent class
	
	void run()
	{
		System.out.println("Bike is Running.....");
	}
}



public class MethodOverridig_Demo1 {

	public static void main(String[] args) {
		
		Bike b1=new Bike();
		 b1.run();
	}

}
