package com.springlearn;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springlearn.c1_2.C2_Persion;
import com.springlearn.c3_ref.First;
import com.springlearn.c3_ref.Second;
import com.springlearn.c4_cons.Foo;
import com.springlearn.c5_lifecycle.LifecycleTest;
import com.springlearn.c5_lifecycle.LifecycleTest2;
import com.springlearn.c6_autowire.Office;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// C5
		/*
		 * AbstractApplicationContext context = new ClassPathXmlApplicationContext(
		 * "com/springlearn/c5_lifecycle/config.xml");
		 * 
		 * LifecycleTest f1 = (LifecycleTest) context.getBean("lifecycle");
		 * 
		 * System.out.println(f1.getName());
		 * 
		 * context.registerShutdownHook(); // this will initiate destroy methos
		 * 
		 * System.out.println("------------------"); LifecycleTest2 f2 =
		 * (LifecycleTest2) context.getBean("lifecycle2");
		 * 
		 * System.out.println(f2.getName());
		 */

		// Note: lifecycle ko check kare ke liye @Anotation @PostConstruc and
		// @PreDestroy bhi h but vo Below java8 hai, search and try

		// C4
		
		  ApplicationContext context = new
		  ClassPathXmlApplicationContext("com/springlearn/c4_cons/config.xml");
		  
		  Foo f1 = (Foo) context.getBean("foo");
		  
		  System.out.println(f1.toString());
		  
		  Foo f2 = (Foo) context.getBean("foo1");
		  
		  System.out.println(f2.toString());
		 

		// C3
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("com/springlearn/c3_ref/c3_config.xml");
		 * 
		 * First f1 = (First) context.getBean("first1");
		 * 
		 * System.out.println(f1.getId());
		 * 
		 * Second sec=(Second)f1.getSec();
		 * 
		 * System.out.println(sec.getName()); System.out.println(sec.getPhone());
		 */

		// C2
		
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("com/springlearn/c1_2/c2_config.xml");
		 * C2_Persion p1 = (C2_Persion) context.getBean("persion2");
		 * 
		 * System.out.println("Name - " + p1.getpName());
		 * 
		 * System.out.println("Phone List "); List<String> l1 = p1.getPhone();
		 * 
		 * for (String s1 : l1) { System.out.println(s1); }
		 * 
		 * System.out.println("Address Set "); Set<String> s2 = p1.getAddress();
		 * 
		 * for (String s : s2) { System.out.println(s); }
		 * 
		 * System.out.println("Mark Map "); Map<String, String> m = p1.getMark();
		 * 
		 * for (Map.Entry<String, String> entry : m.entrySet())
		 * System.out.println("Key = " + entry.getKey() + ", Value = " +
		 * entry.getValue());
		 */
		  
		 
		// C1
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("c1_config.xml"); C1_Student s1= (C1_Student)
		 * context.getBean("student1");
		 * 
		 * System.out.println(s1.toString());
		 * 
		 * s1.setStudentId("5656"); System.out.println(s1.toString());
		 * 
		 * C1_Student s2= (C1_Student) context.getBean("student2");
		 * System.out.println(s2.toString());
		 * 
		 * //using Schema/p C1_Student s3= (C1_Student) context.getBean("student3");
		 * System.out.println(s3.toString());
		 */

	}
}
