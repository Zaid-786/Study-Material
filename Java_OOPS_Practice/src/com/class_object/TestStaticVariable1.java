package com.class_object;

//this program demonstrate a static variable use 
class Student
{
	int rollno;
	String name;
	static String collegename="Jiems Eng";    //collegename variable is static variable we dont required memory to created of this instance of object data field once you created!
	
	Student(int rollno,String name)        // this is parameterized constructor
	{
		this.rollno=rollno;
		this.name=name;
	}
	
	public void display()
	{
		System.out.println("student rollno="+rollno+"\n student name "+name+"\n college name= "+collegename);
	}
	
	
}


public class TestStaticVariable1 {

	public static void main(String[] args) {
				
		Student s1=new Student(111,"ansari");    //we created object in this line 
		Student s2=new Student(222,"khan");
		
		s1.display();
		s2.display();
	}

}
