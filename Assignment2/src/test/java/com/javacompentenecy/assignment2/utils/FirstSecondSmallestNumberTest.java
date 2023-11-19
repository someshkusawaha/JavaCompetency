package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstSecondSmallestNumberTest {

	@InjectMocks
	FirstSecondSmallestNumber firstSecondSmallestNumber;
	
	@Test
	void firstSecondSmallestNoSuccessTest(){
		Integer[] input = { 5,2,4,3,5,6 };
		String response = null;
		response = firstSecondSmallestNumber.firstSecondSmallestNo(input);
		assertEquals("{-1,-1}",response);
		
		Integer[] input1 = { 6,1,2,1,3,6,7 };
		response = firstSecondSmallestNumber.firstSecondSmallestNo(input1);
		assertEquals("{-1,-1}",response);
	}
}
