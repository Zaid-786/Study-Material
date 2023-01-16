package com.collection_generics_concept_demo;



//generics  example 4

public class GenericsBenefitsTest4 {

	public static void main(String[] args) {

// created object 1 with integer generic		
		MyGenericsClass<Integer>  g1=new MyGenericsClass<Integer>();
		g1.setObject(1000);
		int i=g1.getObject();
		System.out.println(i);
		
// created object 2 with String generic				
		MyGenericsClass<String>  g2=new MyGenericsClass<String>();
		g2.setObject("ansari");
		String j=g2.getObject();
		System.out.println(j);
		
// created object 3 with Float generic		
		MyGenericsClass<Float>  g3=new MyGenericsClass<Float>();
		g3.setObject(12.3f);
		Float k=g3.getObject();
		System.out.println(k);
		
		
	}

}
