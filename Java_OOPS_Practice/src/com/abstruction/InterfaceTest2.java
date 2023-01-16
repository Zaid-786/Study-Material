package com.abstruction;

//To write a program for interface example 

interface Drawable					//this is a interface of Drawable
{
	void draw();	        		//this is interface method()
}

class rectangle1 implements Drawable			// class rectangle  implements by interface Drawable
{
	public void draw()							//this is interface method body defining of draw() method
	{
		System.out.println("rectangle is drawing...");
	}
}


class Circle1 implements Drawable					// class circle  implements by interface Drawable
{
	public void draw()
	{
		System.out.println("circle is drawing...");
	}
}


public class InterfaceTest2 
{
	public static void main(String[] args)
	{
		Drawable a=new Circle1();	
		a.draw();
		
		a=new rectangle1();
		a.draw();
	}

}
