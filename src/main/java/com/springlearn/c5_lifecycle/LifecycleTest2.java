package com.springlearn.c5_lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifecycleTest2 implements InitializingBean, DisposableBean {
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

	
	public void destroy() throws Exception {
		
		System.out.println("destroy2 method");
		
	}

	public void afterPropertiesSet() throws Exception {
	
		System.out.println("init2 method");
	}

	
	

}
