package com.class_object;

public class CounterWithoutStatic
{
	int counter=0;					//instance variable counter
	
	CounterWithoutStatic()				// default constructor
	{
		counter++;							//incrementing   counter=counter+1;
		System.out.println(counter);
	}
	
	public static void main(String[] args)
	{
      
		CounterWithoutStatic a=new CounterWithoutStatic();		// we created object a,b,c
		CounterWithoutStatic b=new CounterWithoutStatic();
		CounterWithoutStatic c=new CounterWithoutStatic();			

		
	}

}
