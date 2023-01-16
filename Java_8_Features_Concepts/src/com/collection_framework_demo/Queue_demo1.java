package com.collection_framework_demo;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_demo1 {

	public static void main(String[] args) {

//*   declaration of Queue in several ways
		
		// Priority Queue implementation of Queue
		Queue<Integer> q1=new PriorityQueue<>();
		
//		// LinkedList implementation of Queue
//		Queue<String> q2=new LinkedList<>();
//		
//		// Array implementation of Queue
//		Queue<String> q3=new ArrayDeque<>();

		
//* add element into priorityQueue q1 by using offer() method 		
		q1.offer(100);
		q1.offer(200);
		q1.offer(300);
		q1.offer(400);
		q1.offer(500);			//  heterogeneous data is not allowed in PriorityQueue

		System.out.println("q1 elements : "+q1);	// q1 elements : [100, 200, 300, 400, 500]

//* peek() method to get head element of q1
		
		System.out.println("head element of q1 : "+ q1.peek()); // head element of q1 : 100

//* poll() method to remove head element of q1		
		
		System.out.println("remove head element from q1 : "+q1.poll());  // remove head element from q1 : 100

		
//*   read the element from collection by using (for each loop & iterator)		
		
//		System.out.println("read elements by for each loop... ");
//		for(int i:q1)
//		{
//			System.out.println(i);
//		}		
		
		
		System.out.println("read elements by using iterator ....");
		Iterator<Integer> it=q1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}
}


/* Java Queue Interface:-
   The Queue interface of the Java collections framework provides the functionality of the queue data structure.
   It extends the Collection interface.

* Classes that Implement Queue:- ( PriorityQueue, LinkedList, ArrayDeque )

* Queue's child interfaces :-   ( Deque, BlockingQueue, BlockingDeque ) 

 
* Working of Queue Data Structure:-
  In queues, elements are stored and accessed in First In, First Out manner. That is, elements are added from the tail and removed from the head.


* Methods of Queue:-
  Some of the commonly used methods of the Queue interface are:
	{ add(), offer() , element() , peek() , remove() , poll() }
	
offer() - Inserts the specified element into the queue. If the task is successful, 
          offer() returns true, if not it returns false.

peek() - Returns the head of the queue. Returns null if the queue is empty.

poll() - Returns and removes the head of the queue. Returns null if the queue is empty.
 
 
  */
 