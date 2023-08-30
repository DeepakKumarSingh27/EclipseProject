package org.jspLevel1OneToOneMapping.Level1OneToOneMapping2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Food {
	@Id
	private int fCode;
	private String fName;
	private double fPrice;
	@ManyToOne
	private Restaurant restaurant;
	
	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public int getfCode() {
		return fCode;
	}

	public void setfCode(int fCode) {
		this.fCode = fCode;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public double getfPrice() {
		return fPrice;
	}

	public void setfPrice(double fPrice) {
		this.fPrice = fPrice;
	}

	@Override
	public String toString() {
		return "Food [fCode=" + fCode + ", fName=" + fName + ", fPrice=" + fPrice + "]";
	}

	

}