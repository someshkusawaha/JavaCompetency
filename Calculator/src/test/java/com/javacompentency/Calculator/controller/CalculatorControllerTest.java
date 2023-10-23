package com.javacompentency.Calculator.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorControllerTest {

	@InjectMocks
	CalculatorController calculatorController;
	
	@Test
	void greetApiTest() {
		String output = calculatorController.greetApi("Test");
		assertEquals("Hello Test...!!!",output);
	}
	
	@Test
	void greetApiEmptyTest() {
		String output = calculatorController.greetApi("");
		assertEquals("Hello World...!!!",output);
	}
	
	@Test
	void additionTest() {
		Map<String,String> output = calculatorController.addition(12, 15);
		assertEquals("27",output.get("Answer"));
	}
	
	@Test
	void subtractionTest() {
		Map<String,String> output = calculatorController.subtraction(20, 15);
		assertEquals("5",output.get("Answer"));
	}
	
	@Test
	void multiplicationTest() {
		Map<String,String> output = calculatorController.multiplication(12, 3);
		assertEquals("36",output.get("Answer"));
	}
	
	@Test
	void divisionTest() {
		Map<String,String> output = calculatorController.division(12, 3);
		assertEquals("4",output.get("Answer"));
	}
	
	@Test
	void squareTest() {
		Map<String,String> output = calculatorController.square(12);
		assertEquals("144",output.get("Answer"));
	}
	
	@Test
	void squarerootTest() {
		Map<String,String> output = calculatorController.squareroot(144);
		assertEquals("12.0",output.get("Answer"));
	}
	
	@Test
	void factorialTest() {
		Map<String,String> output = calculatorController.factorial(5);
		assertEquals("120",output.get("Answer"));
	}
	
	@Test
	void minmaxTest() {
		Map<String,String> output = calculatorController.minmax(getMinMaxObject());
		assertEquals("Min : 1 ,Max : 9",output.get("Answer"));
	}

	private MinMax getMinMaxObject() {
		MinMax minmax = new MinMax();
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(8);
		numbers.add(7);
		numbers.add(1);
		numbers.add(9);
		minmax.setNumbers(numbers);
		return minmax;
	}
}