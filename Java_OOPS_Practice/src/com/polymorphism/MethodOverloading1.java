package com.polymorphism;

//To write a program for method overloading changing by no.of arguments

class Adder
{
	static int add(int a,int b)				//this is static method then we don't need instance for this method and in this method we passed two int-type variable
	{
		return a+b;
	}
	
	static int add(int a,int b,int c)			//this is static method then we don't need instance for this method and in this method we passed three int-type variable
	{
		return a+b+c;
	}
}


class MethodOverloading1
{
	public static void main(String args[])
	{
		System.out.println(Adder.add(11,11));					//we directly called static method through class name like Adder.add(11,11)
		System.out.println(Adder.add(10,10,10));
	}
}
