package com.inheritance_demo;




//	2. super keyword can be used to invoke immediate parent class method.



class Animalx{								// parent class
 
	void eat()
	{
		System.out.println(" Animal is Eating.....");
	}
	
}

class Dogx extends Animalx{								// child class
	
	void eat()											// override eat() method
	{
		System.out.println("Dog is eating....");
	}
	
	void bark()
	{
		System.out.println(" Barking ....");
	}
	
	void work()
	{
		super.eat();								// by using super keyword we invoked immediate parent class method
		bark();
	}
}




public class KeyWord_SuperKeyWord_2 {

	public static void main(String[] args)
	{
		Dogx d1=new Dogx();
		
		d1.work();
	}

}


/*
   in this Example, Animal and Dog both classes have eat() method if we call eat() method from Dog Class,
   it will call eat() method of Dog Class by default because priority is given to Local. 
 
   To call the parent class method, we need to use super keyword.
 
 */
 