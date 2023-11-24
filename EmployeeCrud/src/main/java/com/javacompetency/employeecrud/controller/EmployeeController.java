package com.javacompetency.employeecrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javacompetency.employeecrud.model.Employee;
import com.javacompetency.employeecrud.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empservice;
	
	@GetMapping("/getEmp")
	public Employee getEmployee(@RequestParam Long id) {
		return empservice.getEmployee(id); 
	}
	
	@PostMapping("/addEmp")
	public Employee addEmployee(@RequestBody Employee emp) {
		Employee empp = empservice.addEmployee(emp);
		System.out.println(empp);
		return empp; 
	}
	
}
