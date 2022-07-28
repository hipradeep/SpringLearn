package com.springlearn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springlearn.entity.Student;

@Component("studentDao") 
public class StudentDaoImpl implements StudentDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		// insert query
		String sql_insert = "insert into student(id, name, address) values(?,?,?)";
		int result = jdbcTemplate.update(sql_insert, student.getId(), student.getName(), student.getAddress());
		return result;
	}

	public int update(Student student) {
		// update query
		String sql_update = "update student set name=?, address=? where id=?";
		int result = jdbcTemplate.update(sql_update, student.getName(), student.getAddress(), student.getId());
		return result;
	}

	public int delete(int id) {
		// delete query
		String sql_delete = "delete from student where id=?";
		int result = jdbcTemplate.update(sql_delete, id);
		return result;
	}

	public Student getStudent(int id) {
		// select single data(object) by id
		String sql_select = "select * from student where id=?";
		// RowMapper<Student> rowMapper = new RowMapperImpl();
		// Student student = jdbcTemplate.queryForObject(sql_select, rowMapper, id);
		Student student = jdbcTemplate.queryForObject(sql_select, new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setAddress(rs.getString(3));
				return student;
			}
		}, id);

		return student;
	}

	public List<Student> getAllStudent() {
		// select multiple data(object) by id
		String sql_select = "select * from student";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> students = jdbcTemplate.query(sql_select, rowMapper);
		return students;
	}

}
