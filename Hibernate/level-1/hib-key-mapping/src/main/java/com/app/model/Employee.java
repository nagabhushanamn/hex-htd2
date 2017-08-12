package com.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EMPLOYEES", schema = "em")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE,generator="my")
	@TableGenerator(name="my",
					table="MY_PK_TABLE",
					initialValue=0,
					allocationSize=1,
				    pkColumnName="MY_PK",
				    pkColumnValue="EMP") 
	private int id;
	private String name;

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
