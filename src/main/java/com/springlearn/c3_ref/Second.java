package com.springlearn.c3_ref;

public class Second {
	private String name;
	private String phone;
	@Override
	public String toString() {
		return "Second [name=" + name + ", phone=" + phone + "]";
	}
	public Second() {
		super();
	}
	public Second(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
