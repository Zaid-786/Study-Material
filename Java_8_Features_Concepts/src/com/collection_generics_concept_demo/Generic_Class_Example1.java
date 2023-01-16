package com.collection_generics_concept_demo;

import java.util.List;

// this is example of generic class with type parameter T (unknown type)
public class Generic_Class_Example1<T> {

	private List<T> list;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
