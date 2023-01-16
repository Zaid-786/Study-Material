package practice_set;

import java.util.Scanner;

//Write a Program to Perfect Square AnyNumber?
public class PerfectSquareAnyNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a Number=");
		int num=sc.nextInt();
		
		//method number one......
		double square_root=Math.sqrt(num);
		System.out.print((int)square_root);
		
		
		//method number two......
//		int flag=0;
//		for(int i=1;i<=num/2;i++)
//		 {
//			if(i*i==num)
//			   {
//				 flag=1;
//				 System.out.print("perfect Square number="+i);
//				 break;
//			   }
//		 }	
//			if(flag==0)
//			   {
//				 System.out.print("not perfect Square number...");
//			   }
		sc.close();
	}

}
