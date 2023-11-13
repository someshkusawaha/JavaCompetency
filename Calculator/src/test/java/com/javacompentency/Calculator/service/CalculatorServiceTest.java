package com.javacompentency.Calculator.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.javacompentency.Calculator.controller.MinMax;

@SpringBootTest
class CalculatorServiceTest {
	
	@InjectMocks
	CalculatorServiceImpl calculatorService;
	
	private static final String ANSWER = "Answer";
	
	@Test
	void additionTest() {
		Map<String,String> output = calculatorService.addition(12, 15);
		assertEquals("27",output.get(ANSWER));
	}
	
	@Test
	void subtractionTest() {
		Map<String,String> output = calculatorService.subtraction(20, 15);
		assertEquals("5",output.get(ANSWER));
	}
	
	@Test
	void multiplicationTest() {
		Map<String,String> output = calculatorService.multiplication(12, 3);
		assertEquals("36",output.get(ANSWER));
	}
	
	@Test
	void divisionTest() {
		Map<String,String> output = calculatorService.division(12, 3);
		assertEquals("4",output.get(ANSWER));
	}
	
	@Test
	void squareTest() {
		Map<String,String> output = calculatorService.square(12);
		assertEquals("144",output.get(ANSWER));
	}
	
	@Test
	void squarerootTest() {
		Map<String,String> output = calculatorService.squareroot(144);
		assertEquals("12.0",output.get(ANSWER));
	}
	
	@Test
	void factorialTest() {
		Map<String,String> output = calculatorService.factorial(5);
		assertEquals("120",output.get(ANSWER));
	}
	
	@Test
	void minmaxTest() {
		Map<String,String> output = calculatorService.minmax(getMinMaxObject());
		assertEquals("Min : 1 ,Max : 9",output.get(ANSWER));
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
