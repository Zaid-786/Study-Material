package com.java_8_features_demo2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*  in Comaparator, we can sorting by using many ways .

1)  for sorting create everytime new class with Comparator interface.

2)  for sorting by using anonymous method

3)  for sorting by using lambda expression

*/

public class BookService {

	public List<Book> getBooks_1() 
	{
		List<Book> books = new BookDAO().getAllBook_1();
//second way by using Annonymous Method 
		Collections.sort(books, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stud

				return o1.getId() - o2.getId();
			}

		});

		return books;
	}

	
	
	
	
	
	
	
	public List<Book> getBooks_2() 
	{
		List<Book> books2 = new BookDAO().getAllBook_2();
// Third way by using Lambda Expression
		Collections.sort(books2, (o1,o2) ->  o1.getName().compareTo(o2.getName()));

		return books2;
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

//		BookDAO list =new BookDAO();
//		List<Book> books=new BookDAO().getAllBook();
//		System.out.println(books);
//		
//		System.out.println("-------------------------------------------------");
//		Collections.sort(books,new Comparatorid());
//		books.forEach(i-> System.out.println(i));

		BookService bs = new BookService();

//		System.out.println(bs.getBooks());
		System.out.println();
		System.out.println("----by using Comparator anonymous method sorting -------");
		for (Object i : bs.getBooks_1()) {
			System.out.println(i);
		}

		
		System.out.println();
		System.out.println("----by using Comparator Lambda Expression sorting -------");
		for (Object i : bs.getBooks_2()) {
			System.out.println(i);
		}		
		
		
	}
}



// this is lambda expression to sorting two object properties
//( o1,  o2) ->  o1.getName().compareTo(o2.getName()); 