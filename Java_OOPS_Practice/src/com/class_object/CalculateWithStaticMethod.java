package com.class_object;



public class CalculateWithStaticMethod
{
		public static int cube(int x)
		{
			return x*x*x;
		}
		
	public static void main(String[] args)
	{
		/*Scanner scan=new Scanner(System.in);
        
		System.out.println("enter a number=");
		int num=scan.nextInt(); */
		
		
		
		int result=CalculateWithStaticMethod.cube(3);
		System.out.println("cube of given number="+result);
	}

}
