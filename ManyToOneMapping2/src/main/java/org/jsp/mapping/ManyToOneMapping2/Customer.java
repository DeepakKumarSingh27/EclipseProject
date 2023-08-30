package org.jsp.mapping.ManyToOneMapping2;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Customer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

	private int cid;
	private String cname;
	@ManyToOne(cascade = CascadeType.ALL)
	private Product P;
	public Product getP() {
		return P;
	}
	public void setP(Product p) {
		P = p;
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

}
