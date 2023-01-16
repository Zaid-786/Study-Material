package com.class_object;

//To write a program multi-level inheritance concepts

class Animal				//this is parents class 
{
	void eat()					//this is method of parents class  Animal
	{
		System.out.println("this is eating....");
	}
}

class Dogs extends Animal							//this is second parents class and child of animal class 
{
	void bark()										//this is method of second parents class Dog 
	{
		System.out.println("this is barking....");
		
	}
}


class BabyDog extends Dogs							// this is child class of all parents class 
{
	void weep()									//this is method of child class BabyDog
	{
		System.out.println("this is weeping....");
		
	}
}


public class InheritanceTest3         
{
	public static void main(String[] args)
	{
								   		//this is multi level inheritance concepts
		BabyDog a=new BabyDog();
		
		a.weep();    				//this is BabyDog class method called from object of BabyDog class
		a.bark();					// this is Dog class method called from object of BabyDog  class
		a.eat();					// this is Animal class method called from object of BabyDog class
		
	}

}
