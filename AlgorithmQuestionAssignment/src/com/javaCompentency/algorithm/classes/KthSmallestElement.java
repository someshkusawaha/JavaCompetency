package com.javaCompentency.algorithm.classes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KthSmallestElement {

	/*
	26. Kth smallest element 
	Given an array arr[] and an integer K where K is smaller than size of array, the task is to find 
	the Kth smallest element in the given array. It is given that all array elements are distinct. 
	Note :-  l and r denotes the starting and ending index of the array. 
	Your Task: 
	You don't have to read input or print anything. Your task is to complete the 
	function kthSmallest() which takes the array arr[], integers l and r denoting the starting and 
	ending index of the array and an integer K as input and returns the Kth smallest element.
	*/
	 public static int kthSmallestElement(Integer[] input,int k) {
			
			List<Integer> inlist = Arrays.asList(input);
			if(inlist.size()<3)
			 return -1;
			else
			 return inlist.stream().distinct().sorted().collect(Collectors.toList()).get(k-1);
		}
}
