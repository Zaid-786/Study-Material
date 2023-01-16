package com.pack;

import com.packtest.*;    		//this is package imported thats name com.packtest 
 
//To write a program for using  package-name.*

//if you use package.* then all the classes and interfaces of this package will be accessible but not sub-package

public class PackageTest1 {

	public static void main(String[] args)
	{
		PackTest1 a=new PackTest1();
		a.show();
	}

}
