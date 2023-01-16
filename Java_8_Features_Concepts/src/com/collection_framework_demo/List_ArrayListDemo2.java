package com.collection_framework_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_ArrayListDemo2 {

	
	public static void main(String[] args) {
	
		
		List <String> al=new ArrayList<>();
		
		al.add("x");
		al.add("z");
		al.add("y");
		al.add("a");
		al.add("c");
		al.add("b");

//		System.out.println(al);
		

		
		List<String> al_dupli=new ArrayList<>();
// addAll()  method to add another collection into existig collectio
		al_dupli.addAll(al);	
		System.out.println(al_dupli);    //OUTPUT:-[x, z, y, a, c, b]
		
		
// removeAll()  method to remove another collection from existig collectio	
		al_dupli.removeAll(al);
		System.out.println("after removing collection : "+al_dupli);		//OUTPUT:- []
		
		
//      sorting.......
		
		System.out.println("elements of arraylist : "+al);                   //OUTPUT:- [x, z, y, a, c, b]

		
		Collections.sort(al);
		System.out.println("after sorting elements of arraylist : "+al);	//OUTPUT:- after sorting elements of arraylist : [a, b, c, x, y, z]


		Collections.shuffle(al);   //shuffle means random order
		System.out.println("after shuffling elements of arraylist : "+al);	//OUTPUT:- after shuffling elements of arraylist : [c, x, b, a, z, y]


		Collections.sort(al,Collections.reverseOrder());
		System.out.println("after reversing elements of arraylist : "+al);	//OUTPUT:- after reversing elements of arraylist : [z, y, x, c, b, a]


		
		
		
		
		
		
	}
}
