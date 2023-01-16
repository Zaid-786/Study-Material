package com.collection_generics_interface;

import java.util.Arrays;
import java.util.List;

//this is example of Upper Bounded Wildcard in Generics
public class WildCards_GenericDemo_UpperBounded {
	
	public static void main(String[] args) {
		
		List<Integer>  IntArr= Arrays.asList(10,20,30,40,50);
		
		List<Double>  doubleArr=Arrays.asList(12.2,13.3,14.4,15.5);
		
		System.out.println("sum = "+WildCards_GenericDemo_UpperBounded.sumNumber(IntArr));
		System.out.println("sum = "+WildCards_GenericDemo_UpperBounded.sumNumber(doubleArr));

	}
	
	// method with Upper Bounded WildCard
	public static double sumNumber(List<? extends Number> arr)
	{
		double sum=0.0;
		
		for(Number i:arr)
		{
			sum=sum+i.doubleValue();
		}
		
//		double average=sum/arr.size();
		
		return sum;
	}
	

}



/*
-> wildCard in java generics ?
  In generic code, the question mark (?), called the wildcard, represents an unknown type. 
  The wildcard can be used in a variety of situations: as the type of a parameter, field, or local variable; sometimes as a return type (though it is better programming practice to be more specific). 
  The wildcard is never used as a type argument for a generic method invocation, a generic class instance creation, or a supertype.

->  wildsCard in generics can be classified into three types ? 
  	1. upper bounded wildcards
  	2. lower bounded wildcards
  	3. unbounded wildcards
  	
 
1. upper bounded wildcards

These wildcards can be used when you want to relax the restrictions on a variable.
	For example, say you want to write a method that works on List < Integer >, List < Double >, and List < Number >, you can do this using an upper bounded wildcard. 
	
general form of upper bounded wildcards
	to declare an upper bounded wildcard, use the wildcard character(?) , followed by extends keyword, followed by its upper bound.
	SYNTAX:-  <? extends UpperBoundType>
  

 */