package com.polymorphism;

//To write a program for runtime polymorphism with data member  Example
//we can not achieved runtime polymorphism through data member 

class A1
{
	int speed=100;
}

class A2 extends A1
{
	int speed=80; 
}



public class RuntimePolymorphismWithDataMember {

	public static void main(String[] args) 
	{
			A1 q=new A2();
			
			System.out.println(" speed of parent class variable rather than child class speed variable="+q.speed);		
	}

}
