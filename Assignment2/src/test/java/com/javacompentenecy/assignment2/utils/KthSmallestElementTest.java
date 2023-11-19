package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KthSmallestElementTest {

	@InjectMocks
	KthSmallestElement kthSmallestElement;
	
	@Test
	void kthSmallestElementSuccessTest() {
		int response=0;
		Integer[] input = { 5,2,4,3,5,6 };
		response = kthSmallestElement.kthSmallestElement(input, 3);
		assertEquals(4,response);
		
		Integer[] input1 = { 6,1,2,1,3,6,7 };
		response = kthSmallestElement.kthSmallestElement(input1, 4);
		assertEquals(6,response);
	}
}
