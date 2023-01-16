package com.collection_generics_interface;

// whenever you are implementing any generic type parameter interface then class must be also a generic

public class GCImp_1<E> implements GInterface_1<E> {

	private E e;
	
	
	@Override
	public void setValue(E e) {
		// TODO Auto-generated method stub

		this.e=e;
	}

	@Override
	public E getValue() {
		// TODO Auto-generated method stub
		return e;
	}

	
	
}
