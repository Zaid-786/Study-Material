package com.crudoperation.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Certificate")
public class Certificate implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Certificate_ID")
	private int Certificate_ID;

	@Column(name = "passing_Year")
	private int passing_year;

// association(OneToOne bi-directional Mapping) between Student class and certificate class 
	@OneToOne(mappedBy = "studentCertificate")
	private Student student;

// association([ManyToOne OR OneToMany] Mapping) between Certificate class and College class 
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "College_Id")
	private College collegeid;

	public Certificate() {

	}

	public Certificate(int certificate_ID, int passing_year, Student student, College collegeid) {

		this.Certificate_ID = certificate_ID;
		this.passing_year = passing_year;
		this.student = student;
		this.collegeid = collegeid;
	}

	public int getCertificate_ID() {
		return Certificate_ID;
	}

	public void setCertificate_ID(int certificate_ID) {
		Certificate_ID = certificate_ID;
	}

	public int getPassing_year() {
		return passing_year;
	}

	public void setPassing_year(int passing_year) {
		this.passing_year = passing_year;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public College getCollege() {
		return collegeid;
	}

	public void setCollege(College collegeid) {
		this.collegeid = collegeid;
	}

	@Override
	public String toString() {
		return "Certificate [Certificate_ID=" + Certificate_ID + ", passing_year=" + passing_year + ", student="
				+ student + ", college=" + collegeid + "]";
	}

}
