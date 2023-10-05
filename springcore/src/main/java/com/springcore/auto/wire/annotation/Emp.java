package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	// 1
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	// or 2
//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setting value !!!");
	}

//	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	// or 3
//	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor !!!");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
