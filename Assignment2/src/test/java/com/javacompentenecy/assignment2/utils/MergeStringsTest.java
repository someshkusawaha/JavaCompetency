package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MergeStringsTest {

	@InjectMocks
	MergeStrings mergeStrings;
	
	@Test
	public void mergeStringsSuccessTest() {
		String response = mergeStrings.mergeStrings("Somesh", "Test");
		assertEquals("SToemsetsh",response);
	}
}
