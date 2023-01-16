import java.util.Scanner;

// write a program to Prime Number .

public class PrimeNumberExample_2 
{
	public static void main(String[] args)
	{
		int counter = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number which you want to prime number... ");
		int num = sc.nextInt();				//take input integer number from user

		for(int i = 1; i <= num; i++) 		// this is our main logic
		{
			if (num % i == 0) 				//by dividing loop each number of our given number and after diving we got reminder zero then our counter is incremented by 1 
			{
				counter++;
			}
		}

		if (counter == 2)					// when our counter number is equal to 2 then given number is prime otherwise not prime number
		{
			System.out.println(num+" is prime number");
		}
		else
		{
			System.out.println(num+" number is not prime");
		}

		sc.close();

	}
}
