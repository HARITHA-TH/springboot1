package com.UST.employeeApplication.service;

import com.UST.employeeApplication.entity.Employee;
import com.UST.employeeApplication.repository.empRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class empService {
    @Autowired
    private empRepo repo;



    public Employee createEmployee(Employee employee) {
        return repo.save(employee);
    }

    public List<Employee> getEmployees() {
        // TODO Auto-generated method stub
        return repo.findAll();
    }

    public Employee getByEmployeeId(String empId) {
        // TODO Auto-generated method stub
        return repo.findByempId(empId);
    }

//    public  String deleteEmployeeById(String id) {
//        repo.deleteEmployeeById(id);
//        return "the employee information is deleted";
//    }


    public String deleteById(String empId) {
        return repo.deleteByEmpId(empId);
    }
}
