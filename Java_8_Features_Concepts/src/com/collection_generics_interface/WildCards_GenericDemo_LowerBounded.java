package com.collection_generics_interface;

import java.util.ArrayList;
import java.util.List;


// this is example of Lower Bounded Wildcard in Generics
public class WildCards_GenericDemo_LowerBounded {

	public static void main(String[] args) {

	List<Integer>  intA=new ArrayList<>();
	intA.add(100);
	intA.add(200);

	
	List<Object>  objA=new ArrayList<>();
	
	WildCards_GenericDemo_LowerBounded.printElement(intA);
	 
	WildCards_GenericDemo_LowerBounded.printElement(objA);

	 
	}
	
	// Method with LowerBounded wildcard
	public static void printElement(List<? super Integer> list)						// ? super Integer thats mean  wildcard(?) super keyword with their super class 
	{
		for(int i=0;i<10;i++)
		{
			list.add(i);
		}
		
		System.out.println(list);
	}
	
	

}



/*
 2. Lower Bounded Wildcards: 

lower bounded wildcard restricts the unknown type to be a specific type or a super type of that type.  

It is expressed using the wildcard character (‘?’), followed by the super keyword, followed by its lower bound: <? super A>. 

 SYNTAX:-  Collectiontype <? super A>

 
 */