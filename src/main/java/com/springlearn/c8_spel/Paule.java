package com.springlearn.c8_spel;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("poule")
@Scope("prototype") // by default Singleton type
public class Paule {
	@Value("#{2000+12}")
	private String salary;
	@Value("#{30*20}")
	private String distance;
	
	
	//@Value("pradeep")
	@Value("#{new java.lang.String('pradeep maurya')}")  //passing obj
	private String name;
	
	
	
	@Value("#{T(java.lang.Math).sqrt(144)}")  //passing static method, sqrt is static in Math
	private double value;
	
	
	//@Value("true")
	@Value("#{3<2}")   //boolean value
	private boolean isTrue;

	public Paule(String salary, String distance, String name, double value) {
		super();
		this.salary = salary;
		this.distance = distance;
		this.name = name;
		this.value = value;
	}

	public Paule() {
		super();
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Paule [salary=" + salary + ", distance=" + distance + ", name=" + name + ", value=" + value
				+ ", isTrue=" + isTrue + "]";
	}

	



}
