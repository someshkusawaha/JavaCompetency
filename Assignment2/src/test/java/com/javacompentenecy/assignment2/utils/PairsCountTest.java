package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PairsCountTest {

	@InjectMocks
	PairsCount pairsCount;
	
	@Test
	public void getPairsCountSuccessTest() {
		Integer[] input = {1, 5, 7, 1};
		int response = pairsCount.getPairsCount(input, 6);
		assertEquals(2,response);
	}
}
