package com.class_object;


//To write a program real usage of this() method Constructor call

public class ThisRealUsage 
{
    	int rollno;					// these are data member or data fields
    	String name,course;
    	float fees;
    	
    	ThisRealUsage(int rollno,String name,String course)			//this is parameterized constructor with three parameter
    	{
    		this.rollno=rollno;										//used this keyword for distinguish instance variables and constructor parameters
    		this.name=name;
    		this.course=course;
    	}
    	
    	ThisRealUsage(int rollno,String name,String course,float fees)			//this is parameterized constructor with four parameter
    	{
			    		this(rollno,name,course);			// it is used for constructor chaining 
			    		this.fees=fees;
    	}
    	
    	public void display()
    	{
    		System.out.println("student rollno="+rollno+"\nstudent name="+name+"\nstudent course="+course+"\nstudent fees"+fees);
    	}
    	
    	
    	
	public static void main(String[] args)
	{
		ThisRealUsage a=new ThisRealUsage(111,"zaid","java");
		ThisRealUsage b=new ThisRealUsage(222,"taufiq","nodejs",20000.2f);
		
		
		a.display();
		b.display();
	}

}
