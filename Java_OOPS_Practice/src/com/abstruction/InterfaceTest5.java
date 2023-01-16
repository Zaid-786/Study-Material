package com.abstruction;

//To write a program for how to overcome and solve multiple inheritance concept and extends one interface to another interface

interface Printable2				//this is a interface of Printable2
{
	void printShow();				//this is interface method()
}


interface Showable2 extends Printable2			//when one interface inherits another interface then we will used extends keyword 
												//interface Showable2  extends by interface Printable2
{
	void printShow();							//this is interface method()
}



 class InterfaceTest5 implements Showable2		// class InterfaceTest5  implements by interface Printable2,Showabl2
{
	public void printShow()
	{
		System.out.println("printShow method executing at runtime polymorphism..");
	}
	
	public static void main(String[] args)
	{
		InterfaceTest5 a=new InterfaceTest5();
		a.printShow();
		
	}



}
