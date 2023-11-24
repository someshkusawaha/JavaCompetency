package com.javacompetency.employeecrud.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javacompetency.employeecrud.dao.EmployeeDao;
import com.javacompetency.employeecrud.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public Employee addEmployee(Employee emp) {
		return employeeDao.save(emp);
	}

	@Override
	public Employee getEmployee(Long id) {
		Optional<Employee> emp = employeeDao.findById(id.toString());
		return emp.get();
	}

}
