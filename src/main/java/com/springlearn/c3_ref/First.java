package com.springlearn.c3_ref;

public class First {
	private int id;
	private Second sec;
	@Override
	public String toString() {
		return "First [id=" + id + ", sec=" + sec + "]";
	}
	public First() {
		super();
	}
	public First(int id, Second sec) {
		super();
		this.id = id;
		this.sec = sec;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Second getSec() {
		return sec;
	}
	public void setSec(Second sec) {
		this.sec = sec;
	}

	
	
}
