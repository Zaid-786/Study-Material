package com.javaAnnotations;


// this is example of java Annotation


// this annotation is showing that fuctional inteface take only one method 
@FunctionalInterface              
interface Func
{
	void a();
//	void b();
}





class A
{
	
	public void show()
	{
		System.out.println(" class A is running.....");
	}
}


class B extends A{
	
	// this annotation is showing this method is deprecated or no longer used
	@Deprecated							
	public void display()
	{
		System.out.println("hello");
	}
	
	
	// this annotation is showing this method is overrinding from thier parent class
	@Override
	public void show()
	{
		System.out.println(" class B is running.....");
	}
	
}


public class JavaAnnotation_Demo1 {

	public static void main(String[] args) {
		
		B obj1=new B();
		obj1.show();
		obj1.display();
		
	}

}




/*  Java Annotations ?
 
 Java annotations are metadata (data about data) for our program source code. 
 They provide additional information about the program to the compiler but are not part of the program itself. 
 These annotations do not affect the execution of the compiled program. Let's take an example of @Override annotation.

 
 */