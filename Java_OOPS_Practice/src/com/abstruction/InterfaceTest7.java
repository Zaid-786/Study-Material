package com.abstruction;

//To write a program for which are used interface and one class inherited other class 

interface Animal3      						//this is an interface
{
	void eats();							//this is an interface method
}


class Dog 										//this is parent class
{
	void barks()								//this is parent class method
	{
		System.out.println("this is dog bark method...");
	}
}


class Dogbaby extends Dog implements Animal3				//this is child class Dogbaby which extends parent class Dog and implements by interface Animal3 
{
	
 public	void eats()											//this is interface method defining 
	{
		System.out.println("this is eating method...");
	}
	
	void weeps()											//this is child class method
	{
		System.out.println("the babydog is weeping...");
	}
}

public class InterfaceTest7 
{
	public static void main(String[] args)
	{
       Dogbaby s=new Dogbaby();
       
       s.weeps();
       s.barks();
       s.eats();
	}
}
