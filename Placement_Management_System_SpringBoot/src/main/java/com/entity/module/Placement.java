package com.entity.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 

@Entity
public class Placement {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String college;
    private Integer data;
    private String name;
    private String  qualification;
    private String year;
    
    public  Placement() {
    }
 
    public  Placement(Integer id,String college,Integer data, String name ,String qualification,String year) {
       
        this.college = college;
        this.data = data;
        this.name  = name ;
        this.qualification = qualification;
        this.year = year;
    }
 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Placement [id=" + id + ", college=" + college + ", data=" + data + ", name=" + name + ", qualification="
				+ qualification + ", year=" + year + "]";
	}
	
 
   
}




