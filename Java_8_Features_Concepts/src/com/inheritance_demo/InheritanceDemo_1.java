package com.inheritance_demo;



// what is Inheritance in Java?

/* inheritance in java is a mechanism in which one Object acquires all properties and behaviors of a parent Object.
  it is a important part of OOPs.
  inheritance represents IS-A relationship which is also known as a Parent-Child relationship.
 */

/* Advantage of inheritance!
	  for method Overriding(so runtime polymorphism can be achieved).
	  for code reusability.
*/

/* Types of Inheritance !
   
 * Single Level Inheritance
 * Multi  Level Inheritance 
 * Hierarchy Level Inheritance
 
  */



class Employee{								// this is parent class
	
	float salary=30000.12f;
}


class Programmer extends Employee{				// this is child class
		
	int bonus=10000;
	
}



public class InheritanceDemo_1 
{

	public static void main(String[] args)
	{
		Programmer p1=new Programmer();
		
		System.out.println("Salary of Employee = "+p1.salary);
		System.out.println("Bonus of Programmer = "+p1.bonus);
	}

}



// in the above example,
// programmer object can access the field of own class as well as of Employee class  i.e code reusability.

