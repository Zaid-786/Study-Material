package com.polymorphism;

//To write a program for final keyword variable

//there is a final variable speed, we are going to change the value of this variable ,but it cant be changed because final variable once assigned a value can never be changed

class Bike1
{
	final int speed=80;					//this is final variable of speed or you can say that constant variable
	
	void run()
	{
		speed=100;							//now we are tried to change final variable speed but we cant changed this is specialty of final keyword 
		System.out.println(speed);
	}
}

public class FinalVariableTest1 
{
	public static void main(String[] args)
	{
			Bike1 r=new Bike1();
			r.run();
	}

}
