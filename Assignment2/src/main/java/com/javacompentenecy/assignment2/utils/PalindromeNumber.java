package com.javacompentenecy.assignment2.utils;

public class PalindromeNumber {

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
}
