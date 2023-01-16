package com.class_objects_Concept;


//program of the counter with static variable.



class Counter2{
	
	static int count=0;
	
	public Counter2()
	{
		count++;
		System.out.println(count);
	}
	
}


public class Keywords_StaticKeyWord_19_3 {

	public static void main(String[] args)
	{
		Counter2 c1=new Counter2();
		Counter2 c2=new Counter2();
		Counter2 c3=new Counter2();
	}

}


//output:-
//			1
//			2
//			3

// because of count variable is static variable which means that count variable gets memory only once in the class area at the time of class loading.



