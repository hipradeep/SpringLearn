package com.springlearn.c6_autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// C6
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springlearn/c6_autowire/config.xml");

		Office f1 = (Office) context.getBean("office");

		System.out.println(f1.getAddress().toString());
	}
}
