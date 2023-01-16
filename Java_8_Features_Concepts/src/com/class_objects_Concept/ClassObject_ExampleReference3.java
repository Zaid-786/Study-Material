package com.class_objects_Concept;


//1) Object and Class Example: Initialization through reference

/*Initializing an object means storing data into the object. 
 * Let's see a simple example where we are going to initialize the object through a reference variable.
 */


class Student_A{
	
	int id;
	String name;
	
	void display()				//this is our display method which will show data members
	{
		System.out.println("Student id ="+id+"\nStudent name ="+name);
	}
}


public class ClassObject_ExampleReference3
{
	public static void main(String[] args) 
	{
		 Student_A s1=new Student_A();
		 	
		 // by reference we assigned values our variable
		 s1.id=101;
		 s1.name="Ansari";
		 s1.display();
		 
	}

}
