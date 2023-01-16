package com.class_object;

public class DefaultConstructorExample1 {

	int id;
	String name;
	
	public void display()
	{
		System.out.println(id+" "+name);
		
	}
	
	public static void main(String[] args) {
		
		DefaultConstructorExample1 obj=new DefaultConstructorExample1();
		
		obj.display();

	}

}
