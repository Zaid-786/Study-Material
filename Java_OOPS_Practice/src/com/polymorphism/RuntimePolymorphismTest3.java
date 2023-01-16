package com.polymorphism;

//To write a program for runtime polymorphism Example of multi level inheritance


class Animal_B
{
   void eat()
   {
		System.out.println("this is eating...");
	}
}

class Dog_B extends Animal_B
{
	void eat() {
		System.out.println("dog is eating...");
	}
}

class DogBaby_B extends Dog_B
{
	void eat() 	{
	 System.out.println("dogbaby is eating...");	
}


public class RuntimePolymorphismTest3 {

	public static void main(String[] args)
	{
			Animal_B x,y,z;
			
			z=new Animal_B();
			z.eat();
			
			y=new Dog_B();
			y.eat();
			
			x=new DogBaby_B();
			x.eat();
			
	}

}
