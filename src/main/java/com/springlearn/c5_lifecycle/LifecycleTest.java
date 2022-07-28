package com.springlearn.c5_lifecycle;

public class LifecycleTest {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setter Method");
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "LifecycleTest [name=" + name + "]";
	}

	//we can change the name of this init/destroy name method, but make same as in config.xml
	public void init() {
		System.out.println("init method");
	}
	public void destroy() {
		System.out.println("destroy method");
	}

}
