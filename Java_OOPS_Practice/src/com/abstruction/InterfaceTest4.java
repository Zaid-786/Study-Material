package com.abstruction;

//To write a program for how to overcome and solve multiple inheritance concept

interface Printable1			//this is a interface of Printable1
{
	void prints();				//this is interface method()
}

interface Showable				//this is a interface of Showable
{
	void show();					//this is interface method()

}


class A7 implements Printable1,Showable				// class A7  implements by interface Printable1,Showable
{
 public void prints()								//this is interface method body defining of prints() method
  {
	  System.out.println("this is printable method...");
  }
  
  public void show()										//this is interface method body defining of show() method
  {
	  System.out.println("this is Showable method...");
  }
}



public class InterfaceTest4
{
	public static void main(String[] args)
	{
		A7 a=new A7();
		
		a.prints();
		a.show();
	}

}
