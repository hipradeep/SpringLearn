package com.springlearn.dao;

import java.util.List;

import com.springlearn.entity.Student;

public interface StudentDao {

	public int insert(Student student);

	public int update(Student student);

	public int delete(int id);

	public Student getStudent(int id);

	public List<Student> getAllStudent();

}
