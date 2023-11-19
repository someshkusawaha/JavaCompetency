package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstAndLastOccurTest {

	@InjectMocks
	FirstAndLastOccur firstAndLastOccur;
	
	@Test
	void firstAndLastOccurSuccessTest(){
		Integer[] input = { 1, 3, 3, 4 };
		String response = null;
		response = firstAndLastOccur.firstAndLastOccur(input, 3);
		assertEquals("1 2",response);
		
		Integer[] input1 = { 1, 2, 3, 4 };
		response = firstAndLastOccur.firstAndLastOccur(input1, 5);
		assertEquals("-1",response);
	}
}
