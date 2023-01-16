package com.class_object;

import java.util.Scanner;

public class Use_ScannerClass {
	
	public static void findEvenOdd(int n)
	{
		if(n%2==0)
		{
			System.out.println("number is even="+n);
		}
		else
		{
			System.out.println("number is odd="+n);
			
		}
	}


	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a number=");
		int num=scan.nextInt();
		
		findEvenOdd(num);
	}

}
