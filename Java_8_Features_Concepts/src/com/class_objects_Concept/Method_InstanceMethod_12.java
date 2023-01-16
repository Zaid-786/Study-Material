package com.class_objects_Concept;



//this is example of Instance Method
/*the method of the class is knwon as instance method and its a non-static method defined in the class
 * before calling or invoking instance method .its necessary to create an Object of its class*/



public class Method_InstanceMethod_12 {

	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	
	
	public static void main(String[] args) 
	{
		Method_InstanceMethod_12 obj1=new Method_InstanceMethod_12();
		
		int x=obj1.add(12, 13);
		
		System.out.println("sum of two number = "+x);
	}

}
