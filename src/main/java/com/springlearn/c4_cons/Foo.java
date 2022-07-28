package com.springlearn.c4_cons;

public class Foo {
	
	private int id;
	private String name;
	private Boo bo;
	public Foo(int id, String name, Boo bo) {
		super();
		this.id = id;
		this.name = name;
		this.bo = bo;
	}
	public Foo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		if(bo==null)
		return "Foo [id=" + id + ", name=" + name +  "]";
		else
		return "Foo [id=" + id + ", name=" + name + ", bo=" + bo.toString() + "]";
	}
	

}
