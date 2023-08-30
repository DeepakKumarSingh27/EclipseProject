package com.org.jsp.hibernate.mapping.ManyToManyEmp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Projects {
	@Id
	private int pId;
	private String pName;
	private String Team;
	@ManyToMany
	private List<Employee> employees=new ArrayList<Employee>();
	

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getTeam() {
		return Team;
	}

	public void setTeam(String Team) {
		this.Team = Team;
	}

	@Override
	public String toString() {
		return "Projects [pId=" + pId + ", pName=" + pName + ", Team=" + Team + "]";
	}
	
	

}
