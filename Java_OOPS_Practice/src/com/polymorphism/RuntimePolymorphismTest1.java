package com.polymorphism;

//To write a program for runtime polymorphism Example


class Shape								//this is parent class 
{
	void draw()							//this is parent class method
	{
		System.out.println("this is shape drawing...");
	}
}

class Rectangel extends Shape					//this is child class extends by parent class
{
	void draw()									//this is child class method or override method 
	{
		System.out.println("this is rectangle drawing...");
	}
}


class Circle extends Shape						//this is child class extends by parent class 
{
	void draw()									//this is child class method or override method
	{
		System.out.println("this is circle drawing...");
	}
}


public class RuntimePolymorphismTest1 
{
public static void main(String[] args) 
{
	Shape s;							//this is reference of parent class
	
	s=new Rectangel();						//now we created object of child class through parent class reference
	s.draw();
	
	s=new Circle();							//now we created object of another child class through parent class reference
	s.draw();
	}

}
