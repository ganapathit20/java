package com.jpa.springboot.jpa.repo;

import org.springframework.stereotype.Repository;

import com.jpa.springboot.model.Emp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class JPARepo{
	
	@PersistenceContext
	EntityManager entityMang;
	
	public void insert(Emp emp) {
		
		entityMang.merge(emp);
		
	}
	
	

}
