package com.inheritance_demo;

//this is Single Level Inheritance example .

//when a class inherits another class is knowns as single level inheritance.
//for example:- Dog class inherits Animal class, so there is the single level inheritance.


class Animal									//this is parent class
{
	void eat()
	{
		System.out.println("eating......");
	}
}


class Dog extends Animal{								// this is child class 
	
	void bark()
	{
		System.out.println("barking.....");
	}
}




public class Inheritance_SingleLevel_2 
{
	public static void main(String[] args)
	{
			Dog d1=new Dog();
			
			d1.eat();
			d1.bark();
	}

}


// OUTPUT:-

//		eating......
//		barking.....
