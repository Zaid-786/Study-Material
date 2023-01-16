package com.pack;

//To write a program for using  fully qualified name
//if you use fully qualified name then only declared class  of this package will be accessible.
//now there is no need to import but you need to use fully qualified name every time  when you are accessing the class or interface

public class PackageTest3 
{
	public static void main(String[] args) 
	{
		ptest.PackTest3 d=new ptest.PackTest3();
		
		d.fight();
	}

}
