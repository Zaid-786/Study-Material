
public class All_Patterns_Examples_9 
{

	public static void main(String[] args) 
	{
		pattern_5(4);
	}
	
	
	
	
// lets print pattern-1 .....................................
//	Square start Pattern
	
//	* * * * 
//	* * * * 
//	* * * * 
//	* * * * 
	
//	static void Pattern1(int n)
//	{
//		for(int row=1;row<=n;row++)
//		{
//			for(int col=1;col<=n;col++)
//			{
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}
//	}
//


	
	
	
	
	
// lets print pattern-2 .....................................
// increasing star Pattern
	
//	* 
//	* * 
//	* * * 
//	* * * * 
	
//	static void pattern_2(int n)
//	{
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}
//	}
	
	
	
	
	

	
// lets print pattern-3 .....................................
// decreasing star Pattern

//	* * * * 
//	* * * 
//	* * 
//	* 

//	static void pattern_3(int n)
//	{
//			for(int i=1;i<=n;i++)
//			{
//				for(int j=i;j<=n;j++)
//				{
//					System.out.print("* ");
//				}
//				
//				System.out.println();
//			}
//	}
	
	
	
	
	

	
	
	
	
// lets print pattern-3 .....................................

//    *
//   **
//  ***
// ****

//	static void pattern_3(int n)
//	{
//			for(int i=1;i<=n;i++)
//			{
//				for(int j=i;j<=n;j++)
//				{
//					System.out.print(" ");
//				}
//				
//				for(int k=1;k<=i;k++)
//				{
//					System.out.print("*");
//				}
//				
//				System.out.println();
//			}
//	}
	
	
	
	
	
	
	
	
	
// lets print pattern-3 .....................................
	
//	 ****
//	  ***
//	   **
//	    *
	
//	static void pattern_4(int n)
//	{
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(" ");
//			}
//			
//			for(int k=i;k<=n;k++)
//			{
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//	}
	
	
	
	


	
// lets print pattern-3 .....................................
//    * 
//   * * 
//  * * * 
// * * * * 

	
	
	static void pattern_5(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	
	
	
}
