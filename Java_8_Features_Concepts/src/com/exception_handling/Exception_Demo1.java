package com.exception_handling;

import java.io.FileInputStream;


public class Exception_Demo1 {

	public static void main(String[] args) {

//  EXCEPTION PROBLEMS (compile-time exception)...............................................		

// 1)		FileInputStream fis=new FileInputStream("d:/abc.txt");              //(Exception 1) this fis object thrown compile-time exception(classNOTFound Exception) because this fis object is not found this abc.txt file 

// 2)		Class.forName("mysql:java");										// (Exception 2)   this is thrown classNotFound Exception

		
//  EXCEPTION PROBLEMS (run-time exception)...................................................		
  		
//	3)		int a=100,b=0,c;
//			System.out.println(a/b);
	

//  4)		String name=null;
//		    System.out.println(name.length());
		
		
//..........................................EXCEPTION HANDLING (SOLUTION).......................................
				
//  1)		try {
//			
//					FileInputStream fis=new FileInputStream("d:/abc.txt");
//				}
//			catch(Exception e)
//				{
//					System.out.println(e);
//					System.out.println("you must create this file");
//				}



//	3)		try {
//				   int a=100,b=0,c;
//				   c=a/b;
//				   System.out.println(c);
//			}
//			catch(Exception e)
//			{
//				System.out.println(e);
//				System.out.println("you cannot divide by zero");
//			}

	
		
		
		
 		try {
			
				String name=null;
			    System.out.println(name.length());	
			  }
			catch(Throwable e)
			{
//				e.printStackTrace();
//				System.out.println(e);
//				System.out.println(e.getMessage());

				System.out.println("fill the name variable because it is set null ");
			}
		
		

		


	}

}





/*  

  whenever there is exception, the method in which an exception occurs will create an object and that object will store three things .
  1) exception name      2) description    3) stack trace
 
*/
 

//  we can handle the exception using 5 keywords:
//  1) try      2) catch   3) finally   4) throw   5) throws


/*
 SYNTAX:- try-catch block 
  
	  try{
	  		// risky code.....
	  }
	  catch(ExceptionClassName ref.var.name)
	  {
	  		// handling code...
	  }
	  
 */
 


/* Methods to print Exception information in java

 1) e.printStackTrace();
 
 	exception_name        description       trace(line) 
   
   
 2) S.O.P (e);  
   
    exception_name	   description
   
   
 3) S.O.P (e.getMessage()); 
 
 	description
   
 */
