package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MissingNumberTest {
	
	@InjectMocks
	MissingNumber missingNumber;
	
	@Test
	public void missingNumberSuccessTest() {
		Integer[] input= {1,5,3,7,6,4};
		int response= missingNumber.missingNumber(input, 6);
		assertEquals(2,response);
	}

}
