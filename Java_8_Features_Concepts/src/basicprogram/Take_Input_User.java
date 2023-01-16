package practice_set;

import java.util.*;

//Write a Program to Take Input From User and Print it?
public class Take_Input_User
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("enter the Roll_no:-");
		int roll_no = sc.nextInt();

		System.out.print("enter the Name:-");
		String name = sc.next();

		System.out.println("Roll_no=" + roll_no + "\nname=" + name);
		
		sc.close();
	}

}
