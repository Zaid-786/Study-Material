package com.collection_framework_demo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;



public class List_LinkedListDemo2 {

	public static void main(String[] args) {

		List<String> l=new LinkedList<>();
	
		l.add("x");
		l.add("a");
		l.add("z");
		l.add("c");
		l.add("y");
		l.add("b");

		
		
		List<String> ll=new LinkedList<>();

		ll.addAll(l);
		System.out.println(ll);    		//OUTPUT:- [x, a, z, c, y, b]

		ll.removeAll(l);
		System.out.println(ll);			//OUTPUT:- []
		
//		sorting....   Collections.sort(Collection c)
		
		System.out.println("before sorting linkedlist l : "+l);
		
		Collections.sort(l);
		System.out.println("after sorting linkedlist l : "+l);

		// reverse order
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("reverse sorting linkedlist l : "+l);

		//shuffle   (random order)
		
		Collections.shuffle(l);
		System.out.println("shuffle sorting linkedlist l : "+l);

		
		
	}
}
