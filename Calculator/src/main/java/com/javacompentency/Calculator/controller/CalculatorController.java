package com.javacompentency.Calculator.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	
	private static final Logger LOG = LoggerFactory.getLogger(CalculatorController.class);
	private static final String ANSWER = "Answer";
	private static final String DETAIL = "Detail";
	private Map<String,String> response = new HashMap<>();

	@GetMapping("/greetapi/v1/hello")
	public String greetApi(@RequestParam String user) {
		LOG.info("CalculatorController : greetApi Start");
		if(!StringUtils.isEmpty(user)) {
			return "Hello "+user+"...!!!";
		}else {
			return "Hello World...!!!";
		}
	}
	
	@GetMapping("/calculatorapi/v1/addition")
	public Map<String,String> addition(@RequestParam Integer number1,@RequestParam Integer number2 ){
		LOG.info("CalculatorController : addition Start");
		response.put(ANSWER, String.valueOf(number1+number2));
		response.put(DETAIL, number1+" + "+number2+" = "+(number1+number2));
		return response;
	}
	
	@GetMapping("/calculatorapi/v1/subtraction")
	public Map<String,String> subtraction(@RequestParam Integer number1,@RequestParam Integer number2 ){
		LOG.info("CalculatorController : subtraction Start");
		response.put(ANSWER, String.valueOf(number1-number2));
		response.put(DETAIL, number1+" - "+number2+" = "+(number1-number2));
		return response;
	}
	
	@GetMapping("/calculatorapi/v1/multiplication")
	public Map<String,String> multiplication(@RequestParam Integer number1,@RequestParam Integer number2 ){
		LOG.info("CalculatorController : multiplication Start");
		response.put(ANSWER, String.valueOf(number1*number2));
		response.put(DETAIL, number1+" * "+number2+" = "+(number1*number2));
		return response;
	}
	
	@GetMapping("/calculatorapi/v1/division")
	public Map<String,String> division(@RequestParam Integer number1,@RequestParam Integer number2 ){
		LOG.info("CalculatorController : division Start");
		response.put(ANSWER, String.valueOf(number1/number2));
		response.put(DETAIL, number1+" / "+number2+" = "+(number1/number2));
		return response;
	}
	
	@GetMapping("/calculatorapi/v1/square/{number}")
	public Map<String,String> square(@PathVariable Integer number){
		LOG.info("CalculatorController : square Start");
		response.put(ANSWER, String.valueOf(number*number));
		response.put(DETAIL, "Square of "+number+" = "+(number*number));
		return response;
	}
	
	@GetMapping("/calculatorapi/v1/squareroot/{number}")
	public Map<String,String> squareroot(@PathVariable Integer number){
		LOG.info("CalculatorController : squareroot Start");
		response.put(ANSWER, String.valueOf(Math.sqrt(number)));
		response.put(DETAIL, "squareroot of "+number+" = "+(Math.sqrt(number)));
		return response;
	}
	
	@GetMapping("/calculatorapi/v1/factorial/{number}")
	public Map<String,String> factorial(@PathVariable Integer number){
		LOG.info("CalculatorController : factorial Start");
		int fact=1;

		for(int i=1;i<=number;i++) {
			fact = i * fact;
		}
        
		response.put(ANSWER, String.valueOf(fact));
		response.put(DETAIL, number+"! = "+fact);
		return response;
	}
	
	@GetMapping("/calculatorapi/v1/minmax")
	public Map<String,String> minmax(@RequestBody MinMax minmax){
		LOG.info("CalculatorController : minmax Start");
		Integer max = minmax.getNumbers().stream().max((n1,n2)->n1.compareTo(n2)).get();
		Integer min = minmax.getNumbers().stream().min((n1,n2)->n1.compareTo(n2)).get();
		response.put(ANSWER, "Min : "+min+" ,Max : "+max);
		response.put(DETAIL, minmax.getNumbers().toString());
		return response;
	}
	
}
