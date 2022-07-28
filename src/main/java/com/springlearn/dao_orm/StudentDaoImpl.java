package com.springlearn.dao_orm;

import java.sql.ResultSet;
import org.springframework.orm.hibernate5.HibernateTemplate;
import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springlearn.entity_orm.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Student student) {
		// insert query
		Integer result = (Integer) this.hibernateTemplate.save(student);
		return result;
	}

	@Transactional
	public void update(Student student) {
		// update query

		this.hibernateTemplate.update(student);
	}
	@Transactional
	public void delete(int id) {
		// delete query
		Student student = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);

	}

	public Student getStudent(int id) {
		// select single data(object) by id
		Student student = this.hibernateTemplate.get(Student.class, id);
		return student;

	}

	public List<Student> getAllStudent() {
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}

}
