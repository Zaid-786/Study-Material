package com.basicpractice;

//To write a program for BranchingStatement_Return


public class BranchingStatement_Return
{
	public static void main(String[] args) 
	{
			int i;
			
			for(i=1;i<=5;i++)
			{
				System.out.println("the value of i="+i);
				
				if(i==3)     		//this is Branching Statement_Return  for return condition expression
					return;
			}
			
			System.out.println("out of loops...");
	}

}
