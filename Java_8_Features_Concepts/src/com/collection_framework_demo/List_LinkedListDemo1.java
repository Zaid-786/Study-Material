package com.collection_framework_demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List_LinkedListDemo1 {

	public static void main(String[] args) {

		
//*	declaration LinkedList 
		
//		LinkedList<Object> ll=new LinkedList();          // for heterogeneous data (different type)
//		List  ll2=new LinkedList();
//		List<String> ll=new LinkedList<>();					// for homogeneous data (similar type)
		List<Object> ll=new LinkedList<>();
		
		ll.add(100);
		ll.add("Welcome");
		ll.add(20.45);
		ll.add('a');
		ll.add(true);
		ll.add(null);

		System.out.println(ll);  //	[100, Welcome, 20.45, a, true, null]

		
//*    size()
		System.out.println("how many elements there are presented in linkedlist : "+ll.size());     //how many elements there are presented in linkedlist : 6

//*    remove(index)      in linkedlist , remove() method only accept index 		
		ll.remove(5);
		System.out.println("after removing element from linkedlist : "+ll); 	// after removing element from linkedlist : [100, Welcome, 20.45, a, true]

		
//*   insert or add new element specific place into linkedlist		
//		add(index,element);	
		ll.add(5,"java programming");
		System.out.println("after adding new element into linkedlist : "+ll);		//after adding new element into linkedlist : [100, Welcome, 20.45, a, true, java programming]

//*   retrieving value /object	
//		get(index);
		System.out.println(ll.get(5)); //java programming

		
//*  change the value
//		set(index,element)
		ll.set(5,null);
		System.out.println("after the replying the value by index : "+ll);
		
//*  search the element by contains() method and returns true and false		
		
		System.out.println(ll.contains("Welcome"));			// true
		System.out.println(ll.contains("java programming")); 	//false

//*   isEmpty()   check the linkedlist is empty or Not		
		
		System.out.println(ll.isEmpty());	//false
		
		
		
/*	DIFFERENT WAYS TO READ DATA FROM COLLECTION :-
	        
		we can read data from collection by many ways but we will focus on three ways:-
		1) for loop      
		2) for each loop      
		3) iterator       (it is a interface which is child interface of collection interface and purpose  of iterator interfcae to read data from collection )

		 */
		
		
		
// 1)  read elements from ll by using for loop		
		
		System.out.println(" 1) read elements from ll by using for loop	");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		

// 2)  read elements from ll by using for each loop		
		
		System.out.println(" 2) read elements from ll by using for each loop	");		
		for(Object i:ll)
		{
			System.out.println(i);
		}
		
		
// 2)  read elements from ll by using iterator interface loop		
		
		System.out.println(" 3) read elements from ll by using Iterator interface loop	");
		
		Iterator<Object> it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
}
