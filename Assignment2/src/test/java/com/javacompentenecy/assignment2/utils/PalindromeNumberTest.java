package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PalindromeNumberTest {
	
	@InjectMocks
	PalindromeNumber palindromeNumber;
	
	@Test
    void palindromeNumber() {
		String response = palindromeNumber.palindromeNumber(454);
		assertEquals("Yes",response);
	}

}
