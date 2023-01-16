package com.inheritance_demo;



// 	Super KeyWord in Java !

/* The Super KeyWord in Java is a Reference variable which is used to refer immediate Parent class Object .  */

/*  Usage of Java super keyword :-
  
 1. Super keyword can be used to refer immediate parent class instance variable.
 
 2. super keyword can be used to invoke immediate parent class method.
    
 3. super keyword can be used to invoke immediate parent class Constructor.
  
 */



//1. Super keyword can be used to refer immediate parent class instance variable.


class  A{
	
	int i=10;						// these are instance variables of parent class (A class)
	String color="White";
}


class B extends A{
	
	int i=20;						// these are instance variables of child class (b class)
	String color="balck";
	
	void display()
	{
		System.out.println(color);					// call the current class variable
		System.out.println(super.color);			// call the immediate parent class variable
		
		System.out.println(i);
		System.out.println(super.i);

	}
}



public class KeyWord_SuperKeyWord_1 {

	public static void main(String[] args)
	{
		B b1=new B();  // create an instance of child class (b class)
		
		b1.display();	// calling the display method of child class
	}

}
