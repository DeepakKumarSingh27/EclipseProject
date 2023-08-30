package org.jsp.mapping.OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int pid;
	private String pname;
	private long contact;
	@OneToOne
	AadharCard aid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", contact=" + contact + ", aid=" + aid + "]";
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public AadharCard getAid() {
		return aid;
	}
	public void setAid(AadharCard aid) {
		this.aid = aid;
	}


}
