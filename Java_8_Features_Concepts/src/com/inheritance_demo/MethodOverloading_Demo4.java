package com.inheritance_demo;



/*	Can we Overload Main() Method ? */

/* YES, in Java we can Overload main() method by using Method Overloading.
   But JVM calls main() method which receives String array as arguments Only.
*/


//lets see the simple Example

public class MethodOverloading_Demo4 
{

	// 1. main() method with string array arguments 
	public static void main(String[] args)
	{
		System.out.println("main() method with string array arguments");
	}
	
	
	// 2. main() method with string  arguments
	public static void main(String args)
	{
		System.out.println("main() method with string  arguments");
	}

	
	// 3. main() method without  arguments
	public static void main() 
	{	
		System.out.println("main() method without  arguments");
	}

}
