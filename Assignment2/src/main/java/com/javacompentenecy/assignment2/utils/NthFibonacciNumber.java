package com.javacompentenecy.assignment2.utils;

import java.util.ArrayList;
import java.util.List;

public class NthFibonacciNumber {

	/**
	Nth Fibonacci Number 
	5. Given a positive integer n, find the nth fibonacci number. Since the answer can be very 
	large, return the answer modulo 1000000007. 
	Your Task:  
	You dont need to read input or print anything. Complete the function nthFibonacci() which 
	takes n as input parameter and returns nth fibonacci number.
	**/
	
	public int nthFibonacciNumber(Integer number) {
		List<Integer> fib = new ArrayList<>();
		fib.add(0);
		fib.add(1);
		for(int i=0;i<number-1;i++) {
			fib.add(fib.get(i)+fib.get(i+1));
		}
		
		return fib.get(number);
	}
}
