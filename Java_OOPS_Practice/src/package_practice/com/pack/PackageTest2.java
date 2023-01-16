package com.pack;

import com.packtest.PackTest2;		//this is package imported thats name com.packtest.PackTest2;

//To write a program for using  package_name.class_name;

//if you import package_name.class_name then only declared class  of this package will be accessible.

public class PackageTest2 
{
	public static void main(String[] args)
	{
		PackTest2 s=new PackTest2();
		
		s.showDetails();
	}

}
