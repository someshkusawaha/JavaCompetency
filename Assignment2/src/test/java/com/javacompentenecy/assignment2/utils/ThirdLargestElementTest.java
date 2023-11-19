package com.javacompentenecy.assignment2.utils;

import org.mockito.InjectMocks;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ThirdLargestElementTest {

	@InjectMocks
	ThirdLargestElement thirdLargestElement;
	
	void thirdLargestSuccessTest() {
		Integer[] input = {25,47,25,95,47,65,52};
		int response = thirdLargestElement.thirdLargest(input);
		assertEquals(52,response);
	}
}
