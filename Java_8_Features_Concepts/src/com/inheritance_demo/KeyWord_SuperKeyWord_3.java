package com.inheritance_demo;



//3. super keyword can be used to invoke immediate parent class Constructor.



class Animalz{
	
	Animalz()
	{
		System.out.println("this is parent class Constructor (Animalz class)");
	}
}


class Dogz extends Animalz{
	
	Dogz()
	{
//		super();
		System.out.println("this is child class Constructor (Dogz class)");

	}
	
}



public class KeyWord_SuperKeyWord_3 {

	public static void main(String[] args) {

		Dogz d1=new Dogz();
	}

}

// OUTPUT:-
//			this is parent class Constructor (Animalz class)
//			this is child class Constructor (Dogz class)





/*
  NOTE:- 
  super() is added in each Class Constructor Automatically if there is no constructor . 
  but, it also adds super() as the first statement .
  
  */


