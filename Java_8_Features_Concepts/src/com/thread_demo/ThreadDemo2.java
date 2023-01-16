package com.thread_demo;



/* in java , we can achieved thread by two ways.
1. by extending Thread Class 
2. by Runnable interface
*/

// 2. by Runnable interface  (we need 2objects ,one is  object of class which implements Runnable interface and second one is Thread class and in this thread class constructor passed with interface )
// in this example , we will write program by using thread class.





public class ThreadDemo2 implements Runnable {

	public static void main(String[] args) 
	{
		ThreadDemo2 t=new ThreadDemo2();
		
		Thread th=new Thread(t);
		
		th.start();
	}

	@Override
	public void run() {
		System.out.println("this is example of Runnable interface for thread");
	}

}
