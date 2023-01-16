package com.collection_framework_demo;

import java.util.ArrayList;

public class List_ArrayListDemo1 {

	public static void main(String[] args) {

//  Different ways to Declare ArrayList...........

//		List arr=new ArrayList();
//		List<Object> arr1=new ArrayList<>();   // we can add heterogeneous data  
//		List<String> arr1=new ArrayList<>();   // we can add only String data  

		ArrayList<Object> al = new ArrayList<>();

//		add new elements to the arraylist
		al.add(100);
		al.add("Welcome");
		al.add(15.20);
		al.add('a');
		al.add(true);

		System.out.println(al); //OUTPUT:- [100, Welcome, 15.2, a, true]

//*		size()  method to know that how many number of elements in the collection
		System.out.println("number of elements in the arraylist : " + al.size());   //OUTPUT:- number of elements in the arraylist: 5

		
//*		remove()  method to remove element from collection and you can pass index or element(object) into remove() for delete element from collection 
		al.remove(1); // here 1 is index
//		al.remove("Welcome");    // here Welcome is element
		System.out.println("after removing element from arraylist: " + al); //OUTPUT:- after removing element from arraylist: [100, 15.2, a, true]

		
//*		insert a new element at particular position
//		add(index,element);
		al.add(1, "JavaScript");
		System.out.println("after adding new element at particular position at arraylist: " + al);																									// arraylist: [100,
		//OUTPUT:- after adding new element at particular position at arraylist: [100, JavaScript, 15.2, a, true]

		
//*		retrieve specific element from collection
//		get(index);     pass only index(position) and get value   		
		System.out.println("retrieve specific element from arraylist by using get() method :"+al.get(0));
		//OUTPUT:- retrieve specific element from arraylist by using get() method :100

		
//*     change the element/ replace element
//		set(index,newelement);
		al.set(4, false);
		System.out.println("after replaced true to false element : "+al);
		
		
//*     search - contains()    
//        contains(element)    check element is present and Not	(if element present then contains returns true and not present then contains returns false)	
		System.out.println(al.contains(100));			//OUTPUT:- true
		System.out.println(al.contains("world"));		//OUTPUT:- false

		
//*     isEmpty()  method to check collection is empty or not(if empty returns true otherwise false)		
		System.out.println(al.isEmpty());		//OUTPUT:- false

		
		
		
		
	}
}
