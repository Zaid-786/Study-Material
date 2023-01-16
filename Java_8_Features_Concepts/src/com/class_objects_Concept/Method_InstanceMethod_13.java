package com.class_objects_Concept;


// Acessor(getter) method and mutator(setter) method  are example of instance method
// we are used to getter and setter methods for protected our data.

class Student1
{
	
	private int id;
	private String name;

	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
		public void display()
		{
			System.out.println(name+" "+id);
		}
	
}






public class Method_InstanceMethod_13 {

	public static void main(String[] args) {

		Student1 s1=new Student1();
		
		s1.setId(1);
		s1.setName("Ansari");
		
		s1.display();
		
		
	
	}

}
