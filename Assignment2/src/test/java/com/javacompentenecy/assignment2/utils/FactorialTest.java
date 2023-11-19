package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FactorialTest {

	@InjectMocks
	Factorial factorial;
	
	@Test
	void factorialSuccessTest(){
		int response;
		response = factorial.factorial(5);
		assertEquals(120,response);
		
		response = factorial.factorial(4);
		assertEquals(24,response);
	}
}
