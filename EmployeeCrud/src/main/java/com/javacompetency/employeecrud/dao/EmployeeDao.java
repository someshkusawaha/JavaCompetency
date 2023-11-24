package com.javacompetency.employeecrud.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javacompetency.employeecrud.model.Employee;

@Repository
public interface EmployeeDao extends MongoRepository<Employee, String>{

}
