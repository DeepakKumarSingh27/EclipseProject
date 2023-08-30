package EaharLazy;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String lname;

@ManyToOne
private Alian alian;





	
	
	public Alian getAlian() {
	return alian;
}
public void setAlian(Alian alian) {
	this.alian = alian;
}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", alian=" + alian + "]";
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
}
