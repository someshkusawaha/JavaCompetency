package com.javacompentency.Calculator.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.javacompentency.Calculator.service.CalculatorService;

@SpringBootTest
class CalculatorControllerTest {

	@InjectMocks
	CalculatorController calculatorController = new CalculatorController();
	
	@Mock
	CalculatorService calculatorService;
	
	private static final String ANSWER = "Answer";
	
	private Map<String, String> response = new HashMap<>();
	
	@Test
	void additionTest() {
		response.put(ANSWER, "27");
		when(calculatorService.addition(any(), any())).thenReturn(response);
		Map<String,String> output = calculatorController.addition(12, 15);
		assertEquals("27",output.get(ANSWER));
	}
	
	@Test
	void subtractionTest() {
		response.put(ANSWER, "5");
		when(calculatorService.subtraction(any(), any())).thenReturn(response);
		Map<String,String> output = calculatorController.subtraction(20, 15);
		assertEquals("5",output.get(ANSWER));
	}
	
	@Test
	void multiplicationTest() {
		response.put(ANSWER, "36");
		when(calculatorService.multiplication(any(), any())).thenReturn(response);
		Map<String,String> output = calculatorController.multiplication(12, 3);
		assertEquals("36",output.get(ANSWER));
	}
	
	@Test
	void divisionTest() {
		response.put(ANSWER, "4");
		when(calculatorService.division(any(), any())).thenReturn( response);
		Map<String,String> output = calculatorController.division(12, 3);
		assertEquals("4",output.get(ANSWER));
	}
	
	@Test
	void squareTest() {
		response.put(ANSWER, "144");
		when(calculatorService.square(any())).thenReturn( response);
		Map<String,String> output = calculatorController.square(12);
		assertEquals("144",output.get(ANSWER));
	}
	
	@Test
	void squarerootTest() {
		response.put(ANSWER, "12.0");
		when(calculatorService.squareroot(any())).thenReturn( response);
		Map<String,String> output = calculatorController.squareroot(144);
		assertEquals("12.0",output.get(ANSWER));
	}
	
	@Test
	void factorialTest() {
		response.put(ANSWER, "120");
		when(calculatorService.factorial(any())).thenReturn( response);
		Map<String,String> output = calculatorController.factorial(5);
		assertEquals("120",output.get(ANSWER));
	}
	
	@Test
	void minmaxTest() {
		response.put(ANSWER, "Min : 1 ,Max : 9");
		when(calculatorService.minmax(any())).thenReturn( response);
		Map<String,String> output = calculatorController.minmax(getMinMaxObject());
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