package com.javacompentency.Calculator.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javacompentency.Calculator.service.CalculatorService;

@RestController
public class CalculatorController {
	
	@Autowired
	CalculatorService calculatorService;
	
	private static final Logger LOG = LoggerFactory.getLogger(CalculatorController.class);

	@GetMapping("/v1/addition")
	public Map<String,String> addition(@RequestParam Integer number1,@RequestParam Integer number2 ){
		LOG.info("CalculatorController : addition Start");
		return calculatorService.addition(number1, number2);
	}
	
	@GetMapping("/v1/subtraction")
	public Map<String,String> subtraction(@RequestParam Integer number1,@RequestParam Integer number2 ){
		LOG.info("CalculatorController : subtraction Start");
		return calculatorService.subtraction(number1, number2);
	}
	
	@GetMapping("/v1/multiplication")
	public Map<String,String> multiplication(@RequestParam Integer number1,@RequestParam Integer number2 ){
		LOG.info("CalculatorController : multiplication Start");
		return calculatorService.multiplication(number1, number2);
	}
	
	@GetMapping("/v1/division")
	public Map<String,String> division(@RequestParam Integer number1,@RequestParam Integer number2 ){
		LOG.info("CalculatorController : division Start");
		return calculatorService.division(number1, number2);
	}
	
	@GetMapping("/v1/square/{number}")
	public Map<String,String> square(@PathVariable Integer number){
		LOG.info("CalculatorController : square Start");
		return calculatorService.square(number);
	}
	
	@GetMapping("/v1/squareroot/{number}")
	public Map<String,String> squareroot(@PathVariable Integer number){
		LOG.info("CalculatorController : squareroot Start");
		return calculatorService.squareroot(number);
	}
	
	@GetMapping("/v1/factorial/{number}")
	public Map<String,String> factorial(@PathVariable Integer number){
		LOG.info("CalculatorController : factorial Start");
		return calculatorService.factorial(number);
	}
	
	@GetMapping("/v1/minmax")
	public Map<String,String> minmax(@RequestBody MinMax minmax){
		LOG.info("CalculatorController : minmax Start");
		return calculatorService.minmax(minmax);
	}
	
}
