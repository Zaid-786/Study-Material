package com.class_objects_Concept;

//this is example of default constructor 
/*
  What is the purpose of a Default Constructor?
  
  The Default Constructor is used to provide the default Values to the Object like 0,null etc.
  Depending on the type.
 
 */

public class Constructor_DefaultConstructor_15
{
	int id;
	String name;
	
	public void display()
	{
		System.out.println(id+" "+name);
	}
	
	
	public static void main(String[] args) 
	{
		Constructor_DefaultConstructor_15  obj1=new Constructor_DefaultConstructor_15();
		
		obj1.display();
	}

}
