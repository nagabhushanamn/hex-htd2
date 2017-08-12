package com.app.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeID implements Serializable {

	private int empID;
	private String depID;

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getDepID() {
		return depID;
	}

	public void setDepID(String depID) {
		this.depID = depID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((depID == null) ? 0 : depID.hashCode());
		result = prime * result + empID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeID other = (EmployeeID) obj;
		if (depID == null) {
			if (other.depID != null)
				return false;
		} else if (!depID.equals(other.depID))
			return false;
		if (empID != other.empID)
			return false;
		return true;
	}

}
