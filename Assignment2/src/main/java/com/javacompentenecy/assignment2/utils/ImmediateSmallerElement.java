package com.javacompentenecy.assignment2.utils;

import java.util.ArrayList;
import java.util.List;

public class ImmediateSmallerElement {
	/**
	11. Immediate Smaller Element 
	Given an integer array Arr of size N. For each element in the array, check whether the right 
	adjacent element (on the next immediate position) of the array is smaller. If next element is 
	smaller, update the current index to that element. If not, then  -1. 
	Your Task:  
	You don't need to read input or print anything. Your task is to complete the 
	function immediateSmaller() which takes the array of integers arr and n as parameters. You 
	need to change the array itself.
	*/
	
	public List<Integer> immediateSmallerElement(Integer[] input){
		List<Integer> result = new ArrayList<>();
		for(int i=0,j=1;j<input.length;i++,j++) {
			if(input[i]>input[j]) {
				result.add(input[j]);
			}else if(input[i]<input[j]) {
				result.add(-1);
			}
		}
		result.add(-1);
		return result;
	}
}
