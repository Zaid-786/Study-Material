package com.collection_generics_concept_demo;


public class Generic_Class_Example2<K, V> {

	private K key;
	private V value;

	public Generic_Class_Example2(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

}
