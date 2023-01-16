package com.javaAnnotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// in this example will be creating our own custom annotation

public class CustomAnnotationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NokiaCompany c1=new NokiaCompany("nokia5533",23);
		
		System.out.println(c1.model+"\t"+c1.size);
		
		
		Class c=c1.getClass();
		Annotation an=c.getAnnotation(SmartPhone.class);
		SmartPhone s=(SmartPhone)an;
		System.out.println(s.os());
		

	}
}






@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface  SmartPhone									//@interface is used to create your own (custom) Java annotations. Annotations are defined in their own file, just like a Java class or interface. Here is custom Java annotation example: @interface MyAnnotation { String value(); String name(); int age(); String[] newNames(); }	// SmartPhone is an custom interface annotation and in this inface we have two method
{
	String os()  default "symbian";
	int version() default 111 ;
}



@SmartPhone(os="Android",version=6)
class NokiaCompany{
	
	String model;
	int size;
	
	public NokiaCompany(String model,int size)
	{
		this.model=model;
		this.size=size;
	}
	
}