package com.array_demo;



/* Single Dimensional Array 

 * Declaration, instantiation and Initialization of Java Array
  
 * we can declare, instantiate and initialize the java array together by:
 
 * int[] a={1,2,3,4,5};

  
*/   



public class ArrayDemo2 {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("array position "+i+" value ="+a[i]);
		}
		
		
	}

}
