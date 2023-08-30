package com.springcore.lifecycle;

public class Samousa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Samousa() {
		super();
	}

	@Override
	public String toString() {
		return "Samousa [price=" + price + "]";
	}
	public void init()
	{
		System.out.println("Inside init method"); 
	}
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}
}
