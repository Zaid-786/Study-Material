package com.thread_demo;




/* in java , we can achieved thread by two ways.
  1. by extending Thread Class 
  2. by Runnable interface
*/

// 1. by extending Thread Class 
// in this example , we will write program by using thread class.



public class ThreadDemo1 extends Thread{

	public void run()
	{
		System.out.println(" this is example of thraed class by using thread class ");
	}
	
	
	public static void main(String[] args) {
		
		ThreadDemo1 t=new ThreadDemo1();
		
		t.start();
		System.out.println(t.getName());
	}

}
