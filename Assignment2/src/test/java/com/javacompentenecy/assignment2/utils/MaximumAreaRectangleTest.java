package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MaximumAreaRectangleTest {

	@InjectMocks
	MaximumAreaRectangle maximumAreaRectangle;
	
	@Test
	void maximumAreaRectangleSuccessTest() {
		int response = 0;
		response = maximumAreaRectangle.maximumAreaRectangle(getRectangleList());
		assertEquals(25,response);
		
	}

	private Rectangle[] getRectangleList() {
		Rectangle r1 = new Rectangle(1, 9);
		Rectangle r2 = new Rectangle(2, 8);
		Rectangle r3 = new Rectangle(3, 7);
		Rectangle r4 = new Rectangle(4, 6);
		Rectangle r5 = new Rectangle(5, 5);
		Rectangle[] rectArray = {r1,r2,r3,r4,r5};
		return rectArray;
	}
}
