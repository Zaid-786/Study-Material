package com.abstruction;

//To write a program for abstract with interface example 

interface A					//this is a interface of A
{
	void a();					//these are interface method
	void b();
	void c();
	void d();
}

abstract class B implements A 				//abstract class B implements by interface A 
{
   public void c()							//this is interface method body defining of c() method
	{
		System.out.println("i am method c");
	}
}

class C extends B							//class C extends by class B which is implemented by interface A
{
	public void a()								//this is interface method body defining of a() method
	{
		System.out.println("i am method a");
	}
	
	public void b()							//this is interface method body defining of b() method
	{
		System.out.println("i am method a");
	}
	
	public void d()							//this is interface method body defining of d() method
	{
		System.out.println("i am method a");
	}
}


public class AbstractWithInterfaceExample 
{
	public static void main(String[] args)
	{
			A z=new C();
			
			z.a();
			z.c();
	}

}
