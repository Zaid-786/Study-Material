package com.collection_generics_concept_demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//generics  example 2

public class GenericsBenefitsTest2 {

	public static void main(String[] args) {

		
		List list1= new ArrayList<>();
		
		list1.add("x");
		list1.add("y");
		list1.add(new Integer(1000));
		
		
// read element from the list by using Itrator interface loop 	

		Iterator<String> i=list1.iterator();
		
		while(i.hasNext())
		{
			Object s=i.next();
			
			if(s instanceof String)						//The instanceof operator in Java is used to check whether an object is an instance of a particular class or not. then returns true or false.
			{
				String data=(String) s;
				System.out.println(data);	
			}
			else if(s instanceof Integer)
			{
				Integer data=(Integer)s;
				System.out.println(data);
			}
			else
			{
				System.out.println(s);
			}
			
			
		}
		
		
		
		
		
	}
}
