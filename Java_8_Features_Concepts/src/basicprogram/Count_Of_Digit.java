package practice_set;



//Write a Program to Count of Digit Any Number?
public class Count_Of_Digit
{
	public static void main(String[] args) 
	{
		int num = 123, count = 0;

		while (num > 0) 
		{
			num = num / 10;
			count++;
		}

		System.out.println(count);

	}

}
