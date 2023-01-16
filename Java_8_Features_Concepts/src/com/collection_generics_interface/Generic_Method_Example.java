package com.collection_generics_interface;


// this is example of generic method with type parameter


public class Generic_Method_Example<T> {

	private T[] arr;

	
	public Generic_Method_Example(T[] arr) {
		super();
		this.arr = arr;
	}


	public T[] getArr() {
		return arr;
	}


//	public void setArr(T[] arr) {
//		this.arr = arr;
//	}
	
	
// this is generic method 	
	public<E> void printElement(E[] arr)
	{
		for(E i:arr)
		{
			System.out.println(i);
		}
	}
	
	
	
	
}


/*
 
 Generic method :-
 
 * any method in the generic class can use the type parameter of the class so that way methods in a generic class are generic.
 
 * generic methods can add more parameters of their own. there can be generic methods even in a non-generic class.
 
 * when you are writting a generic method after the acces modifier you need to declare the type parameters then the return type.
 
 
 */