package encapsulation;

//To write a program for encapsulation example

/*lets see another example of encapsulation that has only four fields
* with its setter and getter methods*/

class Account
{
	private long acc_no;					//these are private instance variable
	private String name,emails;
	private float amount;
	
	
	public long getAcc_no()   //this is getter of acc_no and which return of value of acc_no
	{
		return acc_no;
	}
	
	public void setAcc_no(long acc_no)			//this is setter of acc_no and which set of value of acc_no
	{
		this.acc_no = acc_no;
	}
	
	public String getName()						//this is getter of name and which return of value of name
	{
		return name;
	}
	
	public void setName(String name)			//this is setter of name and which set of value of name
	{
		this.name = name;
	}
	
	public String getEmails() 				//this is getter of emails and which return of value of emails
	{
		return emails;
	}
	
	public void setEmails(String emails)		//this is setter of emails and which set of value of emails
	{
		this.emails = emails;
	}
	
	public float getAmount()			//this is getter of amount and which return of value of amount
	{
		return amount;
	}
	
	public void setAmount(float amount)			//this is setter of amount and which set of value of amount
	{
		this.amount = amount;
	}
	
}


public class EncapsulatinTest2
{
	public static void main(String[] args)
	{
        Account t=new Account();
        
        t.setAcc_no(12345);											//set the account no. by setter method()
        System.out.println("account no of user="+t.getAcc_no());	//get the account no. by getter method()
        
        t.setName("zaid");											//set the name by setter method()
        System.out.println("name of user="+t.getName());			//get the name by getter method()

        t.setEmails("agshhd@gmail.com");							//set the emails  by setter method()
        System.out.println("emails id of user="+t.getEmails());		//get the emails by getter method()

        t.setAmount(1200.12f);										//set the amount by setter method()
        System.out.println("amount of user="+t.getAmount());		//get the amount by getter method()

	}

}
