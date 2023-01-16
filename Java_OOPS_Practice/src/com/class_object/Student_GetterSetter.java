package com.class_object;

public class Student_GetterSetter {
      
	private int rollno;    // this private data memember
	private String name;    // we will create getter or setter method through right click then pop up a menu box of list then click on  source list there will show the getter and setter option
	
	
	
	
	public int getRollno()          //getter to return values and reads
	{
		return rollno;
	}




	public void setRollno(int rollno)    //setter to set values and reads
	{
		this.rollno = rollno;
	}




	public String getName()      //getter to return values and reads
	{
		return name;
	}




	public void setName(String name)   //setter to set values and reads
	{
		this.name = name;
	}




	public static void main(String[] args) {
      
		Student_GetterSetter o=new Student_GetterSetter();
		 
		o.setRollno(01);
		o.setName("zaid");
		
		System.out.println("student rollno="+o.getRollno());
		System.out.println("student name="+o.getName());

	}

}
