package com.javacompentenecy.assignment2.utils;

public class SubSequence {

	/*
	17. Check for subsequence 
	Given two strings A and B, find if A is a subsequence of B. 
	Your Task: 
	You dont need to read input or print anything. Complete the function isSubSequence() 
	which takes A and B as input parameters and returns a boolean value denoting if A is a 
	subsequence of B or not.

	 */
	public boolean isSubSequence(String in1, String in2){

		for(int i=in1.length()-1,j=in2.length()-1;i>=0&&j>=0;) {
			if(in1.charAt(i)==in2.charAt(j)) {
				i--;
				j--;
			}
			if(in1.charAt(i)!=in2.charAt(j)) {
				j--;
			}

			if(i==0) {
				return true; 
			}
			if(j==0) {
				return false;
			}
		}
		return false;
	}
}
