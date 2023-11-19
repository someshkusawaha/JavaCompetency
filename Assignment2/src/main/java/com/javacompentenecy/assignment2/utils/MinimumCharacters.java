package com.javacompentenecy.assignment2.utils;

public class MinimumCharacters {
/*
	24.Add Minimum Characters 
	Given a string str, find the minimum characters to be added at front of the string to make it 
	a palindrome. 
	Your Task:  
	You don't need to read input or print anything. Your task is to complete the 
	function addMinChar() which takes the string str as input parameters and returns the 
	minimum number of characters to be added to make it a palindrome.
	*/
	
	public int addMinimunCharacter(String input) {
		char[] in=input.toCharArray();
		char[] out = new char[input.length()];
	
		for(int i=input.length()-1,j=0;i>=0 && j<input.length();i--,j++) {
			out[j] = in[i];
		}
	
		if(input.equals(new String(out)))
			return 0;
		else
			return input.length()-1;
	}
}
