package com.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

//Single Table inheritance
@DiscriminatorValue("Manager")


// Join Table Inheritance
//@Table(name="Manager2")

public class Manager extends Employee{

	private static final long serialVersionUID=1L;

	@Column(name="department")
	private String departmentName;

	public Manager()
	{
		
	}
	 
	public Manager(int empId,String empName, double empSalary, String departmentName)
	{
		super(empId,empName, empSalary);
		this.departmentName = departmentName;
	}

	
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
	
	
	
}
