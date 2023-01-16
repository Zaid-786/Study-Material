package com.java_8_features_demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// this is example of forEach() method for iteration  java 8 feature
// whenever you are printing user-defined class object through forEach() method loop you should remember toString() method must defined in the user-class.

public class forEach_Method_Loop {

	public static void main(String[] args) {

		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("Sean", 45));
		stuList.add(new Student("Andrew", 40));
		stuList.add(new Student("Martin", 42));

		System.out.println("------------Iterating by passing lambda expression--------------");

		stuList.forEach(i -> System.out.println(i)); 		// first way iterating
//		stuList.forEach(System.out::println);				// second way iterating

		System.out.println("-----------read element by for each loop ----------------");
		for (Student i : stuList) {
			System.out.println(i);
		}

		
		
		
		
		
//.........................................................................		

		System.out.println("------------------------------------------------------");
		List<Integer> list1 = new ArrayList<>();

		list1.add(10);
		list1.add(30);
		list1.add(50);
		list1.add(20);
		list1.add(100);

		// without sorting
		list1.forEach(i -> System.out.println(i));

		// with sorting but sort() method only will be working single object which
		// contains only same type one attribute
		Collections.sort(list1);
		System.out.println(list1);

	}

}
