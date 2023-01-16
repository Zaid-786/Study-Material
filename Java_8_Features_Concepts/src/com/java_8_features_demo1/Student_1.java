package com.java_8_features_demo1;


public class Student_1 {

	private int id;
	private String name;
	private String add;
	
	
	public Student_1(int id, String name, String add) {
		this.id = id;
		this.name = name;
		this.add = add;
	}

	
	public Student_1()
	{
		
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


	public String getAdd() {
		return add;
	}


	public void setAdd(String add) {
		this.add = add;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
	}




// below compareTo() method in Comparable Interface for single sorting logic 
//	@Override
//	public int compareTo(Student o) {
//
//		return this.id-o.id;
//		
////		return this.name.compareTo(o.name);
//	}
	
	
	
}
