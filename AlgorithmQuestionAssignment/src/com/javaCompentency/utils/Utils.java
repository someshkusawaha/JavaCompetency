package com.javaCompentency.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.javaCompentency.model.Rectangle;

public class Utils {

   /** Prime Number
	1. For a given number N check if it is prime or not. A prime number is a number which is only 
	divisible by 1 and itself. 
	Your Task: 
	You don't need to read input or print anything. Your task is to complete the function 
	isPrime() which takes an integer N as input parameters and returns an integer, 1 if N is a 
	prime number or 0 otherwise.
	**/
	public static Integer primeNumber(Integer number) {
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
	
	/** Palindrome Number
	2. Given an integer, check whether it is a palindrome or not. 
	Your Task: 
	You don't need to read or print anything. Your task is to complete the 
	function is_palindrome() which takes the number as input parameter and returns "Yes" if it 
	is palindrome otherwise returns "No"(Without quotes).
	**/
	public static String palindromeNumber(Integer number) {
		int copyint = number;
		int sum=0;

		while(copyint%10 !=0) {
			sum = copyint%10 + (sum*10);
			copyint = copyint/10;
		}
		if(number.equals(sum)) {
			return "Yes";
		}else {
			return "No";
		}
	}
	
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
	
	/** Palindrome String 
	4. Given a string S, check if it is palindrome or not. 
	Your Task: 
	You don't need to read input or print anything. Complete the function isPalindrome()which 
	accepts string S and returns an integer value 1 or 0.
	**/
	
	public static int palindromeString(String input) {
		char[] in=input.toCharArray();
		char[] out = new char[input.length()];
	
		for(int i=input.length()-1,j=0;i>=0 && j<input.length();i--,j++) {
			out[j] = in[i];
		}
	
		if(input.equals(new String(out)))
			return 1;
		else
			return 0;
	}
	
	/**
	Nth Fibonacci Number 
	5. Given a positive integer n, find the nth fibonacci number. Since the answer can be very 
	large, return the answer modulo 1000000007. 
	Your Task:  
	You dont need to read input or print anything. Complete the function nthFibonacci() which 
	takes n as input parameter and returns nth fibonacci number.
	**/
	
	public static int nthFibonacciNumber(Integer number) {
		List<Integer> fib = new ArrayList<>();
		fib.add(0);
		fib.add(1);
		for(int i=0;i<number-1;i++) {
			fib.add(fib.get(i)+fib.get(i+1));
		}
		
		return fib.get(number);
	}
	
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
	
	/** Confused pappu 
	7. Pappu is confused between 6 & 9. He works in the billing department of abc company and 
	his work is to return the remaining amount to the customers. If the actual remaining amount 
	is given we need to find the maximum possible extra amount given by the pappu to the 
	customers. 
	User Task: 
	Your task is to complete the function findDiff() which takes single argument(amount) and 
	returns the answer. You need not take any input or print anything.
	**/
	
	public static int confusedPappu(Integer number) {
		char[] array = number.toString().toCharArray();
		for(int i=0;i<array.length;i++) {
			if(array[i] == '9') {
				array[i]='6';
				continue;
			}
			
			if(array[i]=='6') {
				array[i]='9';
				continue;
			}
		}
		
		return Integer.valueOf(new String(array))-number;
	}
	
	/** Unique Subsets 
	8. Given an array arr[] of integers of size N that might contain duplicates, the task is to find all 
	possible unique subsets. 
	Note: Each subset should be sorted. 
	Your Task: 
	Your task is to complete the function AllSubsets() which takes the array arr[] and N as input 
	parameters and returns list of all possible unique subsets in lexicographical order.
	**/
	
	public static Set<String> uniqueSubsets(int[] input){
		return null;
	}
	
	/**Count subsets having distinct even numbers 
	9. Given a set of n numbers. The task is to count all the subsets of the given set which only 
	have even numbers and all are distinct. 
	Note: By the property of sets, if two subsets have the same set of elements then they are 
	considered as one. For example: [2, 4, 8] and [4, 2, 8] are considered to be the same. 
	Your Task:  
	You don't need to read input or print anything. Your task is to complete the 
	function countSubsets() which takes the array a[] and its size n as inputs and returns the 
	Count of possible subsets.
	**/
	
	public static int evenSubsetsCount(int[] input){
		return 0;
	}
	
	/**Maximum Area Rectangle 
	10. Given N  pairs of rectangles, where each pair denotes the length L and breadth B of the 
	ith rectangle. The task is to return the maximum area of the rectangle. 
	User Task: Your task is to complete the function calculate_Area() which returns maximum 
	area. Use area() function in Rectangle class.
	**/
	
	public static int maximumAreaRectangle(Rectangle[] input){
		int area = 0;
		int max=0;
		for(int i=0; i<input.length;i++) {
			area = input[i].area();
			if(max<area) {
				max=area;
			}
		}
		return max;
	}
}
