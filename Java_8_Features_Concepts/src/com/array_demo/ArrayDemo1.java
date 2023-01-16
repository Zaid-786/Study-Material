package com.array_demo;


// ARRAY:-

/* array in java is a collection of the similar type of elements which have contiguous memory allocation .*/


//Declaration & Initialization of Single dimensional Array

/* Declaration of single Dimensional:-

1* syntax:-     data-type[]  array_name;
 Example:-      int[]  a;

2* syntax:-     data-type  []array_name;
 Example:-      int  []a;

3* syntax:-     data-type  array_name[];
 Example:-      int  a[];

*/




public class ArrayDemo1 {

	public static void main(String[] args)
	{
		int[] a=new int[5];      // declaration of single dimensional with size
		
		a[0]=1;					// initialization of single dimensional
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
		


	}

}
