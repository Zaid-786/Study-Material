package com.abstruction;

//To write a program for abstruction example 


abstract class Bank
{
	abstract int interest();
}

class Sbi extends Bank
{
	int  interest()
	{
		return 7;
	}
}

class Axis extends Bank
{
	int interest()
	{
		return 10;
	}
}


public class AbstructionExample3 {

	public static void main(String[] args)
	{
			Bank z=new Axis();
			
			System.out.println("interest of axis bank="+z.interest());
	}

}
