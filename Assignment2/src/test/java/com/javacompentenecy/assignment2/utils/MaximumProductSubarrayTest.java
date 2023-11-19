package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MaximumProductSubarrayTest {
	
	@InjectMocks
	MaximumProductSubarray maximumProductSubarray;
	
	@Test
	void maxProductSubarraySuccessTest() {
		int response =0 ;
		
		Integer[] input = { 5,2,4,3,5,6 };
		response = maximumProductSubarray.maxProductSubarray(input);
		assertEquals(3600,response);
	}

}
