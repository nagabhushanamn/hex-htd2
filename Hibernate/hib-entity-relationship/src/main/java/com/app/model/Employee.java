package com.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

	@Id
	private int id;
	private String name;

	@ManyToOne
	// @JoinColumn(name = "dep_id")
	@JoinTable(name = "DEP_EMPLOYEES", joinColumns = @JoinColumn(name = "e_id"), inverseJoinColumns = @JoinColumn(name = "dep_id"))
	private Department department;

	@ManyToMany
	private List<Project> projects;

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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
