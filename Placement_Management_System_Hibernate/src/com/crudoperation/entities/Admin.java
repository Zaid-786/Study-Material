package com.crudoperation.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Admin")
public class Admin implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Admin_ID")
	private long adminId;

	@Column(name = "Admin_NAME")
	private String adminName;

	@Column(name = "Admin_PASSWORD")
	private String adminPassword;

// association(OneToOne bi-directional Mapping) between Admin class and User class 
	@OneToOne(mappedBy = "studentAdmin")
	private User user;

	public Admin() {

	}

	public Admin(long adminId, String adminName, String adminPassword) {

		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
	}

	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword + "]";
	}

}
