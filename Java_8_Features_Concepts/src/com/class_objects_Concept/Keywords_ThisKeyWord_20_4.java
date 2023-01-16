package com.class_objects_Concept;


// Real Usage of this() Constructor Call.

/* the this() Constructor call should be used to reuse the constructor from the Constructor.
   it maintain the chain between the Constructors.	*/

/* i.e it is used for Constructor Chaining.
   lets see the example given below that displays the actual use of this keyword!. */



class Student_10{
	 
	int id;
	String name;
	String Address;
	float fees;
	
	Student_10(int id,String name,String Address)
	{
		this.id=id;
		this.name=name;
		this.Address=Address;
	}
	
	
	Student_10(int id,String name,String Address,float fees )
	{
		this(id,name,Address);
		this.fees=fees;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+Address+" "+fees);
	}
	
}





public class Keywords_ThisKeyWord_20_4 
{
	public static void main(String[] args)
	{
			Student_10 s1=new Student_10(11,"Ansari","bhiwandi");
			s1.display();
			
			Student_10 s2=new Student_10(11,"Ansari","bhiwandi",50000.50f);
			s2.display();
	}

}
