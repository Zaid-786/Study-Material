import java.util.Scanner;

// write a program to factorial number .
// for example:-  5!= 5*4*3*2*1 = 120 ;

public class FactorialNumberExample_5
{
	public static void main(String[] args)
	{
		int fact=1;					// this variable stored value after multiple
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number which you want to factorial..");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)				// we started loop from 1 because if start from zero you got out zero
		{
			fact=fact*i;
		}
		
		System.out.println("factorial number "+num+" is "+fact);
		
		sc.close();
	}
}
