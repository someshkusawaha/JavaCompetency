package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PrimeNumberTest {

	@InjectMocks
	PrimeNumber primeNumber;
	
	@Test
	public void primeNumberSuccessTest() {
		int response = primeNumber.primeNumber(5);
		assertEquals(1,response);
	}
}
