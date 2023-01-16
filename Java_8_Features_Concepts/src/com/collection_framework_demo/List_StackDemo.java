package com.collection_framework_demo;

import java.util.Collections;
import java.util.Stack;

public class List_StackDemo {

	public static void main(String[] args) {

		
// declaration of stack class 
		Stack<Integer> s1=new Stack<>();
		
		
//*  add elements into stack by push() method
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);

		System.out.println("stack elements are : "+s1);		// [10, 20, 30, 40]
		
//*  add elements from stack by pop() method

		s1.pop();
		System.out.println("after the removing element from stack : "+s1);  // [10, 20, 30]

//*  get head element from stack by peek()		
		
		int head =s1.peek();
		System.out.println("get the head element from stack : "+head);		//get the head element from stack : 30
		
		
//*  get the size of stack element 		
		
		System.out.println("size of element from stack : "+ s1.size());		//size of element from stack : 3

		
		
//*  check the stack is empty or not (if stack is empty then returns true and not the returns false)		
		boolean check=s1.isEmpty();
		System.out.println("check the stack is empty or not : "+check);		//check the stack is empty or not : false
	
		
//*  find the index by search element		
		int indexsearch = s1.search(30);
		System.out.println("find the index by search element : "+indexsearch);
				
		
		
	}
}
