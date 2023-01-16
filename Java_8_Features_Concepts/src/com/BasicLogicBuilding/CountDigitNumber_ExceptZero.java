import java.util.Scanner;

// write a program to Count Digit Number Except zero digit .

public class CountDigitNumber_ExceptZero
{
	public static void main(String[] args) 
	{
			int count=0;
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter a number...");
			int num=sc.nextInt();
			
			while(num!=0)
			{
				if(num%10 != 0)
				{
					count++;
				}
				
				num=num/10;				//remove the last digit from given number
			}
			
			System.out.println(count);
			
			sc.close();
	}

}
