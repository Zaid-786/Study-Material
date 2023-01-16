package basicprogram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
	
		
		int temp,sum=0,re;
		
		temp=num;
		
		for(;num>0;num=num/10)
		{
			re=num%10;
			sum=sum+(re*re*re);
		}
		
		if(temp==sum)
		{
			System.out.println("Armstrong number"+sum);
		}
		else
		{
			System.out.println("is not Armstrong number"+sum);
		}
			
	}

}
