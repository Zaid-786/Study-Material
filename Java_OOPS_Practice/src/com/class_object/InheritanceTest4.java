package com.class_object;

//To write a program for hierarchical  inheritance concepts

class Animal1								//this is parents class Animal1
{
	void eat()									//this is method of class Animal1
	{
		System.out.println("this is eating....");
	}
}

class Dog1  extends Animal1								//this is child class of Animal1
{
	void bark()												//this is method of class Dog1
	{
		System.out.println("this is barking...");
	}
}

class Cat extends Animals								//this is child class of Animal1
{
	void meow()											//this is method of Cat class
	{
		System.out.println("this is meowing...");
	}
}




public class InheritanceTest4 
{
	public static void main(String[] args) 
	{
			Cat b=new Cat();
			Dogs c=new Dogs();
			
			
			b.meow();							//this is Cat class method called from object of Cat class
			b.eat();							////this is Animal1 class method called from object of Cat class
			
			c.bark();
			c.eat();
	}

}
