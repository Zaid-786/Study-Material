package com.class_objects_Concept;

// this is example of static keyWord

/* static keyword in Java is used for Memory Management Mainly.
 * static keyword belongs to the class rather than an instance of the class.
 * the static can be (Variable,method,Block and Nested Class).
 * 
 * the static variable can be used to refer to the common property of all Objects.
 * for example:- Company name of employees, College name of students
 * 
 * static variable gets memory only once in the class area at the time of class loading .
 * 
 * it makes your program memory efficient.(its save the memory).
 * 
 * */




class Student_11
{
	int id;									//instance variable
	String name;
	static String collage="Jiems";					//static variable
	
	
	public Student_11(int id,String name)			// Constructor
	{
		this.id=id;
		this.name=name;
	}
	
//	method to display the value
	void display()
	{
		System.out.println(id+" "+name+" "+collage);
	}
	
}






public class Keywords_StaticKeyWord_19_1 
{
	public static void main(String[] args) 
	{
			Student_11 s1=new Student_11(11,"Ansari");
			Student_11 s2=new Student_11(12,"khan");

			
			s1.display();
			s2.display();

	}

}
