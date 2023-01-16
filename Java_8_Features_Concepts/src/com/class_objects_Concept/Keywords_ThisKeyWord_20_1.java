package com.class_objects_Concept;



// USE 1:- "this" keyword is used to invoke the current class instance variable



class ThisKeyWord_InstanceVariable
{
	int i;
	
	public ThisKeyWord_InstanceVariable(int i)
	{
		this.i=i;
	}
	
	void Show()
	{
		System.out.println("this keyword is used to invoke current class instance variable");
		System.out.println("i variable is instance variable= "+i);
	}	
	
}





public class Keywords_ThisKeyWord_20_1 
{
	public static void main(String[] args) 
	{
		ThisKeyWord_InstanceVariable   t1=new ThisKeyWord_InstanceVariable(100);
		
		t1.Show();
	}

}
