package com.class_object;

public class ThisInstanceVariable
{
   int id;							//these are instance variable or data members
   String name;
   float salary;
   
   ThisInstanceVariable(int id,String name,float salary)		// parameterized constructor  with instance variable 
   {
	   this.id=id;											//we used this keywords for distinguish between formal parameter and instance variable 
	   this.name=name;
	   this.salary=salary;
   }
   
   public void display()
   {
	   System.out.println("emp id="+id+"\nemp name="+name+"\nemp salary="+salary);
   }
   
   
   
	public static void main(String[] args)
	{
		ThisInstanceVariable s=new ThisInstanceVariable(111,"zaid",23.5f);
		s.display();
		
		ThisInstanceVariable w=new ThisInstanceVariable(111,"zaid",23.5f);
		w.display();
		
	}

}
