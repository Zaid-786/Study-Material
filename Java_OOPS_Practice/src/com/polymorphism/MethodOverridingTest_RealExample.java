package com.polymorphism;

//To write a program for method overriding example


class Bank						//this is parent class 
{
	int getRateofInterest()			//this is parent class method
	{
		return 0;
	}
}


class Axis extends Bank     		//this is child class extends by parent class
{

	int getRateofInterest()				//this is child class method
	{
		return 8;
	}
}

class Sbi extends Bank					//this is child class extends by parent class

{
	int getRateofInterest()			//this is child class method
	{
		return 10;
	}
}


public class MethodOverridingTest_RealExample 
{
	public static void main(String[] args) 
	{
	     Axis a=new Axis();
	     Sbi b=new Sbi();
	     
	     System.out.println("Axis bank of interest="+a.getRateofInterest());    // we called method through instance or object
	     System.out.println("Sbi bank of interest="+b.getRateofInterest());
	     
	}

}
