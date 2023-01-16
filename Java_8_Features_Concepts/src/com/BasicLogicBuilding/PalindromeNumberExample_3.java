import java.util.Scanner;


// write a program to Palindrome Number
public class PalindromeNumberExample_3 {

	public static void main(String[] args) {

		int reverse=0,temp,reminder;			
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		temp=num;
		
		while(num!=0)						// this our main logic
		{
			reminder=num%10;					// by this statement we got last digit of number
			reverse=reverse*10+reminder;		
			num=num/10;							//by this statement we removed last digit of our number
		}
		
		if(reverse==temp)
		{
			System.out.println(temp+" is a prime number");
		}
		else
		{
			System.out.println(temp+" is not prime number");
		}
		
		
		sc.close();
	}
}
