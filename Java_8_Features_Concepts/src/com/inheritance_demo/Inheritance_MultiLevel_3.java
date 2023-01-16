package com.inheritance_demo;


//this is Multi Level Inheritance example.

// when there is a chain of inheritance,its known as Multi level inheritance.

// for example:- BabyDog class inherits Dog class which again inherits Animal class.


class Animal1									//this is parent class
{
	void eat()
	{
		System.out.println("eating......");
	}
}


class Dog1 extends Animal1{								//  child class of Animal class and parent class of BabyDog class
	
	void bark()
	{
		System.out.println("barking.....");
	}
}


class BabyDog extends Dog1{
	
	void weep()
	{
		System.out.println("weeping......");
	}
}


public class Inheritance_MultiLevel_3 {

	public static void main(String[] args) {
		
		BabyDog b1=new BabyDog();
		
		b1.weep();									//this method of BabyDog class
		b1.bark();									//this method of Dog class
		b1.eat();									//this method of Animal class
	}

}

//OUTPUT:-

//		weeping......
//		barking.....
//		eating......
