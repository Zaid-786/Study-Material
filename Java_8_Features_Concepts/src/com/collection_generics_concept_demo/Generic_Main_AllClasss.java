package com.collection_generics_concept_demo;

import java.util.ArrayList;
import java.util.List;

public class Generic_Main_AllClasss {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);

		Generic_Class_Example1<Integer> g1 = new Generic_Class_Example1<>();
		g1.setList(list);

//		List<Integer> data=g1.getList();
//		System.out.println(data);				// OUTPUT:- [100, 200, 300, 400]

//		for(int i:g1.getList())
//		{
//			System.out.println(i);
//		}
//		
		
		g1.getList().forEach(System.out::println);

		System.out.println("--------------------------------------");
		
		Generic_Class_Example2<Integer,String> gce1=new Generic_Class_Example2<>(111,"ansari");	
		System.out.println(gce1.getKey()+"\t"+gce1.getValue());

		Generic_Class_Example2<Integer,String> gce2=new Generic_Class_Example2<>(222,"khan");	
		System.out.println(gce2.getKey()+"\t"+gce2.getValue());

		Generic_Class_Example2<Integer,String> gce3=new Generic_Class_Example2<>(333,"momin");	
		System.out.println(gce3.getKey()+"\t"+gce3.getValue());
		
		System.out.println("---------------------------------------------------------");		
	}
}
