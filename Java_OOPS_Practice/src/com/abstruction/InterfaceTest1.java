package com.abstruction;

//To write a program for interface example 

interface Printable 				//this is a interface of Printable
 {
	void print();					//this is interface method()
	
 }


class A2 implements Printable				// class A2  implements by interface Printable
 {
	
  public void print() 						//this is interface method body defining of print() method
	{
		System.out.println("this is print() method defining..");
	}
}




public class InterfaceTest1 
{
	public static void main(String[] args)
	  {
		 Printable a=new  A2();
		
		   a.print();
	   }

}
