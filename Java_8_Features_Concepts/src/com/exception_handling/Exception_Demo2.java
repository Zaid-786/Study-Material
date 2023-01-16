package com.exception_handling;

import java.rmi.AccessException;

public class Exception_Demo2 {

	public static void main(String[] args) 
	{

		
		
		
//	case_1:-	wrong declaration block because try block always with catch() block or finally block 	
//				 try
//				 {
//					 int a=100;		 
//				 }
					

		
//	case_2:-   wrong declaration block because catch() block always with try block
		
//			catch(Exception e)
//			{
//				System.out.println(e);
//			}
		
		
		
//	case_3:-   wrong declaration block because finally block always with try block
		
//		 finally
//		 {
//			 System.out.println("hello");
//		 }
	
		
	
		

		
		
//	case_4:-   we can use multiple catch() block with try block but we can only use once finally block with try block
//			   we must remember whenever you are using multiple catch() block with try block then you should passed child exception class into your catch() block 	
	
//		try {
//			
//				int a=100/0;
//				System.out.println(a);
//			    System.out.println(" try block......");
//		}
//		catch(ArithmeticException e1)
//		{
//			System.out.println(e1);
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		
		
		
		
		
		
		
		
//	case_5:-   we can use multiple try-catch block within try block
		
//	try {	
//		
//		try {
//			   System.out.println("try block......");
//		}
//		catch(ArithmeticException e1)
//		{
//			System.out.println(e1);
//		}
//	}	
//	catch(Exception e2)
//		{
//			System.out.println(e2);
//		}
	
	
	
	
	
		
		
//	case_6:-   we can use multiple try-catch block within catch() block.
		
//		try {
//			int a=100/0;
//			System.out.println(a);
//			System.out.println(" outsider try block....");
//		}
//	   catch(Exception e)
//		{
//		   try{
//		   		System.out.println("insider try block......");
//		   	}
//			catch(ArithmeticException e1)
//			{
//				System.out.println(e1);
//			}
//		   
//		   System.out.println(e);
//		}

	
		
		
		
		
		
	
//	case_7:-   we can use try,catch & finally block together .

//		try 
//		{
//			int a=100/0;
//			System.out.println(a);
//			System.out.println("i am in try block");
//		}
//		catch(ArithmeticException e1)
//		{
////			System.out.println(e1);
//			e1.printStackTrace();
//		}
//		finally {
//			System.out.println("i am in finally block");
//		}
	
	
		
		
		
		
		
//	case_8:-   we can use multiple try-catch block within finally block.
		
//		try {
//			int a=100/2;
//			System.out.println(a);
//			System.out.println(" outsider try block....");
//		}
//	   catch(ArithmeticException e)
//		{
//		   System.out.println(e);
//		}
//		finally {
//			
//			try{
//				System.out.println("insider finally try block......");
//			}
//			catch(Exception e1)
//			{
//				System.out.println(e1);
//			}
//			
//		}

		

		
		
		
		
		
//		case_9:-   wrong declaration of blocks.
		
		
//		try{
//			  int a=100/0;
//			  System.out.println(a);
//			  System.out.println("i am in the try block");
//		}
//		finally {
//			System.out.println("i am in the finally block");
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		
		

		
		
//		case_10:-   wrong declaration of blocks.
	
//		try{
//			  int a=100/0;
//			  System.out.println(a);
//			  System.out.println("i am in the try block");
//		  }
//		System.out.println("outsider statements... ");
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		
		
		
		
		
	}
}
