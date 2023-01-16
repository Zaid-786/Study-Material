package basicprogram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		int temp=num;
		
		int re,reverse = 0;
		
		while(num>0)
		{
			re=num%10;
			reverse=reverse*10+re;
			num=num/10;
		}
		
		System.out.println("Reverse of given number "+temp+" is "+reverse);
		
	}

}
