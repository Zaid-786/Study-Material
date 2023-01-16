package com.collection_generics_concept_demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//generics  example 3


public class GenericsBenefitsTest3 {

	public static void main(String[] args)
	{

		
List<String> list= new ArrayList<>();
		
		list.add("x");
		list.add("y");
//		list.add(new Integer(1000));
		
		
// read element from the list by using foreach loop 	
//		for(Object i:list)
//		{
//			System.out.println(i);
//		}

		
// read element from the list by using Itrator interface loop 	
		Iterator <String> i= list.iterator();							// we cant stored diffent type data into generic type parameter because we specified type parameter 
		while(i.hasNext())
		{
			String data= i.next();
			System.out.println(data);
		}

		
		
// OUTPUT :-
//		x
//		y

		
		
	}

}
