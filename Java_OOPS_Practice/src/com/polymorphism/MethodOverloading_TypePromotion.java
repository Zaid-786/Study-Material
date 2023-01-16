package com.polymorphism;


//To write a program for MethodOverloading_TypePromotion

public class MethodOverloading_TypePromotion 
{
	void sum(int a,long b)			//type promotion  means in this method we passed two parameters first argu type is int and second argu type is long 
	{									//through type promotion we converted long variable into int variable
		System.out.println(a+b);
	}
	
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) 
	{
		MethodOverloading_TypePromotion a=new MethodOverloading_TypePromotion();
		
		a.sum(12,12);
		a.sum(12,12,12);
	}

}
