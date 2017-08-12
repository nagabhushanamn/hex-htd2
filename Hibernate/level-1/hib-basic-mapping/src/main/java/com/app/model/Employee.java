package com.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EMPLOYEES", schema = "em")
public class Employee {

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Id
	@Column(name = "EMP_ID")
	private int id;
	@Column(name = "EMP_NAME")
	private String name;
	@Column(name = "EMP_SALARY")
	private double salary;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dob;
	@Lob
	private String empProfile;
	@Lob
	private byte[] image;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
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

}
