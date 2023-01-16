package com.class_objects_Concept;


//Object and Class Example: Employee
//Let's see an example where we are maintaining records of employees.


class Employee
{
	int id;
	String name;
	float salary;
	
	void insert(int i,String n,float s)
	{
		id=i;
		name=n;
		salary=s;
	}
	
	void display()
	{
		System.out.println("Employee id="+id+"\nEmployee name="+name+"\nEmployee salary="+salary);
	}
}



public class ClassObject_ExampleMethod_5 
{
	public static void main(String[] args) 
	{
			Employee e1=new Employee();			//e1 is a reference variable which is hold object and reference of Employee class
			Employee e2=new Employee();			//e2 as same above statement
			
			
			e1.insert(101,"Ansari",10000.2f);
			e1.display();
			
			e2.insert(102,"Khan",50000.2f);
			e2.display();
			
			
	}

}
