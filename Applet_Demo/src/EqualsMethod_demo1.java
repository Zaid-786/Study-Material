

// Difference Between == Operator and .equals() method

// == Operator is used to Reference Comparison(Address Comparison).

/*    .equals() method
 
  1) .equals() of Object Class
  2) .equals() of String Class
 
  1) .equals() of Object Class
	 .equals() method of Object Class is used to Reference Comparison(Address Comparison). i.e:- if two Objects point to the same memory location or not. 
 
  2) .equals() of String Class
   	 .equals() method of String Class is used to Content Comparison. i.e:- if checks Object value. 

 */



public class EqualsMethod_demo1 
{

	public static void main(String[] args)
	{
		String s1=new String("ansari");
		String s2=new String("ansari");
		
		String s3="khan";
		String s4="khan";
		
		Object o=new Object();
		
		Thread t=new Thread();
		
		
		System.out.println(s1==s2);				// false, memory address is different	
		System.out.println(s1.equals(s2));		// true,  Objects value are same

		System.out.println(s3==s4);				// 	true, both objects are point same address
		System.out.println(s3.equals(s4));		// true, Objects value are same


		System.out.println(o==t);
		System.out.println(o.equals(t));

	}

}
