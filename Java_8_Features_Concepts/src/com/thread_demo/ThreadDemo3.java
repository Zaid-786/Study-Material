package com.thread_demo;





class Tcontent{
												// synchronized keyword is used to make your thread safe
	public synchronized void  m1(String s)
	{
		System.out.println("{");
		System.out.println(s);
		
		try {
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("}");
	}	
}


class ThreadJOB extends Thread{					// this is our Thread class where we will write our logic into run() method

	Tcontent t;
	String s;
	
	ThreadJOB(Tcontent t,String s)
	{
		this.t=t;
		this.s=s;
		
		start();
	}
	
	public void run()
	{
		t.m1(s);
	}
}





public class ThreadDemo3 {

	public static void main(String[] args) {
		
		Tcontent t=new Tcontent();
		new ThreadJOB(t,"hello");
		new ThreadJOB(t,"world");

	}

}
