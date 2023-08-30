package org.jsp.mapping.OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AadharCard {
	@Id
	private long aadharid;
	private long Contact;
	public long getAadharid() {
		return aadharid;
	}
	public void setAadharid(long aadharid) {
		this.aadharid = aadharid;
	}
	public long getContact() {
		return Contact;
	}
	public void setContact(long contact) {
		Contact = contact;
	}

}
