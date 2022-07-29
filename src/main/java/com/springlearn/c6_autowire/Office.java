package com.springlearn.c6_autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Office {
	//using properties injection
	@Autowired
	@Qualifier("address1")  //this for mention bean name
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
	
	/*
	 * Using Xml
	 * We have to create 'address' object here, by autowire,
	 * Using @Autowire, 
	 * we use this @Autowire on the Object, setter method or on the constructor
	 * @Qualifier("office") on properties,   if there is multiple bean available ioc, this will help to autowire particular bean
	 * */
	
}


