package com.EmpReg.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmpReg.emp.model.Empdetails;
import com.EmpReg.emp.service.Empservice;

@RestController
@RequestMapping("/registration")
@CrossOrigin("*")
public class Empcontroller {
	
	
	@Autowired
	private Empservice service;
	
	@PostMapping("/addetails")
	public Empdetails addEmp(@RequestBody Empdetails emp) {
		return service.createemp(emp);
	}
	
	@GetMapping("/emp")
	public List<Empdetails> getEmp(){
		return service.getEmp();
	}
	
	@GetMapping("/emp/{id}")
	public Empdetails showemp(@PathVariable int id) {
		return service.getEmpById(id);
	}
	
	@PutMapping("/update/{id}")
	public Empdetails updateemp(@RequestBody Empdetails emp) {
		return service.getupdate(emp);
	}
	
	@DeleteMapping("/delete/{id}")
		public String deleteemp(@PathVariable int id) {
			return service.deleteemp(id);
		}
	}

