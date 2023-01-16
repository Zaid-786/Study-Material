package com.basicpractice;

//To write a program for ShiftOperator

public class ShiftOperator 
{
	public static void main(String[] args)
	{
			int a,b;
			a=b=4;
			
			a=a>>2;   					//first we convert 4 number into binary then left shifting by 2 then we will get result is 1      
			b=b<<2;						//first we convert 4 number into binary then right shifting by 2 then we will get result is 16
			
			System.out.println("a="+a);    
			System.out.println("b="+b);
			
	}

}
