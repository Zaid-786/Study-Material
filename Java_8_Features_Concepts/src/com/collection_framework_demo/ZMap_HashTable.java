package com.collection_framework_demo;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class ZMap_HashTable {

	public static void main(String[] args) {

//*  declaration of HashTable 

//		Hashtable  ht=new Hashtable();   // capacity is 11 and loadFactor is 0.75
//		Hashtable  ht=new Hashtable(initial capacity);
//		Hashtable  ht=new Hashtable(initial capacity, loadfactor);

		Hashtable<Integer, String> ht = new Hashtable<>();

		ht.put(101, "jhon");
		ht.put(102, "david");
		ht.put(103, "scott");
		ht.put(104, "erick");
		ht.put(105, "charls");

		// ht.put(null,"charls"); // nullpointer exception provided
		// ht.put(106,null); // nullpointer exception provided

		System.out.println(ht); // {105=charls, 104=erick, 103=scott, 102=david, 101=jhon}

		
//* get(key) returns value and passed key into get() method.
		System.out.println("get the value on the basis key : " + ht.get(101));   // get the value on the basis key : jhon

		
//* remove(key) returns pair of element from Hashtap on the basis key.
		ht.remove(101);
		System.out.println("after removing pair from hashtap : " + ht);			// after removing pair from hashtap : {105=charls, 104=erick, 103=scott, 102=david}

		
//* containsKey(key) and containsValue(value) // check the key and value are
		// presented then these method returns true and otherwise false

		System.out.println("containsKey method : " + ht.containsKey(101)); 				// containsKey method : false

		System.out.println("containsValue method : " + ht.containsValue("neslon"));		// containsValue method : false

		
//* isEmpty() check the collection is empty(true) or not(false).

		System.out.println("check collection is empty or not : " + ht.isEmpty());		// check collection is empty or not : false
																					
//* keySet() 	returns all the keys as set
		System.out.println("keySet method returns all key : "+ht.keySet());				// keySet method returns all key : [105, 104, 103, 102]
		
//* values()    returns all the values as collection
		System.out.println("values method returns all values : "+ht.values()); 			// values method returns all values : [charls, erick, scott, david]


		
//		read keys and values one by one......
		System.out.println("read pair by using for each loop.........................");
		for(Object i:ht.keySet())
		{
			System.out.println(i+"  "+ht.get(i));
		}
		
		
//		read keys and values one by one by using entry interface......
		System.out.println(".......................................................");
		for(Map.Entry entry:ht.entrySet())
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		
		
		
		
	}
}
