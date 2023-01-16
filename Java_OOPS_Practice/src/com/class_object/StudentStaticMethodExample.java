package com.class_object;

public class StudentStaticMethodExample
{
    int rollno;									//instance variable int  rollno
    String name;								//instance variable String name 
    static String collegename="jiems";			//static instance variable string collegename
    
    static void change()						//static without-return method
    {
    	collegename="xyz";						//statice method have ability to change values of static variable 
    }
    
    StudentStaticMethodExample(int rollno,String name)      //parameterized constructor
    {
    	this.rollno=rollno;										//this keyword is used for same data-type variable use in class and method 
    	this.name=name;
    }
    
    
    public void display()
    {
    	System.out.println("rollno="+rollno+"\nname="+name+"\ncollegename="+collegename);
    }
    
    
	public static void main(String[] args)
	{
		StudentStaticMethodExample a=new StudentStaticMethodExample(111,"zaid");   //we created object with parameterized constructor with values
		a.display();							
		StudentStaticMethodExample.change();           //we invoked change()method with class name
		a.display();
		
	}

}
