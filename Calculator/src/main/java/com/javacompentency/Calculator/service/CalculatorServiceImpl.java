package com.javacompentency.Calculator.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.javacompentency.Calculator.controller.MinMax;

@Service
public class CalculatorServiceImpl implements CalculatorService{

	private static final Logger LOG = LoggerFactory.getLogger(CalculatorServiceImpl.class);
	private static final String ANSWER = "Answer";
	private static final String DETAIL = "Detail";
	private Map<String,String> response = new HashMap<>();
	
	public Map<String,String> addition( Integer number1, Integer number2 ){
		LOG.info("CalculatorService : addition Start");
		response.put(ANSWER, String.valueOf(number1+number2));
		response.put(DETAIL, number1+" + "+number2+" = "+(number1+number2));
		return response;
	}
	
	public Map<String,String> subtraction( Integer number1, Integer number2 ){
		LOG.info("CalculatorService : subtraction Start");
		response.put(ANSWER, String.valueOf(number1-number2));
		response.put(DETAIL, number1+" - "+number2+" = "+(number1-number2));
		return response;
	}
	
	public Map<String,String> multiplication( Integer number1, Integer number2 ){
		LOG.info("CalculatorService : multiplication Start");
		response.put(ANSWER, String.valueOf(number1*number2));
		response.put(DETAIL, number1+" * "+number2+" = "+(number1*number2));
		return response;
	}
	
	public Map<String,String> division( Integer number1, Integer number2 ){
		LOG.info("CalculatorService : division Start");
		response.put(ANSWER, String.valueOf(number1/number2));
		response.put(DETAIL, number1+" / "+number2+" = "+(number1/number2));
		return response;
	}
	
	public Map<String,String> square( Integer number){
		LOG.info("CalculatorService : square Start");
		response.put(ANSWER, String.valueOf(number*number));
		response.put(DETAIL, "Square of "+number+" = "+(number*number));
		return response;
	}
	
	public Map<String,String> squareroot( Integer number){
		LOG.info("CalculatorService : squareroot Start");
		response.put(ANSWER, String.valueOf(Math.sqrt(number)));
		response.put(DETAIL, "squareroot of "+number+" = "+(Math.sqrt(number)));
		return response;
	}
	
	public Map<String,String> factorial( Integer number){
		LOG.info("CalculatorService : factorial Start");
		int fact=1;

		for(int i=1;i<=number;i++) {
			fact = i * fact;
		}
        
		response.put(ANSWER, String.valueOf(fact));
		response.put(DETAIL, number+"! = "+fact);
		return response;
	}
	
	public Map<String,String> minmax( MinMax minmax){
		LOG.info("CalculatorService : minmax Start");
		Integer max = minmax.getNumbers().stream().max((n1,n2)->n1.compareTo(n2)).get();
		Integer min = minmax.getNumbers().stream().min((n1,n2)->n1.compareTo(n2)).get();
		response.put(ANSWER, "Min : "+min+" ,Max : "+max);
		response.put(DETAIL, minmax.getNumbers().toString());
		return response;
	}
}
