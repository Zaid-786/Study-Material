import java.util.Scanner;

// write a program to Count Digit Number.

public class CountDigitNumber_6
{

	public static void main(String[] args) {

		int count=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number...");
		int num=sc.nextInt();
		
		while(num!=0)				//this is our main logic
		{
			num=num/10;					//remove last digit of given number
			count++;					// increment by 1
		}
		
		System.out.println("count of digit given number ="+count);
	
		sc.close();
	
	}

}
