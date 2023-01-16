package basicprogram;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		int sum=0,re;
		
		int temp=num;

		while(num>0)
		{
		    re=num%10;				// get the last digit of number
			sum=sum*10+re;
			
			num=num/10;				// remove the last digit of number
			
		}
		
		
		if(temp==sum)
		{
			System.out.println("number is palindrom number");
		}
		else
		{
			System.out.println("number is not palindrom number");
		}
		
		
		
	}

}
