package com.collection_generics_interface;

// this is example of bounded type parameter with numeric super class

public class BoundedTypeParameter_Example1<T extends Number> {

// declared a array with type parameter(Unknown type)
	private T[] arr;

// parameterized constructor
	public BoundedTypeParameter_Example1(T[] arr) {
		this.arr = arr;
	}

	
// thi is our averageNumber method which returne average of some number
	public double averageNumber() {
		double sum = 0.0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i].doubleValue();						// doubleValue() method is a inbuilt method of Number class and purpose of doubleValue() is converted integer value to double .

		}

		double average = sum / arr.length;

		return average;

	}
}

/*
 * BOUNDED TYPE PARAMETER IN JAVA GENERICS:-
  
  when you want to restrict the types that can be used as type arguments in a parameterized type.
  that can be done using bounded type parameter in java generics.
 
 * FOR EXAMPLE: if you have a generics class with a method that operates on
  number, you would want to restrict it to accept instances of Number and its
  subclasses only.
  
  
 * How to Declare a Bounded Type Parameter in Java?
  
  List the type parameter’s name, Along with the extends keyword And by its
  upper bound. (which in the below example c is A.) Syntax
  
  <T extends superClassName>      OR <T extends Number>
  
  
 */
