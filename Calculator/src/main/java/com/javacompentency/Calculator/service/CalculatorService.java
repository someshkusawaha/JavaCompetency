package com.javacompentency.Calculator.service;

import com.javacompentency.Calculator.controller.MinMax;

public interface CalculatorService {

	public String addition( Integer number1, Integer number2 );
	public String subtraction( Integer number1, Integer number2 );
	public String multiplication( Integer number1, Integer number2 );
	public String division( Integer number1, Integer number2 );
	public String square( Integer number);
	public String squareroot( Integer number);
	public String factorial( Integer number);
	public String minmax( MinMax minmax);
}
