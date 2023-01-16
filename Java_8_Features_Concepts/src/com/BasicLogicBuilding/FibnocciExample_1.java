import java.util.*;



// write a program to fibnocci number example.
public class FibnocciExample_1 
{

	public static void main(String[] args)
	{
		int n1=0,n2=1,n3;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number of which you want fibnocii..");
		int num=sc.nextInt();
		
		
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<num;i++)					//this is our logic part
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			
			n1=n2;
			n2=n3;
			
		}
		sc.close();
			
			
	}

}
