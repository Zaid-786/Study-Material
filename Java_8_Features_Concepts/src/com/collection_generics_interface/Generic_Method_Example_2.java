package com.collection_generics_interface;


// this is example of type parameter method we can use in the no generic class.

public class Generic_Method_Example_2 {

	
	public<E> void printElement(E[] e)
	{
		for(E i:e)
		{
			System.out.println(i);
		}
	}
	

	
}
