package com.polymorphism;

//To write a program for super variable to called parent class instance varibale
//super is used to refer immediate parent class instance variable

class color1				//this is parent class 
{
	String val="white";			//this is instance string variable 
}

class color2 extends color1				//this is child class extends by parent class
{
	String val1="red";					//this is instance string variable  
	
 void display()								//this is show method instance variable 
 {
	System.out.println(val1);
	System.out.println(super.val);				//this is parent class instance variable prints by super keyword 
 }

}


public class SuperVariableTest1 
{
	public static void main(String[] args)
	{
		color2 a=new color2();					//this is object of class color2
		a.display();							//call display method through object 
	}

}
