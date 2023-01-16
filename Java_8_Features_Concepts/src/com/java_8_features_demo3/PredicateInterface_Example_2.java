package com.java_8_features_demo3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//this is example of Predicate Interface which is the feature of Java 8 
//it is a functional Interface contains only one method   void test(T t) method 

//Consumer Interface is same example of filter()  method  purpose these return true and false


public class PredicateInterface_Example_2 {

	public static void main(String[] args) {

		
		Predicate<Integer> pred= (x)-> {
			
			if(x%2==0)
			{
				return true;
			}
			else
			{
			     return false;	
			}
		};
		
		System.out.println(pred.test(10));
	
		
// Consumer interfcae like same to filter() method
				List<Integer> list= Arrays.asList(3,5,2,1,7,8,10);
				
//				list.stream().filter(x-> x%2==0).forEach(i-> System.out.println("print even number :"+i));
	

// this is example of Supplier Interface of get() which returns somthing according you if your lsit empty you can pass message 
//				List<String> list1 = Arrays.asList();
//
//				System.out.println(list1.stream().findAny().orElseGet(() -> "list is empty"));
	
	}

}
