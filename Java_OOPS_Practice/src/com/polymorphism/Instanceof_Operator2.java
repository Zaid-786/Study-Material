package com.polymorphism;

//To write a program for instanceof operator example 
//instanceof operator in java its built-in operator which is used to comparison instance(object) type  
//when we created any child class instance then parent class instance(object) automatically created 

class x
{
 int a=10;
}


class y extends x
{
	int b=80;
}

public class Instanceof_Operator2 
{

	public static void main(String[] args)
	{
			x a=new y();
			
			System.out.println(a instanceof y);
	}

}
