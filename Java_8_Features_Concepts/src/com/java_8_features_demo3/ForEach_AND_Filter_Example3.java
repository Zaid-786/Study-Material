package com.java_8_features_demo3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach_AND_Filter_Example3 {

	public static void main(String[] args) {

		System.out.println("----------ArrayList Example---------");
		List<String> nameList=new ArrayList<>();	
		nameList.add("ansari");
		nameList.add("khan");
		nameList.add("shaikh");
		nameList.add("sayyed");

		nameList.stream().forEach(i-> System.out.println(i));
		System.out.println("");
		nameList.stream().filter(t-> t.startsWith("s")).forEach(t-> System.out.println(t));;
		
		
		
		System.out.println();
		System.out.println("----------Map Example------------");
		Map<Integer,String> store=new HashMap<>();
		store.put(10,"Apple");
		store.put(20,"Samsung");
		store.put(30,"OnePlus");
		store.put(40,"nokia");
		store.put(50,"Blackberry");
		
		//first way to iteration by using lambda expression
		store.forEach((key,value)-> System.out.println(key+" "+value));
		//second way to iteration by using lambda expression
		store.entrySet().stream().forEach(x -> System.out.println(x));
		
		// filter() applied on Map
		System.out.println();
		store.entrySet().stream().filter(k-> k.getKey()%2!=0).forEach(t-> System.out.println(t));
		
		
		
		
	}

}
