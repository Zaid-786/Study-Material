package com.class_objects_Concept;


//this is java static block example

//it is used to initialize the static data member.
//its executed before the main method at the time of class loading .




public class Keywords_StaticKeyWord_19_4 {

	
	static {
		System.out.println("this is static block invoked...");
	   }
	
	
	public static void main(String[] args) 
	{
		System.out.println("this is main method block invoked...");

	}

}
