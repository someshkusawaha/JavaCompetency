package com.javacompentenecy.assignment2.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestElement {

	/*
	28. Second Largest 
	Given an array Arr of size N, print second largest distinct element from an array. 
	Your Task: 
	You don't need to read input or print anything. Your task is to complete the 
	function print2largest() which takes the array of integers arr and n as parameters and 
	returns an integer denoting the answer. If 2nd largest element doesn't exist then return -1.
	*/
	
    public static int secondLargest(Integer[] input) {
		
		List<Integer> inlist = Arrays.asList(input);
		if(inlist.size()<3)
		 return -1;
		else
		 return inlist.stream().distinct().sorted().collect(Collectors.toList()).get(inlist.size()-3);
	}
}
