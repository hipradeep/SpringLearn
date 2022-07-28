package com.springlearn.c10_orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springlearn.dao_orm.StudentDao;
import com.springlearn.entity_orm.Student;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springlearn/c10_orm/config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		Student student = new Student(1012, "kake22", "lucknow");
		Student student1 = new Student(1013, "pol", "yutr");
		Student student2 = new Student(1014, "ytr", "hgyt");

		try {
			//int r = studentDao.insert(student);
			//int r1 = studentDao.insert(student1);
			//int r2 = studentDao.insert(student2);
			//studentDao.update(student);
			//studentDao.delete(1012);
			//System.out.println("done " );
			
			
			List<Student> students=studentDao.getAllStudent();
			
			for (Student s : students) {
				System.out.println( s);
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
