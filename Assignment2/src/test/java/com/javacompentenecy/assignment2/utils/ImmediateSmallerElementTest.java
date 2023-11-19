package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ImmediateSmallerElementTest {

	@InjectMocks
	ImmediateSmallerElement immediateSmallerElement;
	
	@Test
	void immediateSmallerElementSuccessTest() {
		List<Integer> response;
		Integer[] input = {4, 2, 1, 5, 3};
		response = immediateSmallerElement.immediateSmallerElement(input);
		assertNotNull(response);
		
		Integer[] input1 = {5, 6, 2, 3, 1, 7};
		response = immediateSmallerElement.immediateSmallerElement(input1);
		assertNotNull(response);
	}
}
