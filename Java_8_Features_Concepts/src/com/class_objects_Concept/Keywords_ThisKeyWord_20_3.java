package com.class_objects_Concept;


//USE 3:- "this" keyword can be used to invoke the current class Constructor.

/* supposed, we have ThisDemo Class and we have created both Constructors (Default Constructor and Parameterized Constructor ) in the Class ThisDemo 
	 we have two conditions:-
	 1. by Default Constructor we will invoke Parameterized Constructor 
	 2. by Parameterized Constructor we will invoke Default Constructor 
*/


// let us understand by a simple example,



class ThisDemo{
	
	//Default Constructor
	ThisDemo()							
	{
//		this(10);				// to invoke current class parameterized Constructor then default Constructor is executed
		System.out.println("this is Default Constructor.....");
	}
	
	//Parameterized Constructor
    ThisDemo(int i)						
	{
    	this();						// to invoke current class default Constructor then parameterized Constructor is executed
		System.out.println("this is Parameterized Constructor.....");

	}
	
}



public class Keywords_ThisKeyWord_20_3 
{
	public static void main(String[] args) 
	{
		ThisDemo t1=new ThisDemo(10);
	}

}
