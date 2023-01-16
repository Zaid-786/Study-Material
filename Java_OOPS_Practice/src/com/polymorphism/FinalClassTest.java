package com.polymorphism;

//To write a program for final keyword class
//if u make any class as final method,then u cannot extend it.

final class A					//this is parent final class
{
	int a=10; 
}

class B extends A					//now can not extends it because of our parent class is final
{
	void a()
	{
		System.out.println(a);
	}
}


public class FinalClassTest 
{
	public static void main(String[] args)
	{
			B n=new B();
			
			n.a();
	}
}
r