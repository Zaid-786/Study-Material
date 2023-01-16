package com.class_objects_Concept;


//this is Constructor Overloading  example.
/*
  in java, a constructor is just like a method but without return-type.
  it can also be overload like java methods. 
 */


class StudentB{
	
		int id;
		String name;
		int age;
		
		public StudentB(int id,String name)
		{
			this.id=id;
			this.name=name;
		}
		
		public StudentB(int id,String name,int age)
		{
			this.id=id;
			this.name=name;
			this.age=age;
		}

		
		public void display()
		{
			System.out.println(id+" "+name+" "+age);
		}
		
}



public class Constructor_ParameterizedConstructor_17 {

	public static void main(String[] args)
	{
			StudentB s1=new StudentB(11,"ANsari");
			StudentB s2=new StudentB(12,"khan",22);

			s1.display();
			s2.display();
			
			
	}

}
