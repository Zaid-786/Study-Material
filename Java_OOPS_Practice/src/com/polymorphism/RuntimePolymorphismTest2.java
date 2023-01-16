package com.polymorphism;

//To write a program for runtime polymorphism Example


class Animal_A							//this is parent class
{
	void eat()							//this is parent class method
	{
		System.out.println("this is eating...");
	}
}

class Dog_A extends Animal_A					//this is child class extends by parent class
{
	void eat()									//this is child class method or override method
	{
		System.out.println("dog is eating...");
	}
}

class Cat_A extends Animal_A						//this is child class extends by parent class
{
	void eat()									//this is child class method or override method
	{
		System.out.println("cat is eating....");
	}
}



public class RuntimePolymorphismTest2 {

	public static void main(String[] args) 
	{
		Animal_A n;						//this is reference of parent class
		
		n=new Dog_A();					//now we created object of child class through parent class reference
		n.eat();
		
		n=new Cat_A();					//now we created object of another child class through parent class reference
		n.eat();
	}

}
