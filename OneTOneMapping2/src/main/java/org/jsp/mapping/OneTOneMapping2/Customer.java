package org.jsp.mapping.OneTOneMapping2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	private int cid;
	private String cname;
	private long cContact;

	@OneToOne
	private Product pro;
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cContact=" + cContact + ", pro=" + pro + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getcContact() {
		return cContact;
	}
	public void setcContact(long cContact) {
		this.cContact = cContact;
	}



}
