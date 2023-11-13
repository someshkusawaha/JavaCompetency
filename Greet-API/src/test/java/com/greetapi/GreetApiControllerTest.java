package com.greetapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.greetapi.controller.GreetApiController;


@SpringBootTest
class GreetApiControllerTest {
	
	@InjectMocks
	GreetApiController greetApiController;
	
	@Test
	void greetApiTest() {
		String output = greetApiController.greetApi("Test");
		assertEquals("Hello Test...!!!",output);
	}
	
	@Test
	void greetApiEmptyTest() {
		String output = greetApiController.greetApi("");
		assertEquals("Hello World...!!!",output);
	}

}
