package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MinimumCharactersTest {
	
	@InjectMocks
	MinimumCharacters minimumCharacters;
	
	@Test
	public void addMinimunCharacterSuccessTest() {
		int response = minimumCharacters.addMinimunCharacter("ABCD");
		assertEquals(3,response);
	}

}
