package com.inheritance_demo;




// Method Overloading In Java =>

// if a class has multiple methods having same name but different in parameters its known as Method Overloading.

/* Advantage of Method Overloading:-
  Method Overloading increases the Readibility of the Program.	*/
// Method Overloading increase the readibility of the Program


/* Different ways to Overload Method 
  There are two ways to Overload the Method in java.
 	1. By Changing no. of Arguments 
 	2. By Changing the Data-type
 */





//lets understand by simple Example

//	1. By Changing no. of Arguments 







/*
  in this example, we have created two method, 
  first add() method performs addition of two numbers and 
  second add() method performs addition of three numbers.
*/



class Adder{
									// Method Overloading 
public static int  add(int a,int b)
{
	return a+b;
}

												// add() Method Overloading with different parameters
public static int  add(int a,int b, int c)
{
	return a+b+c;
}

}



public class MethodOverloading_Demo1 {

	public static void main(String[] args) {

		
		System.out.println(Adder.add(11,11));
		System.out.println(Adder.add(11,11,11));

		
	}

}
