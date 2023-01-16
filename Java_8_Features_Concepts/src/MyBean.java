import java.util.Scanner;

public class MyBean {

	public static void main(String[] args) {
		
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("====================================");
	for(int i=0;i<3;i++)
	{
		String str=sc.next();
		int a=sc.nextInt();
		
		System.out.printf("%-15s %03d %n",str,a);
		
	}
	System.out.println("====================================");

	
	
		
		
	}
	
	
}
