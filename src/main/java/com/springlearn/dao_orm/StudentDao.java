package com.springlearn.dao_orm;

import java.util.List;

import com.springlearn.entity_orm.Student;

public interface StudentDao {

	public int insert(Student student);

	public void update(Student student);

	public void delete(int id);

	public Student getStudent(int id);

	public List<Student> getAllStudent();

}
