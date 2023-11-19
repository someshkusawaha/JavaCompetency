package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UniqueFrequencyTest {

	@InjectMocks
	UniqueFrequency uniqueFrequency;
	
	@Test
     void checkUniqueFrequencySuccessTest() {
		Integer[] input = {2, 2, 5, 10, 1, 2, 10, 5, 10, 2};
		boolean response = uniqueFrequency.checkUniqueFrequency(input);
		assertTrue(response);
	}
}
