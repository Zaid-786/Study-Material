import java.util.Scanner;

//write a program to palindrome Number or String 
// like 121,353, lol,madam etc...

public class PalindromeNumberExample_4 
{

	public static void main(String[] args) 
	{
			String original,reverse="";
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a number OR String ");			
			original=sc.nextLine();								//take string or number from user
			
			
			int lenght=original.length();						// by this statement we got lenght of our number OR string 
			
			for(int i=lenght-1;i>=0;i--)						// this our main logic          (lenght-1  is used for get last digit of given number or string ) 
			{
				reverse=reverse+original.charAt(i);
			}
			
			if(original.equals(reverse))						// by this statement we compare given number or string is equal or not and if equal then palindrome or not equal then not palindrome
			{
				System.out.println(reverse+" palindrome number or String ");
			}
			else
			{
				System.out.println(reverse+" Not palindrome number or String");
			}
			
			sc.close();
	}
}
