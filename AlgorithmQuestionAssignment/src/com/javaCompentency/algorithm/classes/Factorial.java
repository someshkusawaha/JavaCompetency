package com.javaCompentency.algorithm.classes;

public class Factorial {

	/** Factorial 
	3. Given a positive integer, N. Find the factorial of N. 
	Your Task: 
	You don't need to read input or print anything. Your task is to complete the function 
	factorial() which takes an integer N as input parameters and returns an integer, the 
	factorial of N.
	**/
	
	public static int factorial(Integer number) {
		int fact=1;
		for(int i=number;i!=0;i--) {
			fact = i*fact;
		}
		return fact;
	}
}
