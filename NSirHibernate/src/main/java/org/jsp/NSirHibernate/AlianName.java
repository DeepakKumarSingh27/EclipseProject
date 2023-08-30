package org.jsp.NSirHibernate;

import javax.persistence.Embeddable;

@Embeddable
public class AlianName {
	private String fname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	private String mname;
	private String lname;
	@Override
	public String toString() {
		return "AlianName [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}

}
