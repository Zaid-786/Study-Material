package com.abstruction;

//To write a program for interface example 

interface Bank1								//this is a interface of Bank1
{
	float getInterest();					//this is interface method()
}


class PNB implements Bank1					//class PNB  implements by interface Bank1
{
 public	float getInterest()					//this is interface method body defining of getInterest() method

	{
		return 19.3f;
	}
}

class SBI1 implements Bank1
{
 public	float getInterest()
	{
		return 10.4f;
	}
}

public class InterfaceTest3 
{
	public static void main(String[] args)
	{
			Bank1 a=new SBI1();
			 
			Bank1	b=new PNB();
				  
			
			System.out.println("interest of SBI="+a.getInterest());
			System.out.println("interest of PNB="+b.getInterest());
	}

}
