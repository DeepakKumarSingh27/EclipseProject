package EaharLazy;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

public class Alian {
	private int aid;
	private String aname;
	
	@OneToMany(mappedBy = "alian",fetch = FetchType.EAGER)
	
	private Collection<Laptop> laps = new ArrayList<>();
	
	
	
	
	public Collection<Laptop> getLaps() {
		return laps;
	}
	public void setLaps(Collection<Laptop> laps) {
		this.laps = laps;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	@Override
	public String toString() {
		return "Alian [aid=" + aid + ", aname=" + aname + ", laps=" + laps + "]";
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	

}
