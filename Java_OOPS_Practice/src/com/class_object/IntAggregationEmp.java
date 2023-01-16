package com.class_object;

//to write a program inheritance aggregation employee and use another class address
 
public class IntAggregationEmp
{
		int id;						//these are data members
		String name;
		InheritanceAgrAddress address;		//this is class reference address variable of class InheritanceAgrAddress 
		
		IntAggregationEmp(int id,String name,InheritanceAgrAddress address)			//this is constructor 
		{
			this.id=id;
			this.name=name;
			this.address=address;
		}
		
		public void display()
		{
			System.out.println("emp id="+id+"\nemp name="+name);
			System.out.println("emp city="+address.city+"\nemp state="+address.state);
		}
		
		
	public static void main(String[] args) 
	{
		InheritanceAgrAddress a=new InheritanceAgrAddress("bhiwandi","Maharastra");    //this object of class InheritanceAgrAddress use as a reference variable
		
		IntAggregationEmp b=new IntAggregationEmp(111,"zaid",a);					  //this object of current class IntAggregationEmp and in this class used parameterized constructor and passed as a object in this object 
		
		b.display();
		
		
	}

}
