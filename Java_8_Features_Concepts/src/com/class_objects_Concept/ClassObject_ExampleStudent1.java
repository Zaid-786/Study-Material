package com.class_objects_Concept;


// Object & Class Example :- main within the class
// Java program to illustrate How to Define a Class and fields
// Defining a Student Class

public class ClassObject_ExampleStudent1
{

	int id;
	String name;
	
	public static void main(String[] args) 
	{
		ClassObject_ExampleStudent1  s1= new ClassObject_ExampleStudent1();
		
		//accessing member through Reference variable
		System.out.println(s1.id);						//output:- 0
		System.out.println(s1.name);					//output:- null
	}
}
