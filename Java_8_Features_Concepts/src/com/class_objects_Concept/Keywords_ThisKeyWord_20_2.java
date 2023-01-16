package com.class_objects_Concept;



// USE 2:- "this" keyword can be used to invoke the current class method(implicitly).

// if you don't use the this keyword, compiler Automatically Adds this keyword while invoking the method.



class ThisKeyWord_method
{

	void display()
	{
		System.out.println("this keyword can be used to invoke current class method");
	}
	
	void Show()
	{
		display();							// you can use both statement to invoke current class method
//		this.display();
	}	
	
}



public class Keywords_ThisKeyWord_20_2 
{
	public static void main(String[] args) 
	{
		ThisKeyWord_method t2=new ThisKeyWord_method();
		
		t2.Show();
	}

}
