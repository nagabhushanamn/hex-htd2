package com.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int id;
	private String name;
	
	@ManyToMany
	private List<Employee> employees=new ArrayList<Employee>();

}
