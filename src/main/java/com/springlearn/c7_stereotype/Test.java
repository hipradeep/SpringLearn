package com.springlearn.c7_stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		// C7
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springlearn/c7_stereotype/config.xml");

		//StudentNew s1 = (StudentNew) context.getBean("studentNew", StudentNew.class); //default name created by IoC
		StudentNew s1 = (StudentNew) context.getBean("StudentNew1", StudentNew.class);
		
		StudentNew s2= (StudentNew) context.getBean("StudentNew1", StudentNew.class);

		System.out.println(s1);
		
		System.out.println("S1");
		System.out.println(s1.hashCode());
		System.out.println("S2");
		System.out.println(s2.hashCode());
	}

	}


