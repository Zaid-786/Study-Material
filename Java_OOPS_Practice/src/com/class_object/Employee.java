package com.class_object;

//Object&Class:- initialization through a Constructor

class TestEmployee
{
	int id;
	String name;
	float salary;
	
	TestEmployee(int i,String n,float s)
	{
		id=i;
		name=n;
		salary=s;
		
	}
	
	public void display()
	{
		System.out.println("emp id="+id+"\nemp name="+name+"\nemp salary="+salary);
		
	}
}





public class Employee {

	public static void main(String[] args) {
		
		TestEmployee e1=new TestEmployee(1,"zaid",30.5f);
		TestEmployee e2=new TestEmployee(2,"taufique",30.5f);
		e1.display();
		e2.display();
		
	}

}
