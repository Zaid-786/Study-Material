package com.class_object;


//To write a program for inheritance aggregation concepts or HAS-A relationship

class Circle
{
	double pi=3.141;							//this is instance variable pi=3.141
	InheritanceAggregationTestOperation op;		//this is reference op class of InheritanceAggregationTestOperation
	
	double area(int radius)						//this is method of class circle
	{
		InheritanceAggregationTestOperation	 c =new InheritanceAggregationTestOperation();			//this is object of op reference
		
		int result=c.sqrt(radius);            //class method called and stored in result variable
	
		return result*pi;					//returns result variable values * pi values 
	}
}



public class InheritanceAggregationTest1
{

	public static void main(String[] args)
	{
		Circle a=new Circle();				//this is object of class circle
		double b=a.area(5);					//this is method area()  
		System.out.println("this is radius of given numbers"+b);
	}

}
