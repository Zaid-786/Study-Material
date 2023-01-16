package com.class_objects_Concept;



// program of the counter without static variable.



class Counter1{
	
	int count=0;
	
	public Counter1()
	{
		count++;
		System.out.println(count);
	}
	
}


public class Keywords_StaticKeyWord_19_2 {
	
public static void main(String[] args) 
{
		Counter1 c1=new Counter1();
		Counter1 c2=new Counter1();
		Counter1 c3=new Counter1();

}
}


//output:-
/*			1
 * 			1
 * 			1
 * */

// because of count variable is instance variable which means that count variable gets memory at the time of Object creation.

