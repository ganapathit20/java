package com.jpa.springboot.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jpa.springboot.model.Emp;

@Repository
public class JDBCRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String Create_Table = 
			"""
			CREATE TABLE emp (
			id int not null,
			name varchar(255) not null,
			primary key(id)
			);
			""";
	
	private static String INSERT_QUERY = 
			"""
			insert into emp(id, name) values (?,?);
				""";
	
	private static String SELECT_QUERY = 
			"""
			select * from emp where id = ?;
				""";
	
	public void createTable() {
		jdbcTemplate.update(Create_Table);
	}
	
	public void insert(Emp emp) {
		
		jdbcTemplate.update(INSERT_QUERY, emp.getId(), emp.getName());
		
	}
	
	public Emp getEmp(int id) {
		return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Emp.class),id);
		
	}

}
