package com.abstruction;

//To write a program for which are used interface and default method in the interface


interface Drawable4					//this is an interface
{
	void draw();						//this is an interface method
	
	static int cube(int x)				//this is static method is supported interface in java version.8  
	{
		return x*x*x;
	}
}



class Circle4 implements Drawable4							//class circle3 implements by interface Drawable3 
{
	public void draw()										//this is interface method body defining 
	{
		System.out.println("this is circle drawing...");
	}
}



public class InterfaceTest9_StaticMethod {

	public static void main(String[] args) 
	{
		Drawable4 s=new Circle4();					//reference variable created by interface Drawable4 and object s is created by class Circle4
		
		s.draw();
		System.out.println(Drawable4.cube(3));			//we called cube method by interface name of Drawable4 
	}

}
