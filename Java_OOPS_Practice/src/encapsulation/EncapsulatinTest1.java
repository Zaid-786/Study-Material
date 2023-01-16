package encapsulation;

//To write a program for encapsulation example

/*lets see the simple example of encapsulation that has only one field
 * with its setter and getter method*/

class Student10
{
	private String name;			//this is private instance variable
	
	public String getName()			//this is getter of name and which return of value of name
	{
		return name;
	}
	
	public void setName(String name)	//this is setter of name and which set of value of name
	{
		this.name=name;
	}	
	
}


public class EncapsulatinTest1
{
	public static void main(String[] args)
	{
			Student10 z=new Student10();
			
			z.setName("zaid");
			
			System.out.println(z.getName());
			
	}

}
