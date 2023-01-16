package com.inheritance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;



@Entity								// to make any class as entity

//// FIRST-WAY :- single table inheritance...............................................................................................................................................................

	@Table(name="employee")											//step1 :- set the name of table
	@Inheritance(strategy=InheritanceType.SINGLE_TABLE)				// step2 :- (mention type of inheritance) we used to make single table inheritance concept
	@DiscriminatorColumn(name="employeeType" , discriminatorType=DiscriminatorType.STRING)			// if you want add column into single table then we used annotation (@DiscrimatorColumn(name of column,data-type of column))
	@DiscriminatorValue("Employee")									// this annotation used to type of class means which class data is added

//// .......................................................................................................................................................................................



// SECOND WAY :- Table per class Inheritance.....................................................

//	@Table(name="employee1")
//	@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

//...............................................................................................



// THIRD WAY :- Joined two table .....................................................
//	@Table(name="Employee2")
//	@Inheritance(strategy=InheritanceType.JOINED)





public class Employee implements Serializable {

	private static final long serialVersionUID=1L;
	
	@Id
	@Column(name="empID")
	private int empId;
	
	@Column(name="empName")
	private String empName;
	
	@Column(name="empSalary")
	private double empSalary;
	
	
	public Employee()
	{
		
	}
	
	public Employee(int empId,String empName, double empSalary) 
	{
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	
	
}
