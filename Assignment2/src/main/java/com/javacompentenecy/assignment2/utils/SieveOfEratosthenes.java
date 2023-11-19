package com.javacompentenecy.assignment2.utils;

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {

	/*
	16. Sieve of Eratosthenes 
	Given a number N, calculate the prime numbers up to N using Sieve of Eratosthenes.  
	Your Task:  
	You don't need to read input or print anything. Your task is to complete the 
	function sieveOfEratosthenes() which takes an integer N as an input parameter and 
	return the list of prime numbers less than equal to N.
		*/
	
	public List<Integer> sieveOfEratosthenes(Integer input){
		List<Integer> listprime = new ArrayList<>();
		listprime.add(1);
		for(int p=2;p<=input;p++) {
			int cnt = 0;
			for(int i=2;i<=p;i++) {
				if(p%i == 0) {
					cnt++;
				}
			}

			if(cnt == 1) {
				listprime.add(p);
			}
		}
		return listprime;
	}
}
