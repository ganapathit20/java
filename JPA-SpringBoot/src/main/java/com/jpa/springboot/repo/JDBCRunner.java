package com.jpa.springboot.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.springboot.jpa.repo.JPARepo;
import com.jpa.springboot.model.Emp;
@Component
public class JDBCRunner implements CommandLineRunner {
	
	@Autowired
	private JDBCRepo jdbcRepo;
	
	@Autowired
	private JPARepo jpaRepo;
	@Override
	public void run(String... args) throws Exception {
		jdbcRepo.createTable();
//		jdbcRepo.insert(new Emp(1, "ganapathi"));
//		jdbcRepo.insert(new Emp(2, "gopi"));
//		jdbcRepo.insert(new Emp(3, "senthil"));
//		
//		System.out.println(jdbcRepo.getEmp(1));
		
		jpaRepo.insert(new Emp(1, "Ganapathi"));
	
	}

}
