 package com.polymorphism;

//To write a program for Dynamic binding example
//when type of object is determined at run time (by the JVM),its knowns as Dynamic binding

class Animal_C
{
	void eat()
	{
		System.out.println("this is eating method...");
	}
}


class Dog_C  extends Animal_C
{
	void eat()
	{
		System.out.println("this is dog eating method");
	}
}


public class DynamicBinding 
{
	public static void main(String[] args)
	{
			Animal_C a=new Dog_C();
			a.eat();		
	}
}

//in this example,the instance of dog is also an instance of Animal.so compiler doesnt know its type,only its base type.
