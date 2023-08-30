package org.jsp.mapping.ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book {
	@Id
	private int bId;
	private String bName;
	private String bAuthor;
	@ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Student> students=new ArrayList<Student>();
	

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbAuthor() {
		return bAuthor;
	}

	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", bAuthor=" + bAuthor + ", students=" + students + "]";
	}

}

