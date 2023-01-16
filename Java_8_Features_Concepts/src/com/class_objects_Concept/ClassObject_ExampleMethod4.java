package com.class_objects_Concept;



//2) Object and Class Example: Initialization through method
/*
 * In this example, we are creating the two objects of Student class and initializing the value to these objects by invoking the insertRecord method.
 * Here, we are displaying the state (data) of the objects by invoking the displayInformation() method.
 */


class Student_B
{
	int roll_no;
	String name;
	
	void insertRecord(int r,String n)
	{
		roll_no=r;
		name=n;
	}
	
	void displayInformation()
	{
		System.out.println("student roll_no= "+roll_no+"\nstudent name= "+name);
	}
	
}



public class ClassObject_ExampleMethod4
{
	public static void main(String[] args) 
	{
			Student_B   s1= new Student_B();
			
			s1.insertRecord(101,"Ansari");
			s1.displayInformation();			
	}

}
