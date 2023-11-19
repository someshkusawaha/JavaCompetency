package com.javacompentenecy.assignment2.utils;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NthFibonacciSeriesTest {
	
	@InjectMocks
	NthFibonacciSeries nthFibonacciSeries;
	
	@Test
	public void nthFibonacciSeriesSuccessTest() {
		List<Integer> response = nthFibonacciSeries.nthFibonacciSeries(5);
		assertNotNull(response);
	}

}
