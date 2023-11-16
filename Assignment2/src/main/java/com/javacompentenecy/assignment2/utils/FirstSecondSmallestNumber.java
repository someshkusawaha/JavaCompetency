package com.javacompentenecy.assignment2.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstSecondSmallestNumber {

	/*
	14. Find the smallest and second smallest element in an array 
	Given an array of integers, your task is to find the smallest and second smallest element in 
	the array. If smallest and second smallest do not exist, print -1. 
	Your Task:  
	You don't need to read input or print anything. Your task is to complete the 
	function minAnd2ndMin() which takes the array A[] and its size N as inputs and returns a 
	vector containing the smallest and second smallest element if possible, else return {-1,-1}.
	 */	

	public static String firstSecondSmallestNo(Integer[] input){

		List<Integer> inlist = Arrays.asList(input).stream().distinct().sorted().collect(Collectors.toList());
		if(inlist.size()>2)
			return "{-1,-1}";
		else
			return "{"+inlist.get(0)+","+inlist.get(1)+"}";
	}

}
