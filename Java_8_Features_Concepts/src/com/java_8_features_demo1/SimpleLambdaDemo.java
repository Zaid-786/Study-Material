package com.java_8_features_demo1;

// this is Example of Lambda Expression

interface Calculator {

//	lambda Expression  ()  ->    {..body..};

//	void switchON();   								method 1 
	
//	void takeParameter(int input);     				method 2 
	
	
	int sum(int a,int b);
	
	
}




public class SimpleLambdaDemo {

	public static void main(String[] args) {

//System.out.println("...............Traditional way to defined a methd..................");
/*		SimpleLambdaDemo d=new SimpleLambdaDemo();
		d.switchON();	
*/

		
//..................................................................................................................
/*     //first way to write Lambda Expression
		Calculator calculator1 = () -> {
			System.out.println("Calculator Switch ON by using lambda Expression ");
		};
		calculator1.switchON();
*/


/*	    //Second way to write Lambda Expression and if you have only one return statement or single statement 
		Calculator calculator2 = () -> System.out.println("Calculator Switch ON by using lambda Expression");
		calculator2.switchON();
*/
		
//...............................................................................................................		
	
		
		
/*		
		Calculator calc1=(input) -> {
			System.out.println("take parameter by user : "+input);
		};
		calc1.takeParameter(11);
		
		
		Calculator calc2=(input) -> System.out.println("take parameter by user : "+input);
		calc2.takeParameter(44);
*/		
		
		
	Calculator calls= (a,b) -> {
		      
		return a+b;
	};		
	System.out.println("sum of two number : "+calls.sum(12, 12));
		
		
		
	}


	
	
/*	//	this is our traditional way to defined a method and move on lambda
	@Override
	public void switchON()
	{
       System.out.println("this is the traditional way to defined a method ");
		System.out.println("Calculator is Switch ON .....");
	}
*/
	
	
}
