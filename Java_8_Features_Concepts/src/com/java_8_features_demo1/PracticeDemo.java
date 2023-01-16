package com.java_8_features_demo1;

import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PracticeDemo {

	public static void main(String[] args) {

		
		List<Student_1> stud=new ArrayList<>();
		
		stud.add(new Student_1(80,"ansari","bhiwandi"));
		stud.add(new Student_1(100,"khan","madhyaperdesh"));
		stud.add(new Student_1(30,"shaikh","maharastra"));
		stud.add(new Student_1(10,"sayyed","uterperdesh"));

//		without sorting stud list
		System.out.println("-------------before sorting -------------");
stud.forEach(i-> System.out.println(i));
		
		
//sorting by using Comparable
		System.out.println("---------------Sorting by using Comparable through id ----------");
		Collections.sort(stud);
		stud.forEach(i-> System.out.println(i));
	
		
		
//		sorting by using Comparator
//		System.out.println("---------------Sorting by using Comparator through id ----------");
//		Collections.sort(stud,new ComparatorId());
//		stud.forEach(i-> System.out.println(i));
//		
//		System.out.println();
//		System.out.println("---------------Sorting by using Comparator through name ----------");
//		Collections.sort(stud,new ComparatorName());
//		stud.forEach(i-> System.out.println(i));
//		
//		
//		System.out.println();
//		System.out.println("---------------Sorting by using Comparator through address ----------");
//		Collections.sort(stud,new ComparatorAdd());
//		stud.forEach(i-> System.out.println(i));
//
//		
		
		
	}

}
