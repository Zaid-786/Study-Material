package com.class_object;

public class InstanceMethodExample          
{										//instanceMethod Class
        
	public int add(int a,int b)			// we created return-type add() method
	{
	   int s;
	   s=a+b;
	   return s;
	   
	}
	
	
	
	public static void main(String[] args) {
		  
		InstanceMethodExample obj=new InstanceMethodExample();  	//created a object of class InstanceMethodClass 
		
		System.out.println("addition of two number="+obj.add(12, 12));  // passing two int parameter values in add() through object
		
		
	}

}
