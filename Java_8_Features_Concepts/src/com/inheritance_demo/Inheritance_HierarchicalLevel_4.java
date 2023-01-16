package com.inheritance_demo;


//this is Hierarchical Level Inheritance example.

// when two or more classes inherits a single class its known as Hierarchical level Inheritance.

// for example:- Dog and Cat classes inherits Animal Class ,so there is hierarchical level inheritance.


class Animal2									//this is parent class
{
	void eat()
	{
		System.out.println("eating......");
	}
}


class Dog2 extends Animal2{								// this is child class of Animal class
	
	void bark()
	{
		System.out.println("barking.....");
	}
}


class Cat extends Animal2{								// this is child class of Animal Class
	
	void meow()
	{
		System.out.println("Meowing.....");
	}
}




public class Inheritance_HierarchicalLevel_4 {

	public static void main(String[] args) {
			
		Cat c1=new Cat();
		c1.meow();
		c1.eat();
		
		Dog2 d1=new Dog2();
		d1.bark();
		d1.eat();
		
	}

}


//OUTPUT:-

//		Meowing.....
//		eating......
//		barking.....
//		eating......

