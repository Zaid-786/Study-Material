package com.class_object;

public class UserDefinedMethod {
	
	
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
		
		UserDefinedMethod.findEvenOdd(7);
		
		

	}

}
