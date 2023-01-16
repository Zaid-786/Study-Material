package com.polymorphism;

//To write a program for 
// can we initialize final blank variable, yes through constructor 
//final static variable values assigned through static block 

class Z
{
	
	final static int xyz;				//final static variable only declaration and not assign value
	
	static								//we can final static variable assign value through static block
	{
		xyz=200;

	}
	
	
	final int pancard;					//final variable only declaration and value assign into only constructor
	
	Z()									//this is constructor
	{
		pancard=100;
		System.out.println("this is final int pancard values which is assign only into constructor= "+pancard);
	}
	
}


public class FinalPracticeTest 
{
	public static void main(String[] args) 
	{
			Z n=new Z();
			
			System.out.println(Z.xyz);
	}

}
