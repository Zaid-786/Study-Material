package com.class_objects_Concept;


class Account
{
	int acc_no;
	String name;
	float  ammount;
	
//insert method
	void insert(int a,String n,float amt)
	{
		acc_no=a;
		name=n;
		ammount=amt;
	}
	
	
// deposit method
	void deposit(float amt)
	{
		ammount=ammount+amt;
		
		System.out.println("deposited = "+ammount);
	}
	
	
// withdraw method
	void withdraw(float amt)
	 {
		if(amt>ammount)
		{
			System.out.println("balance is insufficient...");
		}
		else
		{
			ammount=ammount-amt;
			System.out.println("after withdraw ammount="+ammount);
		}
	}
	

	
// checkBalance method 	(check balance of account) 
	void checkBalance()
	{
		System.out.println("main balance ="+ammount);
	}
	
// method to display the values of an object (display method)
	void display()
	{
		System.out.println("account number = "+acc_no+"\naccount name = "+name+"\naccount ammount = "+ammount);
	}
		
}



public class Method_TestAccount_6 
{
	public static void main(String[] args)
	{
		Account a1=new Account();
		
		a1.insert(111,"Ansari",10000.76f);
		a1.display();
		a1.checkBalance();
		
		a1.deposit(1200.20f);
		a1.checkBalance();
		
		a1.withdraw(1200.20f);
		a1.checkBalance();

	}

}
