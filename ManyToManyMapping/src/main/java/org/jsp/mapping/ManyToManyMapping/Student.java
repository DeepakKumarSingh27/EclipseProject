package org.jsp.mapping.ManyToManyMapping;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Student {
	@Id
	private int sId;
	private String sName;
	private long sContact;
	@ManyToMany(mappedBy = "students")
	private List<Book> books=new ArrayList<Book>();
	
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public long getsContact() {
		return sContact;
	}

	public void setsContact(long sContact) {
		this.sContact = sContact;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sContact=" + sContact + "]";
	}

	
	
}
