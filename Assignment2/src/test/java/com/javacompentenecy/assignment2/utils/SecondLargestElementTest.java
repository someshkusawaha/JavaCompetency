package com.javacompentenecy.assignment2.utils;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SecondLargestElementTest {

	@InjectMocks
	SecondLargestElement secondLargestElement;
	
	@Test
	void secondLargestSuccessTest() {
		Integer[] input = {14,25,85,57,14,36,45};
		int response = secondLargestElement.secondLargest(input);
		assertEquals(57,response);
	}
}
