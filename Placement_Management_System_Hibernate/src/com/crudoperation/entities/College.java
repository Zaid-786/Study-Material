package com.crudoperation.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "college")
public class College implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CollegeId")
	private long collegeId;

	@Column(name = "collegeName")
	private String collegeName;

	@Column(name = "collegelocation")
	private String location;

// association(OneToOne Uni-directional Mapping) between College class and User class 
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "User_id")
	private User userid;

	@OneToMany(mappedBy = "collegeid", orphanRemoval = true, cascade = CascadeType.PERSIST)
	private List<Student> student;

	@OneToMany(mappedBy = "collegeid", orphanRemoval = true, cascade = CascadeType.PERSIST)
	private List<Placement> placement;

	@OneToMany(mappedBy = "collegeid")
	private List<Certificate> certificate;

	public College() {

	}

	public College(long collegeId, String collegeName, String location, User userid) {

		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.location = location;
		this.userid = userid;
	}

	public long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(long collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public User getUserid() {
		return userid;
	}

	public void setUserid(User userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", location=" + location
				+ ", userid=" + userid + "]";
	}

}
