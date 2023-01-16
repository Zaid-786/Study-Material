package com.collection_generics_concept_demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


// generics  example 1 

public class GenericsBenefitsTest1 {

	public static void main(String[] args)
	{
		
		List list= new ArrayList();
		
		list.add("x");
		list.add("y");
		list.add(new Integer(1000));
		
		
// read element from the list by using foreach loop 	
//		for(Object i:list)
//		{
//			System.out.println(i);
//		}

		
// read element from the list by using Itrator interface loop 	
		Iterator <String> i= list.iterator();							// we cant stored diffent type data into generic type parameter because we specified type parameter 
		while(i.hasNext())
		{
			String data= i.next();
			System.out.println(data);
		}
	
		
// OUTPUT :- 
//		Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
//		at com.collection_generics_concept_demo.GenericsBenefitsTest1.main(GenericsBenefitsTest1.java:32)

		
		
	}

}



/* what is generics in java ?
		
generics in java enable you to specify type parameters when defining classes , interfaces and methods .	

for example:-  when you say List<T> that means a list which will store elements of type T.
               since you have specified a type parameter so this List interface is generic and T is the type parameter which specifies the type of element stored in the List .



=>  type parameter  naming  conventions 

by convention, generic type parameter names are single , upper case letter. that helps in distinguishing between type parameters and normal variables.
 
the most commonly used type parameter names are :

E - Element
K - key
N - Number 
T - Type 
V - Value

]
S,U,V etc. -2nd,3rd,4th types.



=> benefits of generics in java:-
1) stronger type checks at compile-time
2) casting is not required 
3) enabling programmers to implement generic algorithms


=> points remember :- 
1. generics in java provide type safety as there are strong type checks at compile-time.
2. generics dont work with primitive types, type arguments passed to the type parameters must be references.
3. you can have generic classes, generics methods and generics interfaces.
4. type parameters are erased when generic classes are compiled.
5. a generic class with type parameters cant have static members using the type parameters. 


*/