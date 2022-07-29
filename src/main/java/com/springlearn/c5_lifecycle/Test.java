package com.springlearn.c5_lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// C5

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springlearn/c5_lifecycle/config.xml");

		LifecycleTest f1 = (LifecycleTest) context.getBean("lifecycle");

		System.out.println(f1.getName());

		context.registerShutdownHook(); // this will initiate destroy method

		System.out.println("------------------");
		LifecycleTest2 f2 = (LifecycleTest2) context.getBean("lifecycle2");

		System.out.println(f2.getName());

		// Note: lifecycle ko check kare ke liye @Anotation @PostConstruc and
		// @PreDestroy bhi h but vo Below java8 hai, search and try
	}
}
