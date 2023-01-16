package com.class_objects_Concept;


//Object & Class Example :- main() method outside the class.
//Java program to Demonstrate having main() method in another Class.

// creating a Student class
class Student
{
	int id;
	String name;
}


//this is another class have main() method
public class ClassObject_ExampleStudent2
{
	public static void main(String[] args) 
	{
			Student s1=new Student();
			 
			System.out.println(s1.id);
			System.out.println(s1.name);
	}

}
