package org.jsp.NSirHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "alian_table")
public class Alian {
	@Id
	private int aid;
	private AlianName aname;
	
	
	
	//@Column(name = "alian_name")
	private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	@Override
	public String toString() {
		return "Alian [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	
	public AlianName getAname() {
		return aname;
	}
	public void setAname(AlianName aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
