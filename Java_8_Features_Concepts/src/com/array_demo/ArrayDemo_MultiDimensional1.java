package com.array_demo;

import java.util.Scanner;

// write a multidimensional array (declaration , initialization and traversing ).

//lets create 3*3 matrix




public class ArrayDemo_MultiDimensional1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of row for array matrix=");
		int row=sc.nextInt();
		
		System.out.println("enter the size of column for array matrix=");
		int column=sc.nextInt();
		
		
		int[][] a=new int[row][column];
		
		System.out.println("insert the element array matrix ");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("traversing of array matrix ");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			
			System.out.println();
		}
		
		
		
	}
}
