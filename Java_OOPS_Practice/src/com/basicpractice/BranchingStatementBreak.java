package com.basicpractice;

//To write a program for BranchingStatementBreak

public class BranchingStatementBreak 
{
	public static void main(String[] args) 
	{
		int i=1;
		
		while(i<=5)
		{
			System.out.println("the value of i="+i);
			i++;
			
			if(i==3)
										//this branching statement break condition
				break;
			
		}
		
		System.out.println("out of loops...");
	}

}
