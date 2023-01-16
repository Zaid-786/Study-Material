package com.collection_framework_demo;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_demo2 {

	public static void main(String[] args) {

		Queue q1=new LinkedList();			// Queue interface's LinkedList class is allowed hetrogeneous data 
		
		q1.offer(100);
		q1.offer("hello");
		q1.offer(15.23);
		q1.offer(true);
		q1.offer('a');

		System.out.println(q1);		// [100, hello, 15.23, true, a]

	
//* peek() and element()    both methods are used for get head element from collection 		
		
		System.out.println("by peek method to get head element : "+q1.peek());			// by peek method to get head element : 100
		System.out.println("by element method to get head element : "+q1.element());	// by element method to get head element : 100


//* poll() and remove()   both methods are used for remove element from collection 		
		
		System.out.println("by poll method to remove head element : "+q1.poll());	// by poll method to remove head element : 100
		System.out.println(q1); 	//[hello, 15.23, true, a]

		
		System.out.println("by remove method to remove head element : "+q1.remove());		// by remove method to remove head element : hello
		System.out.println(q1);																// [15.23, true, a]

		
	}
}
