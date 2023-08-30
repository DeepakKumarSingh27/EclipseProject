package org.jsp.mapping.OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	@Id
	private int pid;
	private String pname;
	private long pcontact;
	@OneToMany(mappedBy = "person",fetch = FetchType.EAGER)
	private List<Vehicle> vehiclelist = new ArrayList<Vehicle>();
	public int getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public long getPcontact() {
		return pcontact;
	}
	public void setPcontact(long pcontact) {
		this.pcontact = pcontact;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", pcontact=" + pcontact + ", vehiclelist=" + vehiclelist
				+ "]";
	}
	public List<Vehicle> getVehiclelist() {
		return vehiclelist;
	}
	public void setVehiclelist(List<Vehicle> vehiclelist) {
		this.vehiclelist = vehiclelist;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}


}
