package org.jsp.hibernate_demo1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_details")
public class Employee {
	@Id
	private int Empid;
	private String Empname;
	private int Empsalary;
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public int getEmpsalary() {
		return Empsalary;
	}
	public void setEmpsalary(int empsalary) {
		Empsalary = empsalary;
	}
}
