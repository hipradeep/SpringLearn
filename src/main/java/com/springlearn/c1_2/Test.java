package com.springlearn.c1_2;

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

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springlearn/c1_2/c2_config.xml");
		C2_Persion p1 = (C2_Persion) context.getBean("persion2");

		System.out.println("Name - " + p1.getpName());

		System.out.println("Phone List ");
		List<String> l1 = p1.getPhone();

		for (String s1 : l1) {
			System.out.println(s1);
		}

		System.out.println("Address Set ");
		Set<String> s2 = p1.getAddress();

		for (String s : s2) {
			System.out.println(s);
		}

		System.out.println("Mark Map ");
		Map<String, String> m = p1.getMark();

		for (Map.Entry<String, String> entry : m.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

		
		System.out.println("Props");
		System.out.println(p1.getProps());
		
	}

}
