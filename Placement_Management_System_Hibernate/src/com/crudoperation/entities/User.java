package com.crudoperation.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "User")

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "User_Id")
	private long userId;

	@Column(name = "Use_Name")
	private String userName;

	@Column(name = "User_Type")
	private String userType;

	@Column(name = "User_Password")
	private String userPassword;

// association(OneToOne bi-directional Mapping) between User class and College class 
	@OneToOne(mappedBy = "userid")
	private College college;

// association(OneToOne Uni-directional Mapping) between User class and Admin class 
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Admin_ID")
	private Admin studentAdmin;

	public User() {

	}

	public User(long userId, String userName, String userType, String userPassword, College college,
			Admin studentAdmin) {
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.userPassword = userPassword;
		this.college = college;
		this.studentAdmin = studentAdmin;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Admin getStudentAdmin() {
		return studentAdmin;
	}

	public void setStudentAdmin(Admin studentAdmin) {
		this.studentAdmin = studentAdmin;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userType=" + userType + ", userPassword="
				+ userPassword + ", college=" + college + ", studentAdmin=" + studentAdmin + "]";
	}

}
