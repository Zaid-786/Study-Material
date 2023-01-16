package com.collection_framework_demo;

import java.util.HashSet;

public class Set_HashSetDemo3 {

	public static void main(String[] args) {

		// Union (unique elements from two collection) , intersection (common elements within two collection , difference (different within two collection), subset(check the collection is subset or not)
		
		
		HashSet<Integer> set1=new HashSet<>();		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);

		System.out.println("set1 elements : "+set1);	// set1 elements : [1, 2, 3, 4, 5]
		
		
		HashSet<Integer> set2=new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);

		System.out.println("set2 elements : "+set2);	// set2 elements : [3, 4, 5]


		
		
////*   Union (Unique elements from two set)		
//		
//		set1.addAll(set2);
//		System.out.println("UNION elements from set1 and set2 : "+set1);	//	Union elements from set1 and set2 : [1, 2, 3, 4, 5]
//		
//		
//		
////*   Intersection (common elements between set1 and set2)		
//		
//		set1.retainAll(set2);
//		System.out.println("INTERSECTION elements between set1 and set2 : "+set1);	// intersection elements between set1 and set2 : [3, 4, 5]
//
//		
		
		
////*  Difference (only we want to get different elements from set1 and set2) 
//		
//		set1.removeAll(set2);
//		System.out.println("DIFFERENCE:- get different elements from set1 and set2 : "+set1);	//DIFFERENCE:- get different elements from set1 and set2 : [1, 2]

		
		
//* Subset (check the collection is subset or not)		
		
		set1.containsAll(set2);			// true or false
		System.out.println("SUBSET : "+set1);	// SUBSET : [1, 2, 3, 4, 5]
		
	}
}
