package com.class_object;

public class ParameterizedConstructorExample {
      
	int id;
	String name;
	
	ParameterizedConstructorExample(int id,String name)         //this is a parameterized constructor method and this a special type of method 
	{
		this.id=id;
		this.name=name;
	}
	
	public void display()
	{
		System.out.println("id="+id+"\n name="+name);
	}
	
	
	public static void main(String[] args) 
	{
		
		ParameterizedConstructorExample a=new ParameterizedConstructorExample(111,"zaid");
		a.display();
		
		
	}

}
