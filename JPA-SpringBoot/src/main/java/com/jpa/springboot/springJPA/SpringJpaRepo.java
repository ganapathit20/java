package com.jpa.springboot.springJPA;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.springboot.model.Emp;

public interface SpringJpaRepo extends JpaRepository<Emp, Integer>{

}
