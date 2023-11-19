package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZigZagTest {
	
	@InjectMocks
	ZigZag zigZag;
	
	@Test
	void ZigZagSuccessTest() {
		Integer[] input= {4, 3, 7, 8, 6, 2, 1};
		Integer[] response = zigZag.zigZag(input);
		assertNotNull(response);
	}

}
