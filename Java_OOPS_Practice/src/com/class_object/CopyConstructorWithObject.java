package com.class_object;

public class CopyConstructorWithObject           //copy constructor with object
{
	int id;					//these are data fields
	String name;
	
	CopyConstructorWithObject(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	CopyConstructorWithObject(CopyConstructorWithObject s)			// passing object as a parameter  
	{
	     id=s.id;
	     name=s.name;
	}
	
	public void display()					//show the value of data fields
	{
		System.out.println(id+" "+name);
	}
	
	
	public static void main(String[] args) 
	{
		
		CopyConstructorWithObject s1=new CopyConstructorWithObject(111,"zaid");    //we created object s1 with parameterized constructor
		CopyConstructorWithObject s2=new CopyConstructorWithObject(s1);            //we created object s2 with passing object s1 as a parameterized constructor
		
		s1.display();
		s2.display();
		
	}

}


