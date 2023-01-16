package com.inheritance_demo;




/*  When use Aggregation?
  
   code reuse is also best achieved by aggregation when there are is no IS-A relationship.

 */


/* Understanding Meaningful Example of Aggregation !
  
 in this example, Employee Class has an Object Of Address Class,
 Address Object Contains its own Informations Such as City,State,Country etc.
 in such case relationship is Employee HAS-A Address.
 
  */



class Address{									//this is Address class
	
	String city,state,country;						// these are instance variable
	
	Address(String city,String state,String country)			//this is our Address Class Constructor
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
}




class Employee1{							//this is Employee class
	
	int id;									// these are instance variable
	String name;
	
    Address Address;						// address variable of type Address Class
	
	Employee1(int id,String name, Address Address){			//this is our Employee Class Constructor
		
		this.id=id;
		this.name=name;
		this.Address=Address;
	}
	
	
	public void display()
	{
		System.out.println(id+" "+name+" "+Address.city+" "+Address.state+" "+Address.country);
	}
	
}




public class Inheritance_Aggregation_2 {

	public static void main(String[] args) {
		
		Address a1=new Address("bhiwandi","MHA","india");			// a1 is reference of Class Address
		
		Employee1 e1=new Employee1(111,"Ansari",a1);				// a1 is passed as argument into Employee Class Constructor
		
		e1.display();
	}
}
