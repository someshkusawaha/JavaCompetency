package com.javacompentenecy.assignment2.utils;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NthFibonacciNumberTest {
	
	@InjectMocks
	NthFibonacciNumber nthFibonacciNumber;
	
	@Test
    void nthFibonacciNumberSuccessTest() {
		int response = nthFibonacciNumber.nthFibonacciNumber(8);
		
		assertEquals(21,response);
	}

}
