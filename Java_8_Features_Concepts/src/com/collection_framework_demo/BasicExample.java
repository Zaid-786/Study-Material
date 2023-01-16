package com.collection_framework_demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicExample {

	public static void main(String[] args) 
	{
			List<Object> arr= new ArrayList<>();
			
			arr.add(100);
			arr.add("JAVA");
			arr.add('z');
			arr.add(10.20);
			arr.add(true);
			
			
	        System.out.println(arr);

	        
	        
/*	DIFFERENT WAYS TO READ DATA FROM COLLECTION :-
 	        
we can read data from collection by many ways but we will focus on three ways:-
1) for loop      
2) for each loop      
3) iterator       (it is a interface which is child interface of collection interface and purpose  of iterator interfcae to read data from collection )

 */
	        
//	1) for loop ......
	        System.out.println("reading elements from arraylist by using for loop ");
	        
	        for(int i=0;i<arr.size();i++)
	        {
	        	System.out.println(arr.get(i));
	        }
	
	        
//  2) for each loop ......    
	        System.out.println("reading elements from arraylist by using for each loop ");

	        for(Object i:arr)
	        {
	        	System.out.println(i);
	        }
	        
	        
//  3) iterator (child interface of collection and purpose read the data from collection ) ........
	        
/*
 The Iterator interface provides 4 methods that can be used to perform various operations on elements of collections.
  
* hasNext() - returns true if there exists an element in the collection
* next() - returns the next element of the collection
* remove() - removes the last element returned by the next()
* forEachRemaining() - performs the specified action for each remaining element of the collection

*/	        
	        
	
	        
	        System.out.println("reading elements from arraylist by using iterator method loop ");
       
	        Iterator<Object> it=arr.iterator();
	        while(it.hasNext())
	        {
	        	System.out.println(it.next());
	        }
			
	}
}
