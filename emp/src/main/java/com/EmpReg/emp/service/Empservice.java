package com.EmpReg.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmpReg.emp.model.Empdetails;
import com.EmpReg.emp.repository.EmpRepo;

@Service
public class Empservice {
	
	@Autowired
	private EmpRepo repo;
	public Empdetails createemp(Empdetails emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	public List<Empdetails> getEmp() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Empdetails getEmpById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	public Empdetails getupdate(Empdetails emp) {
		// TODO Auto-generated method stube
		Empdetails oldemp=null;
		Optional<Empdetails>optionalemp=repo.findById(emp.getId());
		if(optionalemp.isPresent()) {
			oldemp=optionalemp.get();
			oldemp.setEmail(emp.getEmail());
			oldemp.setDomain(emp.getDomain());
			oldemp.setExperience(emp.getExperience());
			repo.save(oldemp);
			
		}
		else {
			return new Empdetails();
		}
		return oldemp;
	}

	public String deleteemp(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "deleted succesfully";
	}

}
