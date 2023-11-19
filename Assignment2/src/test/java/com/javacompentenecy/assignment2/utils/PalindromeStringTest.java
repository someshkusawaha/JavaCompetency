package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PalindromeStringTest {

	@InjectMocks
	PalindromeString palindromeString;
	
	@Test
	public void palindromeStringSuccessTest() {
		int response = palindromeString.palindromeString("abba");
		assertEquals(1,response);
	}
}
