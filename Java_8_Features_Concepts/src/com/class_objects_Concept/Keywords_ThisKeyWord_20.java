package com.class_objects_Concept;


//what is this keyword ?

/* in java, " this " keyword is the reference variable that refers to the current Object .*/

//there are many usage of this keyword but we focus on few important usage.



class ThisKeyWord_Demo{
	
	int i;
	
	void setValue(int i)
	{
		this.i=i;
	}
	
	void show()
	{
		System.out.println(i);
	}
	
}



public class Keywords_ThisKeyWord_20 {

	public static void main(String[] args) 
	{
		ThisKeyWord_Demo d1=new ThisKeyWord_Demo();
		
		d1.setValue(100);
		d1.show();
	}

}
