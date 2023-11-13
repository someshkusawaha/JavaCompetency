package com.javacompentency.Calculator.service;

import java.util.Map;

import com.javacompentency.Calculator.controller.MinMax;

public interface CalculatorService {

	public Map<String,String> addition( Integer number1, Integer number2 );
	public Map<String,String> subtraction( Integer number1, Integer number2 );
	public Map<String,String> multiplication( Integer number1, Integer number2 );
	public Map<String,String> division( Integer number1, Integer number2 );
	public Map<String,String> square( Integer number);
	public Map<String,String> squareroot( Integer number);
	public Map<String,String> factorial( Integer number);
	public Map<String,String> minmax( MinMax minmax);
}
