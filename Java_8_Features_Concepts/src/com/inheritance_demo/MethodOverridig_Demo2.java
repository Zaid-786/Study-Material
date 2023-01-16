package com.inheritance_demo;


// A Real Example Of Java Method Overriding !

/*
  Consider a Scenario, where Bank is a Class that provides Functionality to get the rate of Interest.
  However, the rate of interest varies  according to Banks. 
  for example:- SBI,ICICI and Axis banks Could provide 8%,7% and 9% rate of Interest.
*/


class Bank{
	
	float rateOfInterest()
	{
		return 0;
	}
}


class SBI extends Bank{
	
	float rateOfInterest()
	{
		return 7.5f;
	}
}



class ICICI extends Bank{
	
	float rateOfInterest()
	{
		return 8.5f;
	}
}


class Axis extends Bank{
	
	float rateOfInterest()
	{
		return 9.5f;
	}
}


public class MethodOverridig_Demo2 {

	public static void main(String[] args) {

		SBI s1=new SBI();
		ICICI c1=new ICICI();
		Axis a1=new Axis();
		
		
		System.out.println("rate of interest SBI bank= "+s1.rateOfInterest());
		System.out.println("rate of interest ICICI bank= "+c1.rateOfInterest());
		System.out.println("rate of interest Axis bank= "+a1.rateOfInterest());
	}

}


/*  Can We Override static method ?
	
	NO, a static method cannot be Overridden. it can be proved by runtime polymorphism.
*/



/*  Can We Override Java main() method ?
  	
  	NO, because the main() method is a static method.
  */



/*	Why Can We Not Override static Method ?
  
	it is because the static method is bound with class Whereas instance method is bound with an instance(object).
	static belongs to the class area , and a instance belongs to the heap area.
 */


