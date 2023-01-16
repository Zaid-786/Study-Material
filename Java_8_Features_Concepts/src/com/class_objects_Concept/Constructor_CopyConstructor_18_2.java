package com.class_objects_Concept;




//this is Copy Constructor example

/* Copy values without Constructor
 *  
 * we can copy the values of one object into another
 * by assigning the objects value to Another object
 *  
 *  */


class Student_D{
	
	int id;
	String name;
	
	public Student_D(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public Student_D()
	{
		
	}
	
	
	public void display()
	{
		System.out.println(id+" "+name);
	}
}



public class Constructor_CopyConstructor_18_2 {

	public static void main(String[] args) {

		 
		Student_D  s1=new Student_D(19,"Ansari");
		Student_D  s2=new Student_D();

		s2.id=s1.id;						//by assigning one objects value into another 
		s2.name=s1.name;
		
		s1.display();
		s2.display();
	}

}
