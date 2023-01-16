package com.class_object;

abstract class Demo				// this a abstract class 
{								
	abstract void display();		//this is a abstract method means without body
}




public class Myclass extends Demo
{
     void display()
     {
    	 System.out.println("this is a abstract method..");
     }
	
	
	public static void main(String[] args) {
			
		Demo a=new Myclass();			// we create object reference through parent class demo and object created by child class Myclass
		a.display();
		
	}

}
