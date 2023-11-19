package com.javacompentenecy.assignment2.utils;

public class PrimeNumber {

	 /** Prime Number
		1. For a given number N check if it is prime or not. A prime number is a number which is only 
		divisible by 1 and itself. 
		Your Task: 
		You don't need to read input or print anything. Your task is to complete the function 
		isPrime() which takes an integer N as input parameters and returns an integer, 1 if N is a 
		prime number or 0 otherwise.
		**/
		public Integer primeNumber(Integer number) {
			int cnt = 0;
			for(int i=2;i<=number;i++) {
				if(number%i == 0) {
					cnt++;
				}
			}
			
			if(cnt == 1 || number == 1) {
				return 1;
			}else {
				return 0;
			}
		}
}
