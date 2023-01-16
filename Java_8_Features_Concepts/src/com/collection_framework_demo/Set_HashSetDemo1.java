package com.collection_framework_demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_HashSetDemo1 {

	public static void main(String[] args) {

		
//declaration HashSet
		
//		HashSet  hs=new HashSet();
//		Set  hs=new HashSet();
//		HashSet  hs=new HashSet(100,(float)0.95);
//		HashSet<String> hs=new HashSet<>();
		
	
// add element /object into HashSet	
	HashSet hs=new HashSet();			// default size of HashSet will be 16 and loadFactor is 0.75
	
	hs.add(100);
	hs.add("welcome");
	hs.add(16.4);
	hs.add(true);
	hs.add(null);

	
	System.out.println(hs);			// [null, 100, 16.4, welcome, true]      // insertion order is not preserved

// remove()
	hs.remove(16.4);
	System.out.println("after the removing element from HashSet : "+hs);
	
// contains()
	System.out.println(hs.contains("welcome"));	// true
	System.out.println(hs.contains("xyz"));		// false

//	isEmpty()
	System.out.println("hashset is empty or not : "+hs.isEmpty());	// hashset is empty or not : false

	
//*	reading elements from HashSet by using For each Loop 
	
	System.out.println("read element by using For each loop.....");
	for(Object i:hs)
	{
		System.out.println(i);
	}
	
	
	
//*	reading elements from HashSet by using For iterator 
	
	System.out.println("read element by using Iterator..... ");
	Iterator<Object> it=hs.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
	
	}
}
