package com.javacompentenecy.assignment2.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdLargestElement {
	/*
	13. Third largest element 
	Given an array of distinct elements. Find the third largest element in it. 
	Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, its output will be 5 because it is the 3 largest 
	element in the array A. 
	Your Task: 
	Complete the function thirdLargest() which takes the array a[] and the size of the array, n, as 
	input parameters and returns the third largest element in the array. It return -1 if there are 
	less than 3 elements in the given array.
	*/
	
	public int thirdLargest(Integer[] input) {
		
		List<Integer> inlist = Arrays.asList(input);
		if(inlist.size()<3)
		 return -1;
		else
		 return inlist.stream().distinct().sorted().collect(Collectors.toList()).get(inlist.size()-3);
	}
}
