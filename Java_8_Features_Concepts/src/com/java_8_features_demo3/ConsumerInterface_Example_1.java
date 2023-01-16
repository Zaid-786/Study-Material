package com.java_8_features_demo3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// this is example of Consumer Interface which is the feature of Java 8 
//it is a functional Interface contains only one method   void accept(T t) method 

// Consumer Interface is same example of forEach() method




public class ConsumerInterface_Example_1{

	public static void main(String[] args)
	{

		Consumer<Integer> con= (x)->{
			        System.out.println("consumer interface example :"+x);
		};
		con.accept(10);
		
		
// Consumer interfcae like same to forEach() method
		List<Integer> list= Arrays.asList(3,5,2,1,7);
		
		list.stream().forEach(i-> System.out.println(i));
		
		
		
		
	}

	

}
