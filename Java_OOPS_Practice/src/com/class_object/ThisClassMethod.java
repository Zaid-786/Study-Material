package com.class_object;

public class ThisClassMethod 
{
		
	void m()											//this is first method m() method
	{
		System.out.println("this is m method..");
	}
	
	void n()											//this is second method n() method
	{
		System.out.println("this is n methid..");
		m();										//this keyword used automatically   this.m();
	}
	
	
	public static void main(String[] args)
	{
		ThisClassMethod c=new ThisClassMethod();
		
		c.n();
		
		
	}

}
