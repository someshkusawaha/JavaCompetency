package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RemAnagramTest {
	
	@InjectMocks
	RemAnagram remAnagram;
	
	@Test
	 void remAnagramSuccessTest() {
		int response = remAnagram.remAnagram("hasdfg", "sfg");
		assertEquals(4,response);
	}

}
