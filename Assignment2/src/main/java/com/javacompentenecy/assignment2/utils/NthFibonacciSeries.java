package com.javacompentenecy.assignment2.utils;

import java.util.ArrayList;
import java.util.List;

public class NthFibonacciSeries {

	/** Fibonacci Series up to Nth term 
	6. You are given integer N, and return the Fibonacci Series till the Nth term. 
	Your Task: 
	You don't need to read input or print anything. Your task is to complete the function 
	Series() which takes an Integer N as input and returns a Fibonacci Series up to the Nth term.
	**/
	
	public static List<Integer> nthFibonacciSeries(Integer number) {
		List<Integer> fib = new ArrayList<>();
		fib.add(0);
		fib.add(1);
		for(int i=0;i<number-1;i++) {
			fib.add(fib.get(i)+fib.get(i+1));
		}
		
		return fib;
	}
}
