package com.springlearn.c6_autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Office {
	//using properties injection
	@Autowired
	@Qualifier("office")  //this for mention bean name
	private Address address;

	public Address getAddress() {
		return address;
	}

	//using setter injection
	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public Office() {
		super();
	}
	//using constructor injection
	//@Autowired
	public Office(Address address) {
		super();
		this.address = address;
	}
	

}
