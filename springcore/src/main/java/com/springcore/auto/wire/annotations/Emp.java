package com.springcore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("temp4")
	private Address address;

	public Address getAddress() {
		return address;
	}
     //  @Autowired
	public void setAddress(Address address) {
		System.out.println("setting value");
		this.address = address;
	}
  // @Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside construcor");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
