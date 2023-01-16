package com.class_objects_Concept;


//this is static method example
// static method means that it is belong to a class rather than an instance (Object).

/*       .....Rules for "static" methods........
 * 
 * 1) static methods belongs to the class, not to the object.
 * 2) A static method can be accessed directly by class name and does'nt need any object.
 * 3) A static method can access only static data.it cannot access non-static data (instance data)
 * 4) A static method can call only other static methods and cannot call a non-static method.
 * 5) A static method cannot refer to "this" or "super" keyword in anyway. 
 * 
 * */


public class Method_StaticMethod_11 
{
	
	public static void show()
	{
		System.out.println("this is example of static method...");
	}
	

	
	public static void main(String[] args)
	{
			show();
	}
	
}







/* Abstract method :- 
 * the method that does not has method body is known as abstract method.
 * it always declares in the abstract class . it means the class itself must be abstract if it has abstract method.
 * */


/* Factory method:-
 * factory method is a method that returns an object to the class to which it belongs.
 * all static methods are factory methods
 * */

