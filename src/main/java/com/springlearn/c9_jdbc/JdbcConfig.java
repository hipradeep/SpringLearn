package com.springlearn.c9_jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.springlearn.dao.StudentDao;
import com.springlearn.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = "com.springlearn.dao")
public class JdbcConfig {

	
	@Bean(name = { "ds" })
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springlearn");
		ds.setUsername("root");
		ds.setPassword("1234");
		return ds;
	}


	@Bean(name = { "jdbcTemp" })
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}

	/* if you want to use this manual studentDao, remove annotation  '@Component("studentDao")'
	 * and '@Autowire'  from  'StudentDaoImpl.java', '@ComponentScan' from JdbcConfig class
	@Bean(name = { "studentDao" })
	public StudentDao getStudentDao() {
		StudentDaoImpl studentDao = new StudentDaoImpl();
		studentDao.setJdbcTemplate(getTemplate()); //this is "jdbcTemp"
		return studentDao;
	}
	
	*/
}
