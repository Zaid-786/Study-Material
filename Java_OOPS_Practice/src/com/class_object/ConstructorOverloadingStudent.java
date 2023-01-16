package com.class_object;

public class ConstructorOverloadingStudent
{
    int id;								//these are data members
    String name;
    int age;
    
    
    ConstructorOverloadingStudent(int id,String name)      //parameterized constructor1 with two parameter
    {
      this.id=id;
      this.name=name;
    }
    
    ConstructorOverloadingStudent(int id,String name,int age)   //parameterized constructor2 with three parameter
    {
    	this.id=id;
    	this.name=name;
    	this.age=age;
    }
    
    public void display()
    {
    	System.out.println("id is="+id+"\nname="+name+"\nage is="+age);			//this is showing method of fields
    }
    
    
    
	public static void main(String[] args) {
		
		ConstructorOverloadingStudent b=new ConstructorOverloadingStudent(111,"zaid");
		ConstructorOverloadingStudent c=new ConstructorOverloadingStudent(112,"taufique",21);
		
		b.display();
		c.display();
		
	}

}
