package com.collection_framework_demo;

import java.util.HashSet;

public class Set_HashSetDemo2 {

	public static void main(String[] args) {

// collection 1		
		HashSet<Integer> evenNumber= new HashSet<>();
		 
		evenNumber.add(2);
		evenNumber.add(6);
		evenNumber.add(8);
		evenNumber.add(10);
		System.out.println(evenNumber);   // [2, 6, 8, 10]

		
// collection 2		
		HashSet<Integer>  number=new HashSet<>();
		
		// addAll( collection c)
		number.addAll(evenNumber);
		number.add(12);
		System.out.println(number);		// [2, 6, 8, 10, 12]

		
// removeAll(collection c)	
		number.removeAll(evenNumber);
		System.out.println("after the removing : " + number);  // after the removing : [12]

		
		
		
		
		
		
		
	}
}
