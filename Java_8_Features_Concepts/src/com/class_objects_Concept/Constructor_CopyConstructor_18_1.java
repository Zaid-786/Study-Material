package com.class_objects_Concept;


// this is Copy Constructor example

/*
 * there is no Copy Constructor in java. however, we can copy the values from one object Another 
 * 
 * there are many ways to copy the values of one object into another in java.
 * 
 * by Constructor
 * by assigning the values of one object into another
 * by clone() method of Object class
 * 
 * */



class Student_C{
	
	int id;
	String name;
	
//	Constructor to initialize integer and String 
	public Student_C(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	
//	constructor to initialize Another Object
	public Student_C(Student_C s)					// we can passed constructor as parameter into another Constructor
	{
		this.id=s.id;
		this.name=s.name;
	}

	
//	displaying instance data(id,String)
	public void display()
	{
		System.out.println(id+" "+name);
	}
}



public class Constructor_CopyConstructor_18_1 
{
	public static void main(String[] args) 
	{
			Student_C  s1=new Student_C(111,"Ansari");
			
			Student_C  s2=new Student_C(s1);					//we passed one object reference into another object 

			s1.display();			
			s2.display();
	}

}
