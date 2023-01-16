package com.abstruction;

//To write a program for how to overcome and solve multiple inheritance concept and extends one interface to another interface


interface Bank3
{
	void printsDetails();
}

interface UserInfo extends Bank3
{
	void shows();
}


 class InterfaceTest6 implements UserInfo
{	

	 public void printsDetails()
	 {
		 System.out.println("this is prints method...");
	 }
	 
	public void shows()
	 {
		 System.out.println("this is shows method...");
	 }
	

	public static void main(String[] args)
	{
		InterfaceTest6	s=new InterfaceTest6();
	  s.shows();
	  s.printsDetails();
	}



}
