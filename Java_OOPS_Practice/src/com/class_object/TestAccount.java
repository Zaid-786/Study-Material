package com.class_object;

class Account
{
	int acc;
	String name;
	float amt;
	
	public void insert(int acc,String name,float amt)
	{
		this.acc=acc;
		this.name=name;
		this.amt=amt;
		
	}
	
	
	
	public void deposit(float amount)
	{
		amt=amt+amount;
		System.out.println("updated amount="+amt);
	}
	
	public void withdraw(float amount)
	{
		if(amt<amount)
		{
			System.out.println("balance insufficient!");
		}
		else
		{
			amt=amt-amount;
		    System.out.println("withdraw amount="+amt);
		}
	}
	
	public void checkBalance()
	{
		System.out.println("main balance="+amt);
	}
	
	public void display()
	{
		System.out.println("user account no.="+acc+"\nuser name="+name+"\nuser amount="+amt);
	}
}





public class TestAccount {

	public static void main(String[] args)
	{
       Account a1=new Account();
       
       a1.insert(111,"zaid",100000);
       a1.display();
       a1.withdraw(50000);
       a1.checkBalance();
       a1.display();
       a1.deposit(50000);
       a1.display();
       a1.withdraw(100000);
       a1.withdraw(2);
       a1.display();
       
	}

}
