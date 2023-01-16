package com.inheritance_demo;


// Super Example:- Real Use

/*
   lets see the real use of super keyword here, EMP class inherits Person class so all the properties of person will be inherited to Emp by default.  
   To initialize all property, we are using parent class Constructor from child class.
   in such way, we are reusing parent class Constructor.
  
 */



class Person{								// parent class
	
	int id;
	String name;
	
	Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
}


class EMP extends Person{							// child class
	
	float salary;
	
	EMP(int id,String name,float salary)
	{
		super(id,name);						// reusing parent constructor
		this.salary=salary;
	}
	
	
	void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}
	
}



public class KeyWord_SuperKeyWord_RealUse {

	public static void main(String[] args)
	{
			EMP e1=new EMP(111,"Ansari",800.17f);
			
			e1.display();
	}

}
