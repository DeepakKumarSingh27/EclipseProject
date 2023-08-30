package com.org.jsp.hibernate.mapping.ManyToManyEmp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int eId;
	private String eName;
	private String eDept;
	private String Team;
	@ManyToMany(mappedBy = "employees",fetch = FetchType.EAGER)
	private List<Projects> projects=new ArrayList<Projects>();
	

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteDept() {
		return eDept;
	}

	public void seteDept(String eDept) {
		this.eDept = eDept;
	}

	public String getTeam() {
		return Team;
	}

	public void setTeam(String Team) {
		this.Team = Team;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eDept=" + eDept + ", Team=" + Team + "]";
	}

}
