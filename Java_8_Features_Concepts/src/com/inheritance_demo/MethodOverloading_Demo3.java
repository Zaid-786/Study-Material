package com.inheritance_demo;


/*why method Overloading is not possible by changing the return-type Method Only ? */

/*
 	in Java, Method Overloading is not possible by Changing the return-type of the method only because of Ambiguity.
 	lets see how Ambiguity may Occur.
  
  */

class Adder2{
	
	static int add(int a,int b)
	{
	return a+b;
	}
	
	static double add1(int a,int b)				// Ambiguity
	{
	return a+b;
	}
}


public class MethodOverloading_Demo3 {

	public static void main(String[] args) {
		
		System.out.println(Adder2.add(11,11));
		System.out.println(Adder2.add(11,14));

	}

}


/*
 NOTE:-
 Compile-time Error is better than Run-time Error.
 so,Java Compiler renders Compiler-time Error if you declare the same  method having  same Parameters
  
  */
