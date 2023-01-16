package com.inheritance_demo;



// Aggregation in Java?

// if A class has an entity of reference. its known as  Aggregation.
// Aggregation represents HAS-A relationship.

// Advantage of Aggregation :- for code resuability


/*
 lets understand it by simple Example,
 we have two classes one is Operation class and Second one is Circle Class
 in this example we have created the reference of Operation class in the Circle class.
 */


 class  Operation{						// this is Operation Class 
	
	 public int square(int n)
	 {
		 return n*n;
	 }
}




 class Circle{								// this is Circle Class 
	 
	 double pi=3.141;
	 
	 Operation op;							// we declare op variable of type Operation class
	 
	 double area(int radiuas)				// defined area method and passed parameter which is out radius
	 {
		 op=new Operation();				// we create instance of operation class and used thier method
		 
		 int r=op.square(radiuas);
		 
		return pi*r;
		 
	 }
 }
 
 
 




public class Inheritance_Aggregation_1 {

	public static void main(String[] args) {
		
		Circle c1=new Circle();
		
		double area=c1.area(5);
		
		System.out.println(area);
	}
}
