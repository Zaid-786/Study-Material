package com.collection_framework_demo;

import java.util.HashMap;
import java.util.Map;

public class ZMap_HashMap {

	public static void main(String[] args) {

		
//*  declaration of HashMap 
		// Map<Integer,String> hm=new HashMap<>();	
		// HashMap hs=new HashMap();
		
		HashMap<Integer,String> hm=new HashMap<>();
		
		// add the element by using put(key,value) method 
		hm.put(101,"jhon");
		hm.put(102,"david");
		hm.put(103,"mary");
		hm.put(104,"scott");
		hm.put(105,"nelson");

		System.out.println(hm); 	// {101=jhon, 102=david, 103=mary, 104=scott, 105=nelson}
		
//	duplicate keys are not allowed and but duplicate values are allowed	
		hm.put(106, "nelson");
		System.out.println(hm); 	// {101=jhon, 102=david, 103=mary, 104=scott, 105=nelson, 106=nelson}

		

//* get(key)  returns value and passed key into get() method.	
		
System.out.println("get the value on the basis key : "+hm.get(101)); // get the value on the basis key : jhon

		
//*  remove(key) returns pair of element from HashMap on the basis key.

	hm.remove(106);
	System.out.println("after removing pair from hashmap : "+hm);// after removing pair from hashmap : {101=jhon, 102=david, 103=mary, 104=scott, 105=nelson}

	
//* containsKey(key)  and containsValue(value)	 // check the key and value are presented then these method returns true and otherwise false	
		
	System.out.println("containsKey method : "+hm.containsKey(101));	//containsKey method : true

	System.out.println("containsValue method : "+hm.containsValue("neslon"));

	
//* isEmpty()  check the collection is empty(true) or not(false).	
	
	System.out.println("check collection is empty or not : "+hm.isEmpty());// check collection is empty or not : false

		
//* keySet() 	returns all the keys as set
	System.out.println("keySet method returns all key : "+hm.keySet());	// keySet method returns all key : [101, 102, 103, 104, 105]

//	i want to read keys one by one by using for each loop .........
	System.out.println("i want to read keys one by one by using for each loop .........");
	for(int i:hm.keySet())
	{
		System.out.println(i);
	}
	
	

	
	
//* values()    returns all the values as collection
	System.out.println("values method returns all values : "+hm.values()); // values method returns all values : [jhon, david, mary, scott, nelson]

//	i want to read values one by one by using for each loop .........
	System.out.println("i want to read values one by one by using for each loop .........");
	for(Object i:hm.values() )
	{
		System.out.println(i);
	}
	
	
	
//	get key and value together by using for each loop (first way).
   	System.out.println(".........................");
	for(Object i:hm.keySet())
	{
		System.out.println(i+" 	 "+hm.get(i));
	}
   	System.out.println(".........................");

	
	
//* entrySet()   returns all the entries(pair of key and value) as set	
	System.out.println("entrySet method returns all entries pair : "+hm.entrySet()); 	// entrySet method returns all entries pair : [101=jhon, 102=david, 103=mary, 104=scott, 105=nelson]

//	i want to read entries (pair:- key and value) one by one by using for each loop .........
	
	for(Map.Entry  entry:hm.entrySet())
	{
		System.out.println(entry.getKey()+"   "+entry.getValue());
	}
	
	}
}

/*
 
 some important method are:-(Methods of Map)
 
* put(K, V) - Inserts the association of a key K and a value V into the map. If the key is already present, the new value replaces the old value.

* putAll() - Inserts all the entries from the specified map to this map.

* get(K) - Returns the value associated with the specified key K. If the key is not found, it returns null.

*containsKey(K) - Checks if the specified key K is present in the map or not.

*containsValue(V) - Checks if the specified value V is present in the map or not.

*replace(K, V) - Replace the value of the key K with the new specified value V.

*replace(K, oldValue, newValue) - Replaces the value of the key K with the new value newValue only if the key K is associated with the value oldValue.

*remove(K) - Removes the entry from the map represented by the key K.

*remove(K, V) - Removes the entry from the map that has key K associated with value V.

*keySet() - Returns a set of all the keys present in a map.

*values() - Returns a set of all the values present in a map.

*entrySet() - Returns a set of all the key/value mapping present in a map.

 
 
 */