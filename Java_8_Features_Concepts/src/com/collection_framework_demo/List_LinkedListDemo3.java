package com.collection_framework_demo;

import java.util.LinkedList;

public class List_LinkedListDemo3 {

	public static void main(String[] args) {

	
		LinkedList l=new LinkedList();
		
		l.add("dog");
		l.add("dog");
		l.add("cat");
		l.add("fish");
		l.add("monkey");

		System.out.println(l);   // [dog, dog, cat, fish, monkey]

		
//*     addFirst(element)	 and  addLast(element)	
		l.addFirst("tiger");
		l.addLast("elephant");
		
		System.out.println("adding first and last element inside linkedlist l : "+l);	// adding first and last element inside linkedlist l : [tiger, dog, dog, cat, fish, monkey, elephant]

		
//*     getFirst()   and  getL ast()		
		System.out.println("getting first element : "+l.getFirst());   // getting first element : tiger
		System.out.println("getting last element : "+l.getLast());		// getting last element : elephant

		
//*     removeFirst()   and  removeLast()	
		l.removeFirst();
		l.removeLast();
		
		System.out.println("after removing first and last element from l : "+l);
	}
}
