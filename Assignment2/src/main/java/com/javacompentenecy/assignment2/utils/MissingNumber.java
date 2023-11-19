package com.javacompentenecy.assignment2.utils;

import java.util.Arrays;

public class MissingNumber {
/*
	25. Missing number in array 
	Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. 
	Find the missing element. 
	Your Task : 
	You don't need to read input or print anything. Complete the function MissingNumber() that 
	takes array and N as input parameters and returns the value of the missing number.
	*/
	
	public int missingNumber(Integer[] input,Integer size) {
		Arrays.sort(input);
		for(int i=1;i<size;i++) {
			if(i!=input[i-1]) {
				return i;
			}
		}
		return size;
	}
}
