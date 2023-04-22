package com.UST.employeeApplication.repository;

import com.UST.employeeApplication.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface empRepo extends JpaRepository<Employee,Integer> {
    Employee findByempId(String empId);

//    void deleteEmployeeById(String id);

    String deleteByEmpId(String empId);
}
