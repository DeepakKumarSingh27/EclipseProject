package org.jspLevel1OneToOneMapping.Level1OneToOneMapping2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Restaurant {
	@Id
	private int rId;
	private String rName;
	private String rLocation;
	@OneToMany(mappedBy = "restaurant",fetch =  FetchType.EAGER)
	private List<Food> foods=new ArrayList<Food>();
	
	
	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public String getrLocation() {
		return rLocation;
	}

	public void setrLocation(String rLocation) {
		this.rLocation = rLocation;
	}

	@Override
	public String toString() {
		return "Restaurant [rId=" + rId + ", rName=" + rName + ", rLocation=" + rLocation + "]";
	}

	
}