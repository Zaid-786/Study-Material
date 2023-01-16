package com.collection_framework_demo;

import java.util.LinkedHashSet;

public class Set_LinkedHashSet {

	public static void main(String[] args) {

		
//*		 declaration of LinkedHashSet	
//		Set ls=new LinkedHashSet();
		LinkedHashSet<Integer> ls=new LinkedHashSet<>();
		
		ls.add(100);
		ls.add(200);
		ls.add(300);
		ls.add(400);
		ls.add(500);

		System.out.println("linkedHashset has insertion orderlist : "+ ls);
//		 linkedHashset has insertion orderlist : [100, 200, 300, 400, 500]
//       we can apply all methods of linkedlist collection on the LinkedHashSet collection
		
		
		
		
//// 	in HashSet collection has not preserved insertion order (order list) 
//		
//		HashSet<Integer> ls =new HashSet<>();
//		ls.add(100);
//		ls.add(200);
//		ls.add(300);
//		ls.add(400);
//		ls.add(500);
//
//		System.out.println("Hashset has not  insertion orderlist : "+ ls);			// printed the elemnet randomly
//		// Hashset has not  insertion orderlist : [400, 100, 500, 200, 300]

		
		
		
	}
}
