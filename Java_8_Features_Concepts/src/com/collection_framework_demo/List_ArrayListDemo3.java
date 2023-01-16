package com.collection_framework_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




// write a program to array convert into arraylist
public class List_ArrayListDemo3 {

	public static void main(String[] args) {

		
		String name[]= {"Ansari","khan","sayyed","momin","Shaikh"};
		
		for(String n:name)
		{
			System.out.println(n);
		}
		
	
		List<String> al=new ArrayList<>(Arrays.asList(name));
		
		System.out.println(al);
		
		
		
	}
}
