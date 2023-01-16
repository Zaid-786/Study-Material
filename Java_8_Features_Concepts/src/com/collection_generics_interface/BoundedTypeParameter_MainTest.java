package com.collection_generics_interface;

public class BoundedTypeParameter_MainTest {

	public static void main(String[] args) {
	
		Integer[] arr= {1,2,3,4};
		Long[] longArr= {10L,20L,30L,40L};
		Double[] doubleArr= {5.0,10.12,30.45,20.0};
		
System.out.println("-----------------------------------------------");
		BoundedTypeParameter_Example1<Number> gg1=new BoundedTypeParameter_Example1<>(arr);
		double x=gg1.averageNumber();
		System.out.println(x);

		BoundedTypeParameter_Example1<Number> gg2=new BoundedTypeParameter_Example1<>(longArr);
		double y=gg2.averageNumber();
		System.out.println(y);
		
		BoundedTypeParameter_Example1<Number> gg3=new BoundedTypeParameter_Example1<>(doubleArr);
		double z=gg3.averageNumber();
		System.out.println(z);
System.out.println("---------------------------------------------------");		
		

		int valueX=BoundedTypeParameter_MainTest.counterLoop(doubleArr,10.0);
		System.out.println(valueX);


	}
	
// static bounded type parameter example of counter
	public static<T extends Comparable<T>> int counterLoop(T[] arr,T e)
	{
		int counter=0;
		for(T i:arr)
		{
			if(i.compareTo(e)>0)
			{
				counter++;
			}
		}
		
		return counter;
	}
	
	
	
	
	
}
