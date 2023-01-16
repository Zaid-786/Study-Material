package com.class_object;

//To write a program single level inheritance

class Emp						//this parent or superclass
{
 	float salary=20000.20f;			//instance variable 
}

class programmer extends Emp				//this is child class or subclass
{
	int bonus=10000;
} 



public class InheritanceTest2
{
	public static void main(String[] args)
	{
				programmer a=new programmer();
				
				System.out.println("employee salary="+a.salary);		//this is printing values of parents class variable from child class instance or objects
				System.out.println("employee bonus="+a.bonus);
	}

}
