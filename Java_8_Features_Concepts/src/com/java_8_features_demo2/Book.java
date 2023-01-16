package com.java_8_features_demo2;




public class Book {

	private int id;
	private String name;
	private int  pasages;
	
	
	public Book() { } ;
	
	
	public Book(int id, String name, int pasages) {
		super();
		this.id = id;
		this.name = name;
		this.pasages = pasages;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPasages() {
		return pasages;
	}

	public void setPasages(int pasages) {
		this.pasages = pasages;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", pasages=" + pasages + "]";
	}
	
	
	
	
	
	
}
