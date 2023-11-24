package com.javacompetency.employeecrud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Employee")
public class Employee {

	@Id
	private String id;
	private String name;
	private String department;
	private Double salary;
}
