package com.javacompentenecy.assignment2.utils;

import org.mockito.InjectMocks;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SubSequenceTest {

	@InjectMocks
	SubSequence subSequence;
	
	void isSubSequenceSuccessTest() {
		boolean response =subSequence.isSubSequence("gksrek", "geeksforgeeks");
		assertTrue(response);
	}
}
