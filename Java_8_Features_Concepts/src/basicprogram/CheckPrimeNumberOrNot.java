package practice_set;

}import java.util.Scanner;

//Write a Program to check number is prime Or NOT?
public class CheckPrimeNumberOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number=");
		int num = sc.nextInt();

		int count = 0;

		for (int i = 1; i <= num; i++) 
		{
			if (num % i == 0)
			{
				count++;
			}
		}

		if (count == 2) {
			System.out.print("number is prime number..." + num);
		} else {
			System.out.print("number is not prime number..." + num);

		}

		sc.close();
	}


