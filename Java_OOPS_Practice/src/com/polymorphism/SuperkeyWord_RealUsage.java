 package com.polymorphism;

//To write a program for used super keyword real example

class Person					// this is parent class
{
	int id;						//these are instance variable 
	String name;
	
	Person(int id,String name)			//this is parent class constructor and passed with parameter 
	{
		this.id=id;
		this.name=name;
	}
}

class Emp extends Person				//this is child class extends by parent class
{
	float salary;
	
	Emp(int id,String name,float salary)			//this is child class constructor
	{
		super(id,name);								//super() method to used for gets parent class instance variable values into child constructor
		this.salary=salary;
	}
	
	void display()
	{
		System.out.println("id="+id+"\nname="+name+"\nsalary="+salary);
	}
	
}


public class SuperkeyWord_RealUsage 
{
	public static void main(String[] args)
	{
			Emp a=new Emp(111,"zaid",1229.444f);
			a.display();
	}

}
