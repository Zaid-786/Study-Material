package com.array_demo;

import java.util.Scanner;

//write a program to sum of Array Elements !







public class ArrayElementsSum {

	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the size of array elemnts");				// we will take size of array by users
			int num=sc.nextInt();
			
			int sum=0;
			
			int[] a=new int[num];												// declared the array and passed the size which is took from user
			
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			
			System.out.println("sum of array elements");
			
			for(int i=0;i<a.length;i++)
			{
				sum=sum+a[i];
			}
			
			System.out.println(sum);
			
	}

}
