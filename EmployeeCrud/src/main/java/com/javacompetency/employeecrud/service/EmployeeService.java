package com.javacompetency.employeecrud.service;

import com.javacompetency.employeecrud.model.Employee;

public interface EmployeeService {

	public Employee getEmployee(Long id);

	public Employee addEmployee(Employee emp);
}
