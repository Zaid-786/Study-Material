package practice_set;


//Write a Program to Count of Digit Number Except of Zero?
public class CountOfDigitNumberExceptOfZero 
{

	public static void main(String[] args) 
	{
		int num = 123, count = 0;

		while (num > 0) {
			if (num % 10 != 0) {
				count++;
			}

			num = num / 10;
		}

		System.out.print(count);

	}

}
