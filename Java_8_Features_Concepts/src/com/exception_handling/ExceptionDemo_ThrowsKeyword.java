package com.exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* throws keyword in java:-
 throws is a keyword in Java which is used in the signature of method to indicate that this method might throw one of the listed type exceptions. 
 The caller to these methods has to handle the exception using a try-catch block. 
*/

//programmer 2 handle programmer file according his need.
public class ExceptionDemo_ThrowsKeyword {

	public static void main(String[] args) {

		ReadWriteFiles rwf = new ReadWriteFiles();

		try {
			rwf.read();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println("program is succesfully run...");


//		try {
//			rwf.saveFile();
//		} catch (FileNotFoundException e2) {
//			e2.printStackTrace();
//		}

//		System.out.println("program is executed successfully...");

	}

}



// programmer 1 is written below code
class ReadWriteFiles {

	void read() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("d://abc.txt");
	}

	void saveFile() throws FileNotFoundException {
		String text = "this is demo";
		FileOutputStream fos = new FileOutputStream("d://abc.txt");
	}

}