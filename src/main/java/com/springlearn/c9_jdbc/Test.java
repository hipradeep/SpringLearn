package com.springlearn.c9_jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springlearn.dao.StudentDao;
import com.springlearn.entity.Student;

public class Test {

	public static void main(String[] args) {

		System.out.println("Start .......");
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/springlearn/c9_jdbc/config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		Student student = new Student();
		student.setId(200);
		student.setName("Pradee13");
		student.setAddress("KDO");

		// int result = studentDao.insert(student);
		// int result = studentDao.update(student);
		// int result = studentDao.delete(200);
		//Student std = studentDao.getStudent(14);

		//System.out.println("number of rows affected - " + std);
		//System.out.println(std);
		
		List<Student> students=studentDao.getAllStudent();
		
		for (Student s : students) {
			System.out.println( s);
		}

	}

}
