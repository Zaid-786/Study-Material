package com.class_objects_Concept;


// this example of parameterized Constructor

/* Parameterized Constructor:-
   A constructor which has a specific number of Constructor is called as Parameterized Constructor.
  
 * Why Use The Parameterized Constructor?
 	
 	The Parameterized Constructor is used to provide the Different values to the Distinct Objects.
  
  */



class StudentA{
	
	//instance variables
	int id;
	String name;
	
	public StudentA(int i,String n)					//this is our parameterized constructor
	{
		this.id=i;
		this.name=n;
	}
	
	//method to the display id and name
	public void display()
	{
		System.out.println(id+" "+name);
	}
}





public class Constructor_ParameterizedConstructor_16 {

	public static void main(String[] args) 
	{
//		creating Objects and passing values into Constructor
			StudentA s1=new StudentA(111,"Ansari");
			
//			calling method to display the values of object.
			s1.display();
	}

}
