package com.java_8_features_demo2;

import java.util.Comparator;

public class Comparatorid implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}

	

}
