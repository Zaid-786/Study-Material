package com.exception_handling;

import java.util.Scanner;

public class ExceptionDemo_ThrowKeyword {

	public static void main(String[] args) {

		
//this is our exception problem	
//	  int a=100/0;
//	  System.out.println(a);
//	  System.out.println("program is executed successfully... ");
	
		
		
// solve no:-1  handle above exception problem by using try-catch() block .	  
//	  try {
//		  
//		  int a=100/0;
//		  System.out.println(a);
//		  System.out.println("program is executed successfully... ");  
//	  }
//	  catch(ArithmeticException e1)
//	  {
//		  System.out.println(e1);
////		  e1.printStackTrace();
//		  System.out.println("number cannot divided by  zero then use other number for divide ");
//	  }
	  
		

		
// solve no:-2  handle above exception problem by using throw keyword (throw keyword always used for custom OR userdefined  exceptions).	  

//		int a=100,b=0,c,d;
//		c=a/b;
//		d=a*b;
//		if(c!=d)
//		{
//			throw new ArithmeticException("this is arithmatic exception");
//		}
//		else
//		{
//			System.out.println("program is executed successfully...");
//		}
//		
		
		
		
/* throw keyword in java:-
  The throw keyword in Java is used to explicitly throw an exception from a method or any block of code.
  We can throw either checked or unchecked exception. 
  The throw keyword is mainly used to throw custom or userdefined exceptions. 
*/		
		
		
// throw keyword example below:-					best way to used throw keyword always for custom or userdefined exception		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age....");
		
		int age=sc.nextInt();

		
		try {
			
			if(age<18)				
			{
				throw new AgeException("you are not eligible for voting");
//				System.out.println("below AgeException statement");           we cannot write any statement after throw statement otherwise we will get error
			}
			else{
				System.out.println("you are eligible for voting");
			}
		}
		catch(AgeException e)
		{
			e.printStackTrace();
		}
		System.out.println("our program is executed successfully....");
		
			
	}
}



class AgeException extends RuntimeException{					// this is custom exception or userdefined exception 
	
	AgeException(String msg)
	{
		super(msg);
	}
}