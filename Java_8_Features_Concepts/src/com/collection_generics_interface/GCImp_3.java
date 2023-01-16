package com.collection_generics_interface;

//whenever you are implemeting generic inteface and class also has generic class and in this class has many type parameters then you should also add type parameter of generic interfcae within generics class

public class GCImp_3<K, E> implements GInterface_3<E> {

	private K k;
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

	
	public K getK() {
		return k;
	}

	public void setK(K k) {
		this.k = k;
	}


}
