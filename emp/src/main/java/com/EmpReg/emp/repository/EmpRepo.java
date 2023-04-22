package com.EmpReg.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EmpReg.emp.model.Empdetails;

@Repository
public interface EmpRepo extends JpaRepository<Empdetails,Integer> {
	
}
