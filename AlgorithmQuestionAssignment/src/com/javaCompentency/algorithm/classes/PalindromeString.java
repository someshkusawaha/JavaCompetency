package com.javaCompentency.algorithm.classes;

public class PalindromeString {

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
}
