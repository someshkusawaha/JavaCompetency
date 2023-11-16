package com.javacompentenecy.assignment2.utils;

public class PairsCount {

	/*
	29. Count pairs with given sum 
	Given an array of N integers, and an integer K, find the number of pairs of elements in the 
	array whose sum is equal to K. 
	Your Task: 
	You don't need to read input or print anything. Your task is to complete the 
	function getPairsCount() which takes arr[], n and k as input parameters and returns the 
	number of pairs that have sum K.
	*/
	
	public static int getPairsCount(Integer[] input,Integer target) {
		int count = 0;
		for(int i=0;i<input.length;i++) {
			for(int j=i+1;j<input.length;j++) {
				if(input[i]+input[j] == target) {
				  System.out.println("["+input[i]+","+input[j]+"] = "+count++);
				}
			}
		}
		return count;
	}
}
