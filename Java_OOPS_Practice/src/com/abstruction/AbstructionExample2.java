package com.abstruction;

//To write a program for abstruction example 

abstract class Shape				//this is abstract parent class
{
	abstract void draw();			//this is abstract method but without method body
}

class Rectangle extends Shape			//this is child class extends by abstract parent class
{
	void draw()							//in this child class we are defining abstract method body
	{
		System.out.println("this is rectangle drawing.");
	}
}

class Circle extends Shape						//this is child class extends by abstract parent class
{
	void draw()
	{
		System.out.println("this is circle drawing.");
	}
}


public class AbstructionExample2 
{
	public static void main(String[] args) 
	{
			Shape b=new Circle();
			
			b.draw();
	}

}
