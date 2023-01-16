package com.collection_generics_interface;

import java.util.Arrays;
import java.util.List;


//this is example of UnBounded Wildcard in Generics
public class WildCards_GenericDemo_UnBounded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> intList=Arrays.asList(10,20,30,40,50);
		
		List<Double> doubleList=Arrays.asList(10.10,20.20,30.30,40.40,50.50);
		
		WildCards_GenericDemo_UnBounded.printElement(intList);
		WildCards_GenericDemo_UnBounded.printElement(doubleList);

	}
	
	//Method with UnBounded generics 
	public static void printElement(List<?> list)
	{
		for(Object i:list)
		
		System.out.println(i);
	}
	

}


/*
 3. Unbounded Wildcard: 
This wildcard type is specified using the wildcard character (?), for example, List. This is called a list of unknown types. These are useful in the following cases –

When writing a method that can be employed using functionality provided in Object class.
When the code is using methods in the generic class that doesn’t depend on the type parameter

 */