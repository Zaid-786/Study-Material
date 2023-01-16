package com.java_8_features_demo2;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public List<Book> getAllBook_1() {
		List<Book> list1 = new ArrayList<>();

		list1.add(new Book(100, "java programming", 500));
		list1.add(new Book(50, "python programming", 300));
		list1.add(new Book(70, " BlockChain New Era", 1000));

		return list1;

	}

	public List<Book> getAllBook_2() {
		List<Book> list2 = new ArrayList<>();

		list2.add(new Book(3, "rich dad poor dad", 400));
		list2.add(new Book(8, "atomic habits ", 30));
		list2.add(new Book(6, "successful breaker", 1000));

		return list2;

	}

}
