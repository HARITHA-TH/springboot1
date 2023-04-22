package com.UST.employeeApplication.controller;


import com.UST.employeeApplication.entity.Employee;
import com.UST.employeeApplication.service.empService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class empController {
    @Autowired
    private empService empservice;
    @PostMapping("/a")
    public Employee addEmployee(@RequestBody Employee employee) {
        return empservice.createEmployee(employee);
    }
    @GetMapping ("/e")
    public List<Employee> getAllEmployee(){
        return empservice.getEmployees();
    }

    @GetMapping("/e/{empId}")
    public Employee getByEmployeeId(@PathVariable String empId){ return empservice.getByEmployeeId(empId);}

    @Transactional
    @DeleteMapping("/d/{empId}")
    public String deleteById(@PathVariable String empId){
        empservice.deleteById(empId);
        return "Its deleted";
    }

}
