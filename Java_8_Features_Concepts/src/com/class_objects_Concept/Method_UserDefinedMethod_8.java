package com.class_objects_Concept;

import java.util.Scanner;

//this is user defined method example
//user defined means user write thier own logic and chunk of codes for perform some specific task
// write a program to check number is ODD or EVEN .



public class Method_UserDefinedMethod_8 
{

	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a number =");					// we take input from user
			int num=sc.nextInt();
			
			
			Method_UserDefinedMethod_8 m1=new Method_UserDefinedMethod_8();		//create the instance of class 
			m1.evenORodd(num);										// by using instance of class we are invoking method of class 
					
			sc.close();
	}
	
	
	public void evenORodd(int x)									// this is our even or odd check logic method 	
	{
		if(x%2==0)
		{
			System.out.println("number is Even = "+x);
		}
		else
		{
			System.out.println("number is odd = "+x);
		}
		
	}
	
	
	
	

}
