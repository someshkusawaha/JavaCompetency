package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GoodBadStringTest {

	@InjectMocks
	GoodBadString goodBadString;
	
	@Test
	void isGoodBadStringSuccessTest() {
		
		boolean response =false;
		response = goodBadString.isGoodBadString("aeioup??");
		assertTrue(response);
		
		response = goodBadString.isGoodBadString("bcdaeiou??");
		assertTrue(response);
	}
}
