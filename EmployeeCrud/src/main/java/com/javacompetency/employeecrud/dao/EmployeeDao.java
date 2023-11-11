package com.javacompetency.employeecrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javacompetency.employeecrud.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
