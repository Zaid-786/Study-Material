package com.polymorphism;

//To write a program for MethodOverloading_TypePromotion_ambiguity 

public class MethodOverloadingTypePromotion_Ambiguity 
{
	void sum(int x,long y)									//if there are no matching type argument in the method and each method promotes similar number of arguments,there will be ambiguity
	{
		System.out.println("This is A method invoked...");
	}
	
	void sum(long x,int y)
	{
		System.out.println("this is b method invoked....");
	}
	
	
	public static void main(String[] args) 
	{
		MethodOverloadingTypePromotion_Ambiguity x=new MethodOverloadingTypePromotion_Ambiguity();
		
		x.sum(12, 12);
	}

}
