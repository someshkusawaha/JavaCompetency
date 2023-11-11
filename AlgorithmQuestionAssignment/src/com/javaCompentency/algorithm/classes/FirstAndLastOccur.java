package com.javaCompentency.algorithm.classes;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastOccur {

	/*
	First and last occurrences of X 
	Given a sorted array having N elements, find the indices of the first and last occurrences of 
	an element X in the given array. 
	Note: If the number X is not found in the array, return '-1' as an array. 
	Your Task: 
	You don't need to read input or print anything. Complete the function firstAndLast() that 
	takes the array arr, its size N and the value X as input parameters and returns a list of 
	integers containing the indices of first and last occurence of X.
	*/
	
	public static String firstAndLastOccur(Integer[] input,Integer target) {
		List<Integer> outlist = new ArrayList<>();
		for(int i=0;i<input.length;i++) {
			if(input[i]==target) {
				outlist.add(i);
			}
		}

		if(outlist.isEmpty())
			return "-1";
		else if(outlist.size() == 2)
			return outlist.get(0)+" "+outlist.get(1);
		else if(outlist.size() == 1)
			return outlist.get(0).toString();
		else
			return outlist.get(0)+" "+outlist.get(outlist.size()-1);
	}
}
