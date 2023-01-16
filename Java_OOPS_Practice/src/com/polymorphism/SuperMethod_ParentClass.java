package com.polymorphism;


//To write a program for used super keyword to called parent class method invoked

class Animal							// this is parent class 
{
	void eat()							//this is parent class method
	{
		System.out.println("this is Animal eating....");
	}
}

class Dog extends Animal					//this is child class extends by parent class
{
	void eat()								//this is first child class method
	{
		System.out.println("this is Dog eating...");
	}
	
	
	void bark()								//this is second child class method
	{
		System.out.println("this is barking....");
	}
	
	void display()								//this is third child class method
	{
		bark();
		super.eat();			//through super keyword we called parent class method
	}
	
}


public class SuperMethod_ParentClass 
{
public static void main(String[] args) 
{
	Dog a=new Dog();
	
		a.display();
	}

}
