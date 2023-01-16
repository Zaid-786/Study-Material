package com.polymorphism;

//To write a program for used super keyword to called parent class constructor invoked 
//as we know well that default constructor is provided by compiler  automatically if there is no constructor but,it also adds  super() as the first statement

class Animal_2   					// this is parent class 
{
	Animal_2()						//this is parent class constructor
	{
		System.out.println("this is Animal constructor...");
	}
}



class Dog1 extends Animal_2						//this is child class extends by parent class
{
	Dog1()										//this is child class constructor
	{
		super();								//we can used super keyword method() and called parent class constructor and if u not used super() but compiler automatically added
		
		System.out.println("this is dog class constructor...");
	}
}


public class SuperKeyword_constructor
{
	public static void main(String[] args) 
	{
			Dog1 n=new Dog1();
	}

}
