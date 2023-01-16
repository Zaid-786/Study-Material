package crudoperation.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;







@Entity
@Table(name="Student_Details")



public class Student {



	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)			//generated value automatically of studentId
	private int studentId;
	
	@Column(name="stdName")
	private String studentName;
	
	@Column(name="stdMarks")
	private double studentMarks;
	
	
	
	public Student()
	{
		
	}
	
	
	
	public Student(int studentId, String studentName, double studentMarks)
	{
	
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}


	
	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public double getStudentMarks() {
		return studentMarks;
	}


	public void setStudentMarks(double studentMarks) {
		this.studentMarks = studentMarks;
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ "]";
	}

	
	
	
	
}
